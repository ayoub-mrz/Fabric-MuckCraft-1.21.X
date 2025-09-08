package net.ayoubmrz.muckcraftmod.item.client;

import net.ayoubmrz.muckcraftmod.item.custom.ObamiumArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ObamiumArmorRenderer extends GeoArmorRenderer<ObamiumArmorItem> {

    public ObamiumArmorRenderer() {
        super(new ObamiumArmorModel());
    }
}
