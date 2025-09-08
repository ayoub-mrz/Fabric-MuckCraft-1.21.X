package net.ayoubmrz.muckcraftmod.block;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

//    -----------------------------------------  Mithril Blocks  --------------------------------------------------------
    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block",
            new Block (AbstractBlock.Settings.create().strength(50.0F, 1200.0F).requiresTool()
                    .sounds(BlockSoundGroup.NETHERITE)));
    public static final Block RAW_MITHRIL_BLOCK = registerBlock("raw_mithril_block",
            new Block (AbstractBlock.Settings.create().strength(5.0F, 6.0F).requiresTool()));

    public static final Block MITHRIL_ORE = registerBlock("mithril_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(20.0F, 300.0F).requiresTool()));
    public static final Block MITHRIL_DEEPSLATE_ORE = registerBlock("mithril_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(20.5F, 300.0F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
//    -------------------------------------------------------------------------------------------------

//    -----------------------------------------  Adamantite Blocks  --------------------------------------------------------
    public static final Block ADAMANTITE_BLOCK = registerBlock("adamantite_block",
            new Block (AbstractBlock.Settings.create().strength(50.0F, 1200.0F).requiresTool()
                    .sounds(BlockSoundGroup.NETHERITE)));
    public static final Block RAW_ADAMANTITE_BLOCK = registerBlock("raw_adamantite_block",
            new Block (AbstractBlock.Settings.create().strength(5.0F, 6.0F).requiresTool()));

    public static final Block ADAMANTITE_ORE = registerBlock("adamantite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(30.0F, 700.0F).requiresTool()));
    public static final Block ADAMANTITE_DEEPSLATE_ORE = registerBlock("adamantite_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(30.0F, 700.0F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
//    -------------------------------------------------------------------------------------------------

//    -----------------------------------------  Obamium Blocks  --------------------------------------------------------
public static final Block OBAMIUM_BLOCK = registerBlock("obamium_block",
        new Block (AbstractBlock.Settings.create().strength(50.0F, 1200.0F).requiresTool()
                .sounds(BlockSoundGroup.NETHERITE)));
    public static final Block RAW_OBAMIUM_BLOCK = registerBlock("raw_obamium_block",
            new Block (AbstractBlock.Settings.create().strength(5.0F, 6.0F).requiresTool()));

    public static final Block OBAMIUM_ORE = registerBlock("obamium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(40.0F, 900.0F).requiresTool()));
    public static final Block OBAMIUM_DEEPSLATE_ORE = registerBlock("obamium_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(40.0F, 900.0F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
//    -------------------------------------------------------------------------------------------------


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MuckCraftMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MuckCraftMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MuckCraftMod.LOGGER.info("Registering Mod Blocks For " + MuckCraftMod.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(RAW_MITHRIL_BLOCK);
            entries.add(MITHRIL_ORE);
            entries.add(MITHRIL_DEEPSLATE_ORE);

            entries.add(RAW_ADAMANTITE_BLOCK);
            entries.add(ADAMANTITE_ORE);
            entries.add(ADAMANTITE_DEEPSLATE_ORE);

            entries.add(RAW_OBAMIUM_BLOCK);
            entries.add(OBAMIUM_ORE);
            entries.add(OBAMIUM_DEEPSLATE_ORE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(MITHRIL_BLOCK);
            entries.add(ADAMANTITE_BLOCK);
            entries.add(OBAMIUM_BLOCK);
        });
    }

}
