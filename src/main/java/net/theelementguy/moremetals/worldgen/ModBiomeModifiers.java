package net.theelementguy.moremetals.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.entity.animal.Panda;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.theelementguy.moremetals.MoreMetalsMod;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> ADD_CUBIC_ZIRCONIA_LARGE_ORE_KEY = registerKey("add_cubic_zirconia_large_ore");

    public static final ResourceKey<BiomeModifier> ADD_CUBIC_ZIRCONIA_MEDIUM_ORE_KEY = registerKey("add_cubic_zirconia_medium_ore");

    public static final ResourceKey<BiomeModifier> ADD_CUBIC_ZIRCONIA_SMALL_ORE_KEY = registerKey("add_cubic_zirconia_small_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_CUBIC_ZIRCONIA_LARGE_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CUBIC_ZIRCONIA_LARGE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CUBIC_ZIRCONIA_MEDIUM_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CUBIC_ZIRCONIA_MEDIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CUBIC_ZIRCONIA_SMALL_ORE_KEY, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CUBIC_ZIRCONIA_SMALL_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }
}
