package net.theelementguy.tegmoremetals.item;

import net.minecraft.core.Holder;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theelementguy.tegmoremetals.MoreMetalsMod;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreMetalsMod.MOD_ID);

    public static final DeferredItem<Item> CUBIC_ZIRCONIA = ITEMS.register("cubic_zirconia", () -> new Item(new Item.Properties().fireResistant()));

    public static final DeferredItem<Item> RAW_CUBIC_ZIRCONIA = ITEMS.register("raw_cubic_zirconia", () -> new Item(new Item.Properties().fireResistant()));

    public static final DeferredItem<SwordItem> CUBIC_ZIRCONIA_SWORD = ITEMS.register("cubic_zirconia_sword", () -> new SwordItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, 3, -2.4f)).fireResistant()));

    public static final DeferredItem<AxeItem> CUBIC_ZIRCONIA_AXE = ITEMS.register("cubic_zirconia_axe", () -> new AxeItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, 6.0f, -3.1f)).fireResistant()));

    public static final DeferredItem<PickaxeItem> CUBIC_ZIRCONIA_PICKAXE = ITEMS.register("cubic_zirconia_pickaxe", () -> new PickaxeItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, 1.0f, -2.8f)).fireResistant()));

    public static final DeferredItem<ShovelItem> CUBIC_ZIRCONIA_SHOVEL = ITEMS.register("cubic_zirconia_shovel", () -> new ShovelItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, 1.5f, -3.0f)).fireResistant()));

    public static final DeferredItem<HoeItem> CUBIC_ZIRCONIA_HOE = ITEMS.register("cubic_zirconia_hoe", () -> new HoeItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, -2.0f, -1.0f)).fireResistant()));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_HELMET = ITEMS.register("cubic_zirconia_helmet", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(39)).fireResistant()));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_CHESTPLATE = ITEMS.register("cubic_zirconia_chestplate", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(39)).fireResistant()));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_LEGGINGS = ITEMS.register("cubic_zirconia_leggings", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(39)).fireResistant()));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_BOOTS = ITEMS.register("cubic_zirconia_boots", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(39)).fireResistant()));

    public static final DeferredItem<Item> TIN_SCRAPS = ITEMS.register("tin_scraps", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RUBIDIUM = ITEMS.register("rubidium", () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> RUBIDIUM_SWORD = ITEMS.register("rubidium_sword", () -> new SwordItem(ModToolTiers.RUBIDIUM, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.RUBIDIUM, 3, -2.4f))));

    public static final DeferredItem<AxeItem> RUBIDIUM_AXE = ITEMS.register("rubidium_axe", () -> new AxeItem(ModToolTiers.RUBIDIUM, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.RUBIDIUM, 6.0f, -3.1f))));

    public static final DeferredItem<PickaxeItem> RUBIDIUM_PICKAXE = ITEMS.register("rubidium_pickaxe", () -> new PickaxeItem(ModToolTiers.RUBIDIUM, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.RUBIDIUM, 1.0f, -2.8f))));

    public static final DeferredItem<ShovelItem> RUBIDIUM_SHOVEL = ITEMS.register("rubidium_shovel", () -> new ShovelItem(ModToolTiers.RUBIDIUM, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.RUBIDIUM, 1.5f, -3.0f))));

    public static final DeferredItem<HoeItem> RUBIDIUM_HOE = ITEMS.register("rubidium_hoe", () -> new HoeItem(ModToolTiers.RUBIDIUM, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.RUBIDIUM, -2.0f, -1.0f))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_HELMET = ITEMS.register("rubidium_helmet", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_CHESTPLATE = ITEMS.register("rubidium_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_LEGGINGS = ITEMS.register("rubidium_leggings", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_BOOTS = ITEMS.register("rubidium_boots", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35))));

    public static final DeferredItem<Item> STARSHARD = ITEMS.register("starshard", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final DeferredItem<SwordItem> STARSHARD_SWORD = ITEMS.register("starshard_sword", () -> new SwordItem(ModToolTiers.STARSHARD, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.STARSHARD, 3, -2.4f))));

    public static final DeferredItem<AxeItem> STARSHARD_AXE = ITEMS.register("starshard_axe", () -> new AxeItem(ModToolTiers.STARSHARD, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.STARSHARD, 6.0f, -3.1f))));

    public static final DeferredItem<PickaxeItem> STARSHARD_PICKAXE = ITEMS.register("starshard_pickaxe", () -> new PickaxeItem(ModToolTiers.STARSHARD, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.STARSHARD, 1.0f, -2.8f))));

    public static final DeferredItem<ShovelItem> STARSHARD_SHOVEL = ITEMS.register("starshard_shovel", () -> new ShovelItem(ModToolTiers.STARSHARD, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.STARSHARD, 1.5f, -3.0f))));

    public static final DeferredItem<HoeItem> STARSHARD_HOE = ITEMS.register("starshard_hoe", () -> new HoeItem(ModToolTiers.STARSHARD, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.STARSHARD, -2.0f, -1.0f))));

    public static final DeferredItem<ArmorItem> STARSHARD_HELMET = ITEMS.register("starshard_helmet", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(41))));

    public static final DeferredItem<ArmorItem> STARSHARD_CHESTPLATE = ITEMS.register("starshard_chestplate", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(41))));

    public static final DeferredItem<ArmorItem> STARSHARD_LEGGINGS = ITEMS.register("starshard_leggings", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(41))));

    public static final DeferredItem<ArmorItem> STARSHARD_BOOTS = ITEMS.register("starshard_boots", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(41))));

    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ModToolTiers.BRONZE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BRONZE, 3.0F, -2.4F))));

    public static final DeferredItem<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ModToolTiers.BRONZE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BRONZE, 6.0F, -3.1F))));

    public static final DeferredItem<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ModToolTiers.BRONZE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BRONZE, 1.0F, -2.8F))));

    public static final DeferredItem<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ModToolTiers.BRONZE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BRONZE, 1.5F, -3.0F))));

    public static final DeferredItem<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ModToolTiers.BRONZE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BRONZE, -2.0F, -1.0F))));

    public static final DeferredItem<ArmorItem> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.HELMET, (new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(7)))));

    public static final DeferredItem<ArmorItem> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, (new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(7)))));

    public static final DeferredItem<ArmorItem> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, (new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(7)))));

    public static final DeferredItem<ArmorItem> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, (new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(7)))));

    public static final DeferredItem<Item> BLOODSTONE = ITEMS.register("bloodstone", () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> BLOODSTONE_SWORD = registerSword("bloodstone_sword", ModToolTiers.BLOODSTONE);

    public static final DeferredItem<AxeItem> BLOODSTONE_AXE = registerAxe("bloodstone_axe", ModToolTiers.BLOODSTONE);

    public static final DeferredItem<PickaxeItem> BLOODSTONE_PICKAXE = registerPickaxe("bloodstone_pickaxe", ModToolTiers.BLOODSTONE);

    public static final DeferredItem<ShovelItem> BLOODSTONE_SHOVEL = registerShovel("bloodstone_shovel", ModToolTiers.BLOODSTONE);

    public static final DeferredItem<HoeItem> BLOODSTONE_HOE = registerHoe("bloodstone_hoe", ModToolTiers.BLOODSTONE);

    public static final DeferredItem<ArmorItem> BLOODSTONE_HELMET = registerHelmet("bloodstone_helmet", ModArmorMaterials.BLOODSTONE, 18);

    public static final DeferredItem<ArmorItem> BLOODSTONE_CHESTPLATE = registerChestplate("bloodstone_chestplate", ModArmorMaterials.BLOODSTONE, 18);

    public static final DeferredItem<ArmorItem> BLOODSTONE_LEGGINGS = registerLeggings("bloodstone_leggings", ModArmorMaterials.BLOODSTONE, 18);

    public static final DeferredItem<ArmorItem> BLOODSTONE_BOOTS = registerBoots("bloodstone_boots", ModArmorMaterials.BLOODSTONE, 18);

	public static final DeferredItem<Item> TENUMBRUM_INGOT = ITEMS.register("tenumbrum_ingot", () -> new Item(new Item.Properties()));

	public static final DeferredItem<Item> RAW_TENUMBRUM = ITEMS.registerSimpleItem("raw_tenumbrum");

	public static final DeferredItem<SwordItem> TENUMBRUM_SWORD = registerSword("tenumbrum_sword", ModToolTiers.TENUMBRUM);

	public static final DeferredItem<AxeItem> TENUMBRUM_AXE = registerAxe("tenumbrum_axe", ModToolTiers.TENUMBRUM);

	public static final DeferredItem<PickaxeItem> TENUMBRUM_PICKAXE = registerPickaxe("tenumbrum_pickaxe", ModToolTiers.TENUMBRUM);

	public static final DeferredItem<ShovelItem> TENUMBRUM_SHOVEL = registerShovel("tenumbrum_shovel", ModToolTiers.TENUMBRUM);

	public static final DeferredItem<HoeItem> TENUMBRUM_HOE = registerHoe("tenumbrum_hoe", ModToolTiers.TENUMBRUM);

	public static final DeferredItem<ArmorItem> TENUMBRUM_HELMET = registerHelmet("tenumbrum_helmet", ModArmorMaterials.TENUMBRUM, 34);

	public static final DeferredItem<ArmorItem> TENUMBRUM_CHESTPLATE = registerChestplate("tenumbrum_chestplate", ModArmorMaterials.TENUMBRUM, 34);

	public static final DeferredItem<ArmorItem> TENUMBRUM_LEGGINGS = registerLeggings("tenumbrum_leggings", ModArmorMaterials.TENUMBRUM, 34);

	public static final DeferredItem<ArmorItem> TENUMBRUM_BOOTS = registerBoots("tenumbrum_boots", ModArmorMaterials.TENUMBRUM, 34);

    public static DeferredItem<SwordItem> registerSword(String name, Tier material) {
        return ITEMS.register(name, () -> new SwordItem(material, new Item.Properties().attributes(SwordItem.createAttributes(material, 3.0f, -2.4f))));
    }

    public static DeferredItem<AxeItem> registerAxe(String name, Tier material) {
        return ITEMS.register(name, () -> new AxeItem(material, new Item.Properties().attributes(AxeItem.createAttributes(material, 6f, -3.1f))));
    }

    public static DeferredItem<PickaxeItem> registerPickaxe(String name, Tier material) {
        return ITEMS.register(name, () -> new PickaxeItem(material, new Item.Properties().attributes(PickaxeItem.createAttributes(material, 1.0f, -2.0f))));
    }

    public static DeferredItem<ShovelItem> registerShovel(String name, Tier material) {
        return ITEMS.register(name, () -> new ShovelItem(material, new Item.Properties().attributes(ShovelItem.createAttributes(material, 1.5f, -3f))));
    }

    public static DeferredItem<HoeItem> registerHoe(String name, Tier material) {
        return ITEMS.register(name, () -> new HoeItem(material, new Item.Properties().attributes(HoeItem.createAttributes(material, -2.0f, -1.0f))));
    }

    public static DeferredItem<ArmorItem> registerHelmet(String name, Holder<ArmorMaterial> material, int durability) {
        return ITEMS.register(name, () -> new ArmorItem(material, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(durability))));
    }

    public static DeferredItem<ArmorItem> registerChestplate(String name, Holder<ArmorMaterial> material, int durability) {
        return ITEMS.register(name, () -> new ArmorItem(material, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(durability))));
    }

    public static DeferredItem<ArmorItem> registerLeggings(String name, Holder<ArmorMaterial> material, int durability) {
        return ITEMS.register(name, () -> new ArmorItem(material, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(durability))));
    }

    public static DeferredItem<ArmorItem> registerBoots(String name, Holder<ArmorMaterial> material, int durability) {
        return ITEMS.register(name, () -> new ArmorItem(material, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(durability))));
    }

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
