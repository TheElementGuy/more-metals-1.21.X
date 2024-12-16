package net.theelementguy.moremetals.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.theelementguy.moremetals.util.ModTags;

public class ModToolTiers {

    public static final Tier CUBIC_ZIRCONIA = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_CUBIC_ZIRCONIA_TOOL, 2501, 7.0f, 2.0f, 14, () -> Ingredient.of(ModItems.CUBIC_ZIRCONIA));

}
