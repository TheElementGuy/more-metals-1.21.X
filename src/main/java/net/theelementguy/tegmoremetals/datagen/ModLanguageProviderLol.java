package net.theelementguy.tegmoremetals.datagen;

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

public class ModLanguageProviderLol extends LanguageProvider {

    public ModLanguageProviderLol(PackOutput output, String locale) {
        super(output, MoreMetalsMod.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {

        add(ModItems.CUBIC_ZIRCONIA, "tuff stuff");
        add(ModItems.RAW_CUBIC_ZIRCONIA, "RAWWWW tuff stuff");
        add(ModItems.CUBIC_ZIRCONIA_SWORD, "Tuff stuff sord");
        add(ModItems.CUBIC_ZIRCONIA_AXE, "tuff stuff Aks");
        add(ModItems.CUBIC_ZIRCONIA_PICKAXE, "tuff stuff pikakse");
        add(ModItems.CUBIC_ZIRCONIA_SHOVEL, "tuff stuff shaval");
        add(ModItems.CUBIC_ZIRCONIA_HOE, "tuff stuff Hoe");
        add(ModItems.CUBIC_ZIRCONIA_HELMET, "SO TUFF SAFTY HAT");
        add(ModItems.CUBIC_ZIRCONIA_CHESTPLATE, "tuff shirt");
        add(ModItems.CUBIC_ZIRCONIA_LEGGINGS, "tuff stuff PATNZ");
        add(ModItems.CUBIC_ZIRCONIA_BOOTS, "SUPA TUFF SAFTY BOOTZ");

        add(ModItems.TIN_SCRAPS, "tin canz");

        add(ModItems.BRONZE_INGOT, "Brozne bricky");
        add(ModItems.BRONZE_SWORD, "Brozne surd");
        add(ModItems.BRONZE_AXE, "Brozne aks");
        add(ModItems.BRONZE_PICKAXE, "Broznzez pikkaxee");
        add(ModItems.BRONZE_SHOVEL, "Brozzne shuvul");
        add(ModItems.BRONZE_HOE, "Bronz hoe");
        add(ModItems.BRONZE_HELMET, "Brozne hullmet");
        add(ModItems.BRONZE_CHESTPLATE, "Brozne chessplate");
        add(ModItems.BRONZE_LEGGINGS, "brozne Leggginggs");
        add(ModItems.BRONZE_BOOTS, "Brozne buuts");

        add(ModItems.RUBIDIUM, "OUCHIE SO HOT");
        add(ModItems.RUBIDIUM_SWORD, "rudibidium surd");
        add(ModItems.RUBIDIUM_AXE, "rudibidium aks");
        add(ModItems.RUBIDIUM_PICKAXE, "rudibidium pikaksee");
        add(ModItems.RUBIDIUM_SHOVEL, "rudibidium shuvl");
        add(ModItems.RUBIDIUM_HOE, "BROZ Befor RDBDM HOEZ");
        add(ModItems.RUBIDIUM_HELMET, "supa hot bike helmet");
        add(ModItems.RUBIDIUM_CHESTPLATE, "hot SHIRTZ");
        add(ModItems.RUBIDIUM_LEGGINGS, "hot pantz");
        add(ModItems.RUBIDIUM_BOOTS, "hot sohez");

        add(ModItems.STARSHARD, "oooh shiny");
        add(ModItems.STARSHARD_SWORD, "oooh shiny sowrd");
        add(ModItems.STARSHARD_AXE, "oooh shiny aks");
        add(ModItems.STARSHARD_PICKAXE, "oooh shiny pikakse");
        add(ModItems.STARSHARD_SHOVEL, "oooh shiny shovl");
        add(ModItems.STARSHARD_HOE, "oooh bent shiny on a stik");
        add(ModItems.STARSHARD_HELMET, "ooooh SHINNY HAT");
        add(ModItems.STARSHARD_CHESTPLATE, "oooh shiyn shurt");
        add(ModItems.STARSHARD_LEGGINGS, "oooh shiny pants");
        add(ModItems.STARSHARD_BOOTS, "ooooh shiny shooz (sparkel sparkel)");

        add(ModItems.BLOODSTONE, "gory stony");
        add(ModItems.BLOODSTONE_SWORD, "used(?) surd");
        add(ModItems.BLOODSTONE_AXE, "HORRRORRR MUVY pRop");
        add(ModItems.BLOODSTONE_PICKAXE, "wut dis pikakse uzed 4...");
        add(ModItems.BLOODSTONE_SHOVEL, "y iz it red olredy");
        add(ModItems.BLOODSTONE_HOE, "(c)reeeeper");
        add(ModItems.BLOODSTONE_HELMET, "red hulmit");
        add(ModItems.BLOODSTONE_CHESTPLATE, "read jursey");
        add(ModItems.BLOODSTONE_LEGGINGS, "gory panzzt");
        add(ModItems.BLOODSTONE_BOOTS, "bootz aund dey wer wallkinng thru teh pante but teh paaiint wuz red andn it got on teh boutz");

        add(ModBlocks.CUBIC_ZIRCONIA_BLOCK, "Blok of tuff stuff");
        add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK, "bLuk uv gross tuff stuff");
        add(ModBlocks.TIN_BLOCK, "blok of cans");
        add(ModBlocks.BRONZE_BLOCK, "Block of Brozne");
        add(ModBlocks.RUBIDIUM_BLOCK, "hot Blouk");
        add(ModBlocks.STARSHARD_BLOCK, "shiny shiny bluckc");
        add(ModBlocks.BLOODSTONE_BLOCK, "blok ov uh oh");

        add(ModBlocks.CUBIC_ZIRCONIA_ORE, "rokz wiht sum tuff stuff");
        add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE, "dark STONY roks withh sommmmmmmmmme tuf stuff");
        add(ModBlocks.TIN_ORE, "rokz with som cans");
        add(ModBlocks.DEEPSLATE_TIN_ORE, "dark stony roks with som cans");
        add(ModBlocks.BLOODSTONE_ORE, "stony stony wiht...is that wut i thinks it izz???");
        add(ModBlocks.DEEPSLATE_BLOODSTONE_ORE, "dark stony roks wihth gorre");
        add(ModBlocks.NETHER_RUBIDIUM_ORE, "HHHHOT Nether ORe");
        add(ModBlocks.END_STARSHARD_ORE, "shyni wite rockkz");

        addTrimMaterial(ModTrimMaterials.CUBIC_ZIRCONIA, "tuff stuff");
        addTrimMaterial(ModTrimMaterials.TIN, "cnaz on ur shirt");
        addTrimMaterial(ModTrimMaterials.BRONZE, "zrobne");
        addTrimMaterial(ModTrimMaterials.RUBIDIUM, "burny clohtez");
        addTrimMaterial(ModTrimMaterials.STARSHARD, "oooh shiny");

    }
    
    protected void add(DeferredItem<? extends Item> key, String name) {
        add(key.get(), name);
        System.out.println(name);
    }

    protected void add(DeferredBlock<? extends Block> key, String name) {
        add(key.get(), name);
        System.out.println(name);
    }

    protected void addTrimMaterial(ResourceKey<TrimMaterial> key, String name) {
        add("trim_material." + MoreMetalsMod.MOD_ID + "." + key.location().getPath(), name);
    }
}
