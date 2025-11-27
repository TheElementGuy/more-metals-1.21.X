package net.theelementguy.tegmoremetals.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.block.ModBlocks;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.trim.ModTrimMaterials;
import net.theelementguy.tegmoremetals.util.ModUtil;

public class ModLanguageProviderShakspeare extends LanguageProvider {

	public ModLanguageProviderShakspeare(PackOutput output) {
		super(output, MoreMetalsMod.MOD_ID, "enws");
	}

	@Override
	protected void addTranslations() {

		add(ModItems.CUBIC_ZIRCONIA, "Cubic Zirconia");
		add(ModItems.RAW_CUBIC_ZIRCONIA, "Raw Cubic Zirconia");
		addMaterialSet("cubic_zirconia", "Cubic Zirconia");

		add(ModItems.RUBIDIUM, "Rubidium");
		addMaterialSet("rubidium", "Rubidium");

		add(ModItems.STARSHARD, "Starshard");
		addMaterialSet("starshard", "Starshard");

		add(ModItems.BLOODSTONE, "Bloodstone");
		addMaterialSet("bloodstone", "Bloodstone");

		add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK, "Block of Raw Cubic Zirconia");

		add(ModItems.TENUMBRUM_INGOT, "Tenumbrum");
		add(ModItems.RAW_TENUMBRUM, "Raw Tenumbrum");
		addMaterialSet("tenumbrum", "Tenumbrum");

		addTrimMaterial(ModTrimMaterials.CUBIC_ZIRCONIA, "Cubic Zirconia");
		addTrimMaterial(ModTrimMaterials.RUBIDIUM, "Rubidium");
		addTrimMaterial(ModTrimMaterials.STARSHARD, "Starshard");
		addTrimMaterial(ModTrimMaterials.BLOODSTONE, "Bloodstone");
		addTrimMaterial(ModTrimMaterials.TIN, "Tin");
		addTrimMaterial(ModTrimMaterials.BRONZE, "Bronze");
		addTrimMaterial(ModTrimMaterials.TENUMBRUM, "Tenumbrum");
	}

	protected void add(DeferredItem<? extends Item> key, String name) {
		add(key.get(), name);
	}

	protected void add(DeferredBlock<? extends Block> key, String name) {
		add(key.get(), name);
	}

	protected void addToolSet(DeferredItem<? extends Item> sword, DeferredItem<? extends Item> axe, DeferredItem<? extends Item> pickaxe, DeferredItem<? extends Item> shovel, DeferredItem<? extends Item> hoe, DeferredItem<? extends Item> helmet, DeferredItem<? extends Item> chestplate, DeferredItem<? extends Item> leggings, DeferredItem<? extends Item> boots, String groupName) {
		addToolSet(sword.get(), axe.get(), pickaxe.get(), shovel.get(), hoe.get(), helmet.get(), chestplate.get(), leggings.get(), boots.get(), groupName);
	}

	protected void addTrimMaterial(ResourceKey<TrimMaterial> key, String name) {
		add("trim_material." + MoreMetalsMod.MOD_ID + "." + key.location().getPath(), name);
	}

	protected void addToolSet(Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, Item helmet, Item chestplate, Item leggings, Item boots, String groupName) {
		System.out.println("Adding tool set");
		add(sword, groupName + " Sword");
		add(axe, groupName + " Axe");
		add(pickaxe, groupName + " Pickaxe");
		add(shovel, groupName + " Spade");
		add(hoe, groupName + " Hoe");
		add(helmet, groupName + " Casque");
		add(chestplate, groupName + " Breast Plate");
		add(leggings, groupName + " Greaves");
		add(boots, groupName + " Sabatons");
	}

	protected void addToolSet(String group, String groupName) {
		System.out.println(ModUtil.getItemFromKey(group + "_boots") + " lol");
		addToolSet(ModUtil.getItemFromKey(group + "_sword"), ModUtil.getItemFromKey(group + "_axe"), ModUtil.getItemFromKey(group + "_pickaxe"), ModUtil.getItemFromKey(group + "_shovel"), ModUtil.getItemFromKey(group + "_hoe"), ModUtil.getItemFromKey(group + "_helmet"), ModUtil.getItemFromKey(group + "_chestplate"), ModUtil.getItemFromKey(group + "_leggings"), ModUtil.getItemFromKey(group + "_boots"), groupName);
	}

	protected void addMaterialSet(String group, String groupName) {
		addToolSet(group, groupName);
		add(BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey(group + "_block")).get().value(), "Clot of " + groupName);
		addOptionalOre(group, groupName);
		addOptionalDeepslateOre(group, groupName);
		addOptionalNetherOre(group, groupName);
		addOptionalEndOre(group, groupName);
	}

	protected void addOptionalOre(String group, String groupName) {
		if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey(group + "_ore")).isPresent()) {
			add(ModUtil.getBlockFromKey(group + "_ore"), groupName + " Ore");
		}
	}

	protected void addOptionalDeepslateOre(String group, String groupName) {
		if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey("deepslate_" + group + "_ore")).isPresent()) {
			add(ModUtil.getBlockFromKey("deepslate_" + group + "_ore"), "Deepethslate " + groupName + " Ore");
		}
	}

	protected void addOptionalNetherOre(String group, String groupName) {
		if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey("nether_" + group + "_ore")).isPresent()) {
			add(ModUtil.getBlockFromKey("nether_" + group + "_ore"), "Nether " + groupName + " Ore");
		}
	}

	protected void addOptionalEndOre(String group, String groupName) {
		if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey("end_" + group + "_ore")).isPresent()) {
			add(ModUtil.getBlockFromKey("end_" + group + "_ore"), "End " + groupName + " Ore");
		}
	}
}