package net.ayoubmrz.muckcraftmod.datagen;

import net.ayoubmrz.muckcraftmod.block.ModBlocks;
import net.ayoubmrz.muckcraftmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MITHRIL_BLOCK)
                .add(ModBlocks.RAW_MITHRIL_BLOCK)
                .add(ModBlocks.MITHRIL_ORE)
                .add(ModBlocks.MITHRIL_DEEPSLATE_ORE)

                .add(ModBlocks.ADAMANTITE_BLOCK)
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK)
                .add(ModBlocks.ADAMANTITE_ORE)
                .add(ModBlocks.ADAMANTITE_DEEPSLATE_ORE)

                .add(ModBlocks.OBAMIUM_BLOCK)
                .add(ModBlocks.RAW_OBAMIUM_BLOCK)
                .add(ModBlocks.OBAMIUM_ORE)
                .add(ModBlocks.OBAMIUM_DEEPSLATE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.MITHRIL_BLOCK)
                .add(ModBlocks.RAW_MITHRIL_BLOCK)
                .add(ModBlocks.MITHRIL_ORE)
                .add(ModBlocks.MITHRIL_DEEPSLATE_ORE)

                .add(ModBlocks.ADAMANTITE_BLOCK)
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK)
                .add(ModBlocks.ADAMANTITE_ORE)
                .add(ModBlocks.ADAMANTITE_DEEPSLATE_ORE)

                .add(ModBlocks.OBAMIUM_BLOCK)
                .add(ModBlocks.RAW_OBAMIUM_BLOCK)
                .add(ModBlocks.OBAMIUM_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.MINEABLE_WITH_MITHRIL_PICKAXE)
                .add(ModBlocks.ADAMANTITE_ORE)
                .add(ModBlocks.ADAMANTITE_DEEPSLATE_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.MINEABLE_WITH_ADAMANTITE_PICKAXE)
                .add(ModBlocks.ADAMANTITE_ORE)
                .add(ModBlocks.ADAMANTITE_DEEPSLATE_ORE)
                .add(ModBlocks.OBAMIUM_ORE)
                .add(ModBlocks.OBAMIUM_DEEPSLATE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.MITHRIL_ORE)
                .add(ModBlocks.MITHRIL_DEEPSLATE_ORE);

    }
}
