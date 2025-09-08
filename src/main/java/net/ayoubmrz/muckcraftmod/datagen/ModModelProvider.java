package net.ayoubmrz.muckcraftmod.datagen;

import net.ayoubmrz.muckcraftmod.block.ModBlocks;
import net.ayoubmrz.muckcraftmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MITHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_MITHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MITHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MITHRIL_DEEPSLATE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ADAMANTITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTITE_DEEPSLATE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBAMIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_OBAMIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBAMIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBAMIUM_DEEPSLATE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.MITHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MITHRIL, Models.GENERATED);

        itemModelGenerator.register(ModItems.MITHRIL_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.MITHRIL_HORSE_ARMOR, Models.GENERATED);


        itemModelGenerator.register(ModItems.ADAMANTITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ADAMANTITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.ADAMANTITE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTITE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTITE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTITE_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.ADAMANTITE_HORSE_ARMOR, Models.GENERATED);


        itemModelGenerator.register(ModItems.OBAMIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_OBAMIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.OBAMIUM_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBAMIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBAMIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBAMIUM_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.OBAMIUM_HORSE_ARMOR, Models.GENERATED);

        // Muck Entities
        itemModelGenerator.register(ModItems.GOBLIN_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.LIL_DAVE_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(ModItems.FIRE_DAVE_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(ModItems.WATER_DAVE_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(ModItems.LIGHTNING_DAVE_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.BIG_WOLF_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.ROCK_GOLEM_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.WYVERN_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.RED_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.WYVERN_CLAWS, Models.GENERATED);


    }
}
