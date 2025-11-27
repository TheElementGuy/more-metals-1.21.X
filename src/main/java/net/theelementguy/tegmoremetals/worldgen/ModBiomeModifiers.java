package net.theelementguy.tegmoremetals.worldgen;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.theelementguy.tegmoremetals.MoreMetalsMod;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> ADD_CUBIC_ZIRCONIA_LARGE_ORE_KEY = registerKey("add_cubic_zirconia_large_ore");

    public static final ResourceKey<BiomeModifier> ADD_CUBIC_ZIRCONIA_MEDIUM_ORE_KEY = registerKey("add_cubic_zirconia_medium_ore");

    public static final ResourceKey<BiomeModifier> ADD_CUBIC_ZIRCONIA_SMALL_ORE_KEY = registerKey("add_cubic_zirconia_small_ore");

    public static final ResourceKey<BiomeModifier> ADD_TIN_SMALL_ORE_KEY = registerKey("add_tin_small_ore");

    public static final ResourceKey<BiomeModifier> ADD_TIN_LARGE_ORE_KEY = registerKey("add_tin_large_ore");

    public static final ResourceKey<BiomeModifier> ADD_TIN_LARGE_EXTRA_ORE_KEY = registerKey("add_tin_large_extra_ore");

    public static final ResourceKey<BiomeModifier> ADD_RUBIDIUM_LARGE_ORE_KEY = registerKey("add_rubidium_large_ore");

    public static final ResourceKey<BiomeModifier> ADD_RUBIDIUIM_SMALL_ORE_KEY = registerKey("add_rubidium_small_ore");

    public static final ResourceKey<BiomeModifier> ADD_STARSHARD_LARGE_ORE_KEY = registerKey("add_starshard_large_ore");

    public static final ResourceKey<BiomeModifier> ADD_STARSHARD_SMALL_ORE_KEY = registerKey("add_starshard_small_ore");

    public static final ResourceKey<BiomeModifier> ADD_BLOODSTONE_LARGE_ORE_KEY = registerKey("add_bloodstone_large_ore");

    public static final ResourceKey<BiomeModifier> ADD_BLOODSTONE_SMALL_ORE_KEY = registerKey("add_bloodstone_small_ore");

	public static final ResourceKey<BiomeModifier> ADD_TENUMBRUM_LARGE_ORE_KEY = registerKey("add_tenumbrum_large_ore");

	public static final ResourceKey<BiomeModifier> ADD_TENUMBRUM_SMALL_ORE_KEY = registerKey("add_tenumbrum_small_ore");

	public static final ResourceKey<BiomeModifier> ADD_TENUMBRUM_EXTRA_ORE_KEY = registerKey("add_tenumbrum_extra_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {

        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_CUBIC_ZIRCONIA_LARGE_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CUBIC_ZIRCONIA_LARGE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CUBIC_ZIRCONIA_MEDIUM_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CUBIC_ZIRCONIA_MEDIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CUBIC_ZIRCONIA_SMALL_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CUBIC_ZIRCONIA_SMALL_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_TIN_SMALL_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TIN_SMALL_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_TIN_LARGE_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TIN_LARGE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RUBIDIUM_LARGE_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.RUBIDIUM_LARGE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RUBIDIUIM_SMALL_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.RUBIDIUM_SMALL_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_STARSHARD_LARGE_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.STARSHARD_LARGEE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_STARSHARD_SMALL_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.STARSHARD_SMALL_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_TIN_LARGE_EXTRA_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TIN_LARGE_EXTRA_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLOODSTONE_LARGE_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.BLOODSTONE_LARGE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        registerOre(context, ADD_BLOODSTONE_SMALL_ORE_KEY, ModPlacedFeatures.BLOODSTONE_SMALL_ORE_PLACED_KEY);

		registerOre(context, ADD_TENUMBRUM_LARGE_ORE_KEY, ModPlacedFeatures.TENUMBRUM_LARGE_ORE_PLACED_KEY);

		registerOre(context, ADD_TENUMBRUM_SMALL_ORE_KEY, ModPlacedFeatures.TENUMBRUM_SMALL_ORE_PLACED_KEY);

		context.register(ADD_TENUMBRUM_EXTRA_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(HolderSet.direct(biomes.getOrThrow(Biomes.PALE_GARDEN)), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TENUMBRUM_EXTRA_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

    private static void registerOre(BootstrapContext<BiomeModifier> context, ResourceKey<BiomeModifier> key, ResourceKey<PlacedFeature> key2) {
        registerModifier(context, key, Tags.Biomes.IS_OVERWORLD, key2);
    }

    private static void registerModifier(BootstrapContext<BiomeModifier> context, ResourceKey<BiomeModifier> key, TagKey<Biome> tag, ResourceKey<PlacedFeature> placedFeatureResourceKey) {

        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> placedFeatureHolderGetter = context.lookup(Registries.PLACED_FEATURE);

        context.register(key, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(tag), HolderSet.direct(placedFeatureHolderGetter.getOrThrow(placedFeatureResourceKey)), GenerationStep.Decoration.UNDERGROUND_ORES));
    }
}