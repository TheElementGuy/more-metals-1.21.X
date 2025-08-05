package net.theelementguy.tegmoremetals.util;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.theelementguy.tegmoremetals.MoreMetalsMod;

import java.util.*;

public class ModUtil {

    private static HashMap<Character, Character> upsideDown = new HashMap<>(mapOf('a', 'ɐ', 'b', 'q', 'c', 'ɔ', 'd', 'p', 'e', 'ǝ', 'f', 'ɟ', 'g', 'ᵷ', 'h', 'ɥ', 'i', 'ᴉ', 'k', 'ʞ', 'C', 'Ɔ', 'u', 'n', 'n', 'u', ' ', ' ', 'z', 'z', 'Z', 'Z', 'q', 'b', 'p', 'd', 'r', 'ɹ', 'o', 'o', 'l', 'l', 's', 's', 'R', 'ᴚ', 'S', 'S', 'B', 'ᗺ', 'A', 'Ɐ', 'w', 'ʍ', 'W', 'M', 'x', 'x', 'P', 'Ԁ', 'T', '⟘', 'H', 'H', 'v', 'ʌ', 'D', 'ᗡ', 'N', 'N', 'E', 'Ǝ', 'O', 'O', 'm', 'ɯ', 't', 'ʇ', 'L', 'Ꞁ', 'I', 'I'));

    public static ResourceKey<Item> createItemResourceKey(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

    public static ResourceKey<Block> createBlockResourceKey(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

    public static ResourceKey<Recipe<?>> createRecipeResourceKey(String name) {
        return ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

    public static void inventoryAddAfter(Item item, Item referenceItem, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(new ItemStack(referenceItem, 1), new ItemStack(item, 1), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    public static void inventoryAddAfter(DeferredItem<? extends Item> item, Item referenceItem, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(new ItemStack(referenceItem, 1), new ItemStack(item.get(), 1), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    public static void inventoryAddAfter(DeferredItem<? extends Item> item, DeferredItem<? extends Item> referenceItem, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(new ItemStack(referenceItem.get(), 1), new ItemStack(item.get(), 1), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    public static void inventoryAddAfter(Block item, Block referenceItem, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(new ItemStack(referenceItem, 1), new ItemStack(item, 1), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    public static void inventoryAddAfter(DeferredBlock<? extends Block> item, Block referenceItem, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(new ItemStack(referenceItem, 1), new ItemStack(item, 1), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    public static void inventoryAddAfter(DeferredBlock<? extends Block> item, DeferredBlock<? extends Block> referenceItem, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(new ItemStack(referenceItem, 1), new ItemStack(item, 1), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    public static Item getItemFromKey(String key) {
        return BuiltInRegistries.ITEM.get(ModUtil.createItemResourceKey(key));
    }

    public static Block getBlockFromKey(String key) {
        return BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey(key));
    }

    public static String toUpsideDown(String given) {

        ArrayList<Character> charList = new ArrayList<>(given.length());

        for (char c : given.toCharArray()) {
            charList.add(c);
        }

        int i = 0;

        for (Character c : charList) {
            if (upsideDown.containsKey(c)) {
                charList.set(i, upsideDown.get(c));
            } else {
                System.out.println(upsideDown);
                throw new NoSuchElementException("No upside down equivalent for: " + c);
            }
            i++;
        }

        StringBuilder b = new StringBuilder();

        Collections.reverse(charList);

        charList.forEach(b::append);

        return b.toString();
    }

    public static <K, V> Map<K, V> mapOf(Object... things) {

        ArrayList<Object> temp = new ArrayList<>(2);
        HashMap<K, V> toReturn = new HashMap<>(things.length / 2);

        for (int i = 0; i < things.length; i++) {
            System.out.println(i);
            if (((i % 2) == 1)) {
                temp.add(things[i]);
                System.out.println(temp);
                toReturn.put((K) temp.get(0), (V) temp.get(1));
                temp.clear();
            } else {
                temp.add(things[i]);
            }
            System.out.println(temp);
        }

        return toReturn;

    }

}
