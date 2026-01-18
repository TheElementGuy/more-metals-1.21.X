package net.theelementguy.tegmoremetals.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.theelementguy.tegmoremetals.MoreMetalsMod;

public class MoreMetalsTags {

    public static class Biomes {

        public static final TagKey<Biome> IS_END_AND_NOT_MAIN_ISLAND = createTag("is_end_and_not_main_island");

        private static TagKey<Biome> createTag(String name) {
            return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
        }

    }

}