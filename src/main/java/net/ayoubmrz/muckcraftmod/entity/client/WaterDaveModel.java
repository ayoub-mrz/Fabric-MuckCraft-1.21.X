package net.ayoubmrz.muckcraftmod.entity.client;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.ayoubmrz.muckcraftmod.entity.custom.LilDaveEntity;
import net.ayoubmrz.muckcraftmod.entity.custom.WaterDaveEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class WaterDaveModel<T extends LilDaveEntity> extends GeoModel<WaterDaveEntity> {

    @Override
    public Identifier getModelResource(WaterDaveEntity waterDaveEntity) {
        return Identifier.of(MuckCraftMod.MOD_ID, "geo/lil_dave.geo.json");
    }

    @Override
    public Identifier getTextureResource(WaterDaveEntity waterDaveEntity) {
        return Identifier.of(MuckCraftMod.MOD_ID, "textures/entity/water_dave.png");
    }

    @Override
    public Identifier getAnimationResource(WaterDaveEntity waterDaveEntity) {
        return Identifier.of(MuckCraftMod.MOD_ID, "animations/lil_dave.animation.json");
    }

    @Override
    public void setCustomAnimations(WaterDaveEntity animatable, long instanceId, AnimationState<WaterDaveEntity> animationState) {
        GeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }



}
