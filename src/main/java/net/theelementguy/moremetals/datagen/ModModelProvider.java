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
        itemModels.generateFlatItem(ModItems.CELESTIAL_BRONZE_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_CELESTIAL_BRONZE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TIN_SCRAPS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_INGOT.get(), ModelTemplates.FLAT_ITEM);

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

        itemModels.generateTrimmableItem(ModItems.CUBIC_ZIRCONIA_HELMET.get(), ModUtil.createEquipmentAssetResourceKey("cubic_zirconia"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "helmet"), false);
        itemModels.generateTrimmableItem(ModItems.CUBIC_ZIRCONIA_CHESTPLATE.get(), ModUtil.createEquipmentAssetResourceKey("cubic_zirconia"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "chestplate"), false);
        itemModels.generateTrimmableItem(ModItems.CUBIC_ZIRCONIA_LEGGINGS.get(), ModUtil.createEquipmentAssetResourceKey("cubic_zirconia"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "leggings"), false);
        itemModels.generateTrimmableItem(ModItems.CUBIC_ZIRCONIA_BOOTS.get(), ModUtil.createEquipmentAssetResourceKey("cubic_zirconia"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "boots"), false);
        itemModels.generateTrimmableItem(ModItems.RUBIDIUM_HELMET.get(), ModUtil.createEquipmentAssetResourceKey("rubidium"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "helmet"), false);
        itemModels.generateTrimmableItem(ModItems.RUBIDIUM_CHESTPLATE.get(), ModUtil.createEquipmentAssetResourceKey("rubidium"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "chestplate"), false);
        itemModels.generateTrimmableItem(ModItems.RUBIDIUM_LEGGINGS.get(), ModUtil.createEquipmentAssetResourceKey("rubidium"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "leggings"), false);
        itemModels.generateTrimmableItem(ModItems.RUBIDIUM_BOOTS.get(), ModUtil.createEquipmentAssetResourceKey("rubidium"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "boots"), false);
        itemModels.generateTrimmableItem(ModItems.STARSHARD_HELMET.get(), ModUtil.createEquipmentAssetResourceKey("starshard"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "helmet"), false);
        itemModels.generateTrimmableItem(ModItems.STARSHARD_CHESTPLATE.get(), ModUtil.createEquipmentAssetResourceKey("starshard"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "chestplate"), false);
        itemModels.generateTrimmableItem(ModItems.STARSHARD_LEGGINGS.get(), ModUtil.createEquipmentAssetResourceKey("starshard"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "leggings"), false);
        itemModels.generateTrimmableItem(ModItems.STARSHARD_BOOTS.get(), ModUtil.createEquipmentAssetResourceKey("starshard"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "boots"), false);
        itemModels.generateTrimmableItem(ModItems.BRONZE_HELMET.get(), ModUtil.createEquipmentAssetResourceKey("bronze"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "helmet"), false);
        itemModels.generateTrimmableItem(ModItems.BRONZE_CHESTPLATE.get(), ModUtil.createEquipmentAssetResourceKey("bronze"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "chestplate"), false);
        itemModels.generateTrimmableItem(ModItems.BRONZE_LEGGINGS.get(), ModUtil.createEquipmentAssetResourceKey("bronze"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "leggings"), false);
        itemModels.generateTrimmableItem(ModItems.BRONZE_BOOTS.get(), ModUtil.createEquipmentAssetResourceKey("bronze"), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "boots"), false);

        blockModels.createTrivialCube(ModBlocks.CUBIC_ZIRCONIA_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CUBIC_ZIRCONIA_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get());
        blockModels.createTrivialCube(ModBlocks.CELESTIAL_BRONZE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAW_CELESTIAL_BRONZE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.TIN_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.TIN_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_TIN_ORE.get());
        blockModels.createTrivialCube(ModBlocks.RUBIDIUM_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.NETHER_RUBIDIUM_ORE.get());
        blockModels.createColoredBlockWithStateRotations(TexturedModel.GLAZED_TERRACOTTA, ModBlocks.STARSHARD_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.END_STARSHARD_ORE.get());
        blockModels.createTrivialCube(ModBlocks.BRONZE_BLOCK.get());
    }
}
