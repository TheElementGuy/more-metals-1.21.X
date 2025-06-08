package net.theelementguy.moremetals.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.item.BlockModelWrapper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.block.ModBlocks;
import net.theelementguy.moremetals.item.ModItems;
import net.theelementguy.moremetals.util.ModTags;
import net.theelementguy.moremetals.util.ModUtil;

import java.util.Collections;
import java.util.Objects;

import static net.minecraft.tags.TagEntry.tag;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, MoreMetalsMod.MOD_ID);
    }

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
        itemModels.generateFlatItem(ModItems.CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CELESTIAL_BRRONZE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
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

        itemModels.generateTrimmableItem(ModItems.CUBIC_ZIRCONIA_HELMET.get(), ModUtil.createEquipmentAssetResourceKey("cubic_zirconia"), "helmet", false);
        itemModels.generateTrimmableItem(ModItems.CUBIC_ZIRCONIA_CHESTPLATE.get(), ModUtil.createEquipmentAssetResourceKey("cubic_zirconia"), "chestplate", false);
        itemModels.generateTrimmableItem(ModItems.CUBIC_ZIRCONIA_LEGGINGS.get(), ModUtil.createEquipmentAssetResourceKey("cubic_zirconia"), "leggings", false);
        itemModels.generateTrimmableItem(ModItems.CUBIC_ZIRCONIA_BOOTS.get(), ModUtil.createEquipmentAssetResourceKey("cubic_zirconia"), "boots", false);
        itemModels.generateTrimmableItem(ModItems.RUBIDIUM_HELMET.get(), ModUtil.createEquipmentAssetResourceKey("rubidium"), "helmet", false);
        itemModels.generateTrimmableItem(ModItems.RUBIDIUM_CHESTPLATE.get(), ModUtil.createEquipmentAssetResourceKey("rubidium"), "chestplate", false);
        itemModels.generateTrimmableItem(ModItems.RUBIDIUM_LEGGINGS.get(), ModUtil.createEquipmentAssetResourceKey("rubidium"), "leggings", false);
        itemModels.generateTrimmableItem(ModItems.RUBIDIUM_BOOTS.get(), ModUtil.createEquipmentAssetResourceKey("rubidium"), "boots", false);
        itemModels.generateTrimmableItem(ModItems.STARSHARD_HELMET.get(), ModUtil.createEquipmentAssetResourceKey("starshard"), "helmet", false);
        itemModels.generateTrimmableItem(ModItems.STARSHARD_CHESTPLATE.get(), ModUtil.createEquipmentAssetResourceKey("starshard"), "chestplate", false);
        itemModels.generateTrimmableItem(ModItems.STARSHARD_LEGGINGS.get(), ModUtil.createEquipmentAssetResourceKey("starshard"), "leggings", false);
        itemModels.generateTrimmableItem(ModItems.STARSHARD_BOOTS.get(), ModUtil.createEquipmentAssetResourceKey("starshard"), "boots", false);
        itemModels.generateTrimmableItem(ModItems.BRONZE_HELMET.get(), ModUtil.createEquipmentAssetResourceKey("bronze"), "helmet", false);
        itemModels.generateTrimmableItem(ModItems.BRONZE_CHESTPLATE.get(), ModUtil.createEquipmentAssetResourceKey("bronze"), "chestplate", false);
        itemModels.generateTrimmableItem(ModItems.BRONZE_LEGGINGS.get(), ModUtil.createEquipmentAssetResourceKey("bronze"), "leggings", false);
        itemModels.generateTrimmableItem(ModItems.BRONZE_BOOTS.get(), ModUtil.createEquipmentAssetResourceKey("bronze"), "boots", false);

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

    public void standardItem(ItemModelGenerators itemModels, Item item) {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item));
        String parent = id.getPath();
        ResourceLocation parentTexture = ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "item/" + parent);

        itemModels.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
    }

    private ResourceLocation blockStateLocation(ResourceLocation id) {
        return ResourceLocation.fromNamespaceAndPath(id.getNamespace(), "block/" + id.getPath());
    }
}
