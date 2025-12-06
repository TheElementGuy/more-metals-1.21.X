package net.theelementguy.tegmoremetals;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.theelementguy.tegmatlib.block.TEGMatLibBlockProvider;
import net.theelementguy.tegmatlib.item.TEGMatLibItemProvider;
import net.theelementguy.tegmatlib.trim.TEGMatLibTrimMaterialProvider;
import net.theelementguy.tegmatlib.worldgen.TEGMatLibConfiguredFeatureProvider;
import net.theelementguy.tegmoremetals.matlib.MoreMetalsMaterials;
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
    public MoreMetalsMod(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.

		MoreMetalsMaterials provider = new MoreMetalsMaterials();

		TEGMatLibItemProvider itemProvider = new TEGMatLibItemProvider(MoreMetalsMod.MOD_ID, provider::getMaterials);
        itemProvider.registerItems(ModRegisters.ITEMS);

		TEGMatLibBlockProvider blockProvider = new TEGMatLibBlockProvider(MOD_ID, provider::getMaterials);
		blockProvider.registerBlocks(ModRegisters.BLOCKS, () -> ModRegisters.ITEMS);

        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

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
