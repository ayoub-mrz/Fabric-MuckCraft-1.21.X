package net.ayoubmrz.muckcraftmod.entity.client;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.ayoubmrz.muckcraftmod.entity.custom.BigWolfEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class BigWolfModel<T extends BigWolfEntity> extends GeoModel<BigWolfEntity> {


    @Override
    public Identifier getModelResource(BigWolfEntity bigWolfEntity) {
        return Identifier.of(MuckCraftMod.MOD_ID, "geo/big_wolf.geo.json");
    }

    @Override
    public Identifier getTextureResource(BigWolfEntity bigWolfEntity) {
        return Identifier.of(MuckCraftMod.MOD_ID, "textures/entity/big_wolf.png");
    }

    @Override
    public Identifier getAnimationResource(BigWolfEntity bigWolfEntity) {
        return Identifier.of(MuckCraftMod.MOD_ID, "animations/big_wolf.animation.json");
    }

    @Override
    public void setCustomAnimations(BigWolfEntity animatable, long instanceId, AnimationState<BigWolfEntity> animationState) {
        GeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }

    

}
