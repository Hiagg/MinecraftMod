package com.hiagg.blocks.tile;

import cpw.mods.fml.common.registry.GameRegistry;
import com.hiagg.blocks.tile.TileEntityTestMachine;

public class ModTileEntities {
	
	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityTestMachine.class, "TestMachine");
	}
	

}
