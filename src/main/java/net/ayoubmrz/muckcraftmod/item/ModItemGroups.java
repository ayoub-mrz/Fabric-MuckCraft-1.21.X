package net.ayoubmrz.muckcraftmod.item;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.ayoubmrz.muckcraftmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup MITHRIL_EQUIPMENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MuckCraftMod.MOD_ID, "aamithril_equipments"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MITHRIL_INGOT))
                    .displayName(Text.translatable("itemgroup.muckcraftmod.aamithril_equipments"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.MITHRIL_INGOT);
                        entries.add(ModItems.RAW_MITHRIL);

                        entries.add(ModBlocks.MITHRIL_BLOCK);
                        entries.add(ModBlocks.RAW_MITHRIL_BLOCK);
                        entries.add(ModBlocks.MITHRIL_ORE);
                        entries.add(ModBlocks.MITHRIL_DEEPSLATE_ORE);

                        entries.add(ModItems.MITHRIL_SWORD);
                        entries.add(ModItems.MITHRIL_PICKAXE);
                        entries.add(ModItems.MITHRIL_SHOVEL);
                        entries.add(ModItems.MITHRIL_AXE);
                        entries.add(ModItems.MITHRIL_HOE);

                        entries.add(ModItems.MITHRIL_HELMET);
                        entries.add(ModItems.MITHRIL_CHESTPLATE);
                        entries.add(ModItems.MITHRIL_LEGGINGS);
                        entries.add(ModItems.MITHRIL_BOOTS);

                        entries.add(ModItems.MITHRIL_HORSE_ARMOR);

                    }).build());

    public static final ItemGroup ADAMANTITE_EQUIPMENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MuckCraftMod.MOD_ID, "adamantite_equipments"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ADAMANTITE_INGOT))
                    .displayName(Text.translatable("itemgroup.muckcraftmod.adamantite_equipments"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.ADAMANTITE_INGOT);
                        entries.add(ModItems.RAW_ADAMANTITE);

                        entries.add(ModBlocks.ADAMANTITE_BLOCK);
                        entries.add(ModBlocks.RAW_ADAMANTITE_BLOCK);
                        entries.add(ModBlocks.ADAMANTITE_ORE);
                        entries.add(ModBlocks.ADAMANTITE_DEEPSLATE_ORE);

                        entries.add(ModItems.ADAMANTITE_SWORD);
                        entries.add(ModItems.ADAMANTITE_PICKAXE);
                        entries.add(ModItems.ADAMANTITE_SHOVEL);
                        entries.add(ModItems.ADAMANTITE_AXE);
                        entries.add(ModItems.ADAMANTITE_HOE);

                        entries.add(ModItems.ADAMANTITE_HELMET);
                        entries.add(ModItems.ADAMANTITE_CHESTPLATE);
                        entries.add(ModItems.ADAMANTITE_LEGGINGS);
                        entries.add(ModItems.ADAMANTITE_BOOTS);

                        entries.add(ModItems.ADAMANTITE_HORSE_ARMOR);

                    }).build());

    public static final ItemGroup OBAMIUM_EQUIPMENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MuckCraftMod.MOD_ID, "obamium_equipments"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.OBAMIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.muckcraftmod.obamium_equipments"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.OBAMIUM_INGOT);
                        entries.add(ModItems.RAW_OBAMIUM);

                        entries.add(ModBlocks.OBAMIUM_BLOCK);
                        entries.add(ModBlocks.RAW_OBAMIUM_BLOCK);
                        entries.add(ModBlocks.OBAMIUM_ORE);
                        entries.add(ModBlocks.OBAMIUM_DEEPSLATE_ORE);

                        entries.add(ModItems.OBAMIUM_SWORD);
                        entries.add(ModItems.OBAMIUM_PICKAXE);
                        entries.add(ModItems.OBAMIUM_SHOVEL);
                        entries.add(ModItems.OBAMIUM_AXE);
                        entries.add(ModItems.OBAMIUM_HOE);

                        entries.add(ModItems.OBAMIUM_HELMET);
                        entries.add(ModItems.OBAMIUM_CHESTPLATE);
                        entries.add(ModItems.OBAMIUM_LEGGINGS);
                        entries.add(ModItems.OBAMIUM_BOOTS);

                        entries.add(ModItems.OBAMIUM_HORSE_ARMOR);

                    }).build());

    public static final ItemGroup MUCK_MOBS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MuckCraftMod.MOD_ID, "muck_mobs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.WYVERN_CLAWS))
                    .displayName(Text.translatable("itemgroup.muckcraftmod.muck_mobs"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.GOBLIN_SPAWN_EGG);
                        entries.add(ModItems.LIL_DAVE_SPAWN_EGG);
                        entries.add(ModItems.BIG_WOLF_SPAWN_EGG);
                        entries.add(ModItems.FIRE_DAVE_SPAWN_EGG);
                        entries.add(ModItems.LIGHTNING_DAVE_SPAWN_EGG);
                        entries.add(ModItems.WATER_DAVE_SPAWN_EGG);
                        entries.add(ModItems.ROCK_GOLEM_SPAWN_EGG);
                        entries.add(ModItems.WYVERN_SPAWN_EGG);

                        entries.add(ModItems.RED_BALL);
                        entries.add(ModItems.BLUE_BALL);
                        entries.add(ModItems.YELLOW_BALL);

                        entries.add(ModItems.ANCIENT_BONE);
                        entries.add(ModItems.WYVERN_CLAWS);
                        entries.add(ModItems.COIN);

                        entries.add(ModItems.SWORD_HILT);
                        entries.add(ModItems.BLADE);

                    }).build());


    public static void registerItemGroups() {
        MuckCraftMod.LOGGER.info("Registering Item Groups for " + MuckCraftMod.MOD_ID);
    }
}

