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
import net.theelementguy.tegmoremetals.MoreMetalsMod;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = MoreMetalsMod.MOD_ID)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();

        generator.addProvider(true, ModBlockLootTableProvider.create(output, provider));
        new LootTableProvider(output, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)), provider);
        generator.addProvider(true, new ModRecipeProvider.Runner(output, provider));

        BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(output, provider);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new ModItemTagProvider(output, provider, blockTagsProvider.contentsGetter()));
        generator.addProvider(true, new ModBiomeTagProvider(output, provider));

        generator.addProvider(true, new ModModelProvider(output));

        generator.addProvider(true, new ModEquipmentAssetProvider(output));

        //generator.addProvider(true, new ModBlockStateProvider(output, existingFileHelper));
        //generator.addProvider(true, new ModItemModelProvider(output, existingFileHelper));

        generator.addProvider(true, new ModDatapackProvider(output, provider));

        generator.addProvider(true, new ModLanguageProvider(output, "en_us"));
        generator.addProvider(true, new ModLanguageProviderLol(output, "lol_us"));
    }

}
