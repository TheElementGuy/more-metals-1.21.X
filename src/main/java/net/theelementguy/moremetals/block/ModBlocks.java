package net.theelementguy.moremetals.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoreMetalsMod.MOD_ID);

    public static final DeferredBlock<Block> CUBIC_ZIRCONIUM_BLOCK = registerBlock("cubic_zirconia_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(5f).mapColor(DyeColor.WHITE).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> RAW_CUBIC_ZIRCONIUM_BLOCK = registerBlock("raw_cubic_zirconia_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(5f).mapColor(DyeColor.MAGENTA).explosionResistance(6f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CUBIC_ZIRCONIA_ORE = registerBlock("cubic_zirconia_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(3f).mapColor((DyeColor.GRAY)).explosionResistance(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DEEPSLATE_CUBIC_ZIRCONIA_ORE = registerBlock("deepslate_cubic_zirconia_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(4.5f).mapColor((DyeColor.GRAY)).explosionResistance(3f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));

    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
    DeferredBlock<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn);
    return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
