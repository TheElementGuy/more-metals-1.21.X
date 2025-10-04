package net.theelementguy.tegmoremetals.trim;

import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.theelementguy.tegmoremetals.MoreMetalsMod;

public class ModTrimMaterials {

    public static final ResourceKey<TrimMaterial> CUBIC_ZIRCONIA = ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia"));

    public static final ResourceKey<TrimMaterial> STARSHARD = registerKey("starshard");

    public static final ResourceKey<TrimMaterial> RUBIDIUM = registerKey("rubidium");

    public static final ResourceKey<TrimMaterial> BLOODSTONE = registerKey("bloodstone");

    public static final MaterialAssetGroup CUBIC_ZIRCONIA_ASSET_GROUP = MaterialAssetGroup.create("cubic_zirconia");

    public static final MaterialAssetGroup STARSHARD_ASSET_GROUP = MaterialAssetGroup.create("starshard");

    public static final MaterialAssetGroup RUBIDIUM_ASSET_GROUP = MaterialAssetGroup.create("rubidium");

    public static final MaterialAssetGroup BRONZE_ASSET_GROUP = MaterialAssetGroup.create("bronze");

    public static final MaterialAssetGroup BLOODSTONE_ASSET_GROUP = MaterialAssetGroup.create("bloodstone");

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, CUBIC_ZIRCONIA, Style.EMPTY.withColor(TextColor.parseColor("#ebcacb").getOrThrow()));

        register(context, STARSHARD, Style.EMPTY.withColor(TextColor.parseColor("#7fe9f5").getOrThrow()));

        register(context, RUBIDIUM, Style.EMPTY.withColor(TextColor.parseColor("#fa89a2").getOrThrow()));

        register(context, BLOODSTONE, Style.EMPTY.withColor(TextColor.parseColor("#590a0a").getOrThrow()));
    }

    public static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> key, Style style) {
        register(context, key, key.location().getPath(), style);
    }

    public static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> resourceKey, String name, Style style) {

        TrimMaterial trimMaterial = new TrimMaterial(MaterialAssetGroup.create(name), Component.translatable(Util.makeDescriptionId("trim_material", resourceKey.location())).withStyle(style));

        System.out.println(resourceKey.location().getPath());

        context.register(resourceKey, trimMaterial);

    }

    public static ResourceKey<TrimMaterial> registerKey(String name) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

}
