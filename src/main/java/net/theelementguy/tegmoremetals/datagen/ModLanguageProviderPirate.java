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

public class ModLanguageProviderPirate extends LanguageProvider {

    public ModLanguageProviderPirate(PackOutput output) {
        super(output, MoreMetalsMod.MOD_ID, "en_pt");
    }

    @Override
    protected void addTranslations() {

        add(ModItems.CUBIC_ZIRCONIA, "Fake booty");
        addMaterialSet("cubic_zirconia", "fake booty");

        add(ModItems.RAW_CUBIC_ZIRCONIA, "Rough fake booty");

        add(ModItems.RUBIDIUM, "Firestone");
        addMaterialSet("rubidium", "firestone");

        add(ModItems.STARSHARD, "Shard o' sun");
        addMaterialSet("starshard", "shard o' sun");

        add(ModItems.BLOODSTONE, "Gorestone");
        addMaterialSet("bloodstone", "gorestone");

        add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK, "Chunk o' rough fake booty");

        addTrimMaterial(ModTrimMaterials.CUBIC_ZIRCONIA, "fake booty");
        addTrimMaterial(ModTrimMaterials.RUBIDIUM, "firestone");
        addTrimMaterial(ModTrimMaterials.STARSHARD, "shard o' sun");
        addTrimMaterial(ModTrimMaterials.BLOODSTONE, "gorestone");
    }

    protected void add(DeferredItem<? extends Item> key, String name) {
        add(key.get(), name);
    }

    protected void add(DeferredBlock<? extends Block> key, String name) {
        add(key.get(), name);
    }

    protected void addTrimMaterial(ResourceKey<TrimMaterial> key, String name) {
        add("trim_material." + MoreMetalsMod.MOD_ID + "." + key.location().getPath(), "Material o' " + name);
    }

    protected void addToolSet(DeferredItem<? extends Item> sword, DeferredItem<? extends Item> axe, DeferredItem<? extends Item> pickaxe, DeferredItem<? extends Item> shovel, DeferredItem<? extends Item> hoe, DeferredItem<? extends Item> helmet, DeferredItem<? extends Item> chestplate, DeferredItem<? extends Item> leggings, DeferredItem<? extends Item> boots, String groupName) {
        addToolSet(sword.get(), axe.get(), pickaxe.get(), shovel.get(), hoe.get(), helmet.get(), chestplate.get(), leggings.get(), boots.get(), groupName);
    }

    protected void addToolSet(Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, Item helmet, Item chestplate, Item leggings, Item boots, String groupName) {
        System.out.println("Adding tool set");
        add(sword, "Cutlass o' " + groupName);
        add(axe, "Hatchet o' " + groupName);
        add(pickaxe, "Pickaxe o' " + groupName);
        add(shovel, "Spade o' " + groupName);
        add(hoe, "Farmin' stick o' " + groupName);
        add(helmet, "Helmet o' " + groupName);
        add(chestplate, "Chestplate o' " + groupName);
        add(leggings, "Greaves o' " + groupName);
        add(boots, "Peg-leg o' " + groupName);
    }

    protected void addToolSet(String group, String groupName) {
        System.out.println(ModUtil.getItemFromKey(group + "_boots") + " lol");
        addToolSet(ModUtil.getItemFromKey(group + "_sword"), ModUtil.getItemFromKey(group + "_axe"), ModUtil.getItemFromKey(group + "_pickaxe"), ModUtil.getItemFromKey(group + "_shovel"), ModUtil.getItemFromKey(group + "_hoe"), ModUtil.getItemFromKey(group + "_helmet"), ModUtil.getItemFromKey(group + "_chestplate"), ModUtil.getItemFromKey(group + "_leggings"), ModUtil.getItemFromKey(group + "_boots"), groupName);
    }

    protected void addMaterialSet(String group, String groupName) {
        addToolSet(group, groupName);
        add(BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey(group + "_block")).get().value(), "Chunk o' "+ groupName);
        addOptionalOre(group, groupName);
        addOptionalDeepslateOre(group, groupName);
        addOptionalNetherOre(group, groupName);
        addOptionalEndOre(group, groupName);
    }

    protected void addOptionalOre(String group, String groupName) {
        if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey(group + "_ore")).isPresent()) {
            add(ModUtil.getBlockFromKey(group + "_ore"), "Orrre o' " + groupName);
        }
    }

    protected void addOptionalDeepslateOre(String group, String groupName) {
        if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey("deepslate_" + group + "_ore")).isPresent()) {
            add(ModUtil.getBlockFromKey("deepslate_" + group + "_ore"), "Tough orrre o' " + groupName);
        }
    }

    protected void addOptionalNetherOre(String group, String groupName) {
        if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey("nether_" + group + "_ore")).isPresent()) {
            add(ModUtil.getBlockFromKey("nether_" + group + "_ore"), "Orrre o' " + groupName);
        }
    }

    protected void addOptionalEndOre(String group, String groupName) {
        if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey("end_" + group + "_ore")).isPresent()) {
            add(ModUtil.getBlockFromKey("end_" + group + "_ore"), "Orrre o' " + groupName);
        }
    }
}
