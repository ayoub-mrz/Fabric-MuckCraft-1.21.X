package net.ayoubmrz.muckcraftmod.item.client;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.ayoubmrz.muckcraftmod.item.custom.AdamantiteArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class AdamantiteArmorModel extends GeoModel<AdamantiteArmorItem> {
    @Override
    public Identifier getModelResource(AdamantiteArmorItem adamantiteArmorItem) {
        return Identifier.of(MuckCraftMod.MOD_ID, "geo/adamantite_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(AdamantiteArmorItem adamantiteArmorItem) {
        return Identifier.of(MuckCraftMod.MOD_ID, "textures/armor/adamantite_armor.png");
    }

    @Override
    public Identifier getAnimationResource(AdamantiteArmorItem adamantiteArmorItem) {
        return Identifier.of(MuckCraftMod.MOD_ID, "animations/armor.animation.json");
    }
}
