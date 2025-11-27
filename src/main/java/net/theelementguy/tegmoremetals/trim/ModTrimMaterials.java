package net.theelementguy.tegmoremetals.trim;

import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.item.ModItems;

import java.util.Map;

public class ModTrimMaterials {

    public static final ResourceKey<TrimMaterial> CUBIC_ZIRCONIA = ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia"));

    public static final ResourceKey<TrimMaterial> TIN = registerKey("tin");

    public static final ResourceKey<TrimMaterial> STARSHARD = registerKey("starshard");

    public static final ResourceKey<TrimMaterial> RUBIDIUM = registerKey("rubidium");

    public static final ResourceKey<TrimMaterial> BRONZE = registerKey("bronze");

    public static final ResourceKey<TrimMaterial> BLOODSTONE = registerKey("bloodstone");

	public static final ResourceKey<TrimMaterial> TENUMBRUM = registerKey("tenumbrum");

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, CUBIC_ZIRCONIA, Style.EMPTY.withColor(TextColor.parseColor("#ebcacb").getOrThrow()), ModItems.CUBIC_ZIRCONIA.get());

        register(context, TIN, Style.EMPTY.withColor(TextColor.parseColor("#e6e6ca").getOrThrow()), ModItems.TIN_SCRAPS.get());

        register(context, STARSHARD, Style.EMPTY.withColor(TextColor.parseColor("#7fe9f5").getOrThrow()), ModItems.STARSHARD.get());

        register(context, BRONZE, Style.EMPTY.withColor(TextColor.parseColor("#ffa896").getOrThrow()), ModItems.BRONZE_INGOT.get());

        register(context, RUBIDIUM, Style.EMPTY.withColor(TextColor.parseColor("#fa89a2").getOrThrow()), ModItems.RUBIDIUM.get());

        register(context, BLOODSTONE, Style.EMPTY.withColor(TextColor.parseColor("#590a0a").getOrThrow()), ModItems.BLOODSTONE.get());

		register(context, TENUMBRUM, Style.EMPTY.withColor(TextColor.parseColor("#1f1029").getOrThrow()), ModItems.TENUMBRUM_INGOT.get());
    }

    public static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> key, Style style, Item iem) {
        register(context, key, iem, key.location().getPath(), style);
    }

    public static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> resourceKey, Item item, String name, Style style) {

        TrimMaterial trimMaterial = TrimMaterial.create(resourceKey.location().getPath(), item, Component.translatable(Util.makeDescriptionId("trim_material", resourceKey.location())).withStyle(style), Map.of());

        System.out.println(resourceKey.location().getPath());

        context.register(resourceKey, trimMaterial);

    }

    public static ResourceKey<TrimMaterial> registerKey(String name) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

}