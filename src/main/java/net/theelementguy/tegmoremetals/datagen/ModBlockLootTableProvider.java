package net.theelementguy.tegmoremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.block.ModBlocks;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.util.ModUtil;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    public static LootTableProvider create(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        return new LootTableProvider(output, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)), provider);
    }

    @Override
    protected void generate() {

        dropSelf(ModBlocks.CUBIC_ZIRCONIA_BLOCK.get());
        dropSelf(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.get());
        dropSelf(ModBlocks.TIN_BLOCK.get());
        dropSelf(ModBlocks.RUBIDIUM_BLOCK.get());
        dropSelf(ModBlocks.STARSHARD_BLOCK.get());
        dropSelf(ModBlocks.BRONZE_BLOCK.get());
        dropSelf(ModBlocks.BLOODSTONE_BLOCK.get());

        add(ModBlocks.CUBIC_ZIRCONIA_ORE.get(), block -> createOreDrop(ModBlocks.CUBIC_ZIRCONIA_ORE.get(), ModItems.RAW_CUBIC_ZIRCONIA.get()));
        add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get(), ModItems.RAW_CUBIC_ZIRCONIA.get()));

        add(ModBlocks.TIN_ORE.get(), block -> createMultipleOreDrops(ModBlocks.TIN_ORE.get(), ModItems.TIN_SCRAPS.get(), 2.0f, 5.0f));
        add(ModBlocks.DEEPSLATE_TIN_ORE.get(), block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.TIN_SCRAPS.get(), 2.0f, 5.0f));

        add(ModBlocks.NETHER_RUBIDIUM_ORE.get(), block -> createOreDrop(ModBlocks.NETHER_RUBIDIUM_ORE.get(), ModItems.RUBIDIUM.get()));

        add(ModBlocks.END_STARSHARD_ORE.get(), block -> createOreDrop(ModBlocks.END_STARSHARD_ORE.get(), ModItems.STARSHARD.get()));

        add(ModBlocks.BLOODSTONE_ORE.get(), block -> createOreDrop(ModBlocks.BLOODSTONE_ORE.get(), ModItems.BLOODSTONE.get()));
        add(ModBlocks.DEEPSLATE_BLOODSTONE_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_BLOODSTONE_ORE.get(), ModItems.BLOODSTONE.get()));

		add("tenumbrum", AutoGenTypes.IRON_TYPE);

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BuiltInRegistries.BLOCK.entrySet().stream().filter(e -> e.getKey().location().getNamespace().equals(MoreMetalsMod.MOD_ID)).map(Map.Entry::getValue).toList();
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item).apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops))).apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

	//Add D, CZ, ND, NI, NCZ, ED, EI, ECZ
	private void add(String name, AutoGenTypes type) {
		dropSelf(ModUtil.getBlockFromKey(name + "_block"));
		if (type == AutoGenTypes.CZ_TYPE || type == AutoGenTypes.DIAMOND_TYPE || type == AutoGenTypes.IRON_TYPE) {
			Item drops;
			switch (type) {
				case IRON_TYPE, CZ_TYPE -> {
					drops = ModUtil.getItemFromKey("raw_" + name);
				}
				case DIAMOND_TYPE -> {
					drops = ModUtil.getItemFromKey(name);
				}
				default -> {
					throw new RuntimeException("Auto gen type not supported: " + type);
				}
			}

			Item finalDrops = drops;
			add(ModUtil.getBlockFromKey(name + "_ore"), block -> createOreDrop(ModUtil.getBlockFromKey(name + "_ore"), finalDrops));
			add(ModUtil.getBlockFromKey("deepslate_" + name + "_ore"), block -> createOreDrop(ModUtil.getBlockFromKey("deepslate_" + name + "_ore"), finalDrops));
			dropSelf(ModUtil.getBlockFromKey("raw_" + name + "_block"));
		}
	}
}
