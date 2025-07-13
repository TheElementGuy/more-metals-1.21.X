package net.theelementguy.moremetals;

import net.minecraft.world.item.Items;
import net.theelementguy.moremetals.block.ModBlocks;
import net.theelementguy.moremetals.item.ModItems;
import net.theelementguy.moremetals.util.ModUtil;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(MoreMetalsMod.MOD_ID)
public class MoreMetalsMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "moremetals";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    //public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.examplemod")) //The language key for the title of your CreativeModeTab.withTabsBefore(CreativeModeTabs.COMBAT).icon(() -> EXAMPLE_ITEM.get().getDefaultInstance()).displayItems((parameters, output) -> {output.accept(EXAMPLE_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event}).build());

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public MoreMetalsMod(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.

        ModItems.register(modEventBus);

        ModBlocks.register(modEventBus);

        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA.get(), Items.GOLD_INGOT, event);
            ModUtil.inventoryAddAfter(ModItems.RAW_CUBIC_ZIRCONIA.get(), Items.LAPIS_LAZULI, event);
            ModUtil.inventoryAddAfter(ModItems.TIN_SCRAPS.get(), Items.RAW_COPPER, event);
            ModUtil.inventoryAddAfter(ModItems.RUBIDIUM.get(), Items.DIAMOND, event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD.get(), ModItems.RUBIDIUM.get(), event);
            ModUtil.inventoryAddAfter(ModItems.BRONZE_INGOT.get(), Items.COPPER_INGOT, event);
        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            ModUtil.inventoryAddAfter(ModBlocks.CUBIC_ZIRCONIA_BLOCK.get(), Blocks.LAPIS_BLOCK, event);
            ModUtil.inventoryAddAfter(ModBlocks.RUBIDIUM_BLOCK, Blocks.DIAMOND_BLOCK, event);
            ModUtil.inventoryAddAfter(ModBlocks.STARSHARD_BLOCK, Blocks.NETHERITE_BLOCK, event);
            ModUtil.inventoryAddAfter(ModBlocks.BRONZE_BLOCK, Blocks.WAXED_OXIDIZED_COPPER_BULB, event);
        }
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            ModUtil.inventoryAddAfter(ModBlocks.CUBIC_ZIRCONIA_ORE, Blocks.LAPIS_ORE, event);
            ModUtil.inventoryAddAfter(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE, ModBlocks.CUBIC_ZIRCONIA_ORE, event);
            ModUtil.inventoryAddAfter(ModBlocks.TIN_ORE, Blocks.COPPER_ORE, event);
            ModUtil.inventoryAddAfter(ModBlocks.DEEPSLATE_TIN_ORE, ModBlocks.TIN_ORE, event);
            ModUtil.inventoryAddAfter(ModBlocks.NETHER_RUBIDIUM_ORE, Blocks.NETHER_QUARTZ_ORE, event);
            ModUtil.inventoryAddAfter(ModBlocks.END_STARSHARD_ORE, Blocks.ANCIENT_DEBRIS, event);
            ModUtil.inventoryAddAfter(ModBlocks.TIN_BLOCK, Blocks.RAW_COPPER_BLOCK, event);
            ModUtil.inventoryAddAfter(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK, Blocks.RAW_IRON_BLOCK, event);
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA_SWORD, Items.IRON_SWORD, event);
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA_AXE, Items.IRON_AXE, event);
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA_HELMET, Items.IRON_BOOTS, event);
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA_CHESTPLATE, ModItems.CUBIC_ZIRCONIA_HELMET, event);
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA_LEGGINGS, ModItems.CUBIC_ZIRCONIA_CHESTPLATE, event);
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA_BOOTS, ModItems.CUBIC_ZIRCONIA_LEGGINGS, event);
            ModUtil.inventoryAddAfter(ModItems.RUBIDIUM_SWORD, Items.DIAMOND_SWORD, event);
            ModUtil.inventoryAddAfter(ModItems.RUBIDIUM_AXE, Items.DIAMOND_AXE, event);
            ModUtil.inventoryAddAfter(ModItems.RUBIDIUM_HELMET, Items.DIAMOND_BOOTS, event);
            ModUtil.inventoryAddAfter(ModItems.RUBIDIUM_CHESTPLATE, ModItems.RUBIDIUM_HELMET, event);
            ModUtil.inventoryAddAfter(ModItems.RUBIDIUM_LEGGINGS, ModItems.RUBIDIUM_CHESTPLATE, event);
            ModUtil.inventoryAddAfter(ModItems.RUBIDIUM_BOOTS, ModItems.RUBIDIUM_LEGGINGS, event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD_SWORD, Items.NETHERITE_SWORD, event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD_AXE, Items.NETHERITE_AXE, event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD_HELMET, Items.NETHERITE_BOOTS, event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD_CHESTPLATE, ModItems.STARSHARD_HELMET, event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD_LEGGINGS, ModItems.STARSHARD_CHESTPLATE, event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD_BOOTS, ModItems.STARSHARD_LEGGINGS, event);
            ModUtil.inventoryAddAfter(ModItems.BRONZE_SWORD, Items.STONE_SWORD, event);
            ModUtil.inventoryAddAfter(ModItems.BRONZE_AXE, Items.STONE_AXE, event);
            ModUtil.inventoryAddAfter(ModItems.BRONZE_HELMET, Items.CHAINMAIL_BOOTS, event);
            ModUtil.inventoryAddAfter(ModItems.BRONZE_CHESTPLATE, ModItems.BRONZE_HELMET, event);
            ModUtil.inventoryAddAfter(ModItems.BRONZE_LEGGINGS, ModItems.BRONZE_CHESTPLATE, event);
            ModUtil.inventoryAddAfter(ModItems.BRONZE_BOOTS, ModItems.BRONZE_LEGGINGS, event);
        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA_AXE, Items.IRON_HOE, event);
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA_PICKAXE, ModItems.CUBIC_ZIRCONIA_AXE, event);
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA_SHOVEL, ModItems.CUBIC_ZIRCONIA_PICKAXE, event);
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA_HOE, ModItems.CUBIC_ZIRCONIA_SHOVEL, event);
            ModUtil.inventoryAddAfter(ModItems.RUBIDIUM_AXE, Items.DIAMOND_HOE, event);
            ModUtil.inventoryAddAfter(ModItems.RUBIDIUM_PICKAXE, ModItems.RUBIDIUM_AXE, event);
            ModUtil.inventoryAddAfter(ModItems.RUBIDIUM_SHOVEL, ModItems.RUBIDIUM_PICKAXE, event);
            ModUtil.inventoryAddAfter(ModItems.RUBIDIUM_HOE, ModItems.RUBIDIUM_SHOVEL, event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD_AXE, Items.NETHERITE_HOE, event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD_PICKAXE, ModItems.STARSHARD_AXE, event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD_SHOVEL, ModItems.STARSHARD_PICKAXE, event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD_HOE, ModItems.STARSHARD_SHOVEL, event);
            ModUtil.inventoryAddAfter(ModItems.BRONZE_AXE, Items.STONE_PICKAXE, event);
            ModUtil.inventoryAddAfter(ModItems.BRONZE_PICKAXE, ModItems.BRONZE_AXE, event);
            ModUtil.inventoryAddAfter(ModItems.BRONZE_SHOVEL, ModItems.BRONZE_PICKAXE, event);
            ModUtil.inventoryAddAfter(ModItems.BRONZE_HOE, ModItems.BRONZE_SHOVEL, event);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
