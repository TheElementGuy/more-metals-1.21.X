package net.theelementguy.tegmoremetals.datagen;

import net.minecraft.client.color.item.Dye;
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
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.block.ModBlocks;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.trim.ModTrimMaterials;
import net.theelementguy.tegmoremetals.util.ModUtil;

import java.util.*;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, MoreMetalsMod.MOD_ID);
    }

    public static final ResourceLocation TRIM_PREFIX_HELMET = prefixForSlotTrimModded("helmet");

    public static final ResourceLocation TRIM_PREFIX_CHESTPLATE = prefixForSlotTrimModded("chestplate");

    public static final ResourceLocation TRIM_PREFIX_LEGGINGS = prefixForSlotTrimModded("leggings");

    public static final ResourceLocation TRIM_PREFIX_BOOTS = prefixForSlotTrimModded("boots");

    public static final List<ItemModelGenerators.TrimMaterialData> TRIM_MATERIAL_MODELS_WITH_MODDED = List.of(
            new ItemModelGenerators.TrimMaterialData("quartz", TrimMaterials.QUARTZ, Map.of()),
            new ItemModelGenerators.TrimMaterialData("iron", TrimMaterials.IRON, Map.of(EquipmentAssets.IRON, "iron_darker")),
            new ItemModelGenerators.TrimMaterialData("netherite", TrimMaterials.NETHERITE, Map.of(EquipmentAssets.NETHERITE, "netherite_darker")),
            new ItemModelGenerators.TrimMaterialData("redstone", TrimMaterials.REDSTONE, Map.of()),
            new ItemModelGenerators.TrimMaterialData("copper", TrimMaterials.COPPER, Map.of()),
            new ItemModelGenerators.TrimMaterialData("gold", TrimMaterials.GOLD, Map.of(EquipmentAssets.GOLD, "gold_darker")),
            new ItemModelGenerators.TrimMaterialData("emerald", TrimMaterials.EMERALD, Map.of()),
            new ItemModelGenerators.TrimMaterialData("diamond", TrimMaterials.DIAMOND, Map.of(EquipmentAssets.DIAMOND, "diamond_darker")),
            new ItemModelGenerators.TrimMaterialData("lapis", TrimMaterials.LAPIS, Map.of()),
            new ItemModelGenerators.TrimMaterialData("amethyst", TrimMaterials.AMETHYST, Map.of()),
            new ItemModelGenerators.TrimMaterialData("resin", TrimMaterials.RESIN, Map.of()),
            new ItemModelGenerators.TrimMaterialData("cubic_zirconia", ModTrimMaterials.CUBIC_ZIRCONIA, Map.of()),
            new ItemModelGenerators.TrimMaterialData("starshard", ModTrimMaterials.STARSHARD, Map.of()),
            new ItemModelGenerators.TrimMaterialData("tin", ModTrimMaterials.TIN, Map.of()),
            new ItemModelGenerators.TrimMaterialData("rubidium", ModTrimMaterials.RUBIDIUM, Map.of()),
            new ItemModelGenerators.TrimMaterialData("bronze", ModTrimMaterials.BRONZE, Map.of())
            );

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_CUBIC_ZIRCONIA.get(), ModelTemplates.FLAT_ITEM);
        //itemModels.generateFlatItem(ModItems.CELESTIAL_BRONZE_INGOT.get(), ModelTemplates.FLAT_ITEM);
        //itemModels.generateFlatItem(ModItems.RAW_CELESTIAL_BRONZE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TIN_SCRAPS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_INGOT.get(), ModelTemplates.FLAT_ITEM);

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
        itemModels.generateFlatItem(ModItems.BRONZE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        generateTrimmableItemWithModded(ModItems.CUBIC_ZIRCONIA_HELMET.get(), ModUtil.createEquipmentAssetResourceKey("cubic_zirconia"), "helmet", false, itemModels);
        generateTrimmableItemWithModded(ModItems.CUBIC_ZIRCONIA_CHESTPLATE.get(), ModUtil.createEquipmentAssetResourceKey("cubic_zirconia"), "chestplate", false, itemModels);
        generateTrimmableItemWithModded(ModItems.CUBIC_ZIRCONIA_LEGGINGS.get(), ModUtil.createEquipmentAssetResourceKey("cubic_zirconia"), "leggings", false, itemModels);
        generateTrimmableItemWithModded(ModItems.CUBIC_ZIRCONIA_BOOTS.get(), ModUtil.createEquipmentAssetResourceKey("cubic_zirconia"), "boots", false, itemModels);
        generateTrimmableItemWithModded(ModItems.RUBIDIUM_HELMET.get(), ModUtil.createEquipmentAssetResourceKey("rubidium"), "helmet", false, itemModels);
        generateTrimmableItemWithModded(ModItems.RUBIDIUM_CHESTPLATE.get(), ModUtil.createEquipmentAssetResourceKey("rubidium"), "chestplate", false, itemModels);
        generateTrimmableItemWithModded(ModItems.RUBIDIUM_LEGGINGS.get(), ModUtil.createEquipmentAssetResourceKey("rubidium"), "leggings", false, itemModels);
        generateTrimmableItemWithModded(ModItems.RUBIDIUM_BOOTS.get(), ModUtil.createEquipmentAssetResourceKey("rubidium"), "boots", false, itemModels);
        generateTrimmableItemWithModded(ModItems.STARSHARD_HELMET.get(), ModUtil.createEquipmentAssetResourceKey("starshard"), "helmet", false, itemModels);
        generateTrimmableItemWithModded(ModItems.STARSHARD_CHESTPLATE.get(), ModUtil.createEquipmentAssetResourceKey("starshard"), "chestplate", false, itemModels);
        generateTrimmableItemWithModded(ModItems.STARSHARD_LEGGINGS.get(), ModUtil.createEquipmentAssetResourceKey("starshard"), "leggings", false, itemModels);
        generateTrimmableItemWithModded(ModItems.STARSHARD_BOOTS.get(), ModUtil.createEquipmentAssetResourceKey("starshard"), "boots", false, itemModels);
        generateTrimmableItemWithModded(ModItems.BRONZE_HELMET.get(), ModUtil.createEquipmentAssetResourceKey("bronze"), "helmet", false, itemModels);
        generateTrimmableItemWithModded(ModItems.BRONZE_CHESTPLATE.get(), ModUtil.createEquipmentAssetResourceKey("bronze"), "chestplate", false, itemModels);
        generateTrimmableItemWithModded(ModItems.BRONZE_LEGGINGS.get(), ModUtil.createEquipmentAssetResourceKey("bronze"), "leggings", false, itemModels);
        generateTrimmableItemWithModded(ModItems.BRONZE_BOOTS.get(), ModUtil.createEquipmentAssetResourceKey("bronze"), "boots", false, itemModels);

        generateTrimmableItemWithModded(Items.LEATHER_HELMET, EquipmentAssets.LEATHER, "helmet", true, itemModels);
        generateTrimmableItemWithModded(Items.LEATHER_CHESTPLATE, EquipmentAssets.LEATHER, "chestplate", true, itemModels);
        generateTrimmableItemWithModded(Items.LEATHER_LEGGINGS, EquipmentAssets.LEATHER, "leggings", true, itemModels);
        generateTrimmableItemWithModded(Items.LEATHER_BOOTS, EquipmentAssets.LEATHER, "boots", true, itemModels);


        generateTrimmableItemWithModded(Items.CHAINMAIL_HELMET, EquipmentAssets.CHAINMAIL, "helmet", false, itemModels);
        generateTrimmableItemWithModded(Items.CHAINMAIL_CHESTPLATE, EquipmentAssets.CHAINMAIL, "chestplate", false, itemModels);
        generateTrimmableItemWithModded(Items.CHAINMAIL_LEGGINGS, EquipmentAssets.CHAINMAIL, "leggings", false, itemModels);
        generateTrimmableItemWithModded(Items.CHAINMAIL_BOOTS, EquipmentAssets.CHAINMAIL, "boots", false, itemModels);


        generateTrimmableItemWithModded(Items.IRON_HELMET, EquipmentAssets.IRON, "helmet", false, itemModels);
        generateTrimmableItemWithModded(Items.IRON_CHESTPLATE, EquipmentAssets.IRON, "chestplate", false, itemModels);
        generateTrimmableItemWithModded(Items.IRON_LEGGINGS, EquipmentAssets.IRON, "leggings", false, itemModels);
        generateTrimmableItemWithModded(Items.IRON_BOOTS, EquipmentAssets.IRON, "boots", false, itemModels);


        generateTrimmableItemWithModded(Items.DIAMOND_HELMET, EquipmentAssets.DIAMOND, "helmet", false, itemModels);
        generateTrimmableItemWithModded(Items.DIAMOND_CHESTPLATE, EquipmentAssets.DIAMOND, "chestplate", false, itemModels);
        generateTrimmableItemWithModded(Items.DIAMOND_LEGGINGS, EquipmentAssets.DIAMOND, "leggings", false, itemModels);
        generateTrimmableItemWithModded(Items.DIAMOND_BOOTS, EquipmentAssets.DIAMOND, "boots", false, itemModels);
        generateTrimmableItemWithModded(Items.GOLDEN_HELMET, EquipmentAssets.GOLD, "helmet", false, itemModels);
        generateTrimmableItemWithModded(Items.GOLDEN_CHESTPLATE, EquipmentAssets.GOLD, "chestplate", false, itemModels);
        generateTrimmableItemWithModded(Items.GOLDEN_LEGGINGS, EquipmentAssets.GOLD, "leggings", false, itemModels);
        generateTrimmableItemWithModded(Items.GOLDEN_BOOTS, EquipmentAssets.GOLD, "boots", false, itemModels);
        generateTrimmableItemWithModded(Items.NETHERITE_HELMET, EquipmentAssets.NETHERITE, "helmet", false, itemModels);
        generateTrimmableItemWithModded(Items.NETHERITE_CHESTPLATE, EquipmentAssets.NETHERITE, "chestplate", false, itemModels);
        generateTrimmableItemWithModded(Items.NETHERITE_LEGGINGS, EquipmentAssets.NETHERITE, "leggings", false, itemModels);
        generateTrimmableItemWithModded(Items.NETHERITE_BOOTS, EquipmentAssets.NETHERITE, "boots", false, itemModels);

        blockModels.createTrivialCube(ModBlocks.CUBIC_ZIRCONIA_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CUBIC_ZIRCONIA_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get());
        //blockModels.createTrivialCube(ModBlocks.CELESTIAL_BRONZE_BLOCK.get());
        //blockModels.createTrivialCube(ModBlocks.RAW_CELESTIAL_BRONZE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.TIN_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.TIN_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_TIN_ORE.get());
        blockModels.createTrivialCube(ModBlocks.RUBIDIUM_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.NETHER_RUBIDIUM_ORE.get());
        blockModels.createColoredBlockWithStateRotations(TexturedModel.GLAZED_TERRACOTTA, ModBlocks.STARSHARD_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.END_STARSHARD_ORE.get());
        blockModels.createTrivialCube(ModBlocks.BRONZE_BLOCK.get());

        /*this.standardBlock(blockModels, ModBlocks.CUBIC_ZIRCONIA_BLOCK.get());
        this.standardBlock(blockModels, ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.get());
        this.standardBlock(blockModels, ModBlocks.CUBIC_ZIRCONIA_ORE.get());
        this.standardBlock(blockModels, ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get());
        this.standardBlock(blockModels, ModBlocks.CELESTIAL_BRONZE_BLOCK.get());
        this.standardBlock(blockModels, ModBlocks.RAW_CELESTIAL_BRONZE_BLOCK.get());
        this.standardBlock(blockModels, ModBlocks.TIN_BLOCK.get());
        this.standardBlock(blockModels, ModBlocks.TIN_ORE.get());
        this.standardBlock(blockModels, ModBlocks.RUBIDIUM_BLOCK.get());
        this.standardBlock(blockModels, ModBlocks.NETHER_RUBIDIUM_ORE.get());
        this.rotatableBlock(blockModels, ModBlocks.STARSHARD_BLOCK.get());
        this.standardBlock(blockModels, ModBlocks.END_STARSHARD_ORE.get());*/


    }

    public void standardBlock(BlockModelGenerators blockModels, Block block) {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(block));
        String parent = id.getPath();
        ResourceLocation parentTexture = ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID ,"block/" + parent);

        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.ALL, parentTexture);
        ResourceLocation basicModel = ModelTemplates.CUBE_ALL.create(block, textureMapping, blockModels.modelOutput);
        /*ResourceLocation fenceGateModelClosed = ModelTemplates.FENCE_GATE_CLOSED.create(fenceGate, textureMapping, blockModels.modelOutput);
        ResourceLocation fenceGateWallModelOpen = ModelTemplates.FENCE_GATE_WALL_OPEN.create(fenceGate, textureMapping, blockModels.modelOutput);
        ResourceLocation fenceGateWallModelClosed = ModelTemplates.FENCE_GATE_WALL_CLOSED.create(fenceGate, textureMapping, blockModels.modelOutput);*/
        blockModels.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, basicModel));

        ResourceLocation inventoryModel = ModelTemplates.CUBE_ALL.create(block, textureMapping, blockModels.modelOutput);

        //blockModels.itemModelOutput.accept(block.asItem(), new BlockModelWrapper.Unbaked(inventoryModel, Collections.emptyList()));
    }

    public void rotatableBlock(BlockModelGenerators blockModels, Block block) {

        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.PATTERN, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "block/" + Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(block)).getPath()));

        blockModels.createColoredBlockWithStateRotations(TexturedModel.GLAZED_TERRACOTTA, block);

        //blockModels.itemModelOutput.accept(block.asItem(), new BlockModelWrapper.Unbaked(ModelTemplates.GLAZED_TERRACOTTA.create(block, textureMapping, blockModels.modelOutput), Collections.emptyList()));
    }

    private ResourceLocation blockStateLocation(ResourceLocation id) {
        return ResourceLocation.fromNamespaceAndPath(id.getNamespace(), "block/" + id.getPath());
    }

    public void generateTrimmableItemWithModded(Item item, ResourceKey<EquipmentAsset> key, String name, boolean dyeable, ItemModelGenerators gens) {
        ResourceLocation resourcelocation = ModelLocationUtils.getModelLocation(item);
        ResourceLocation resourcelocation1 = TextureMapping.getItemTexture(item);
        ResourceLocation resourcelocation2 = TextureMapping.getItemTexture(item, "_overlay");
        List<SelectItemModel.SwitchCase<ResourceKey<TrimMaterial>>> list = new ArrayList<>(TRIM_MATERIAL_MODELS_WITH_MODDED.size());

        for (ItemModelGenerators.TrimMaterialData itemmodelgenerators$trimmaterialdata : TRIM_MATERIAL_MODELS_WITH_MODDED) {
            ResourceLocation resourcelocation3 = resourcelocation.withSuffix("_" + itemmodelgenerators$trimmaterialdata.name() + "_trim");
            ResourceLocation resourcelocation4 = ResourceLocation.fromNamespaceAndPath(
                    (itemmodelgenerators$trimmaterialdata.textureName(key).contains("rubidium") || itemmodelgenerators$trimmaterialdata.textureName(key).contains("starshard") || itemmodelgenerators$trimmaterialdata.textureName(key).contains("cubic_zirconia") || itemmodelgenerators$trimmaterialdata.textureName(key).contains("tin") || itemmodelgenerators$trimmaterialdata.textureName(key).contains("bronze")) ? "minecraft" : "minecraft", "trims/items/" + name + "_trim_" + itemmodelgenerators$trimmaterialdata.textureName(key)
            );
            ItemModel.Unbaked itemmodel$unbaked;
            if (dyeable) {
                gens.generateLayeredItem(resourcelocation3, resourcelocation1, resourcelocation2, resourcelocation4);
                itemmodel$unbaked = ItemModelUtils.tintedModel(resourcelocation3, new Dye(-6265536));
            } else {
                gens.generateLayeredItem(resourcelocation3, resourcelocation1, resourcelocation4);
                itemmodel$unbaked = ItemModelUtils.plainModel(resourcelocation3);
            }

            list.add(ItemModelUtils.when(itemmodelgenerators$trimmaterialdata.materialKey(), itemmodel$unbaked));

            System.out.println(resourcelocation3);
        }

        ItemModel.Unbaked itemmodel$unbaked1;
        if (dyeable) {
            ModelTemplates.TWO_LAYERED_ITEM.create(resourcelocation, TextureMapping.layered(resourcelocation1, resourcelocation2), gens.modelOutput);
            itemmodel$unbaked1 = ItemModelUtils.tintedModel(resourcelocation, new Dye(-6265536));
        } else {
            ModelTemplates.FLAT_ITEM.create(resourcelocation, TextureMapping.layer0(resourcelocation1), gens.modelOutput);
            itemmodel$unbaked1 = ItemModelUtils.plainModel(resourcelocation);
        }

        gens.itemModelOutput.accept(item, ItemModelUtils.select(new TrimMaterialProperty(), itemmodel$unbaked1, list));
    }

    public static ResourceLocation prefixForSlotTrimModded(String name) {
        return ResourceLocation.fromNamespaceAndPath("minecraft", "trims/items/" + name + "_trim");
    }
}
