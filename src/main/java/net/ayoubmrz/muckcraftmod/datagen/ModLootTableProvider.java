package net.ayoubmrz.muckcraftmod.datagen;

import net.ayoubmrz.muckcraftmod.block.ModBlocks;
import net.ayoubmrz.muckcraftmod.item.ModItems;
import net.ayoubmrz.muckcraftmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MITHRIL_BLOCK);
        addDrop(ModBlocks.RAW_MITHRIL_BLOCK);

        addDrop(ModBlocks.MITHRIL_ORE, oreDrops(ModBlocks.MITHRIL_ORE, ModItems.RAW_MITHRIL));
        addDrop(ModBlocks.MITHRIL_DEEPSLATE_ORE,
                multipleOreDrops(ModBlocks.MITHRIL_DEEPSLATE_ORE, ModItems.RAW_MITHRIL, 1, 2));

        addDrop(ModBlocks.ADAMANTITE_BLOCK);
        addDrop(ModBlocks.RAW_ADAMANTITE_BLOCK);

        addDrop(ModBlocks.ADAMANTITE_ORE,
                dropsWithSilkTouch(ModBlocks.ADAMANTITE_ORE,
                        applyExplosionDecay(ModBlocks.ADAMANTITE_ORE,
                                ItemEntry.builder(ModItems.RAW_ADAMANTITE)
                                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)))
                                        .conditionally(MatchToolLootCondition.builder(
                                                ItemPredicate.Builder.create()
                                                        .tag(ModTags.Items.MITHRIL_PICKAXES)
                                        ))
                        )
                )
        );
        addDrop(ModBlocks.ADAMANTITE_DEEPSLATE_ORE,
                dropsWithSilkTouch(ModBlocks.ADAMANTITE_DEEPSLATE_ORE,
                        applyExplosionDecay(ModBlocks.ADAMANTITE_DEEPSLATE_ORE,
                                ItemEntry.builder(ModItems.RAW_ADAMANTITE)
                                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)))
                                        .conditionally(MatchToolLootCondition.builder(
                                                ItemPredicate.Builder.create()
                                                        .tag(ModTags.Items.MITHRIL_PICKAXES)

                                        ))
                        )
                )
        );

        addDrop(ModBlocks.OBAMIUM_BLOCK);
        addDrop(ModBlocks.RAW_OBAMIUM_BLOCK);

        addDrop(ModBlocks.OBAMIUM_ORE,
                dropsWithSilkTouch(ModBlocks.OBAMIUM_ORE,
                        applyExplosionDecay(ModBlocks.OBAMIUM_ORE,
                                ItemEntry.builder(ModItems.RAW_OBAMIUM)
                                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)))
                                        .conditionally(MatchToolLootCondition.builder(
                                                ItemPredicate.Builder.create()
                                                        .tag(ModTags.Items.ADAMANTITE_PICKAXES)
                                        ))
                        )
                )
        );
        addDrop(ModBlocks.OBAMIUM_DEEPSLATE_ORE,
                dropsWithSilkTouch(ModBlocks.OBAMIUM_DEEPSLATE_ORE,
                        applyExplosionDecay(ModBlocks.OBAMIUM_DEEPSLATE_ORE,
                                ItemEntry.builder(ModItems.RAW_OBAMIUM)
                                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)))
                                        .conditionally(MatchToolLootCondition.builder(
                                                ItemPredicate.Builder.create()
                                                        .tag(ModTags.Items.ADAMANTITE_PICKAXES)
                                        ))
                        )
                )
        );

    }


    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }



}
