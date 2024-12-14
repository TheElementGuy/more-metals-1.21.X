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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CUBIC_ZIRCONIUM_BLOCK).requires(ModItems.CUBIC_ZIRCONIA, 9).unlockedBy("has_cz", has(ModItems.CUBIC_ZIRCONIA)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RAW_CUBIC_ZIRCONIUM_BLOCK).requires(ModItems.RAW_CUBIC_ZIRCONIA, 9).unlockedBy("has_rcz", has(ModItems.RAW_CUBIC_ZIRCONIA)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CUBIC_ZIRCONIA, 9).requires(ModBlocks.CUBIC_ZIRCONIUM_BLOCK).unlockedBy("has_czb", has(ModBlocks.CUBIC_ZIRCONIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_CUBIC_ZIRCONIA, 9).requires(ModBlocks.RAW_CUBIC_ZIRCONIUM_BLOCK).unlockedBy("has_rczb", has(ModBlocks.RAW_CUBIC_ZIRCONIUM_BLOCK)).save(recipeOutput);

        swordRecipe(ModItems.CUBIC_ZIRCONIA_SWORD.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        axeRecipe(ModItems.CUBIC_ZIRCONIA_AXE.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        pickaxeRecipe(ModItems.CUBIC_ZIRCONIA_PICKAXE.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        shovelRecipe(ModItems.CUBIC_ZIRCONIA_SHOVEL.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        hoeRecipe(ModItems.CUBIC_ZIRCONIA_HOE.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        helmetRecipe(ModItems.CUBIC_ZIRCONIA_HELMET.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        chestplateRecipe(ModItems.CUBIC_ZIRCONIA_CHESTPLATE.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        leggingsRecipe(ModItems.CUBIC_ZIRCONIA_LEGGINGS.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        bootsRecipe(ModItems.CUBIC_ZIRCONIA_BOOTS.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", recipeOutput);

        oreSmelting(recipeOutput, CUBIC_ZIRCONIA_SMELTABLES, RecipeCategory.MISC, ModItems.CUBIC_ZIRCONIA.get(), 0.9f, 200, "cz");
        oreBlasting(recipeOutput, CUBIC_ZIRCONIA_SMELTABLES, RecipeCategory.MISC, ModItems.CUBIC_ZIRCONIA.get(), 0.9f, 100, "cz");
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
}