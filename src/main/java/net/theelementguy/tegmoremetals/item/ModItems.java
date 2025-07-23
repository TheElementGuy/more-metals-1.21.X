package net.theelementguy.tegmoremetals.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.util.ModUtil;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreMetalsMod.MOD_ID);

    public static final DeferredItem<Item> CUBIC_ZIRCONIA = ITEMS.registerSimpleItem("cubic_zirconia", new Item.Properties().fireResistant());

    public static final DeferredItem<Item> RAW_CUBIC_ZIRCONIA = ITEMS.registerSimpleItem("raw_cubic_zirconia", new Item.Properties());

    public static final DeferredItem<SwordItem> CUBIC_ZIRCONIA_SWORD = ITEMS.register("cubic_zirconia_sword", () -> new SwordItem(ModToolMaterials.CUBIC_ZIRCONIA, 3.0F, -2.4F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_sword")))));

    public static final DeferredItem<AxeItem> CUBIC_ZIRCONIA_AXE = ITEMS.register("cubic_zirconia_axe", () -> new AxeItem(ModToolMaterials.CUBIC_ZIRCONIA, 6.0F, -3.1F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_axe")))));

    public static final DeferredItem<PickaxeItem> CUBIC_ZIRCONIA_PICKAXE = ITEMS.register("cubic_zirconia_pickaxe", () -> new PickaxeItem(ModToolMaterials.CUBIC_ZIRCONIA, 1.0F, -2.8F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_pickaxe")))));

    public static final DeferredItem<ShovelItem> CUBIC_ZIRCONIA_SHOVEL = ITEMS.register("cubic_zirconia_shovel", () -> new ShovelItem(ModToolMaterials.CUBIC_ZIRCONIA, 1.5F, -3.0F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_shovel")))));

    public static final DeferredItem<HoeItem> CUBIC_ZIRCONIA_HOE = ITEMS.register("cubic_zirconia_hoe", () -> new HoeItem(ModToolMaterials.CUBIC_ZIRCONIA, -2.0F, -1.0F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_hoe")))));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_HELMET = ITEMS.register("cubic_zirconia_helmet", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.HELMET, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_helmet")))));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_CHESTPLATE = ITEMS.register("cubic_zirconia_chestplate", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.CHESTPLATE, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_chestplate")))));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_LEGGINGS = ITEMS.register("cubic_zirconia_leggings", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.LEGGINGS, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_leggings")))));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_BOOTS = ITEMS.register("cubic_zirconia_boots", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.BOOTS, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_boots")))));

    public static final DeferredItem<Item> TIN_SCRAPS = ITEMS.register("tin_scraps", () -> new Item((new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "tin_scraps")))));

    public static final DeferredItem<Item> RUBIDIUM = ITEMS.register("rubidium", () -> new Item((new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium")))));

    public static final DeferredItem<SwordItem> RUBIDIUM_SWORD = ITEMS.register("rubidium_sword", () -> new SwordItem(ModToolMaterials.RUBIDIUM, 3.0F, -2.4F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_sword")))));

    public static final DeferredItem<AxeItem> RUBIDIUM_AXE = ITEMS.register("rubidium_axe", () -> new AxeItem(ModToolMaterials.RUBIDIUM, 6.0F, -3.1F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_axe")))));

    public static final DeferredItem<PickaxeItem> RUBIDIUM_PICKAXE = ITEMS.register("rubidium_pickaxe", () -> new PickaxeItem(ModToolMaterials.RUBIDIUM, 1.0F, -2.8F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_pickaxe")))));

    public static final DeferredItem<ShovelItem> RUBIDIUM_SHOVEL = ITEMS.register("rubidium_shovel", () -> new ShovelItem(ModToolMaterials.RUBIDIUM, 1.5F, -3.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_shovel")))));

    public static final DeferredItem<HoeItem> RUBIDIUM_HOE = ITEMS.register("rubidium_hoe", () -> new HoeItem(ModToolMaterials.RUBIDIUM, -2.0F, -1.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_hoe")))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_HELMET = ITEMS.register("rubidium_helmet", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorType.HELMET, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_helmet")))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_CHESTPLATE = ITEMS.register("rubidium_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorType.CHESTPLATE, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_chestplate")))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_LEGGINGS = ITEMS.register("rubidium_leggings", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorType.LEGGINGS, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_leggings")))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_BOOTS = ITEMS.register("rubidium_boots", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorType.BOOTS, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_boots")))));

    public static final DeferredItem<Item> STARSHARD = ITEMS.register("starshard", () -> new Item((new Item.Properties()).rarity(Rarity.UNCOMMON).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard")))));

    public static final DeferredItem<SwordItem> STARSHARD_SWORD = ITEMS.register("starshard_sword", () -> new SwordItem(ModToolMaterials.STARSHARD, 3.0F, -2.4F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_sword")))));

    public static final DeferredItem<AxeItem> STARSHARD_AXE = ITEMS.register("starshard_axe", () -> new AxeItem(ModToolMaterials.STARSHARD, 6.0F, -3.1F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_axe")))));

    public static final DeferredItem<PickaxeItem> STARSHARD_PICKAXE = ITEMS.register("starshard_pickaxe", () -> new PickaxeItem(ModToolMaterials.STARSHARD, 1.0F, -2.8F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_pickaxe")))));

    public static final DeferredItem<ShovelItem> STARSHARD_SHOVEL = ITEMS.register("starshard_shovel", () -> new ShovelItem(ModToolMaterials.STARSHARD, 1.5F, -3.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_shovel")))));

    public static final DeferredItem<HoeItem> STARSHARD_HOE = ITEMS.register("starshard_hoe", () -> new HoeItem(ModToolMaterials.STARSHARD, -2.0F, -1.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_hoe")))));

    public static final DeferredItem<ArmorItem> STARSHARD_HELMET = ITEMS.register("starshard_helmet", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorType.HELMET, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_helmet")))));

    public static final DeferredItem<ArmorItem> STARSHARD_CHESTPLATE = ITEMS.register("starshard_chestplate", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorType.CHESTPLATE, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_chestplate")))));

    public static final DeferredItem<ArmorItem> STARSHARD_LEGGINGS = ITEMS.register("starshard_leggings", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorType.LEGGINGS, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_leggings")))));

    public static final DeferredItem<ArmorItem> STARSHARD_BOOTS = ITEMS.register("starshard_boots", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorType.BOOTS, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_boots")))));

    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().setId(ModUtil.createItemResourceKey("bronze_ingot"))));

    public static final DeferredItem<SwordItem> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ModToolMaterials.BRONZE, 3.0F, -2.4F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_sword")))));

    public static final DeferredItem<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ModToolMaterials.BRONZE, 6.0F, -3.1F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_axe")))));

    public static final DeferredItem<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ModToolMaterials.BRONZE, 1.0F, -2.8F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_pickaxe")))));

    public static final DeferredItem<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ModToolMaterials.BRONZE, 1.5F, -3.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_shovel")))));

    public static final DeferredItem<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ModToolMaterials.BRONZE, -2.0F, -1.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_hoe")))));

    public static final DeferredItem<ArmorItem> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorType.HELMET, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_helmet")))));

    public static final DeferredItem<ArmorItem> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorType.CHESTPLATE, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_chestplate")))));

    public static final DeferredItem<ArmorItem> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorType.LEGGINGS, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_leggings")))));

    public static final DeferredItem<ArmorItem> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorType.BOOTS, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_boots")))));

    public static final DeferredItem<Item> BLOODSTONE = ITEMS.register("bloodstone", () -> new Item(new Item.Properties().setId(ModUtil.createItemResourceKey("bloodstone"))));

    public static final DeferredItem<SwordItem> BLOODSTONE_SWORD = registerSword("bloodstone_sword", ModToolMaterials.BLOODSTONE);

    public static final DeferredItem<AxeItem> BLOODSTONE_AXE = registerAxe("bloodstone_axe", ModToolMaterials.BLOODSTONE);

    public static final DeferredItem<PickaxeItem> BLOODSTONE_PICKAXE = registerPickaxe("bloodstone_pickaxe", ModToolMaterials.BLOODSTONE);

    public static final DeferredItem<ShovelItem> BLOODSTONE_SHOVEL = registerShovel("bloodstone_shovel", ModToolMaterials.BLOODSTONE);

    public static final DeferredItem<HoeItem> BLOODSTONE_HOE = registerHoe("bloodstone_hoe", ModToolMaterials.BLOODSTONE);

    public static final DeferredItem<ArmorItem> BLOODSTONE_HELMET = registerHelmet("bloodstone_helmet", ModArmorMaterials.BLOODSTONE);

    public static final DeferredItem<ArmorItem> BLOODSTONE_CHESTPLATE = registerChestplate("bloodstone_chestplate", ModArmorMaterials.BLOODSTONE);

    public static final DeferredItem<ArmorItem> BLOODSTONE_LEGGINGS = registerLeggings("bloodstone_leggings", ModArmorMaterials.BLOODSTONE);

    public static final DeferredItem<ArmorItem> BLOODSTONE_BOOTS = registerBoots("bloodstone_boots", ModArmorMaterials.BLOODSTONE);

    public static DeferredItem<SwordItem> registerSword(String name, ToolMaterial material) {
        return ITEMS.register(name, () -> new SwordItem(material, 3.0f, -2.4f, new Item.Properties().setId(ModUtil.createItemResourceKey(name))));
    }

    public static DeferredItem<AxeItem> registerAxe(String name, ToolMaterial material) {
        return ITEMS.register(name, () -> new AxeItem(material, 6.0f, -3.1f, new Item.Properties().setId(ModUtil.createItemResourceKey(name))));
    }

    public static DeferredItem<PickaxeItem> registerPickaxe(String name, ToolMaterial material) {
        return ITEMS.register(name, () -> new PickaxeItem(material, 1.0f, -2.0f, new Item.Properties().setId(ModUtil.createItemResourceKey(name))));
    }

    public static DeferredItem<ShovelItem> registerShovel(String name, ToolMaterial material) {
        return ITEMS.register(name, () -> new ShovelItem(material, 1.5f, -3f, new Item.Properties().setId(ModUtil.createItemResourceKey(name))));
    }

    public static DeferredItem<HoeItem> registerHoe(String name, ToolMaterial material) {
        return ITEMS.register(name, () -> new HoeItem(material, -2.0f, -1.0f, new Item.Properties().setId(ModUtil.createItemResourceKey(name))));
    }

    public static DeferredItem<ArmorItem> registerHelmet(String name, ArmorMaterial material) {
        return ITEMS.register(name, () -> new ArmorItem(material, ArmorType.HELMET, new Item.Properties().setId(ModUtil.createItemResourceKey(name))));
    }

    public static DeferredItem<ArmorItem> registerChestplate(String name, ArmorMaterial material) {
        return ITEMS.register(name, () -> new ArmorItem(material, ArmorType.CHESTPLATE, new Item.Properties().setId(ModUtil.createItemResourceKey(name))));
    }

    public static DeferredItem<ArmorItem> registerLeggings(String name, ArmorMaterial material) {
        return ITEMS.register(name, () -> new ArmorItem(material, ArmorType.LEGGINGS, new Item.Properties().setId(ModUtil.createItemResourceKey(name))));
    }

    public static DeferredItem<ArmorItem> registerBoots(String name, ArmorMaterial material) {
        return ITEMS.register(name, () -> new ArmorItem(material, ArmorType.BOOTS, new Item.Properties().setId(ModUtil.createItemResourceKey(name))));
    }

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
