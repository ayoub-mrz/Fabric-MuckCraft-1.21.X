package net.ayoubmrz.muckcraftmod.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.animation.*;


public class WaterDaveEntity extends HostileEntity implements GeoEntity, IShootable {

    private final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    private static final TrackedData<Boolean> IS_SHOOTING = DataTracker.registerData(WaterDaveEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    private int shootingTicks = 0;
    private final String TEXTUREPATH = "textures/entity/blue_ball.png";

    public WaterDaveEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tick() {
        super.tick();

        if (isShooting()) {
            shootingTicks++;
            if (shootingTicks > 5) {
                setShooting(false);
                shootingTicks = 0;
            }
        }
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(IS_SHOOTING, false);
    }

    public boolean isShooting() {
        return this.dataTracker.get(IS_SHOOTING);
    }

    public void setShooting(boolean shooting) {
        this.dataTracker.set(IS_SHOOTING, shooting);
    }

    public String getTexturePath() {return TEXTUREPATH;}

    public static DefaultAttributeContainer.Builder setAttributes() {
        return HostileEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 80.0D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.6F)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 35.0F);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new DaveMeleeAttackGoal(this, 0.4D, true));
        this.goalSelector.add(3, new WanderAroundFarGoal(this, 0.4f, 1));
        this.goalSelector.add(4, new LookAroundGoal(this));
        this.goalSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "controller", 0, this::predicate));
        controllers.add(new AnimationController<>(this, "shootController", 0, this::shootPredicate));
    }

    private PlayState shootPredicate(AnimationState<WaterDaveEntity> event) {

        if (this.isShooting()) {
            event.getController().forceAnimationReset();
            event.getController().setAnimation(
                    RawAnimation.begin().then("animation.lil_dave.attack", Animation.LoopType.PLAY_ONCE)
            );
            setShooting(false);
            return PlayState.CONTINUE;
        }

        return PlayState.CONTINUE;
    }

    private PlayState predicate(AnimationState<WaterDaveEntity> animationState) {
        var controller = animationState.getController();

        if (animationState.isMoving() && !this.isShooting()) {
            controller.setAnimation(RawAnimation.begin().then("animation.lil_dave.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }

        controller.setAnimation(RawAnimation.begin().then("animation.lil_dave.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

}