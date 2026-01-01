package net.theelementguy.tegmoremetals.matlib;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.common.Tags;
import net.theelementguy.tegmatlib.core.*;
import net.theelementguy.tegmatlib.core.tiers.MineabilityTier;
import net.theelementguy.tegmatlib.core.tiers.MiningTier;
import net.theelementguy.tegmatlib.worldgen.config.*;

import java.util.List;
import java.util.function.Supplier;

public class MoreMetalsMaterials implements FullyConfiguredMaterialHolder {

	public MoreMetalsMaterials() {

	}

	public List<Supplier<MaterialConfiguration>> MATERIALS = List.of(() -> new IronTypeMaterialConfiguration.Builder().armorMaterial(34, 3, 8, 6, 3, 11, 11, () -> SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f).baseName("tenumbrum").toolMaterial(1641, 8.5f, 3f, 16).smeltingExperience(1f).dropsPerOre(1).inGameName("Tenumbrum").blockProperties(() -> MapColor.TERRACOTTA_PURPLE, () -> SoundType.IRON).oreConfigSimpleWithExtra(OreGenConfig.smallAllBiomes(10, -60, OreDistribution.TRIANGLE, 1, 5, Dimension.OVERWORLD), () -> new OreGenConfig(OreGenSize.LARGE, HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(-30)), 6, 0f, OreRarity.RARE, 4, Tags.Biomes.IS_OVERWORLD), () -> new OreGenConfig(OreGenSize.EXTRA, HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(36)), 3, 0f, OreRarity.COMMON, 4, Biomes.PALE_GARDEN)).modId("tegmoremetals").trimMaterialDescriptionColor("#1f1029").tier(MiningTier.DIAMOND).setBefore("diamond", "diamond", Items.GOLD_INGOT, Blocks.GOLD_BLOCK, "gold", "diamond").build(), () -> new DiamondTypeMaterialConfiguration.Builder().armorMaterial(18, 1, 4, 3, 2, 3, 21, () -> SoundEvents.ARMOR_EQUIP_GENERIC, 0f, 0f).baseName("bloodstone").toolMaterial(571, 4.0f, 4.0f, 19).smeltingExperience(0.9f).dropsPerOre(1).inGameName("Bloodstone").blockProperties(() -> MapColor.COLOR_RED, () -> SoundType.STONE).oreConfigSimple(OreGenConfig.smallAllBiomes(56, -60, OreDistribution.TRIANGLE, 2, 100, Dimension.OVERWORLD), () -> new OreGenConfig(OreGenSize.LARGE, HeightRangePlacement.triangle(VerticalAnchor.absolute(-48), VerticalAnchor.absolute(48)), 6, 0f, OreRarity.RARE, 2, BiomeTags.IS_OVERWORLD)).modId("tegmoremetals").trimMaterialDescriptionColor("#590a0a").tier(MiningTier.STONE, MineabilityTier.STONE).setBefore("stone", "chainmail", Items.LAPIS_LAZULI, Blocks.LAPIS_BLOCK, "lapis").build(), () -> new CubicZirconiaTypeMaterialConfiguration.Builder().armorMaterial(39, 2, 6, 5, 2, 5, 14, () -> SoundEvents.ARMOR_EQUIP_DIAMOND).blockProperties(() -> MapColor.COLOR_PINK, () -> SoundType.METAL).toolMaterial(2501, 7f, 2f, 14).baseName("cubic_zirconia").defaultProperties(() -> new Item.Properties().fireResistant()).modId("tegmoremetals").trimMaterialDescriptionColor("#ebcacb").dropsPerOre(1).inGameName("Cubic Zirconia").setBefore("iron", "iron", Items.NETHERITE_INGOT, Blocks.EMERALD_BLOCK, "tenumbrum", "iron").tier(MiningTier.IRON).smeltingExperience(1f).oreConfigNoExtra(() -> new OreGenConfig(OreGenSize.SMALL, HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(48)), 2, 0.5f, OreRarity.COMMON, 8, BiomeTags.IS_OVERWORLD), () -> new OreGenConfig(OreGenSize.MEDIUM, HeightRangePlacement.triangle(VerticalAnchor.absolute(-48), VerticalAnchor.absolute(16)), 9, 0.5f, OreRarity.COMMON, 2, BiomeTags.IS_OVERWORLD), () -> new OreGenConfig(OreGenSize.LARGE, HeightRangePlacement.triangle(VerticalAnchor.absolute(-48), VerticalAnchor.absolute(0)), 16, 0.7f, OreRarity.COMMON, 8, BiomeTags.IS_OVERWORLD)).build());

	@Override
	public void setMaterialConfiguration(List<Supplier<MaterialConfiguration>> material) {
		MATERIALS = material;
	}

	public List<MaterialConfiguration> getMaterials() {
		return MATERIALS.stream().map(Supplier::get).toList();
	}

	public void setList(Supplier<List<MaterialConfiguration>> materials) {
	}

}
