package net.theelementguy.moremetals.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.theelementguy.moremetals.MoreMetalsMod;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> CUBIC_ZIRCONIA_LARGE_ORE_PLACED_KEY = registerKey("cubic_zirconia_large_ore_placed");

    public static final ResourceKey<PlacedFeature> CUBIC_ZIRCONIA_MEDIUM_ORE_PLACED_KEY = registerKey("cubic_zirconia_medium_ore_placed");

    public static final ResourceKey<PlacedFeature> CUBIC_ZIRCONIA_SMALL_ORE_PLACED_KEY = registerKey("cubic_zirconia_small_ore_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, CUBIC_ZIRCONIA_MEDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CUBIC_ZIRCONIA_MEDIUM_ORE_KEY), ModOrePlacemet.commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(48))));

        register(context, CUBIC_ZIRCONIA_SMALL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CUBIC_ZIRCONIA_SMALL_ORE_KEY), ModOrePlacemet.commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(48))));

        register(context, CUBIC_ZIRCONIA_LARGE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CUBIC_ZIRCONIA_LARGE_ORE_KEY), ModOrePlacemet.rareOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.absolute(-48), VerticalAnchor.absolute(0))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
