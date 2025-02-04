package com.neofastftl.ultoolmate.worldgen;

import com.neofastftl.ultoolmate.Ultoolmate;
import com.neofastftl.ultoolmate.blocks.CustomBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class CustomConFeat {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RAW_ELECTRUM_ORE_KEY = registerKey("raw_electrum_ore");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldRawElectrumOres = List.of(
                OreConfiguration.target(stoneReplaceables, CustomBlocks.RAW_ELECTRUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CustomBlocks.DEEPSLATE_RAW_ELECTRUM_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_RAW_ELECTRUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRawElectrumOres, 9));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Ultoolmate.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
