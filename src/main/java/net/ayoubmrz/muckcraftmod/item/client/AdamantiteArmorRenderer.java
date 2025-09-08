package net.ayoubmrz.muckcraftmod.item.client;

import net.ayoubmrz.muckcraftmod.item.custom.AdamantiteArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AdamantiteArmorRenderer extends GeoArmorRenderer<AdamantiteArmorItem> {

    public AdamantiteArmorRenderer() {
        super(new AdamantiteArmorModel());
    }
}
