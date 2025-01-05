package net.theelementguy.moremetals.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.item.custom.CelestialBronzeSwordItem;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreMetalsMod.MOD_ID);

    public static final DeferredItem<Item> CUBIC_ZIRCONIA = ITEMS.registerSimpleItem("cubic_zirconia", new Item.Properties().fireResistant());

    public static final DeferredItem<Item> RAW_CUBIC_ZIRCONIA = ITEMS.registerSimpleItem("raw_cubic_zirconia", new Item.Properties());

    public static final DeferredItem<SwordItem> CUBIC_ZIRCONIA_SWORD = ITEMS.register("cubic_zirconia_sword", () -> new SwordItem(ModToolMaterials.CUBIC_ZIRCONIA, 3.0F, -2.4F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "cubic_zirconia_sword")))));

    public static final DeferredItem<AxeItem> CUBIC_ZIRCONIA_AXE = ITEMS.register("cubic_zirconia_axe", () -> new AxeItem(ModToolMaterials.CUBIC_ZIRCONIA, 6.0F, -3.1F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "cubic_zirconia_axe")))));

    public static final DeferredItem<PickaxeItem> CUBIC_ZIRCONIA_PICKAXE = ITEMS.register("cubic_zirconia_pickaxe", () -> new PickaxeItem(ModToolMaterials.CUBIC_ZIRCONIA, 1.0F, -2.8F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "cubic_zirconia_pickaxe")))));

    public static final DeferredItem<ShovelItem> CUBIC_ZIRCONIA_SHOVEL = ITEMS.register("cubic_zirconia_shovel", () -> new ShovelItem(ModToolMaterials.CUBIC_ZIRCONIA, 1.5F, -3.0F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "cubic_zirconia_shovel")))));

    public static final DeferredItem<HoeItem> CUBIC_ZIRCONIA_HOE = ITEMS.register("cubic_zirconia_hoe", () -> new HoeItem(ModToolMaterials.CUBIC_ZIRCONIA, -2.0F, -1.0F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "cubic_zirconia_hoe")))));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_HELMET = ITEMS.register("cubic_zirconia_helmet", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.HELMET, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "cubic_zirconia_helmet")))));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_CHESTPLATE = ITEMS.register("cubic_zirconia_chestplate", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.CHESTPLATE, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "cubic_zirconia_chestplate")))));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_LEGGINGS = ITEMS.register("cubic_zirconia_leggings", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.LEGGINGS, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "cubic_zirconia_leggings")))));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_BOOTS = ITEMS.register("cubic_zirconia_boots", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.BOOTS, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "cubic_zirconia_boots")))));

    public static final DeferredItem<Item> TIN_SCRAPS = ITEMS.register("tin_scraps", () -> new Item((new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "tin_scraps")))));

    public static final DeferredItem<Item> RAW_CELESTIAL_BRONZE = ITEMS.register("raw_celestial_bronze", () -> new Item((new Item.Properties()).rarity(Rarity.RARE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "raw_celestial_bronze")))));

    public static final DeferredItem<Item> CELESTIAL_BRONZE_INGOT = ITEMS.register("celestial_bronze_ingot", () -> new Item((new Item.Properties()).rarity(Rarity.RARE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "celestial_bronze_ingot")))));

    public static final DeferredItem<CelestialBronzeSwordItem> CELESTIAL_BRRONZE_SWORD = ITEMS.register("celestial_bronze_sword", () -> new CelestialBronzeSwordItem(ModToolMaterials.CELESTIAL_BRONZE, 3.0F, -2.4F, (new Item.Properties()).rarity(Rarity.RARE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "celestial_bronze_sword")))));

    public static final DeferredItem<Item> RUBIDIUM = ITEMS.register("rubidium", () -> new Item((new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "rubidium")))));

    public static final DeferredItem<SwordItem> RUBIDIUM_SWORD = ITEMS.register("rubidium_sword", () -> new SwordItem(ModToolMaterials.RUBIDIUM, 3.0F, -2.4F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "rubidium_sword")))));

    public static final DeferredItem<AxeItem> RUBIDIUM_AXE = ITEMS.register("rubidium_axe", () -> new AxeItem(ModToolMaterials.RUBIDIUM, 6.0F, -3.1F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "rubidium_axe")))));

    public static final DeferredItem<PickaxeItem> RUBIDIUM_PICKAXE = ITEMS.register("rubidium_pickaxe", () -> new PickaxeItem(ModToolMaterials.RUBIDIUM, 1.0F, -2.8F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "rubidium_pickaxe")))));

    public static final DeferredItem<ShovelItem> RUBIDIUM_SHOVEL = ITEMS.register("rubidium_shovel", () -> new ShovelItem(ModToolMaterials.RUBIDIUM, 1.5F, -3.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "rubidium_shovel")))));

    public static final DeferredItem<HoeItem> RUBIDIUM_HOE = ITEMS.register("rubidium_hoe", () -> new HoeItem(ModToolMaterials.RUBIDIUM, -2.0F, -1.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "rubidium_hoe")))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_HELMET = ITEMS.register("rubidium_helmet", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorType.HELMET, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "rubidium_helmet")))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_CHESTPLATE = ITEMS.register("rubidium_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorType.CHESTPLATE, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "rubidium_chestplate")))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_LEGGINGS = ITEMS.register("rubidium_leggings", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorType.LEGGINGS, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "rubidium_leggings")))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_BOOTS = ITEMS.register("rubidium_boots", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorType.BOOTS, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "rubidium_boots")))));

    public static final DeferredItem<Item> STARSHARD = ITEMS.register("starshard", () -> new Item((new Item.Properties()).rarity(Rarity.UNCOMMON).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "starshard")))));

    public static final DeferredItem<SwordItem> STARSHARD_SWORD = ITEMS.register("starshard_sword", () -> new SwordItem(ModToolMaterials.STARSHARD, 3.0F, -2.4F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "starshard_sword")))));

    public static final DeferredItem<AxeItem> STARSHARD_AXE = ITEMS.register("starshard_axe", () -> new AxeItem(ModToolMaterials.STARSHARD, 6.0F, -3.1F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "starshard_axe")))));

    public static final DeferredItem<PickaxeItem> STARSHARD_PICKAXE = ITEMS.register("starshard_pickaxe", () -> new PickaxeItem(ModToolMaterials.STARSHARD, 1.0F, -2.8F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "starshard_pickaxe")))));

    public static final DeferredItem<ShovelItem> STARSHARD_SHOVEL = ITEMS.register("starshard_shovel", () -> new ShovelItem(ModToolMaterials.STARSHARD, 1.5F, -3.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "starshard_shovel")))));

    public static final DeferredItem<HoeItem> STARSHARD_HOE = ITEMS.register("starshard_hoe", () -> new HoeItem(ModToolMaterials.STARSHARD, -2.0F, -1.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "starshard_hoe")))));

    public static final DeferredItem<ArmorItem> STARSHARD_HELMET = ITEMS.register("starshard_helmet", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorType.HELMET, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "starshard_helmet")))));

    public static final DeferredItem<ArmorItem> STARSHARD_CHESTPLATE = ITEMS.register("starshard_chestplate", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorType.CHESTPLATE, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "starshard_chestplate")))));

    public static final DeferredItem<ArmorItem> STARSHARD_LEGGINGS = ITEMS.register("starshard_leggings", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorType.LEGGINGS, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "starshard_leggings")))));

    public static final DeferredItem<ArmorItem> STARSHARD_BOOTS = ITEMS.register("starshard_boots", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorType.BOOTS, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("moremetals", "starshard_boots")))));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
