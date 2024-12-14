package net.theelementguy.moremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.block.ModBlocks;
import net.theelementguy.moremetals.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MoreMetalsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.CUBIC_ZIRCONIUM_BLOCK.get()).add(ModBlocks.RAW_CUBIC_ZIRCONIUM_BLOCK.get()).add(ModBlocks.CUBIC_ZIRCONIA_ORE.get()).add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.CUBIC_ZIRCONIUM_BLOCK.get()).add(ModBlocks.RAW_CUBIC_ZIRCONIUM_BLOCK.get()).add(ModBlocks.CUBIC_ZIRCONIA_ORE.get()).add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get());

        tag(ModTags.Blocks.NEEDS_CUBIC_ZIRCONIA_TOOL).addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_CUBIC_ZIRCONIA_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL).remove(ModTags.Blocks.NEEDS_CUBIC_ZIRCONIA_TOOL);
    }
}
