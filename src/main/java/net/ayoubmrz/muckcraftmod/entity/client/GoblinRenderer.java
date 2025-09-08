package net.ayoubmrz.muckcraftmod.entity.client;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.ayoubmrz.muckcraftmod.entity.custom.GoblinEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GoblinRenderer extends GeoEntityRenderer<GoblinEntity> {

    public GoblinRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new GoblinModel<>());
    }

    @Override
    public Identifier getTextureLocation(GoblinEntity animatable) {
        return Identifier.of(MuckCraftMod.MOD_ID, "textures/entity/goblin.png");
    }

}
