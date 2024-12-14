package net.theelementguy.moremetals.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theelementguy.moremetals.MoreMetalsMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreMetalsMod.MOD_ID);

    public static final DeferredItem<Item> CUBIC_ZIRCONIA = ITEMS.register("cubic_zirconia", () -> new Item(new Item.Properties().fireResistant()));

    public static final DeferredItem<Item> RAW_CUBIC_ZIRCONIA = ITEMS.register("raw_cubic_zirconia", () -> new Item(new Item.Properties().fireResistant()));

    public static final DeferredItem<SwordItem> CUBIC_ZIRCONIA_SWORD = ITEMS.register("cubic_zirconia_sword", () -> new SwordItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, 3, -2.4f))));

    public static final DeferredItem<AxeItem> CUBIC_ZIRCONIA_AXE = ITEMS.register("cubic_zirconia_axe", () -> new AxeItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, 6.0f, -3.1f))));

    public static final DeferredItem<PickaxeItem> CUBIC_ZIRCONIA_PICKAXE = ITEMS.register("cubic_zirconia_pickaxe", () -> new PickaxeItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, 1.0f, -2.8f))));

    public static final DeferredItem<ShovelItem> CUBIC_ZIRCONIA_SHOVEL = ITEMS.register("cubic_zirconia_shovel", () -> new ShovelItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, 1.5f, -3.0f))));

    public static final DeferredItem<HoeItem> CUBIC_ZIRCONIA_HOE = ITEMS.register("cubic_zirconia_hoe", () -> new HoeItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, -2.0f, -1.0f))));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_HELMET = ITEMS.register("cubic_zirconia_helmet", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(39))));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_CHESTPLATE = ITEMS.register("cubic_zirconia_chestplate", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(39))));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_LEGGINGS = ITEMS.register("cubic_zirconia_leggings", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(39))));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_BOOTS = ITEMS.register("cubic_zirconia_boots", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(39))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
