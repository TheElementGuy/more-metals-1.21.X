package net.theelementguy.tegmoremetals;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theelementguy.tegmoremetals.matlib.MoreMetalsMaterials;

public class ModRegisters {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreMetalsMod.MOD_ID);
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoreMetalsMod.MOD_ID);

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
		BLOCKS.register(eventBus);
	}

}
