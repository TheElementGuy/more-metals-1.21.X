package net.theelementguy.tegmoremetals.datagen;

import net.minecraft.client.color.item.Dye;
import net.minecraft.client.color.item.ItemTintSource;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.item.SelectItemModel;
import net.minecraft.client.renderer.item.properties.select.TrimMaterialProperty;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimMaterials;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.block.ModBlocks;
import net.theelementguy.tegmoremetals.item.ModEquipmentAssets;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.trim.ModTrimMaterials;
import net.theelementguy.tegmoremetals.util.ModUtil;

import java.util.ArrayList;
import java.util.List;

import static net.minecraft.client.data.models.ItemModelGenerators.*;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, MoreMetalsMod.MOD_ID);
    }

    public static final List<ItemModelGenerators.TrimMaterialData> TRIM_MATERIAL_MODELS = List.of(
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.QUARTZ, TrimMaterials.QUARTZ),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.IRON, TrimMaterials.IRON),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.NETHERITE, TrimMaterials.NETHERITE),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.REDSTONE, TrimMaterials.REDSTONE),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.COPPER, TrimMaterials.COPPER),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.GOLD, TrimMaterials.GOLD),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.EMERALD, TrimMaterials.EMERALD),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.DIAMOND, TrimMaterials.DIAMOND),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.LAPIS, TrimMaterials.LAPIS),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.AMETHYST, TrimMaterials.AMETHYST),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.RESIN, TrimMaterials.RESIN),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.CUBIC_ZIRCONIA_ASSET_GROUP, ModTrimMaterials.CUBIC_ZIRCONIA),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.STARSHARD_ASSET_GROUP, ModTrimMaterials.STARSHARD),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.RUBIDIUM_ASSET_GROUP, ModTrimMaterials.RUBIDIUM),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.BLOODSTONE_ASSET_GROUP, ModTrimMaterials.BLOODSTONE),
			new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.TENUMBRUM_ASSET_GROUP, ModTrimMaterials.TENUMBRUM)
    );

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_CUBIC_ZIRCONIA.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD.get(), ModelTemplates.FLAT_ITEM);
        normal(ModItems.BLOODSTONE.get(), itemModels);

        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BLOODSTONE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BLOODSTONE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BLOODSTONE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BLOODSTONE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BLOODSTONE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.CUBIC_ZIRCONIA_HELMET.get(), ModEquipmentAssets.CUBIC_ZIRCONIA, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.CUBIC_ZIRCONIA_CHESTPLATE.get(), ModEquipmentAssets.CUBIC_ZIRCONIA, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.CUBIC_ZIRCONIA_LEGGINGS.get(), ModEquipmentAssets.CUBIC_ZIRCONIA, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.CUBIC_ZIRCONIA_BOOTS.get(), ModEquipmentAssets.CUBIC_ZIRCONIA, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.RUBIDIUM_HELMET.get(), ModEquipmentAssets.RUBIDIUM, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.RUBIDIUM_CHESTPLATE.get(), ModEquipmentAssets.RUBIDIUM, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.RUBIDIUM_LEGGINGS.get(), ModEquipmentAssets.RUBIDIUM, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.RUBIDIUM_BOOTS.get(), ModEquipmentAssets.RUBIDIUM, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.STARSHARD_HELMET.get(), ModEquipmentAssets.STARSHARD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.STARSHARD_CHESTPLATE.get(), ModEquipmentAssets.STARSHARD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.STARSHARD_LEGGINGS.get(), ModEquipmentAssets.STARSHARD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.STARSHARD_BOOTS.get(), ModEquipmentAssets.STARSHARD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BLOODSTONE_HELMET.get(), ModEquipmentAssets.BLOODSTONE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BLOODSTONE_CHESTPLATE.get(), ModEquipmentAssets.BLOODSTONE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BLOODSTONE_LEGGINGS.get(), ModEquipmentAssets.BLOODSTONE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BLOODSTONE_BOOTS.get(), ModEquipmentAssets.BLOODSTONE, false);

        blockModels.createTrivialCube(ModBlocks.CUBIC_ZIRCONIA_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CUBIC_ZIRCONIA_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get());
        blockModels.createTrivialCube(ModBlocks.RUBIDIUM_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.NETHER_RUBIDIUM_ORE.get());
        blockModels.createColoredBlockWithStateRotations(TexturedModel.GLAZED_TERRACOTTA, ModBlocks.STARSHARD_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.END_STARSHARD_ORE.get());
        blockModels.createTrivialCube(ModBlocks.BLOODSTONE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.BLOODSTONE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_BLOODSTONE_ORE.get());

        generateTrimmableItemWithModdedMaterials(itemModels, Items.LEATHER_HELMET, EquipmentAssets.LEATHER, true);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.LEATHER_CHESTPLATE, EquipmentAssets.LEATHER, true);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.LEATHER_LEGGINGS, EquipmentAssets.LEATHER, true);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.LEATHER_BOOTS, EquipmentAssets.LEATHER, true);


        generateTrimmableItemWithModdedMaterials(itemModels, Items.CHAINMAIL_HELMET, EquipmentAssets.CHAINMAIL, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.CHAINMAIL_CHESTPLATE, EquipmentAssets.CHAINMAIL, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.CHAINMAIL_LEGGINGS, EquipmentAssets.CHAINMAIL, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.CHAINMAIL_BOOTS, EquipmentAssets.CHAINMAIL, false);


        generateTrimmableItemWithModdedMaterials(itemModels, Items.IRON_HELMET, EquipmentAssets.IRON, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.IRON_CHESTPLATE, EquipmentAssets.IRON, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.IRON_LEGGINGS, EquipmentAssets.IRON, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.IRON_BOOTS, EquipmentAssets.IRON, false);


        generateTrimmableItemWithModdedMaterials(itemModels, Items.DIAMOND_HELMET, EquipmentAssets.DIAMOND, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.DIAMOND_CHESTPLATE, EquipmentAssets.DIAMOND, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.DIAMOND_LEGGINGS, EquipmentAssets.DIAMOND, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.DIAMOND_BOOTS, EquipmentAssets.DIAMOND, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.GOLDEN_HELMET, EquipmentAssets.GOLD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.GOLDEN_CHESTPLATE, EquipmentAssets.GOLD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.GOLDEN_LEGGINGS, EquipmentAssets.GOLD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.GOLDEN_BOOTS, EquipmentAssets.GOLD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.NETHERITE_HELMET, EquipmentAssets.NETHERITE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.NETHERITE_CHESTPLATE, EquipmentAssets.NETHERITE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.NETHERITE_LEGGINGS, EquipmentAssets.NETHERITE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.NETHERITE_BOOTS, EquipmentAssets.NETHERITE, false);

        generateTrimmableItemWithModdedMaterials(itemModels, Items.TURTLE_HELMET, EquipmentAssets.TURTLE_SCUTE, false);

		generateTrimmableItemWithModdedMaterials(itemModels, Items.COPPER_HELMET, EquipmentAssets.COPPER, false);
		generateTrimmableItemWithModdedMaterials(itemModels, Items.COPPER_CHESTPLATE, EquipmentAssets.COPPER, false);
		generateTrimmableItemWithModdedMaterials(itemModels, Items.COPPER_LEGGINGS, EquipmentAssets.COPPER, false);
		generateTrimmableItemWithModdedMaterials(itemModels, Items.COPPER_BOOTS, EquipmentAssets.COPPER, false);

		set(itemModels, "tenumbrum", AutoGenTypes.IRON_TYPE, blockModels);
    }

    public void generateTrimmableItemWithModdedMaterials(ItemModelGenerators itemModels, Item item, ResourceKey<EquipmentAsset> equipmentAsset, boolean usesSecondLayer) {
        ResourceLocation resourcelocation = ModelLocationUtils.getModelLocation(item);
        ResourceLocation resourcelocation1 = TextureMapping.getItemTexture(item);
        ResourceLocation resourcelocation2 = TextureMapping.getItemTexture(item, "_overlay");
        List<SelectItemModel.SwitchCase<ResourceKey<TrimMaterial>>> list = new ArrayList(TRIM_MATERIAL_MODELS.size());

        for(ItemModelGenerators.TrimMaterialData itemmodelgenerators$trimmaterialdata : TRIM_MATERIAL_MODELS) {
            ResourceLocation resourcelocation3 = resourcelocation.withSuffix("_" + itemmodelgenerators$trimmaterialdata.assets().base().suffix() + "_trim");
            String var10001 = itemmodelgenerators$trimmaterialdata.assets().assetId(equipmentAsset).suffix();
            String path = item.getDescriptionId();
            ResourceLocation modelId = (path.contains("helmet")) ? TRIM_PREFIX_HELMET : ((path.contains("chestplate")) ? TRIM_PREFIX_CHESTPLATE : ((path.contains("leggings")) ? TRIM_PREFIX_LEGGINGS : ItemModelGenerators.TRIM_PREFIX_BOOTS));
            System.out.println(path);
            ResourceLocation resourcelocation4 = modelId.withSuffix("_" + var10001);
            ItemModel.Unbaked itemmodel$unbaked;
            if (usesSecondLayer) {
                itemModels.generateLayeredItem(resourcelocation3, resourcelocation1, resourcelocation2, resourcelocation4);
                itemmodel$unbaked = ItemModelUtils.tintedModel(resourcelocation3, new ItemTintSource[]{new Dye(-6265536)});
            } else {
                itemModels.generateLayeredItem(resourcelocation3, resourcelocation1, resourcelocation4);
                itemmodel$unbaked = ItemModelUtils.plainModel(resourcelocation3);
            }

            list.add(ItemModelUtils.when(itemmodelgenerators$trimmaterialdata.materialKey(), itemmodel$unbaked));
        }

        ItemModel.Unbaked itemmodel$unbaked1;
        if (usesSecondLayer) {
            ModelTemplates.TWO_LAYERED_ITEM.create(resourcelocation, TextureMapping.layered(resourcelocation1, resourcelocation2), itemModels.modelOutput);
            itemmodel$unbaked1 = ItemModelUtils.tintedModel(resourcelocation, new ItemTintSource[]{new Dye(-6265536)});
        } else {
            ModelTemplates.FLAT_ITEM.create(resourcelocation, TextureMapping.layer0(resourcelocation1), itemModels.modelOutput);
            itemmodel$unbaked1 = ItemModelUtils.plainModel(resourcelocation);
        }

        itemModels.itemModelOutput.accept(item, ItemModelUtils.select(new TrimMaterialProperty(), itemmodel$unbaked1, list));
    }

    public static ResourceLocation prefixForSlotTrimModded(String name) {
        return ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "trims/items/" + name + "_trim");
    }

    public void normal(Item item, ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
    }

	public void set(ItemModelGenerators geners, String groupName, AutoGenTypes type, BlockModelGenerators bGeners) {
		geners.generateFlatItem(ModUtil.getItemFromKey(groupName + "_sword"), ModelTemplates.FLAT_HANDHELD_ITEM);
		geners.generateFlatItem(ModUtil.getItemFromKey(groupName + "_axe"), ModelTemplates.FLAT_HANDHELD_ITEM);
		geners.generateFlatItem(ModUtil.getItemFromKey(groupName + "_pickaxe"), ModelTemplates.FLAT_HANDHELD_ITEM);
		geners.generateFlatItem(ModUtil.getItemFromKey(groupName + "_shovel"), ModelTemplates.FLAT_HANDHELD_ITEM);
		geners.generateFlatItem(ModUtil.getItemFromKey(groupName + "_hoe"), ModelTemplates.FLAT_HANDHELD_ITEM);
		bGeners.createTrivialCube(ModUtil.getBlockFromKey(groupName + "_block"));
		if (type == AutoGenTypes.DIAMOND_TYPE || type == AutoGenTypes.NETHER_DIAMOND_TYPE || type == AutoGenTypes.END_DIAMOND_TYPE) {
			geners.generateFlatItem(ModUtil.getItemFromKey(groupName), ModelTemplates.FLAT_ITEM);
		}
		if (type == AutoGenTypes.IRON_TYPE || type == AutoGenTypes.NETHER_IRON_TYPE || type == AutoGenTypes.END_IRON_TYPE) {
			geners.generateFlatItem(ModUtil.getItemFromKey(groupName + "_ingot"), ModelTemplates.FLAT_ITEM);
			geners.generateFlatItem(ModUtil.getItemFromKey("raw_" + groupName), ModelTemplates.FLAT_ITEM);
			bGeners.createTrivialCube(ModUtil.getBlockFromKey("raw_" + groupName + "_block"));
		}
		if (type == AutoGenTypes.CZ_TYPE) {
			geners.generateFlatItem(ModUtil.getItemFromKey(groupName), ModelTemplates.FLAT_ITEM);
			geners.generateFlatItem(ModUtil.getItemFromKey("raw_" + groupName), ModelTemplates.FLAT_ITEM);
			bGeners.createTrivialCube(ModUtil.getBlockFromKey("raw_" + groupName + "_block"));
		}
		if (type == AutoGenTypes.DIAMOND_TYPE || type == AutoGenTypes.IRON_TYPE || type == AutoGenTypes.CZ_TYPE) {
			bGeners.createTrivialCube(ModUtil.getBlockFromKey("deepslate_" + groupName + "_ore"));
			bGeners.createTrivialCube(ModUtil.getBlockFromKey(groupName + "_ore"));
		}
		if (type == AutoGenTypes.NETHER_DIAMOND_TYPE || type == AutoGenTypes.NETHER_IRON_TYPE) {
			bGeners.createTrivialCube(ModUtil.getBlockFromKey("nether_" + groupName + "_ore"));
		}
		if (type == AutoGenTypes.END_DIAMOND_TYPE || type == AutoGenTypes.END_IRON_TYPE) {
			bGeners.createTrivialCube(ModUtil.getBlockFromKey("end_" + groupName + "_ore"));
		}
		generateTrimmableItemWithModdedMaterials(geners, ModUtil.getItemFromKey(groupName + "_helmet"), ModUtil.createEquipmentAssetResourceKey(groupName), false);
		generateTrimmableItemWithModdedMaterials(geners, ModUtil.getItemFromKey(groupName + "_chestplate"), ModUtil.createEquipmentAssetResourceKey(groupName), false);
		generateTrimmableItemWithModdedMaterials(geners, ModUtil.getItemFromKey(groupName + "_leggings"), ModUtil.createEquipmentAssetResourceKey(groupName), false);
		generateTrimmableItemWithModdedMaterials(geners, ModUtil.getItemFromKey(groupName + "_boots"), ModUtil.createEquipmentAssetResourceKey(groupName), false);
	}
}
