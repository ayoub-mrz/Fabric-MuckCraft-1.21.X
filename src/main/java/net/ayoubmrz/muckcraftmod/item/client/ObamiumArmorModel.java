package net.ayoubmrz.muckcraftmod.item.client;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.ayoubmrz.muckcraftmod.item.custom.ObamiumArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class ObamiumArmorModel extends GeoModel<ObamiumArmorItem> {
    @Override
    public Identifier getModelResource(ObamiumArmorItem obamiumArmorItem) {
        return Identifier.of(MuckCraftMod.MOD_ID, "geo/obamium_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(ObamiumArmorItem obamiumArmorItem) {
        return Identifier.of(MuckCraftMod.MOD_ID, "textures/armor/obamium_armor.png");
    }

    @Override
    public Identifier getAnimationResource(ObamiumArmorItem obamiumArmorItem) {
        return Identifier.of(MuckCraftMod.MOD_ID, "animations/armor.animation.json");
    }
}
