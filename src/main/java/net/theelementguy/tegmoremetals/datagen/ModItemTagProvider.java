package net.theelementguy.tegmoremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.util.ModTags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends IntrinsicHolderTagsProvider<Item> {

    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTags) {
        super(output, Registries.ITEM, lookupProvider, item -> item.builtInRegistryHolder().key());
        //this.blockTagProvider = blockTags;
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        tag(ItemTags.SWORDS).add(ModItems.CUBIC_ZIRCONIA_SWORD.get()).add(ModItems.RUBIDIUM_SWORD.get()).add(ModItems.STARSHARD_SWORD.get()).add(ModItems.BRONZE_SWORD.get()).replace(false);
        tag(ItemTags.AXES).add(ModItems.CUBIC_ZIRCONIA_AXE.get()).add(ModItems.RUBIDIUM_AXE.get()).add(ModItems.STARSHARD_AXE.get()).add(ModItems.BRONZE_AXE.get()).replace(false);
        tag(ItemTags.PICKAXES).add(ModItems.CUBIC_ZIRCONIA_PICKAXE.get()).add(ModItems.RUBIDIUM_PICKAXE.get()).add(ModItems.STARSHARD_PICKAXE.get()).add(ModItems.BRONZE_PICKAXE.get()).replace(false);
        tag(ItemTags.SHOVELS).add(ModItems.CUBIC_ZIRCONIA_SHOVEL.get()).add(ModItems.RUBIDIUM_SHOVEL.get()).add(ModItems.STARSHARD_SHOVEL.get()).add(ModItems.BRONZE_SHOVEL.get()).replace(false);
        tag(ItemTags.HOES).add(ModItems.CUBIC_ZIRCONIA_HOE.get()).add(ModItems.RUBIDIUM_HOE.get()).add(ModItems.STARSHARD_HOE.get()).add(ModItems.BRONZE_HOE.get()).replace(false);
        tag(ItemTags.TRIMMABLE_ARMOR).add(ModItems.CUBIC_ZIRCONIA_HELMET.get()).add(ModItems.CUBIC_ZIRCONIA_CHESTPLATE.get()).add(ModItems.CUBIC_ZIRCONIA_LEGGINGS.get()).add(ModItems.CUBIC_ZIRCONIA_BOOTS.get()).add(ModItems.RUBIDIUM_HELMET.get()).add(ModItems.RUBIDIUM_CHESTPLATE.get()).add(ModItems.RUBIDIUM_LEGGINGS.get()).add(ModItems.RUBIDIUM_BOOTS.get()).add(ModItems.STARSHARD_HELMET.get()).add(ModItems.STARSHARD_CHESTPLATE.get()).add(ModItems.STARSHARD_LEGGINGS.get()).add(ModItems.STARSHARD_BOOTS.get()).add(ModItems.BRONZE_HELMET.get()).add(ModItems.BRONZE_CHESTPLATE.get()).add(ModItems.BRONZE_LEGGINGS.get()).add(ModItems.BRONZE_BOOTS.get()).replace(false);
        tag(ModTags.Items.CUBIC_ZIRCONIA_REPAIRABLES).add(ModItems.CUBIC_ZIRCONIA.get()).replace(false);
        tag(ModTags.Items.RUBIDIUM_REPAIRABLES).add(ModItems.RUBIDIUM.get()).replace(false);
        tag(ModTags.Items.STARSHARD_REPAIRABLES).add(ModItems.STARSHARD.get()).replace(false);
        tag(ModTags.Items.BRONZE_REPAIRABLES).add(ModItems.BRONZE_INGOT.get()).replace(false);
        tag(ItemTags.TRIM_MATERIALS).add(ModItems.BRONZE_INGOT.get()).add(ModItems.CUBIC_ZIRCONIA.get()).add(ModItems.TIN_SCRAPS.get()).add(ModItems.RUBIDIUM.get()).add(ModItems.STARSHARD.get());

        //Neoforge tags
        tag(Tags.Items.GEMS).add(ModItems.CUBIC_ZIRCONIA.get()).add(ModItems.RUBIDIUM.get()).add(ModItems.STARSHARD.get()).replace(false);
        //tag(Tags.Items.INGOTS);
        tag(Tags.Items.RAW_MATERIALS).add(ModItems.RAW_CUBIC_ZIRCONIA.get()).replace(false);
        tag(Tags.Items.TOOLS).add(ModItems.CUBIC_ZIRCONIA_SWORD.get()).add(ModItems.RUBIDIUM_SWORD.get()).add(ModItems.STARSHARD_SWORD.get()).add(ModItems.BRONZE_SWORD.get()).add(ModItems.CUBIC_ZIRCONIA_AXE.get()).add(ModItems.RUBIDIUM_AXE.get()).add(ModItems.STARSHARD_AXE.get()).add(ModItems.BRONZE_AXE.get()).add(ModItems.CUBIC_ZIRCONIA_PICKAXE.get()).add(ModItems.RUBIDIUM_PICKAXE.get()).add(ModItems.STARSHARD_PICKAXE.get()).add(ModItems.BRONZE_PICKAXE.get()).add(ModItems.CUBIC_ZIRCONIA_SHOVEL.get()).add(ModItems.RUBIDIUM_SHOVEL.get()).add(ModItems.STARSHARD_SHOVEL.get()).add(ModItems.BRONZE_SHOVEL.get()).add(ModItems.CUBIC_ZIRCONIA_SHOVEL.get()).add(ModItems.RUBIDIUM_SHOVEL.get()).add(ModItems.STARSHARD_SHOVEL.get()).add(ModItems.BRONZE_SHOVEL.get()).add(ModItems.CUBIC_ZIRCONIA_HOE.get()).add(ModItems.RUBIDIUM_HOE.get()).add(ModItems.STARSHARD_HOE.get()).add(ModItems.BRONZE_HOE.get()).replace(false);
        tag(Tags.Items.MELEE_WEAPON_TOOLS).add(ModItems.CUBIC_ZIRCONIA_SWORD.get()).add(ModItems.RUBIDIUM_SWORD.get()).add(ModItems.STARSHARD_SWORD.get()).add(ModItems.BRONZE_SWORD.get()).add(ModItems.CUBIC_ZIRCONIA_AXE.get()).add(ModItems.RUBIDIUM_AXE.get()).add(ModItems.STARSHARD_AXE.get()).add(ModItems.BRONZE_AXE.get()).replace(false);
        tag(Tags.Items.MINING_TOOL_TOOLS).add(ModItems.CUBIC_ZIRCONIA_PICKAXE.get()).add(ModItems.RUBIDIUM_PICKAXE.get()).add(ModItems.STARSHARD_PICKAXE.get()).add(ModItems.BRONZE_PICKAXE.get()).replace(false);
        tag(Tags.Items.ARMORS).add(ModItems.CUBIC_ZIRCONIA_HELMET.get()).add(ModItems.CUBIC_ZIRCONIA_CHESTPLATE.get()).add(ModItems.CUBIC_ZIRCONIA_LEGGINGS.get()).add(ModItems.CUBIC_ZIRCONIA_BOOTS.get()).add(ModItems.RUBIDIUM_HELMET.get()).add(ModItems.RUBIDIUM_CHESTPLATE.get()).add(ModItems.RUBIDIUM_LEGGINGS.get()).add(ModItems.RUBIDIUM_BOOTS.get()).add(ModItems.STARSHARD_HELMET.get()).add(ModItems.STARSHARD_CHESTPLATE.get()).add(ModItems.STARSHARD_LEGGINGS.get()).add(ModItems.STARSHARD_BOOTS.get()).add(ModItems.BRONZE_HELMET.get()).add(ModItems.BRONZE_CHESTPLATE.get()).add(ModItems.BRONZE_LEGGINGS.get()).add(ModItems.BRONZE_BOOTS.get()).replace(false);
        tag(Tags.Items.ENCHANTABLES).add(ModItems.CUBIC_ZIRCONIA_SWORD.get()).add(ModItems.RUBIDIUM_SWORD.get()).add(ModItems.STARSHARD_SWORD.get()).add(ModItems.BRONZE_SWORD.get()).add(ModItems.CUBIC_ZIRCONIA_AXE.get()).add(ModItems.RUBIDIUM_AXE.get()).add(ModItems.STARSHARD_AXE.get()).add(ModItems.BRONZE_AXE.get()).add(ModItems.CUBIC_ZIRCONIA_PICKAXE.get()).add(ModItems.RUBIDIUM_PICKAXE.get()).add(ModItems.STARSHARD_PICKAXE.get()).add(ModItems.BRONZE_PICKAXE.get()).add(ModItems.CUBIC_ZIRCONIA_SHOVEL.get()).add(ModItems.RUBIDIUM_SHOVEL.get()).add(ModItems.STARSHARD_SHOVEL.get()).add(ModItems.BRONZE_SHOVEL.get()).add(ModItems.CUBIC_ZIRCONIA_SHOVEL.get()).add(ModItems.RUBIDIUM_SHOVEL.get()).add(ModItems.STARSHARD_SHOVEL.get()).add(ModItems.BRONZE_SHOVEL.get()).add(ModItems.CUBIC_ZIRCONIA_HOE.get()).add(ModItems.RUBIDIUM_HOE.get()).add(ModItems.STARSHARD_HOE.get()).add(ModItems.BRONZE_HOE.get()).add(ModItems.CUBIC_ZIRCONIA_HELMET.get()).add(ModItems.CUBIC_ZIRCONIA_CHESTPLATE.get()).add(ModItems.CUBIC_ZIRCONIA_LEGGINGS.get()).add(ModItems.CUBIC_ZIRCONIA_BOOTS.get()).add(ModItems.RUBIDIUM_HELMET.get()).add(ModItems.RUBIDIUM_CHESTPLATE.get()).add(ModItems.RUBIDIUM_LEGGINGS.get()).add(ModItems.RUBIDIUM_BOOTS.get()).add(ModItems.STARSHARD_HELMET.get()).add(ModItems.STARSHARD_CHESTPLATE.get()).add(ModItems.STARSHARD_LEGGINGS.get()).add(ModItems.STARSHARD_BOOTS.get()).add(ModItems.BRONZE_HELMET.get()).add(ModItems.BRONZE_CHESTPLATE.get()).add(ModItems.BRONZE_LEGGINGS.get()).add(ModItems.BRONZE_BOOTS.get());
        tag(ModTags.Items.CUBIC_ZIRCONIA_REPAIRABLES).add(ModItems.CUBIC_ZIRCONIA.get()).replace(false);
    }
}