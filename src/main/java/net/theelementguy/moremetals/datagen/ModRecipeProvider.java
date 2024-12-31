package net.theelementguy.moremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.block.ModBlocks;
import net.theelementguy.moremetals.item.ModItems;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> CUBIC_ZIRCONIA_SMELTABLES = List.of(ModItems.RAW_CUBIC_ZIRCONIA, ModBlocks.CUBIC_ZIRCONIA_ORE, ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE);

        List<ItemLike> CELESTIAL_BRONZE_SMELTABLES = List.of(ModItems.RAW_CELESTIAL_BRONZE);

        List<ItemLike> TIN_SMELTABLES = List.of(ModBlocks.TIN_ORE, ModBlocks.DEEPSLATE_TIN_ORE);

        List<ItemLike> RUBIDIUM_SMELTABLES = List.of(ModBlocks.NETHER_RUBIDIUM_ORE);

        List<ItemLike> STARSHARD_SMELTABLES = List.of(ModBlocks.END_STARSHARD_ORE);

        blockRecipe(ModItems.CUBIC_ZIRCONIA.get(), ModBlocks.CUBIC_ZIRCONIUM_BLOCK.asItem(), "has_cz", recipeOutput);

        blockRecipe(ModItems.RAW_CUBIC_ZIRCONIA.get(), ModBlocks.RAW_CUBIC_ZIRCONIUM_BLOCK.asItem(), "has_rcz", recipeOutput);

        blockRecipe(ModItems.CELESTIAL_BRONZE_INGOT.get(), ModBlocks.CELESTIAL_BRONZE_BLOCK.asItem(), "has_cb", recipeOutput);

        blockRecipe(ModItems.RAW_CELESTIAL_BRONZE.get(), ModBlocks.RAW_CELESTIAL_BRONZE_BLOCK.asItem(), "has_rcb", recipeOutput);

        blockRecipe(ModItems.TIN_SCRAPS.get(), ModBlocks.TIN_BLOCK.asItem(), "has_t", recipeOutput);

        blockRecipe(ModItems.RUBIDIUM.get(), ModBlocks.RUBIDIUM_BLOCK.asItem(), "has_r", recipeOutput);

        blockRecipe(ModItems.STARSHARD.get(), ModBlocks.STARSHARD_BLOCK.asItem(), "has_s", recipeOutput);

        swordRecipe(ModItems.CUBIC_ZIRCONIA_SWORD.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        axeRecipe(ModItems.CUBIC_ZIRCONIA_AXE.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        pickaxeRecipe(ModItems.CUBIC_ZIRCONIA_PICKAXE.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        shovelRecipe(ModItems.CUBIC_ZIRCONIA_SHOVEL.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        hoeRecipe(ModItems.CUBIC_ZIRCONIA_HOE.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        helmetRecipe(ModItems.CUBIC_ZIRCONIA_HELMET.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        chestplateRecipe(ModItems.CUBIC_ZIRCONIA_CHESTPLATE.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        leggingsRecipe(ModItems.CUBIC_ZIRCONIA_LEGGINGS.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        bootsRecipe(ModItems.CUBIC_ZIRCONIA_BOOTS.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        swordRecipe(ModItems.CELESTIAL_BRRONZE_SWORD.get(), ModItems.CELESTIAL_BRONZE_INGOT.get(), "has_cb", recipeOutput);

        swordRecipe(ModItems.RUBIDIUM_SWORD.get(), ModItems.RUBIDIUM.get(), "has_r", recipeOutput);

        axeRecipe(ModItems.RUBIDIUM_AXE.get(), ModItems.RUBIDIUM.get(), "has_r", recipeOutput);

        pickaxeRecipe(ModItems.RUBIDIUM_PICKAXE.get(), ModItems.RUBIDIUM.get(), "has_r", recipeOutput);

        shovelRecipe(ModItems.RUBIDIUM_SHOVEL.get(), ModItems.RUBIDIUM.get(), "has_r", recipeOutput);

        hoeRecipe(ModItems.RUBIDIUM_HOE.get(), ModItems.RUBIDIUM.get(), "has_r", recipeOutput);

        helmetRecipe(ModItems.RUBIDIUM_HELMET.get(), ModItems.RUBIDIUM.get(), "has_r", recipeOutput);

        chestplateRecipe(ModItems.RUBIDIUM_CHESTPLATE.get(), ModItems.RUBIDIUM.get(), "has_r", recipeOutput);

        leggingsRecipe(ModItems.RUBIDIUM_LEGGINGS.get(), ModItems.RUBIDIUM.get(), "has_r", recipeOutput);

        bootsRecipe(ModItems.RUBIDIUM_BOOTS.get(), ModItems.RUBIDIUM.get(), "has_r", recipeOutput);

        swordRecipe(ModItems.STARSHARD_SWORD.get(), ModItems.STARSHARD.get(), "has_s", recipeOutput);

        axeRecipe(ModItems.STARSHARD_AXE.get(), ModItems.STARSHARD.get(), "has_s", recipeOutput);

        pickaxeRecipe(ModItems.STARSHARD_PICKAXE.get(), ModItems.STARSHARD.get(), "has_s", recipeOutput);

        shovelRecipe(ModItems.STARSHARD_SHOVEL.get(), ModItems.STARSHARD.get(), "has_s", recipeOutput);

        hoeRecipe(ModItems.STARSHARD_HOE.get(), ModItems.STARSHARD.get(), "has_s", recipeOutput);

        helmetRecipe(ModItems.STARSHARD_HELMET.get(), ModItems.STARSHARD.get(), "has_s", recipeOutput);

        chestplateRecipe(ModItems.STARSHARD_CHESTPLATE.get(), ModItems.STARSHARD.get(), "has_s", recipeOutput);

        leggingsRecipe(ModItems.STARSHARD_LEGGINGS.get(), ModItems.STARSHARD.get(), "has_s", recipeOutput);

        bootsRecipe(ModItems.STARSHARD_BOOTS.get(), ModItems.STARSHARD.get(), "has_s", recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CELESTIAL_BRONZE_INGOT).requires(Items.COPPER_INGOT, 4).requires(ModItems.TIN_SCRAPS).requires(Items.NETHER_STAR).unlockedBy("has_ns", has(Items.NETHER_STAR)).save(recipeOutput, "celestial_bronze_forging");

        allOreSmelting(ModItems.CUBIC_ZIRCONIA.get(), CUBIC_ZIRCONIA_SMELTABLES, 1.0f, "cz", recipeOutput);

        allOreSmelting(ModItems.CELESTIAL_BRONZE_INGOT.get(), CELESTIAL_BRONZE_SMELTABLES, 1.0f, "cb", recipeOutput);

        allOreSmelting(ModItems.TIN_SCRAPS.get(), TIN_SMELTABLES, 0.7f, "t", recipeOutput);

        allOreSmelting(ModItems.RUBIDIUM.get(), RUBIDIUM_SMELTABLES, 1.3f, "r", recipeOutput);

        allOreSmelting(ModItems.STARSHARD.get(), STARSHARD_SMELTABLES, 1.5f, "s", recipeOutput);
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, MoreMetalsMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void swordRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result).pattern(" I ").pattern(" I ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected static void axeRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result).pattern("II ").pattern("IS ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, has(ingredient)).save(output);


    }

    protected static void pickaxeRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result).pattern("III").pattern(" S ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected static void shovelRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result).pattern(" I ").pattern(" S ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected static void hoeRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result).pattern("II ").pattern(" S ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected static void helmetRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result).pattern("III").pattern("I I").pattern("   ").define('I', ingredient).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected static void chestplateRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result).pattern("I I").pattern("III").pattern("III").define('I', ingredient).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected static void leggingsRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result).pattern("III").pattern("I I").pattern("I I").define('I', ingredient).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected static void bootsRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result).pattern("   ").pattern("I I").pattern("I I").define('I', ingredient).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected static void blockRecipe(Item material, Item block, String advancementName, RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, material, 9).requires(block).unlockedBy(advancementName, has(block)).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, block).requires(material, 9).unlockedBy(advancementName + "b", has(block)).save(output);
    }

    protected static void allOreSmelting(Item material, List<ItemLike> smeltables, float experience, String group, RecipeOutput output) {
        oreSmelting(output, smeltables, RecipeCategory.MISC, material, experience, 200, group);
        oreBlasting(output, smeltables, RecipeCategory.MISC, material, experience, 100, group);
    }
}