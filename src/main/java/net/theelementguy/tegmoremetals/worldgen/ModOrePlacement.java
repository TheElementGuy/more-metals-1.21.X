package net.theelementguy.tegmoremetals.worldgen;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;

import java.util.List;

public class ModOrePlacement {
    public static List<PlacementModifier> orePlacement(PlacementModifier pCountPlacement, PlacementModifier pHeightRange) {
        return List.of(pCountPlacement, InSquarePlacement.spread(), pHeightRange, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
        return orePlacement(CountPlacement.of(pCount), pHeightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
    }

    public static List<PlacementModifier> lavaCommonOrePlacement(int pCount, PlacementModifier pHeightRange) {
        return List.of(CountPlacement.of(pCount), pHeightRange, new BlockPredicateFilter(lavaAdjacentPredicate()));
    }

    public static BlockPredicate lavaAdjacentPredicate() {
        return BlockPredicate.anyOf(
                BlockPredicate.matchesBlocks(new BlockPos(1, 0, 0), List.of(Blocks.LAVA)),
                BlockPredicate.matchesBlocks(new BlockPos(-1, 0, 0), List.of(Blocks.LAVA)),
                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), List.of(Blocks.LAVA)),
                BlockPredicate.matchesBlocks(new BlockPos(0, -1, 0), List.of(Blocks.LAVA)),
                BlockPredicate.matchesBlocks(new BlockPos(0, 0, 1), List.of(Blocks.LAVA)),
                BlockPredicate.matchesBlocks(new BlockPos(0, 0, -1), List.of(Blocks.LAVA))
        );
    }

}