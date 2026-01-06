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
import com.github.theelementguy.tegmatlib.core.*;
import com.github.theelementguy.tegmatlib.core.tiers.MineabilityTier;
import com.github.theelementguy.tegmatlib.core.tiers.MiningTier;
import com.github.theelementguy.tegmatlib.worldgen.config.*;

import java.util.List;
import java.util.function.Supplier;

public class MoreMetalsMaterials implements FullyConfiguredMaterialHolder {

	private Supplier<MaterialConfiguration> TENUMBRUM = () -> new IronTypeMaterialConfiguration.Builder().armorMaterial(34, 3, 8, 6, 3, 11, 11, () -> SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f).baseName("tenumbrum").toolMaterial(1641, 8.5f, 3f, 16).smeltingExperience(1f).dropsPerOre(1).inGameName("Tenumbrum").blockProperties(() -> MapColor.TERRACOTTA_PURPLE, () -> SoundType.IRON).oreConfigSimpleWithExtra(OreGenConfig.smallAllBiomes(10, -60, OreDistribution.TRIANGLE, 1, 5, Dimension.OVERWORLD), OreGenConfig.rareLargeAllBiomes(-30, -60, OreDistribution.TRIANGLE, 6, 4, Dimension.OVERWORLD), OreGenConfig.extraWithBiome(36, -60, OreDistribution.TRIANGLE, 3, 4, Biomes.PALE_GARDEN)).modId("tegmoremetals").trimMaterialDescriptionColor("#1f1029").tier(MiningTier.DIAMOND).setBefore("diamond", "diamond", Items.GOLD_INGOT, Blocks.GOLD_BLOCK, "gold", "diamond").build();

	private Supplier<MaterialConfiguration> BLOODSTONE = () -> new DiamondTypeMaterialConfiguration.Builder().armorMaterial(18, 1, 4, 3, 2, 3, 21, () -> SoundEvents.ARMOR_EQUIP_GENERIC, 0f, 0f).baseName("bloodstone").toolMaterial(571, 4.0f, 4.0f, 19).smeltingExperience(0.9f).dropsPerOre(1).inGameName("Bloodstone").blockProperties(() -> MapColor.COLOR_RED, () -> SoundType.STONE).oreConfigSimple(OreGenConfig.smallAllBiomes(56, -60, OreDistribution.TRIANGLE, 2, 100, Dimension.OVERWORLD), OreGenConfig.rareLargeAllBiomes(48, -48, OreDistribution.TRIANGLE, 6, 2, Dimension.OVERWORLD)).modId("tegmoremetals").trimMaterialDescriptionColor("#590a0a").tier(MiningTier.STONE, MineabilityTier.STONE).setBefore("stone", "chainmail", Items.LAPIS_LAZULI, Blocks.LAPIS_BLOCK, "lapis").build();

	private Supplier<MaterialConfiguration> CUBIC_ZIRCONIA = () -> new CubicZirconiaTypeMaterialConfiguration.Builder().armorMaterial(39, 2, 6, 5, 2, 5, 14, () -> SoundEvents.ARMOR_EQUIP_DIAMOND).blockProperties(() -> MapColor.COLOR_PINK, () -> SoundType.METAL).toolMaterial(2501, 7f, 2f, 14).baseName("cubic_zirconia").defaultProperties(() -> new Item.Properties().fireResistant()).modId("tegmoremetals").trimMaterialDescriptionColor("#ebcacb").dropsPerOre(1).inGameName("Cubic Zirconia").setBefore("iron", "iron", Items.NETHERITE_INGOT, Blocks.EMERALD_BLOCK, "tenumbrum", "iron").tier(MiningTier.IRON).smeltingExperience(1f).oreConfigNoExtra(OreGenConfig.smallAllBiomes(48, -32, OreDistribution.TRIANGLE, 2, 8, Dimension.OVERWORLD, 0.5f), OreGenConfig.mediumAllBiomes(-48, 16, OreDistribution.TRIANGLE, 9, 2, Dimension.OVERWORLD, 0.5f), OreGenConfig.rareLargeAllBiomes(0, -48, OreDistribution.TRIANGLE, 16, 8, Dimension.OVERWORLD, 0.7f)).build();

	private Supplier<MaterialConfiguration> RUBIDIUM = () -> new NetherDiamondTypeMaterialConfiguration.Builder().armorMaterial(35, 3, 8, 6, 3, 10, 15, () -> SoundEvents.ARMOR_EQUIP_DIAMOND, 1f, 0f).baseName("rubidium").toolMaterial(1831, 12.0f, 3.0f, 17).smeltingExperience(1.1f).dropsPerOre(1).inGameName("Rubidium").blockProperties(() -> MapColor.COLOR_RED, () -> SoundType.METAL).oreConfigSimple(OreGenConfig.smallAllBiomes(56, 20, OreDistribution.UNIFORM, 1, 4, Dimension.NETHER), OreGenConfig.rareLargeAllBiomes(46, 30, OreDistribution.UNIFORM, 4, 1, Dimension.NETHER)).modId("tegmoremetals").trimMaterialDescriptionColor("#fa89a2").tier(MiningTier.NETHERITE).setBefore("netherite", "netherite", Items.EMERALD, Blocks.EMERALD_BLOCK, "quartz").build();

	public List<Supplier<MaterialConfiguration>> MATERIALS = List.of(TENUMBRUM, BLOODSTONE, CUBIC_ZIRCONIA, RUBIDIUM);

	@Override
	public void setMaterialConfiguration(List<Supplier<MaterialConfiguration>> material) {
		MATERIALS = material;
	}

	public List<MaterialConfiguration> getMaterials() {
		return MATERIALS.stream().map(Supplier::get).toList();
	}

	@Override
	public String getModID() {
		return "tegmoremetals";
	}

	public void setList(Supplier<List<MaterialConfiguration>> materials) {
	}

}
