package net.ayoubmrz.muckcraftmod.entity.client;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.ayoubmrz.muckcraftmod.entity.custom.WaterDaveEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WaterDaveRenderer extends GeoEntityRenderer<WaterDaveEntity> {


    public WaterDaveRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new WaterDaveModel<>());
    }

    @Override
    public Identifier getTextureLocation(WaterDaveEntity animatable) {
        return Identifier.of(MuckCraftMod.MOD_ID, "textures/entity/water_dave.png");
    }

    @Override
    public void scaleModelForRender(float widthScale, float heightScale, MatrixStack poseStack,
                                    WaterDaveEntity animatable, BakedGeoModel model, boolean isReRender, float partialTick,
                                    int packedLight, int packedOverlay) {
        super.scaleModelForRender(widthScale, heightScale, poseStack, animatable, model, isReRender, partialTick,
                packedLight, packedOverlay);
        this.withScale(2.2f);
    }


}
