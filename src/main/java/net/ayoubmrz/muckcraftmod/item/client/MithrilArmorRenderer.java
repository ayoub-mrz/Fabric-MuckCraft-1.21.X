package net.ayoubmrz.muckcraftmod.item.client;

import net.ayoubmrz.muckcraftmod.item.custom.MithrilArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MithrilArmorRenderer extends GeoArmorRenderer<MithrilArmorItem> {

    public MithrilArmorRenderer() {
        super(new MithrilArmorModel());
    }
}
