package net.theelementguy.moremetals.item;

import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.util.ModUtil;

import java.util.function.BiConsumer;

import static net.theelementguy.moremetals.MoreMetalsMod.MOD_ID;

public class ModEquipmentAssets {

    public static final ResourceKey<EquipmentAsset> CUBIC_ZIRCONIA = ModUtil.createEquipmentAssetResourceKey("cubic_zirconia");
    public static final ResourceKey<EquipmentAsset> RUBIDIUM = ModUtil.createEquipmentAssetResourceKey("rubidium");
    public static final ResourceKey<EquipmentAsset> STARSHARD = ModUtil.createEquipmentAssetResourceKey("starshard");
    public static void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer) {
        consumer.accept(ModEquipmentAssets.CUBIC_ZIRCONIA, onlyHumanoidAssets("cubic_zirconia"));
        consumer.accept(ModEquipmentAssets.RUBIDIUM, onlyHumanoidAssets("rubidium"));
        consumer.accept(ModEquipmentAssets.STARSHARD, onlyHumanoidAssets("starshard"));
    }

    private static EquipmentClientInfo onlyHumanoidAssets(String name) {
        return EquipmentClientInfo.builder().addHumanoidLayers(ResourceLocation.fromNamespaceAndPath(MOD_ID, name)).build();
    }
}
