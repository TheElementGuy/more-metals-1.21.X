package net.theelementguy.tegmoremetals;

import com.mojang.serialization.MapCodec;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.jetbrains.annotations.NotNull;

public class MoreMetalsRegisters {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreMetalsMod.MOD_ID);
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoreMetalsMod.MOD_ID);
	public static final DeferredRegister<@NotNull MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, MoreMetalsMod.MOD_ID);

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
		BLOCKS.register(eventBus);
		LOOT_MODIFIERS.register(eventBus);
	}

}
