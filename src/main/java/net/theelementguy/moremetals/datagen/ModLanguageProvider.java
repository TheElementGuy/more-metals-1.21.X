package net.theelementguy.moremetals.datagen;

import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.block.ModBlocks;
import net.theelementguy.moremetals.item.ModItems;
import net.theelementguy.moremetals.trim.ModTrimMaterials;

public class ModLanguageProvider extends LanguageProvider {
    
    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, MoreMetalsMod.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {

        add(ModItems.CUBIC_ZIRCONIA, "Cubic Zirconia");
        add(ModItems.RAW_CUBIC_ZIRCONIA, "Raw Cubic Zirconia");
        add(ModItems.CUBIC_ZIRCONIA_SWORD, "Cubic Zirconia Sword");
        add(ModItems.CUBIC_ZIRCONIA_AXE, "Cubic Zirconia Axe");
        add(ModItems.CUBIC_ZIRCONIA_PICKAXE, "Cubic Zirconia Pickaxe");
        add(ModItems.CUBIC_ZIRCONIA_SHOVEL, "Cubic Zirconia Shovel");
        add(ModItems.CUBIC_ZIRCONIA_HOE, "Cubic Zirconia Hoe");
        add(ModItems.CUBIC_ZIRCONIA_HELMET, "Cubic Zirconia Helmet");
        add(ModItems.CUBIC_ZIRCONIA_CHESTPLATE, "Cubic Zirconia Chestplate");
        add(ModItems.CUBIC_ZIRCONIA_LEGGINGS, "Cubic Zirconia Leggings");
        add(ModItems.CUBIC_ZIRCONIA_BOOTS, "Cubic Zirconia Boots");

        add(ModItems.TIN_SCRAPS, "Tin Scraps");

        add(ModItems.BRONZE_INGOT, "Bronze Ingot");
        add(ModItems.BRONZE_SWORD, "Bronze Sword");
        add(ModItems.BRONZE_AXE, "Bronze Axe");
        add(ModItems.BRONZE_PICKAXE, "Bronze Pickaxe");
        add(ModItems.BRONZE_SHOVEL, "Bronze Shovel");
        add(ModItems.BRONZE_HOE, "Bronze Hoe");
        add(ModItems.BRONZE_HELMET, "Bronze Helmet");
        add(ModItems.BRONZE_CHESTPLATE, "Bronze Chestplate");
        add(ModItems.BRONZE_LEGGINGS, "Bronze Leggings");
        add(ModItems.BRONZE_BOOTS, "Bronze Boots");

        add(ModItems.RUBIDIUM, "Rubidium");
        add(ModItems.RUBIDIUM_SWORD, "Rubidium Sword");
        add(ModItems.RUBIDIUM_AXE, "Rubidium Axe");
        add(ModItems.RUBIDIUM_PICKAXE, "Rubidium Pickaxe");
        add(ModItems.RUBIDIUM_SHOVEL, "Rubidium Shovel");
        add(ModItems.RUBIDIUM_HOE, "Rubidium Hoe");
        add(ModItems.RUBIDIUM_HELMET, "Rubidium Helmet");
        add(ModItems.RUBIDIUM_CHESTPLATE, "Rubidium Chestplate");
        add(ModItems.RUBIDIUM_LEGGINGS, "Rubidium Leggings");
        add(ModItems.RUBIDIUM_BOOTS, "Rubidium Boots");

        add(ModItems.STARSHARD, "Starshard");
        add(ModItems.STARSHARD_SWORD, "Starshard Sword");
        add(ModItems.STARSHARD_AXE, "Starshard Axe");
        add(ModItems.STARSHARD_PICKAXE, "Starshard Pickaxe");
        add(ModItems.STARSHARD_SHOVEL, "Starshard Shovel");
        add(ModItems.STARSHARD_HOE, "Starshard Hoe");
        add(ModItems.STARSHARD_HELMET, "Starshard Helmet");
        add(ModItems.STARSHARD_CHESTPLATE, "Starshard Chestplate");
        add(ModItems.STARSHARD_LEGGINGS, "Starshard Leggings");
        add(ModItems.STARSHARD_BOOTS, "Starshard Boots");

        add(ModBlocks.CUBIC_ZIRCONIA_BLOCK, "Block of Cubic Zirconia");
        add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK, "Block of Raw Cubic Zirconia");
        add(ModBlocks.TIN_BLOCK, "Block of Tin");
        add(ModBlocks.BRONZE_BLOCK, "Block of Bronze");
        add(ModBlocks.RUBIDIUM_BLOCK, "Block of Rubidium");
        add(ModBlocks.STARSHARD_BLOCK, "Block of Starshard");

        add(ModBlocks.CUBIC_ZIRCONIA_ORE, "Cubic Zirconia Ore");
        add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE, "Deepslate Cubic Zirconia Ore");
        add(ModBlocks.TIN_ORE, "Tin Ore");
        add(ModBlocks.DEEPSLATE_TIN_ORE, "Deepslate Tin Ore");
        add(ModBlocks.NETHER_RUBIDIUM_ORE, "Nether Rubidium Ore");
        add(ModBlocks.END_STARSHARD_ORE, "End Starshard Ore");

        addTrimMaterial(ModTrimMaterials.CUBIC_ZIRCONIA, "Cubic Zirconia");
        addTrimMaterial(ModTrimMaterials.TIN, "Tin");
        addTrimMaterial(ModTrimMaterials.BRONZE, "Bronze");
        addTrimMaterial(ModTrimMaterials.RUBIDIUM, "Rubidium");
        addTrimMaterial(ModTrimMaterials.STARSHARD, "Starshard");

    }
    
    protected void add(DeferredItem<? extends Item> key, String name) {
        add(key.get(), name);
    }

    protected void add(DeferredBlock<? extends Block> key, String name) {
        add(key.get(), name);
    }

    protected void addTrimMaterial(ResourceKey<TrimMaterial> key, String name) {
        add("trim_material." + MoreMetalsMod.MOD_ID + "." + key.location().getPath(), name);
    }
}
