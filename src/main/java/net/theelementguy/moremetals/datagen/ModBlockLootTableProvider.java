package net.theelementguy.moremetals.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.theelementguy.moremetals.block.ModBlocks;
import net.theelementguy.moremetals.item.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        dropSelf(ModBlocks.CUBIC_ZIRCONIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_CUBIC_ZIRCONIUM_BLOCK.get());

        add(ModBlocks.CUBIC_ZIRCONIA_ORE.get(), block -> createOreDrop(ModBlocks.CUBIC_ZIRCONIA_ORE.get(), ModItems.RAW_CUBIC_ZIRCONIA.get()));
        add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get(), ModItems.RAW_CUBIC_ZIRCONIA.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }

}
