package net.theelementguy.tegmoremetals.worldgen;

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
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> CUBIC_ZIRCONIA_LARGE_ORE_KEY = registerKey("lagre_cubic_zirconia");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CUBIC_ZIRCONIA_MEDIUM_ORE_KEY = registerKey("medium_cubic_zirconia");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CUBIC_ZIRCONIA_SMALL_ORE_KEY = registerKey("small_cubic_zirconia");

    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBIDIUM_LARGE_ORE_KEY = registerKey("large_rubidium");

    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBIDIUM_SMALL_ORE_KEY = registerKey("small_rubidium");

    public static final ResourceKey<ConfiguredFeature<?, ?>> STARSHARD_SMALL_ORE_KEY = registerKey("small_starshard");

    public static final ResourceKey<ConfiguredFeature<?, ?>> STARSHARD_LARGE_ORE_KEY = registerKey("large_starshard");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLOODSTONE_LARGE_ORE_KEY = registerKey("large_bloodstone");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLOODSTONE_SMALL_ORE_KEY = registerKey("small_bloodstone");

	public static final ResourceKey<ConfiguredFeature<?, ?>> TENUMBRUM_LARGE_ORE_KEY = registerKey("large_tenumbrum");

	public static final ResourceKey<ConfiguredFeature<?, ?>> TENUMBRUM_SMALL_ORE_KEY = registerKey("small_tenumbrum");

	public static final ResourceKey<ConfiguredFeature<?, ?>> TENUMBRUM_EXTRA_ORE_KEY = registerKey("extra_tenumbrum");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceabes = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceabes = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endStoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> cubicZirconiaOres = List.of(OreConfiguration.target(stoneReplaceabes, ModBlocks.CUBIC_ZIRCONIA_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceabes, ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> rubidiumOres = List.of(OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_RUBIDIUM_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> starshardOres = List.of(OreConfiguration.target(endStoneReplaceables, ModBlocks.END_STARSHARD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> bloodstoneOres = List.of(OreConfiguration.target(stoneReplaceabes, ModBlocks.BLOODSTONE_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceabes, ModBlocks.DEEPSLATE_BLOODSTONE_ORE.get().defaultBlockState()));

		List<OreConfiguration.TargetBlockState> tenumbrumOres = List.of(OreConfiguration.target(stoneReplaceabes, ModBlocks.TENUMBRUM_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceabes, ModBlocks.DEEPSLATE_TENUMBRUM_ORE.get().defaultBlockState()));

        register(context, CUBIC_ZIRCONIA_LARGE_ORE_KEY, Feature.ORE, new OreConfiguration(cubicZirconiaOres, 16, 0.7f));

        register(context, CUBIC_ZIRCONIA_MEDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(cubicZirconiaOres, 9, 0.5f));

        register(context, CUBIC_ZIRCONIA_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(cubicZirconiaOres, 2, 0.5f));

        register(context, RUBIDIUM_LARGE_ORE_KEY, Feature.ORE, new OreConfiguration(rubidiumOres, 4));

        register(context, RUBIDIUM_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(rubidiumOres, 1));

        register(context, STARSHARD_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(starshardOres, 1));

        register(context, STARSHARD_LARGE_ORE_KEY, Feature.ORE, new OreConfiguration(starshardOres, 3));

        register(context, BLOODSTONE_LARGE_ORE_KEY, Feature.ORE, new OreConfiguration(bloodstoneOres, 6));

        register(context, BLOODSTONE_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(bloodstoneOres, 2));

		register(context, TENUMBRUM_LARGE_ORE_KEY, Feature.ORE, new OreConfiguration(tenumbrumOres, 6));

		register(context, TENUMBRUM_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(tenumbrumOres, 1));

		register(context, TENUMBRUM_EXTRA_ORE_KEY, Feature.ORE, new OreConfiguration(tenumbrumOres, 3));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}