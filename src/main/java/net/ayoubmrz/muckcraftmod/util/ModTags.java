package net.ayoubmrz.muckcraftmod.util;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_MITHRIL_TOOL = createTag("needs_mithril_tool");
        public static final TagKey<Block> INCORRECT_FOR_MITHRIL_TOOL = createTag("incorrect_for_mithril_tool");

        public static final TagKey<Block> NEEDS_ADAMANTITE_TOOL = createTag("needs_adamantite_tool");
        public static final TagKey<Block> INCORRECT_FOR_ADAMANTITE_TOOL = createTag("incorrect_for_adamantite_tool");

        public static final TagKey<Block> NEEDS_OBAMIUM_TOOL = createTag("needs_obamium_tool");
        public static final TagKey<Block> INCORRECT_FOR_OBAMIUM_TOOL = createTag("incorrect_for_obamium_tool");


        public static final TagKey<Block> MINEABLE_WITH_MITHRIL_PICKAXE =
                TagKey.of(RegistryKeys.BLOCK, Identifier.of(MuckCraftMod.MOD_ID, "mineable_with_mithril_pickaxe"));

        public static final TagKey<Block> MINEABLE_WITH_ADAMANTITE_PICKAXE =
                TagKey.of(RegistryKeys.BLOCK, Identifier.of(MuckCraftMod.MOD_ID, "mineable_with_adamantite_pickaxe"));


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MuckCraftMod.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> MITHRIL_PICKAXES =
                TagKey.of(RegistryKeys.ITEM, Identifier.of(MuckCraftMod.MOD_ID, "mithril_pickaxes"));

        public static final TagKey<Item> ADAMANTITE_PICKAXES =
                TagKey.of(RegistryKeys.ITEM, Identifier.of(MuckCraftMod.MOD_ID, "adamantite_pickaxes"));


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MuckCraftMod.MOD_ID, name));
        }
    }
}
