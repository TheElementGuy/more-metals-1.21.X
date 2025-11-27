package net.theelementguy.tegmoremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.util.ModTags;
import net.theelementguy.tegmoremetals.util.ModUtil;

import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, blockTags, MoreMetalsMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
		tag(ItemTags.SWORDS).addAll(ModItems.ITEMS.getEntries().stream().filter(new Predicate<DeferredHolder<Item, ? extends Item>>() {
			@Override
			public boolean test(DeferredHolder<Item, ? extends Item> itemDeferredHolder) {
				return itemDeferredHolder.get().getDescriptionId().contains("sword");
			}
		}).map((DeferredHolder<Item, ? extends Item> d) -> {return ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.bySeparator(d.getRegisteredName(), ':'));}).toList()).replace(false);
		tag(ItemTags.AXES).addAll(ModItems.ITEMS.getEntries().stream().filter(new Predicate<DeferredHolder<Item, ? extends Item>>() {
			@Override
			public boolean test(DeferredHolder<Item, ? extends Item> itemDeferredHolder) {
				return itemDeferredHolder.get().getDescriptionId().contains("axe");
			}
		}).map((DeferredHolder<Item, ? extends Item> d) -> {return ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.bySeparator(d.getRegisteredName(), ':'));}).toList()).replace(false);
		tag(ItemTags.PICKAXES).addAll(ModItems.ITEMS.getEntries().stream().filter(new Predicate<DeferredHolder<Item, ? extends Item>>() {
			@Override
			public boolean test(DeferredHolder<Item, ? extends Item> itemDeferredHolder) {
				return itemDeferredHolder.get().getDescriptionId().contains("pickaxe");
			}
		}).map((DeferredHolder<Item, ? extends Item> d) -> {return ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.bySeparator(d.getRegisteredName(), ':'));}).toList()).replace(false);
		tag(ItemTags.SHOVELS).addAll(ModItems.ITEMS.getEntries().stream().filter(new Predicate<DeferredHolder<Item, ? extends Item>>() {
			@Override
			public boolean test(DeferredHolder<Item, ? extends Item> itemDeferredHolder) {
				return itemDeferredHolder.get().getDescriptionId().contains("shovel");
			}
		}).map((DeferredHolder<Item, ? extends Item> d) -> {return ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.bySeparator(d.getRegisteredName(), ':'));}).toList()).replace(false);
		tag(ItemTags.HOES).addAll(ModItems.ITEMS.getEntries().stream().filter(new Predicate<DeferredHolder<Item, ? extends Item>>() {
			@Override
			public boolean test(DeferredHolder<Item, ? extends Item> itemDeferredHolder) {
				return itemDeferredHolder.get().getDescriptionId().contains("hoe");
			}
		}).map((DeferredHolder<Item, ? extends Item> d) -> {return ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.bySeparator(d.getRegisteredName(), ':'));}).toList()).replace(false);

        tag(ModTags.Items.CUBIC_ZIRCONIA_REPAIRABLES).add(ModItems.CUBIC_ZIRCONIA.get()).replace(false);
        tag(ModTags.Items.RUBIDIUM_REPAIRABLES).add(ModItems.RUBIDIUM.get()).replace(false);
        tag(ModTags.Items.STARSHARD_REPAIRABLES).add(ModItems.STARSHARD.get()).replace(false);
        tag(ModTags.Items.BRONZE_REPAIRABLES).add(ModItems.BRONZE_INGOT.get()).replace(false);
        tag(ModTags.Items.BLOODSTONE_REPAIRABLES).add(ModItems.BLOODSTONE.get()).replace(false);
		tag(ModTags.Items.TENUMBRUM_REPAIRABLES).add(ModItems.TENUMBRUM_INGOT.get()).replace(false);
        tag(ItemTags.TRIM_MATERIALS).add(ModItems.BRONZE_INGOT.get()).add(ModItems.CUBIC_ZIRCONIA.get()).add(ModItems.TIN_SCRAPS.get()).add(ModItems.RUBIDIUM.get()).add(ModItems.STARSHARD.get()).add(ModItems.BLOODSTONE.get()).add(ModItems.TENUMBRUM_INGOT.get()).replace(false);

		tag(ItemTags.HEAD_ARMOR).addAll(ModItems.ITEMS.getEntries().stream().filter(new Predicate<DeferredHolder<Item, ? extends Item>>() {
			@Override
			public boolean test(DeferredHolder<Item, ? extends Item> itemDeferredHolder) {
				return itemDeferredHolder.get().getDescriptionId().contains("helmet");
			}
		}).map((DeferredHolder<Item, ? extends Item> d) -> {return ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.bySeparator(d.getRegisteredName(), ':'));}).toList()).replace(false);
		tag(ItemTags.CHEST_ARMOR).addAll(ModItems.ITEMS.getEntries().stream().filter(new Predicate<DeferredHolder<Item, ? extends Item>>() {
			@Override
			public boolean test(DeferredHolder<Item, ? extends Item> itemDeferredHolder) {
				return itemDeferredHolder.get().getDescriptionId().contains("chestplate");
			}
		}).map((DeferredHolder<Item, ? extends Item> d) -> {return ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.bySeparator(d.getRegisteredName(), ':'));}).toList()).replace(false);
		tag(ItemTags.LEG_ARMOR).addAll(ModItems.ITEMS.getEntries().stream().filter(new Predicate<DeferredHolder<Item, ? extends Item>>() {
			@Override
			public boolean test(DeferredHolder<Item, ? extends Item> itemDeferredHolder) {
				return itemDeferredHolder.get().getDescriptionId().contains("leggings");
			}
		}).map((DeferredHolder<Item, ? extends Item> d) -> {return ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.bySeparator(d.getRegisteredName(), ':'));}).toList()).replace(false);
		tag(ItemTags.FOOT_ARMOR).addAll(ModItems.ITEMS.getEntries().stream().filter(new Predicate<DeferredHolder<Item, ? extends Item>>() {
			@Override
			public boolean test(DeferredHolder<Item, ? extends Item> itemDeferredHolder) {
				return itemDeferredHolder.get().getDescriptionId().contains("boots");
			}
		}).map((DeferredHolder<Item, ? extends Item> d) -> {return ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.bySeparator(d.getRegisteredName(), ':'));}).toList()).replace(false);

        //Neoforge tags
        tag(Tags.Items.GEMS).add(ModItems.CUBIC_ZIRCONIA.get()).add(ModItems.RUBIDIUM.get()).add(ModItems.STARSHARD.get()).add(ModItems.BLOODSTONE.get()).replace(false);
        tag(Tags.Items.INGOTS).add(ModItems.BRONZE_INGOT.get()).add(ModItems.TENUMBRUM_INGOT.get());
        tag(Tags.Items.RAW_MATERIALS).add(ModItems.RAW_CUBIC_ZIRCONIA.get()).add(ModItems.RAW_TENUMBRUM.asItem()).replace(false);
		tag(Tags.Items.MELEE_WEAPON_TOOLS).addAll(ModItems.ITEMS.getEntries().stream().filter(new Predicate<DeferredHolder<Item, ? extends Item>>() {
			@Override
			public boolean test(DeferredHolder<Item, ? extends Item> itemDeferredHolder) {
				return itemDeferredHolder.get().getDescriptionId().contains("sword") || itemDeferredHolder.get().getDescriptionId().contains("axe");
			}
		}).map((DeferredHolder<Item, ? extends Item> d) -> {return ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.bySeparator(d.getRegisteredName(), ':'));}).toList()).replace(false);
		tag(Tags.Items.MINING_TOOL_TOOLS).addAll(ModItems.ITEMS.getEntries().stream().filter(new Predicate<DeferredHolder<Item, ? extends Item>>() {
			@Override
			public boolean test(DeferredHolder<Item, ? extends Item> itemDeferredHolder) {
				return itemDeferredHolder.get().getDescriptionId().contains("pickaxe");
			}
		}).map((DeferredHolder<Item, ? extends Item> d) -> {return ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.bySeparator(d.getRegisteredName(), ':'));}).toList()).replace(false);
    }
}