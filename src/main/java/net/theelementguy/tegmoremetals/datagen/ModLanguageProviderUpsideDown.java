package net.theelementguy.tegmoremetals.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.block.ModBlocks;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.trim.ModTrimMaterials;
import net.theelementguy.tegmoremetals.util.ModUtil;

public class ModLanguageProviderUpsideDown extends LanguageProvider {

    public ModLanguageProviderUpsideDown(PackOutput output) {
        super(output, MoreMetalsMod.MOD_ID, "en_ud");
    }

    @Override
    protected void addTranslations() {

        add(ModItems.CUBIC_ZIRCONIA, ModUtil.toUpsideDown("Cubic Zirconia"));
        addMaterialSet("cubic_zirconia", ModUtil.toUpsideDown("Cubic Zirconia"));

        add(ModItems.RAW_CUBIC_ZIRCONIA, ModUtil.toUpsideDown("Raw Cubic Zirconia"));

        add(ModItems.RUBIDIUM, ModUtil.toUpsideDown("Rubidium"));
        addMaterialSet("rubidium", ModUtil.toUpsideDown("Rubidium"));

        add(ModItems.STARSHARD, ModUtil.toUpsideDown("Starshard"));
        addMaterialSet("starshard", ModUtil.toUpsideDown("Starshard"));

        add(ModItems.BLOODSTONE, ModUtil.toUpsideDown("Bloodstone"));
        addMaterialSet("bloodstone", ModUtil.toUpsideDown("Bloodstone"));

        add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK, ModUtil.toUpsideDown("Block of Raw Cubic Zirconia"));

        addTrimMaterial(ModTrimMaterials.CUBIC_ZIRCONIA, ModUtil.toUpsideDown("Cubic Zirconia"));
        addTrimMaterial(ModTrimMaterials.RUBIDIUM, ModUtil.toUpsideDown("Rubidium"));
        addTrimMaterial(ModTrimMaterials.STARSHARD, ModUtil.toUpsideDown("Starshard"));
        addTrimMaterial(ModTrimMaterials.BLOODSTONE, ModUtil.toUpsideDown("Bloodstone"));
    }

    protected void add(DeferredItem<? extends Item> key, String name) {
        add(key.get(), name);
    }

    protected void add(DeferredBlock<? extends Block> key, String name) {
        add(key.get(), name);
    }

    protected void addTrimMaterial(ResourceKey<TrimMaterial> key, String name) {
        add("trim_material." + MoreMetalsMod.MOD_ID + "." + key.location().getPath(), name);
    }

    protected void addToolSet(DeferredItem<? extends Item> sword, DeferredItem<? extends Item> axe, DeferredItem<? extends Item> pickaxe, DeferredItem<? extends Item> shovel, DeferredItem<? extends Item> hoe, DeferredItem<? extends Item> helmet, DeferredItem<? extends Item> chestplate, DeferredItem<? extends Item> leggings, DeferredItem<? extends Item> boots, String groupName) {
        addToolSet(sword.get(), axe.get(), pickaxe.get(), shovel.get(), hoe.get(), helmet.get(), chestplate.get(), leggings.get(), boots.get(), groupName);
    }

    protected void addToolSet(Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, Item helmet, Item chestplate, Item leggings, Item boots, String groupName) {
        System.out.println("Adding tool set");
        add(sword, ModUtil.toUpsideDown(" Sword") + groupName);
        add(axe, ModUtil.toUpsideDown(" Axe") + groupName);
        add(pickaxe, ModUtil.toUpsideDown(" Pickaxe") + groupName);
        add(shovel, ModUtil.toUpsideDown(" Shovel") + groupName);
        add(hoe, ModUtil.toUpsideDown(" Hoe") + groupName);
        add(helmet, ModUtil.toUpsideDown(" Helmet") + groupName);
        add(chestplate, ModUtil.toUpsideDown(" Chestplate") + groupName);
        add(leggings, ModUtil.toUpsideDown(" Leggings") + groupName);
        add(boots, ModUtil.toUpsideDown(" Boots") + groupName);
    }

    protected void addToolSet(String group, String groupName) {
        System.out.println(ModUtil.getItemFromKey(group + "_boots") + " lol");
        addToolSet(ModUtil.getItemFromKey(group + "_sword"), ModUtil.getItemFromKey(group + "_axe"), ModUtil.getItemFromKey(group + "_pickaxe"), ModUtil.getItemFromKey(group + "_shovel"), ModUtil.getItemFromKey(group + "_hoe"), ModUtil.getItemFromKey(group + "_helmet"), ModUtil.getItemFromKey(group + "_chestplate"), ModUtil.getItemFromKey(group + "_leggings"), ModUtil.getItemFromKey(group + "_boots"), groupName);
    }

    protected void addMaterialSet(String group, String groupName) {
        addToolSet(group, groupName);
        add(BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey(group + "_block")).get().value(), groupName + ModUtil.toUpsideDown("Block of "));
        addOptionalOre(group, groupName);
        addOptionalDeepslateOre(group, groupName);
        addOptionalNetherOre(group, groupName);
        addOptionalEndOre(group, groupName);
    }

    protected void addOptionalOre(String group, String groupName) {
        if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey(group + "_ore")).isPresent()) {
            add(ModUtil.getBlockFromKey(group + "_ore"), ModUtil.toUpsideDown(" Ore") + groupName);
        }
    }

    protected void addOptionalDeepslateOre(String group, String groupName) {
        if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey("deepslate_" + group + "_ore")).isPresent()) {
            add(ModUtil.getBlockFromKey("deepslate_" + group + "_ore"), ModUtil.toUpsideDown(" Ore") + groupName + ModUtil.toUpsideDown("Deepslate "));
        }
    }

    protected void addOptionalNetherOre(String group, String groupName) {
        if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey("nether_" + group + "_ore")).isPresent()) {
            add(ModUtil.getBlockFromKey("nether_" + group + "_ore"), ModUtil.toUpsideDown(" Ore") + groupName + ModUtil.toUpsideDown("Nether "));
        }
    }

    protected void addOptionalEndOre(String group, String groupName) {
        if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey("end_" + group + "_ore")).isPresent()) {
            add(ModUtil.getBlockFromKey("end_" + group + "_ore"), ModUtil.toUpsideDown(" Ore") + groupName + ModUtil.toUpsideDown("End "));
        }
    }
}
