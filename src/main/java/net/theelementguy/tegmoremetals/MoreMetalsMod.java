package net.theelementguy.tegmoremetals;

import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.theelementguy.tegmoremetals.block.ModBlocks;
import net.theelementguy.tegmoremetals.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
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
import net.theelementguy.tegmoremetals.util.ModUtil;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(MoreMetalsMod.MOD_ID)
public class MoreMetalsMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "tegmoremetals";
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

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA.get(), Items.GOLD_NUGGET, event);
            ModUtil.inventoryAddAfter(ModItems.RAW_CUBIC_ZIRCONIA.get(), Items.LAPIS_LAZULI, event);
			ModUtil.inventoryAddAfter(ModItems.TENUMBRUM_INGOT.get(), Items.GOLD_INGOT, event);
            ModUtil.inventoryAddAfter(ModItems.RUBIDIUM.get(), ModItems.TENUMBRUM_INGOT.get(), event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD.get(), ModItems.RUBIDIUM.get(), event);
            ModUtil.inventoryAddAfter(ModItems.BLOODSTONE.get(), ModItems.RAW_CUBIC_ZIRCONIA.get(), event);
        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            ModUtil.inventoryAddAfter(ModBlocks.CUBIC_ZIRCONIA_BLOCK.get(), Blocks.LAPIS_BLOCK, event);
            ModUtil.inventoryAddAfter(ModBlocks.TENUMBRUM_BLOCK, Blocks.DIAMOND_BLOCK, event);
			ModUtil.inventoryAddAfter(ModBlocks.RUBIDIUM_BLOCK, ModBlocks.TENUMBRUM_BLOCK, event);
            ModUtil.inventoryAddAfter(ModBlocks.STARSHARD_BLOCK, Blocks.NETHERITE_BLOCK, event);
            ModUtil.inventoryAddAfter(ModBlocks.BLOODSTONE_BLOCK, ModBlocks.CUBIC_ZIRCONIA_BLOCK, event);
        }
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            ModUtil.inventoryAddAfter(ModBlocks.CUBIC_ZIRCONIA_ORE, Blocks.LAPIS_ORE, event);
            ModUtil.inventoryAddAfter(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE, ModBlocks.CUBIC_ZIRCONIA_ORE, event);
            ModUtil.inventoryAddAfter(ModBlocks.NETHER_RUBIDIUM_ORE, Blocks.NETHER_QUARTZ_ORE, event);
            ModUtil.inventoryAddAfter(ModBlocks.END_STARSHARD_ORE, Blocks.ANCIENT_DEBRIS, event);
            ModUtil.inventoryAddAfter(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK, Blocks.RAW_IRON_BLOCK, event);
            ModUtil.inventoryAddAfter(ModBlocks.BLOODSTONE_ORE, ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE, event);
            ModUtil.inventoryAddAfter(ModBlocks.DEEPSLATE_BLOODSTONE_ORE, ModBlocks.BLOODSTONE_ORE, event);
			ModUtil.inventoryAddAfter(ModBlocks.RAW_TENUMBRUM_BLOCK, Blocks.RAW_GOLD_BLOCK, event);
			ModUtil.inventoryAddAfter(ModBlocks.TENUMBRUM_ORE, Blocks.DEEPSLATE_DIAMOND_ORE, event);
			ModUtil.inventoryAddAfter(ModBlocks.DEEPSLATE_TENUMBRUM_ORE, ModBlocks.TENUMBRUM_ORE, event);
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            ModUtil.setAddAfter("cubic_zirconia", "iron", event);
			ModUtil.setAddAfter("tenumbrum", "diamond", event);
            ModUtil.setAddAfter("rubidium", "tenumbrum", event);
            ModUtil.setAddAfter("starshard", "netherite", event);
            ModUtil.setAddAfter("bloodstone", "cubic_zirconia", event);
        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA_AXE, Items.IRON_HOE, event);
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA_PICKAXE, ModItems.CUBIC_ZIRCONIA_AXE, event);
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA_SHOVEL, ModItems.CUBIC_ZIRCONIA_PICKAXE, event);
            ModUtil.inventoryAddAfter(ModItems.CUBIC_ZIRCONIA_HOE, ModItems.CUBIC_ZIRCONIA_SHOVEL, event);
            ModUtil.toolsAddAfter("tenumbrum", "diamond", event);
			ModUtil.toolsAddAfter("rubidium", "tenumbrum", event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD_AXE, Items.NETHERITE_HOE, event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD_PICKAXE, ModItems.STARSHARD_AXE, event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD_SHOVEL, ModItems.STARSHARD_PICKAXE, event);
            ModUtil.inventoryAddAfter(ModItems.STARSHARD_HOE, ModItems.STARSHARD_SHOVEL, event);
            ModUtil.inventoryAddAfter(ModItems.BLOODSTONE_AXE, ModItems.CUBIC_ZIRCONIA_HOE, event);
            ModUtil.inventoryAddAfter(ModItems.BLOODSTONE_PICKAXE, ModItems.BLOODSTONE_AXE, event);
            ModUtil.inventoryAddAfter(ModItems.BLOODSTONE_SHOVEL, ModItems.BLOODSTONE_PICKAXE, event);
            ModUtil.inventoryAddAfter(ModItems.BLOODSTONE_HOE, ModItems.BLOODSTONE_SHOVEL, event);
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
    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
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
