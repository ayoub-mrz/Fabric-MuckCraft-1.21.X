package net.ayoubmrz.muckcraftmod.item.custom;

import net.ayoubmrz.muckcraftmod.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class MithrilPickaxeItem extends PickaxeItem {


    public MithrilPickaxeItem(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    @Override
    public boolean isCorrectForDrops(ItemStack stack, BlockState state) {
        return state.isIn(ModTags.Blocks.MINEABLE_WITH_MITHRIL_PICKAXE);
    }

}
