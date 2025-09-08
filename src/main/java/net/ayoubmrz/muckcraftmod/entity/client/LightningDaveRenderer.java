package net.ayoubmrz.muckcraftmod.entity.client;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.ayoubmrz.muckcraftmod.entity.custom.LightningDaveEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class LightningDaveRenderer extends GeoEntityRenderer<LightningDaveEntity> {


    public LightningDaveRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new LightningDaveModel<>());
    }

    @Override
    public Identifier getTextureLocation(LightningDaveEntity animatable) {
        return Identifier.of(MuckCraftMod.MOD_ID, "textures/entity/lightning_dave.png");
    }

    @Override
    public void scaleModelForRender(float widthScale, float heightScale, MatrixStack poseStack,
                                    LightningDaveEntity animatable, BakedGeoModel model, boolean isReRender, float partialTick,
                                    int packedLight, int packedOverlay) {
        super.scaleModelForRender(widthScale, heightScale, poseStack, animatable, model, isReRender, partialTick,
                packedLight, packedOverlay);
        this.withScale(2.2f);
    }


}
