package net.ayoubmrz.muckcraftmod.entity.custom;

import net.ayoubmrz.muckcraftmod.entity.ModEntities;
import net.ayoubmrz.muckcraftmod.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BallProjectileEntity extends PersistentProjectileEntity {
    private static final String DEFAULT_TEXTURE = "textures/entity/red_ball.png";
    private final Set<Entity> hitEntities = new HashSet<>();
    Random random = new Random();
    private boolean hasHitPlayer = false;
    private int currentTick = 0;
    private String texturePath = DEFAULT_TEXTURE; // default texture
    private static final TrackedData<String> TEXTURE_PATH = DataTracker.registerData(
            BallProjectileEntity.class, TrackedDataHandlerRegistry.STRING);

    public BallProjectileEntity(EntityType<? extends PersistentProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    public BallProjectileEntity(World world, HostileEntity mob, String texturePath) {
        super(ModEntities.BALL, world);
        setTexturePath(texturePath);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(TEXTURE_PATH, DEFAULT_TEXTURE);
    }

    public String getTexturePath() {
        return this.dataTracker.get(TEXTURE_PATH);
    }

    public void setTexturePath(String texturePath) {
        this.dataTracker.set(TEXTURE_PATH, texturePath);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putString("TexturePath", getTexturePath());
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        if (nbt.contains("TexturePath")) {
            setTexturePath(nbt.getString("TexturePath"));
        }
    }

    @Override
    public void tick() {
        super.tick();

        if(currentTick == 0) {
            playLaunchSound();
        }
        ++currentTick;

        if(currentTick >= 100) {
            this.discard();
        }

    }

   @Override
    protected ItemStack getDefaultItemStack() {
        return new ItemStack(ModItems.RED_BALL);
    }

    // Stop Sound on block hit
    @Override
    public void playSound(SoundEvent sound, float volume, float pitch) {
        if(false) {
            super.playSound(sound, volume, pitch);
        }
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {

        // if this ball is not shoot from (Wyvern), create explosion
        if (!this.getWorld().isClient && !this.getTexturePath().equals("textures/entity/white_ball.png")) {
            BlockPos hitPos = blockHitResult.getBlockPos();
            ServerWorld serverWorld = (ServerWorld) this.getWorld();

            // Create explosion
            this.getWorld().createExplosion(
                    this,
                    hitPos.getX() + 0.5,
                    hitPos.getY() + 3,
                    hitPos.getZ() + 0.5,
                    2.0f,
                    true,
                    World.ExplosionSourceType.MOB
            );

            // Spawn additional particle effects
            serverWorld.spawnParticles(
                    ParticleTypes.EXPLOSION,
                    hitPos.getX() + 0.5, hitPos.getY() + 0.5, hitPos.getZ() + 0.5,
                    3, 0.2, 0.2, 0.2, 0.1
            );

        }

        this.discard();
        super.onBlockHit(blockHitResult);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        Entity hitEntity = entityHitResult.getEntity();

        if (hitEntities.contains(hitEntity)) {
            return;
        }

        hitEntities.add(hitEntity);

        if (hitEntity instanceof PlayerEntity player) {
            player.damage(this.getDamageSources().thrown(this, this.getOwner()), 14.0f);
            player.setOnFireFor(random.nextInt(4, 7));
            hasHitPlayer = true;
            this.discard();

        } else if (hitEntity instanceof LivingEntity livingEntity) {
            if (!this.getWorld().isClient) {
                ((ServerWorld) this.getWorld()).spawnParticles(
                        ParticleTypes.CRIT,
                        hitEntity.getX(), hitEntity.getY() + hitEntity.getHeight() / 2, hitEntity.getZ(),
                        5, 0.1, 0.1, 0.1, 0.1
                );
            }

        }
    }

    // Play sound on entity spawn
    public void playLaunchSound() {
        if (!this.getWorld().isClient) {
            this.getWorld().playSound(
                    null,
                    this.getX(), this.getY(), this.getZ(),
                    SoundEvents.ENTITY_ENDER_DRAGON_SHOOT,
                    SoundCategory.HOSTILE,
                    1.0f,
                    0.8f
            );
        }
    }

    @Override
    protected ItemStack asItemStack() {
        return new ItemStack(ModItems.RED_BALL);
    }

}
