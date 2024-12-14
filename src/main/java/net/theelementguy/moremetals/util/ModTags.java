package net.theelementguy.moremetals.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.theelementguy.moremetals.MoreMetalsMod;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> NEEDS_CUBIC_ZIRCONIA_TOOL = createTag("needs_cubic_zirconia");

        public static final TagKey<Block> INCORRECT_FOR_CUBIC_ZIRCONIA_TOOL = createTag("incorrect_for_cubic_zirconia_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
        }

    }

}
