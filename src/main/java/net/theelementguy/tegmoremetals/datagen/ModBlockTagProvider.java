package net.theelementguy.tegmoremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.util.ModTags;
import net.theelementguy.tegmoremetals.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, MoreMetalsMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.CUBIC_ZIRCONIA_BLOCK.get()).add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.get()).add(ModBlocks.CUBIC_ZIRCONIA_ORE.get()).add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get()).add(ModBlocks.TIN_BLOCK.get()).add(ModBlocks.TIN_ORE.get()).add(ModBlocks.DEEPSLATE_TIN_ORE.get()).add(ModBlocks.RUBIDIUM_BLOCK.get()).add(ModBlocks.STARSHARD_BLOCK.get()).add(ModBlocks.END_STARSHARD_ORE.get()).add(ModBlocks.BRONZE_BLOCK.get()).replace(false);

        tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.CUBIC_ZIRCONIA_BLOCK.get()).add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.get()).add(ModBlocks.CUBIC_ZIRCONIA_ORE.get()).add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get()).replace(false);

        tag(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.TIN_ORE.get()).add(ModBlocks.DEEPSLATE_TIN_ORE.get()).replace(false);

        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.RUBIDIUM_BLOCK.get()).add(ModBlocks.NETHER_RUBIDIUM_ORE.get()).add(ModBlocks.STARSHARD_BLOCK.get()).replace(false);

        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(ModBlocks.END_STARSHARD_ORE.get()).replace(false);

        tag(ModTags.Blocks.NEEDS_CUBIC_ZIRCONIA_TOOL).addTag(BlockTags.NEEDS_IRON_TOOL).replace(false);

        tag(ModTags.Blocks.INCORRECT_FOR_CUBIC_ZIRCONIA_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL).remove(ModTags.Blocks.NEEDS_CUBIC_ZIRCONIA_TOOL).replace(false);

        tag(ModTags.Blocks.NEEDS_RUBIDIUM_TOOL).addTag(BlockTags.NEEDS_DIAMOND_TOOL).replace(false);

        tag(ModTags.Blocks.INCORRECT_FOR_RUBIDIUM_TOOL).addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL).remove(ModTags.Blocks.NEEDS_RUBIDIUM_TOOL).replace(false);

        tag(ModTags.Blocks.NEEDS_STARSHARD_TOOL).addTag(Tags.Blocks.NEEDS_NETHERITE_TOOL).replace(false);

        tag(ModTags.Blocks.INCORRECT_FOR_STARSHARD_TOOL).addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL).remove(ModTags.Blocks.NEEDS_STARSHARD_TOOL).replace(false);

        tag(ModTags.Blocks.NEEDS_BRONZE_TOOL).addTag(BlockTags.NEEDS_IRON_TOOL).replace(false);

        tag(ModTags.Blocks.INCORRECT_FOR_BRONZE_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL).replace(false);

        //Neoforge tags
        tag(Tags.Blocks.ORE_RATES_DENSE).add(ModBlocks.TIN_ORE.get()).add(ModBlocks.DEEPSLATE_TIN_ORE.get()).replace(false);

        tag(Tags.Blocks.ORE_RATES_SINGULAR).add(ModBlocks.CUBIC_ZIRCONIA_ORE.get()).add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get()).add(ModBlocks.NETHER_RUBIDIUM_ORE.get()).add(ModBlocks.END_STARSHARD_ORE.get()).replace(false);

        tag(Tags.Blocks.ORES).add(ModBlocks.TIN_ORE.get()).add(ModBlocks.DEEPSLATE_TIN_ORE.get()).add(ModBlocks.CUBIC_ZIRCONIA_ORE.get()).add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get()).add(ModBlocks.NETHER_RUBIDIUM_ORE.get()).add(ModBlocks.END_STARSHARD_ORE.get()).replace(false);

        tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(ModBlocks.TIN_ORE.get()).add(ModBlocks.CUBIC_ZIRCONIA_ORE.get()).replace(false);

        tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(ModBlocks.DEEPSLATE_TIN_ORE.get()).add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get()).replace(false);

        tag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK).add(ModBlocks.NETHER_RUBIDIUM_ORE.get()).replace(false);

        tag(Tags.Blocks.STORAGE_BLOCKS).add(ModBlocks.TIN_BLOCK.get()).add(ModBlocks.CUBIC_ZIRCONIA_BLOCK.get()).add(ModBlocks.RUBIDIUM_BLOCK.get()).add(ModBlocks.STARSHARD_BLOCK.get()).replace(false);

    }
}
