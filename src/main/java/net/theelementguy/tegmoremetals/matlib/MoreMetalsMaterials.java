package net.theelementguy.tegmoremetals.matlib;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.common.Tags;
import net.theelementguy.tegmatlib.core.IronTypeMaterialConfiguration;
import net.theelementguy.tegmatlib.core.MaterialConfiguration;
import net.theelementguy.tegmatlib.core.MaterialType;
import net.theelementguy.tegmatlib.core.tiers.MiningTier;
import net.theelementguy.tegmatlib.worldgen.BiomeModifierKeyHolder;
import net.theelementguy.tegmatlib.worldgen.OreGenConfigHolder;
import net.theelementguy.tegmatlib.worldgen.config.*;
import net.theelementguy.tegmoremetals.util.ModTags;

import java.util.List;

public class MoreMetalsMaterials {

	public MoreMetalsMaterials() {

	}

	public List<MaterialConfiguration> getMaterials() {
		return List.of(new IronTypeMaterialConfiguration.Builder().armorMaterial(34, 3, 8, 6, 3, 11, 11, () -> SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f).baseName("tenumbrum").toolMaterial(1641, 8.5f, 3f, 16).smeltingExperience(1f).dropsPerOre(1).inGameName("Tenumbrum").blockProperties(() -> MapColor.TERRACOTTA_PURPLE, () -> SoundType.IRON).oreConfigSimpleWithExtra(OreGenConfig.smallAllBiomes(10, -60, OreDistribution.TRIANGLE, 1, 5, Dimension.OVERWORLD), () -> new OreGenConfig(OreGenSize.LARGE, HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(-30)), 6, 0f, OreRarity.RARE, 4, Tags.Biomes.IS_OVERWORLD), () -> new OreGenConfig(OreGenSize.EXTRA, HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(36)), 3, 0f, OreRarity.COMMON, 4, Biomes.PALE_GARDEN)).modId("tegmoremetals").trimMaterialDescriptionColor("#1f1029").tier(MiningTier.IRON).build());
	}

}
