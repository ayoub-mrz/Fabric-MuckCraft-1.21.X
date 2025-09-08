package net.ayoubmrz.muckcraftmod.world;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.ayoubmrz.muckcraftmod.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> MITHRIL_ORE_KEY = registerKey("mithril_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ADAMANTITE_ORE_KEY = registerKey("adamantite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OBAMIUM_ORE_KEY = registerKey("obamium_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldMithrilOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.MITHRIL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.MITHRIL_DEEPSLATE_ORE.getDefaultState()));

        register(context, MITHRIL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMithrilOres, 5));

        List<OreFeatureConfig.Target> overworldAdamantiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ADAMANTITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.ADAMANTITE_DEEPSLATE_ORE.getDefaultState()));

        register(context, ADAMANTITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAdamantiteOres, 4));

        List<OreFeatureConfig.Target> overworldObamiumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.OBAMIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.OBAMIUM_DEEPSLATE_ORE.getDefaultState()));

        register(context, OBAMIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldObamiumOres, 4));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MuckCraftMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}