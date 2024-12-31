package net.theelementguy.moremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBiomeTagProvider extends BiomeTagsProvider {
    public ModBiomeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, MoreMetalsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Biomes.IS_END_AND_NOT_MAIN_ISLAND).add(Biomes.END_MIDLANDS).add(Biomes.END_HIGHLANDS).add(Biomes.END_BARRENS).add(Biomes.SMALL_END_ISLANDS);
    }
}
