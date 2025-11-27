package net.theelementguy.tegmoremetals.block;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.block.custom.ModHorizontalRotationBlock;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.util.ModUtil;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoreMetalsMod.MOD_ID);

    public static final DeferredBlock<Block> CUBIC_ZIRCONIA_BLOCK = registerBlockWithItem("cubic_zirconia_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(5f).explosionResistance(6f).mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.XYLOPHONE).sound(SoundType.METAL).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_block")))), new Item.Properties().fireResistant().setId(ModUtil.createItemResourceKey("cubic_zirconia_block")));

    public static final DeferredBlock<Block> RAW_CUBIC_ZIRCONIA_BLOCK = registerBlockWithItem("raw_cubic_zirconia_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(3f).explosionResistance(6f).mapColor(MapColor.STONE).instrument(NoteBlockInstrument.XYLOPHONE).sound(SoundType.STONE).setId(ModUtil.createBlockResourceKey("raw_cubic_zirconia_block"))), null);

    public static final DeferredBlock<Block> CUBIC_ZIRCONIA_ORE = registerBlockWithItem("cubic_zirconia_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(3f).mapColor((MapColor.STONE)).explosionResistance(3f).sound(SoundType.STONE).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.XYLOPHONE).setId(ModUtil.createBlockResourceKey("cubic_zirconia_ore")).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_ore")))), null);

    public static final DeferredBlock<Block> DEEPSLATE_CUBIC_ZIRCONIA_ORE = registerBlockWithItem("deepslate_cubic_zirconia_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(4.5f).mapColor((MapColor.DEEPSLATE)).explosionResistance(3f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "deepslate_cubic_zirconia_ore")))), null);

    public static final DeferredBlock<Block> TIN_BLOCK = registerBlockWithItem("tin_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(5f).mapColor(MapColor.RAW_IRON).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "tin_block")))), null);

    public static final DeferredBlock<Block> TIN_ORE = registerBlockWithItem("tin_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(3f).mapColor(MapColor.STONE).explosionResistance(3f).sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "tin_ore")))), null);

    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = registerBlockWithItem("deepslate_tin_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(4.5f).mapColor(MapColor.DEEPSLATE).explosionResistance(3f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "deepslate_tin_ore")))), null);

    public static final DeferredBlock<Block> RUBIDIUM_BLOCK = registerBlockWithItem("rubidium_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(5f).explosionResistance(6f).sound(SoundType.METAL).mapColor(MapColor.COLOR_RED).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_block")))), null);

    public static final DeferredBlock<Block> NETHER_RUBIDIUM_ORE = registerBlockWithItem("nether_rubidium_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(3.0f).explosionResistance(3.0f).sound(SoundType.NETHER_ORE).mapColor(MapColor.NETHER).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "nether_rubidium_ore")))), null);

    public static final DeferredBlock<Block> STARSHARD_BLOCK = registerBlockWithItem("starshard_block", () -> new ModHorizontalRotationBlock(BlockBehaviour.Properties.of().destroyTime(5f).mapColor(MapColor.COLOR_GREEN).explosionResistance(6f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_block")))), new Item.Properties().rarity(Rarity.RARE).setId(ModUtil.createItemResourceKey("starshard_block")));

    public static final DeferredBlock<Block> END_STARSHARD_ORE = registerBlockWithItem("end_starshard_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(4.5f).explosionResistance(9f).mapColor(MapColor.SAND).sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "end_starshard_ore")))), null);

    public static final DeferredBlock<Block> BRONZE_BLOCK = registerBlockWithItem("bronze_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(4.5f).explosionResistance(6f).mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.METAL).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_block")))), null);

    public static final DeferredBlock<Block> BLOODSTONE_BLOCK = registerBlockWithItem("bloodstone_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(5f).explosionResistance(6f).mapColor(MapColor.COLOR_RED).sound(SoundType.METAL).requiresCorrectToolForDrops().setId(ModUtil.createBlockResourceKey("bloodstone_block"))), null);

    public static final DeferredBlock<Block> BLOODSTONE_ORE = registerBlockWithItem("bloodstone_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(3f).explosionResistance(3f).mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ModUtil.createBlockResourceKey("bloodstone_ore"))), null);

    public static final DeferredBlock<Block> DEEPSLATE_BLOODSTONE_ORE = registerBlockWithItem("deepslate_bloodstone_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(4.5f).explosionResistance(3f).mapColor(MapColor.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().setId(ModUtil.createBlockResourceKey("deepslate_bloodstone_ore"))), null);

	public static final DeferredBlock<Block> TENUMBRUM_BLOCK = registerBlockWithItem("tenumbrum_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(5f).explosionResistance(6f).mapColor(MapColor.TERRACOTTA_PURPLE).sound(SoundType.METAL).requiresCorrectToolForDrops().setId(ModUtil.createBlockResourceKey("tenumbrum_block"))), null);

	public static final DeferredBlock<Block> RAW_TENUMBRUM_BLOCK = registerBlockWithItem("raw_tenumbrum_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(3f).explosionResistance(6f).mapColor(MapColor.TERRACOTTA_PURPLE).sound(SoundType.METAL).requiresCorrectToolForDrops().setId(ModUtil.createBlockResourceKey("raw_tenumbrum_block"))), null);

	public static final DeferredBlock<Block> TENUMBRUM_ORE = registerOre("tenumbrum_ore");

	public static final DeferredBlock<Block> DEEPSLATE_TENUMBRUM_ORE = registerDeepslateOre("deepslate_tenumbrum_ore");

    public static <T extends Block> DeferredBlock<T> registerBlockWithItem(String name, Supplier<T> block, @Nullable Item.Properties properties) {
        if(properties ==  null) {
            properties = new Item.Properties().setId(ModUtil.createItemResourceKey(name));
        }
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        ModItems.ITEMS.registerSimpleBlockItem(name, toReturn, properties);
        return toReturn;
    }

	public static DeferredBlock<Block> registerOre(String name) {
		return registerBlockWithItem(name, () -> new Block(BlockBehaviour.Properties.of().destroyTime(3f).explosionResistance(3f).mapColor(MapColor.STONE).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ModUtil.createBlockResourceKey(name))), null);
	}

	public static DeferredBlock<Block> registerDeepslateOre(String name) {
		return registerBlockWithItem(name, () -> new Block(BlockBehaviour.Properties.of().destroyTime(4.5f).explosionResistance(3f).mapColor(MapColor.DEEPSLATE).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE).setId(ModUtil.createBlockResourceKey(name))), null);
	}

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

}
