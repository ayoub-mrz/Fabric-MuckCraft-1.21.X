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
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // Block loot tables
        generateBlockLoot();

        // Entity loot tables
        generateEntityLoot();
    }

    private void generateBlockLoot() {
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

    private void generateEntityLoot() {
        BiConsumer<RegistryKey<LootTable>, LootTable.Builder> consumer = this::accept;

        // Goblin loot table
        RegistryKey<LootTable> goblinLootTableKey = RegistryKey.of(RegistryKeys.LOOT_TABLE,
                Identifier.of("goblinmod", "entities/goblin"));

        consumer.accept(
                goblinLootTableKey,
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.05f))
                                .with(ItemEntry.builder(ModItems.ANCIENT_BONE)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(1.0f, 1.0f)
                                        ))
                                )
                        )
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(1f))
                                .with(ItemEntry.builder(ModItems.COIN)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(6.0f, 12.0f)
                                        ))
                                )
                        )
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.05f))
                                .with(ItemEntry.builder(Items.GOLD_ORE)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(5.0f, 15.0f)
                                        ))
                                )
                        )
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.005f))
                                .with(ItemEntry.builder(ModItems.SWORD_HILT)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(1.0f, 1.0f)
                                        ))
                                )
                        )
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.005f))
                                .with(ItemEntry.builder(ModItems.BLADE)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(1.0f, 1.0f)
                                        ))
                                )
                        )
        );

        // Lil Dave loot table
        RegistryKey<LootTable> daveLootTableKey = RegistryKey.of(RegistryKeys.LOOT_TABLE,
                Identifier.of("goblinmod", "entities/lil_dave"));

        consumer.accept(
                daveLootTableKey,
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(1f))
                                .with(ItemEntry.builder(ModItems.COIN)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(4.0f, 7.0f)
                                        ))
                                )
                        )
        );

        // Fire Dave loot table
        RegistryKey<LootTable> FireDaveLootTableKey = RegistryKey.of(RegistryKeys.LOOT_TABLE,
                Identifier.of("goblinmod", "entities/fire_dave"));

        consumer.accept(
                FireDaveLootTableKey,
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(1f))
                                .with(ItemEntry.builder(ModItems.COIN)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(10.0f, 20.0f)
                                        ))
                                )
                        )
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.08f))
                                .with(ItemEntry.builder(ModItems.RED_BALL)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(4.0f, 8.0f)
                                        ))
                                )
                        )
        );

        // Water Dave loot table
        RegistryKey<LootTable> WaterDaveLootTableKey = RegistryKey.of(RegistryKeys.LOOT_TABLE,
                Identifier.of("goblinmod", "entities/water_dave"));

        consumer.accept(
                WaterDaveLootTableKey,
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(1f))
                                .with(ItemEntry.builder(ModItems.COIN)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(10.0f, 20.0f)
                                        ))
                                )
                        )
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.08f))
                                .with(ItemEntry.builder(ModItems.BLUE_BALL)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(4.0f, 8.0f)
                                        ))
                                )
                        )
        );

        // Lightning Dave loot table
        RegistryKey<LootTable> LightningDaveLootTableKey = RegistryKey.of(RegistryKeys.LOOT_TABLE,
                Identifier.of("goblinmod", "entities/lightning_dave"));

        consumer.accept(
                LightningDaveLootTableKey,
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(1f))
                                .with(ItemEntry.builder(ModItems.COIN)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(10.0f, 20.0f)
                                        ))
                                )
                        )
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.08f))
                                .with(ItemEntry.builder(ModItems.YELLOW_BALL)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(4.0f, 8.0f)
                                        ))
                                )
                        )
        );

        // Big Wolf loot table
        RegistryKey<LootTable> WolfLootTableKey = RegistryKey.of(RegistryKeys.LOOT_TABLE,
                Identifier.of("goblinmod", "entities/big_wolf"));

        consumer.accept(
                WolfLootTableKey,
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(1f))
                                .with(ItemEntry.builder(ModItems.COIN)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(5.0f, 15.0f)
                                        ))
                                )
                        )
        );

        // Rock Golem loot table
        RegistryKey<LootTable> RockGolemLootTableKey = RegistryKey.of(RegistryKeys.LOOT_TABLE,
                Identifier.of("goblinmod", "entities/rock_golem"));

        consumer.accept(
                RockGolemLootTableKey,
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(1f))
                                .with(ItemEntry.builder(ModItems.COIN)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(12.0f, 16.0f)
                                        ))
                                )
                        )
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(1f))
                                .with(ItemEntry.builder(Items.COBBLED_DEEPSLATE)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(2.0f, 4.0f)
                                        ))
                                )
                        )
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.5f))
                                .with(ItemEntry.builder(Items.FLINT)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(2.0f, 4.0f)
                                        ))
                                )
                        )
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.1f))
                                .with(ItemEntry.builder(Items.IRON_ORE)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(1.0f, 2.0f)
                                        ))
                                )
                        )
        );

        // Wyvern loot table
        RegistryKey<LootTable> WyvernLootTableKey = RegistryKey.of(RegistryKeys.LOOT_TABLE,
                Identifier.of("goblinmod", "entities/wyvern"));

        consumer.accept(
                WyvernLootTableKey,
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(1f))
                                .with(ItemEntry.builder(ModItems.COIN)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(15.0f, 30.0f)
                                        ))
                                )
                        )
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.05f))
                                .with(ItemEntry.builder(Items.GOLD_INGOT)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(2.0f, 8.0f)
                                        ))
                                )
                        )
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.03f))
                                .with(ItemEntry.builder(ModItems.WYVERN_CLAWS)
                                        .apply(SetCountLootFunction.builder(
                                                UniformLootNumberProvider.create(1.0f, 1.0f)
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

    // Helper method to accept entity loot tables
    private void accept(RegistryKey<LootTable> key, LootTable.Builder builder) {
        // This method uses the internal mechanism of FabricBlockLootTableProvider
        // to add entity loot tables alongside block loot tables
        this.lootTables.put(key, builder);
    }
}