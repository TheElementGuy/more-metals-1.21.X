package net.theelementguy.moremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, MoreMetalsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS).add(ModItems.CUBIC_ZIRCONIA_SWORD.get());
        tag(ItemTags.AXES).add(ModItems.CUBIC_ZIRCONIA_AXE.get());
        tag(ItemTags.PICKAXES).add(ModItems.CUBIC_ZIRCONIA_PICKAXE.get());
        tag(ItemTags.SHOVELS).add(ModItems.CUBIC_ZIRCONIA_SHOVEL.get());
        tag(ItemTags.HOES).add(ModItems.CUBIC_ZIRCONIA_HOE.get());
        tag(ItemTags.TRIMMABLE_ARMOR).add(ModItems.CUBIC_ZIRCONIA_HELMET.get()).add(ModItems.CUBIC_ZIRCONIA_CHESTPLATE.get()).add(ModItems.CUBIC_ZIRCONIA_LEGGINGS.get()).add(ModItems.CUBIC_ZIRCONIA_BOOTS.get());
    }
}
