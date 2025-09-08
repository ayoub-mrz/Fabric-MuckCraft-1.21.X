package net.ayoubmrz.muckcraftmod.item.client;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.ayoubmrz.muckcraftmod.item.custom.MithrilArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class MithrilArmorModel extends GeoModel<MithrilArmorItem> {
    @Override
    public Identifier getModelResource(MithrilArmorItem mithrilArmorItem) {
        return Identifier.of(MuckCraftMod.MOD_ID, "geo/mithril_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(MithrilArmorItem mithrilArmorItem) {
        return Identifier.of(MuckCraftMod.MOD_ID, "textures/armor/mithril_armor.png");
    }

    @Override
    public Identifier getAnimationResource(MithrilArmorItem mithrilArmorItem) {
        return Identifier.of(MuckCraftMod.MOD_ID, "animations/armor.animation.json");
    }
}
