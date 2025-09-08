package net.ayoubmrz.muckcraftmod.item;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.ayoubmrz.muckcraftmod.item.custom.AdamantiteArmorItem;
import net.ayoubmrz.muckcraftmod.item.custom.MithrilArmorItem;
import net.ayoubmrz.muckcraftmod.item.custom.ObamiumArmorItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
//    -----------------------------------------  Mithril Items  --------------------------------------------------------
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot", new Item(new Item.Settings()));
    public static final Item RAW_MITHRIL = registerItem("raw_mithril", new Item(new Item.Settings()));

    public static final Item MITHRIL_SWORD = registerItem("mithril_sword",
            new SwordItem(ModToolMaterials.MITHRIL, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.MITHRIL, 3, -2.4f))));
    public static final Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe",
            new PickaxeItem(ModToolMaterials.MITHRIL, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.MITHRIL, 1, -2.8f))));
    public static final Item MITHRIL_SHOVEL = registerItem("mithril_shovel",
            new ShovelItem(ModToolMaterials.MITHRIL, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.MITHRIL, 1.5f, -3.0f))));
    public static final Item MITHRIL_AXE = registerItem("mithril_axe",
            new AxeItem(ModToolMaterials.MITHRIL, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.MITHRIL, 6, -3f))));
    public static final Item MITHRIL_HOE = registerItem("mithril_hoe",
            new HoeItem(ModToolMaterials.MITHRIL, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.MITHRIL, 0, -3f))));

    public static final Item MITHRIL_HELMET = registerItem("mithril_helmet",
            new MithrilArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(30))));
    public static final Item MITHRIL_CHESTPLATE = registerItem("mithril_chestplate",
            new MithrilArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(30))));
    public static final Item MITHRIL_LEGGINGS = registerItem("mithril_leggings",
            new MithrilArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(30))));
    public static final Item MITHRIL_BOOTS = registerItem("mithril_boots",
            new MithrilArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(30))));

    public static final Item MITHRIL_HORSE_ARMOR = registerItem("mithril_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));
//  ----------------------------------------------------------------------------------------------------

//    -----------------------------------------  Adamantite Items  --------------------------------------------------------
public static final Item ADAMANTITE_INGOT = registerItem("adamantite_ingot", new Item(new Item.Settings()));
    public static final Item RAW_ADAMANTITE = registerItem("raw_adamantite", new Item(new Item.Settings()));

    public static final Item ADAMANTITE_SWORD = registerItem("adamantite_sword",
            new SwordItem(ModToolMaterials.ADAMANTITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ADAMANTITE, 3, -2.4f))));
    public static final Item ADAMANTITE_PICKAXE = registerItem("adamantite_pickaxe",
            new PickaxeItem(ModToolMaterials.ADAMANTITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ADAMANTITE, 1, -2.8f))));
    public static final Item ADAMANTITE_SHOVEL = registerItem("adamantite_shovel",
            new ShovelItem(ModToolMaterials.ADAMANTITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ADAMANTITE, 1.5f, -3.0f))));
    public static final Item ADAMANTITE_AXE = registerItem("adamantite_axe",
            new AxeItem(ModToolMaterials.ADAMANTITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ADAMANTITE, 6, -3f))));
    public static final Item ADAMANTITE_HOE = registerItem("adamantite_hoe",
            new HoeItem(ModToolMaterials.ADAMANTITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ADAMANTITE, 0, -3f))));

    public static final Item ADAMANTITE_HELMET = registerItem("adamantite_helmet",
            new AdamantiteArmorItem(ModArmorMaterials.ADAMANTITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(27))));
    public static final Item ADAMANTITE_CHESTPLATE = registerItem("adamantite_chestplate",
            new AdamantiteArmorItem(ModArmorMaterials.ADAMANTITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(27))));
    public static final Item ADAMANTITE_LEGGINGS = registerItem("adamantite_leggings",
            new AdamantiteArmorItem(ModArmorMaterials.ADAMANTITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(27))));
    public static final Item ADAMANTITE_BOOTS = registerItem("adamantite_boots",
            new AdamantiteArmorItem(ModArmorMaterials.ADAMANTITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(27))));

    public static final Item ADAMANTITE_HORSE_ARMOR = registerItem("adamantite_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.ADAMANTITE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

//  ----------------------------------------------------------------------------------------------------

//    -----------------------------------------  Obamium Items  --------------------------------------------------------
public static final Item OBAMIUM_INGOT = registerItem("obamium_ingot", new Item(new Item.Settings()));
    public static final Item RAW_OBAMIUM = registerItem("raw_obamium", new Item(new Item.Settings()));

    public static final Item OBAMIUM_SWORD = registerItem("obamium_sword",
            new SwordItem(ModToolMaterials.OBAMIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OBAMIUM, 3, -2.2f))));
    public static final Item OBAMIUM_PICKAXE = registerItem("obamium_pickaxe",
            new PickaxeItem(ModToolMaterials.OBAMIUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.OBAMIUM, 1, -2.8f))));
    public static final Item OBAMIUM_SHOVEL = registerItem("obamium_shovel",
            new ShovelItem(ModToolMaterials.OBAMIUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.OBAMIUM, 1.5f, -3.0f))));
    public static final Item OBAMIUM_AXE = registerItem("obamium_axe",
            new AxeItem(ModToolMaterials.OBAMIUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.OBAMIUM, 6, -3f))));
    public static final Item OBAMIUM_HOE = registerItem("obamium_hoe",
            new HoeItem(ModToolMaterials.OBAMIUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.OBAMIUM, 0, -3f))));

    public static final Item OBAMIUM_HELMET = registerItem("obamium_helmet",
            new ObamiumArmorItem(ModArmorMaterials.OBAMIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
    public static final Item OBAMIUM_CHESTPLATE = registerItem("obamium_chestplate",
            new ObamiumArmorItem(ModArmorMaterials.OBAMIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
    public static final Item OBAMIUM_LEGGINGS = registerItem("obamium_leggings",
            new ObamiumArmorItem(ModArmorMaterials.OBAMIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
    public static final Item OBAMIUM_BOOTS = registerItem("obamium_boots",
            new ObamiumArmorItem(ModArmorMaterials.OBAMIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));

    public static final Item OBAMIUM_HORSE_ARMOR = registerItem("obamium_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.OBAMIUM_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));
//  ----------------------------------------------------------------------------------------------------


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MuckCraftMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MuckCraftMod.LOGGER.info("Registering Mod Items for " + MuckCraftMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MITHRIL_INGOT);
            entries.add(RAW_MITHRIL);

            entries.add(ADAMANTITE_INGOT);
            entries.add(RAW_ADAMANTITE);

            entries.add(OBAMIUM_INGOT);
            entries.add(RAW_OBAMIUM);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(MITHRIL_SWORD);
            entries.add(MITHRIL_AXE);
            entries.add(MITHRIL_HELMET);
            entries.add(MITHRIL_CHESTPLATE);
            entries.add(MITHRIL_LEGGINGS);
            entries.add(MITHRIL_BOOTS);
            entries.add(MITHRIL_HORSE_ARMOR);

            entries.add(ADAMANTITE_SWORD);
            entries.add(ADAMANTITE_AXE);
            entries.add(ADAMANTITE_HELMET);
            entries.add(ADAMANTITE_CHESTPLATE);
            entries.add(ADAMANTITE_LEGGINGS);
            entries.add(ADAMANTITE_BOOTS);
            entries.add(ADAMANTITE_HORSE_ARMOR);

            entries.add(OBAMIUM_SWORD);
            entries.add(OBAMIUM_AXE);
            entries.add(OBAMIUM_HELMET);
            entries.add(OBAMIUM_CHESTPLATE);
            entries.add(OBAMIUM_LEGGINGS);
            entries.add(OBAMIUM_BOOTS);
            entries.add(OBAMIUM_HORSE_ARMOR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(MITHRIL_PICKAXE);
            entries.add(MITHRIL_SHOVEL);
            entries.add(MITHRIL_AXE);
            entries.add(MITHRIL_HOE);

            entries.add(ADAMANTITE_PICKAXE);
            entries.add(ADAMANTITE_SHOVEL);
            entries.add(ADAMANTITE_AXE);
            entries.add(ADAMANTITE_HOE);

            entries.add(OBAMIUM_PICKAXE);
            entries.add(OBAMIUM_SHOVEL);
            entries.add(OBAMIUM_AXE);
            entries.add(OBAMIUM_HOE);
        });
    }
}
