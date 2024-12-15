package net.theelementguy.moremetals.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> CUBIC_ZIRCONIA_LARGE_ORE_KEY = registerKey("lagre_cubic_zirconia");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CUBIC_ZIRCONIA_MEDIUM_ORE_KEY = registerKey("medium_cubic_zirconia");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CUBIC_ZIRCONIA_SMALL_ORE_KEY = registerKey("small_cubic_zirconia");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceabes = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceabes = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> cubicZirconiaOres = List.of(OreConfiguration.target(stoneReplaceabes, ModBlocks.CUBIC_ZIRCONIA_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceabes, ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get().defaultBlockState()));

        register(context, CUBIC_ZIRCONIA_LARGE_ORE_KEY, Feature.ORE, new OreConfiguration(cubicZirconiaOres, 16, 0.7f));

        register(context, CUBIC_ZIRCONIA_MEDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(cubicZirconiaOres, 9, 0.5f));

        register(context, CUBIC_ZIRCONIA_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(cubicZirconiaOres, 2, 0.5f));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
