package net.ayoubmrz.muckcraftmod.entity.client;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.ayoubmrz.muckcraftmod.entity.custom.RockGolemEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class RockGolemRenderer extends GeoEntityRenderer<RockGolemEntity> {


    public RockGolemRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new RockGolemModel<>());
    }

    @Override
    public Identifier getTextureLocation(RockGolemEntity animatable) {
        return Identifier.of(MuckCraftMod.MOD_ID, "textures/entity/rock_golem.png");
    }

    @Override
    public void scaleModelForRender(float widthScale, float heightScale, MatrixStack poseStack,
                                    RockGolemEntity animatable, BakedGeoModel model, boolean isReRender, float partialTick,
                                    int packedLight, int packedOverlay) {
        super.scaleModelForRender(widthScale, heightScale, poseStack, animatable, model, isReRender, partialTick,
                packedLight, packedOverlay);
        this.withScale(1.4f);
    }

}
