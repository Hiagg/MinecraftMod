package com.curle.block.tiles;

import cpw.mods.fml.common.registry.GameRegistry;

public class TilesGalore {
	
	public static void init() {
		GameRegistry.registerTileEntity(TileEntityMatInf.class, "MaterialInfuser");
	}

}
