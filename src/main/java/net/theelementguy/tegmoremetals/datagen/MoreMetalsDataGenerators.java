package net.theelementguy.tegmoremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.theelementguy.tegmatlib.data.*;
import net.theelementguy.tegmatlib.trim.TEGMatLibTrimMaterialProvider;
import net.theelementguy.tegmatlib.worldgen.TEGMatLibBiomeModifierProvider;
import net.theelementguy.tegmatlib.worldgen.TEGMatLibConfiguredFeatureProvider;
import net.theelementguy.tegmatlib.worldgen.TEGMatLibPlacedFeatureProvider;
import net.theelementguy.tegmoremetals.MoreMetalsMod;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.theelementguy.tegmoremetals.MoreMetalsMod.MATERIAL_PROVIDER;

@EventBusSubscriber(modid = MoreMetalsMod.MOD_ID)
public class MoreMetalsDataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();

        generator.addProvider(true, new TEGMatLibModelProvider(output, MoreMetalsMod.MOD_ID, MATERIAL_PROVIDER::getMaterials));

        generator.addProvider(true, new TEGMatLibEquipmentAssetProvider(output, output.createPathProvider(PackOutput.Target.DATA_PACK, "equipment"), MATERIAL_PROVIDER::getMaterials));

        generator.addProvider(true, new TEGMatLibLanguageProvider(output, MoreMetalsMod.MOD_ID, MATERIAL_PROVIDER::getMaterials));

        generator.addProvider(true, TEGMatLibBlockLootTableProvider.create(output, provider, MATERIAL_PROVIDER::getMaterials));
        new LootTableProvider(output, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(prov -> new TEGMatLibBlockLootTableProvider(prov, MATERIAL_PROVIDER::getMaterials), LootContextParamSets.BLOCK)), provider);
        generator.addProvider(true, new TEGMatLibRecipeProvider.Runner(output, provider, "More Metals", MATERIAL_PROVIDER::getMaterials, MoreMetalsMod.MOD_ID));

        BlockTagsProvider blockTagsProvider = new TEGMatLibBlockTagProvider(output, provider, MoreMetalsMod.MOD_ID, MATERIAL_PROVIDER::getMaterials);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new TEGMatLibItemTagProvider(output, provider, MoreMetalsMod.MOD_ID, MATERIAL_PROVIDER::getMaterials));
        generator.addProvider(true, new MoreMetalsBiomeTagsProvider(output, provider));

		TEGMatLibConfiguredFeatureProvider configuredFeatures = new TEGMatLibConfiguredFeatureProvider(MoreMetalsMod.MOD_ID, MATERIAL_PROVIDER::getMaterials);
		TEGMatLibPlacedFeatureProvider placedFeatures = new TEGMatLibPlacedFeatureProvider(MoreMetalsMod.MOD_ID, MATERIAL_PROVIDER::getMaterials);
		TEGMatLibBiomeModifierProvider biomeModifiers = new TEGMatLibBiomeModifierProvider(MATERIAL_PROVIDER::getMaterials);
		TEGMatLibTrimMaterialProvider trims = new TEGMatLibTrimMaterialProvider(MoreMetalsMod.MOD_ID, MATERIAL_PROVIDER::getMaterials);

        generator.addProvider(true, new TEGMatLibDatapackProvider(output, provider, MoreMetalsMod.MOD_ID, configuredFeatures, placedFeatures, biomeModifiers, trims));
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Server event) {
    }

}
