package com.curle.deltaseven;

import com.curle.armor.ArmorMaterials;
import com.curle.block.BlocksGalore;
import com.curle.block.tiles.TilesGalore;
import com.curle.item.ItemsGalore;
import com.curle.item.ToolMaterials;
import com.curle.utils.Essentials;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;

@Mod(modid = Essentials.MODID, version = Essentials.VERSION, name = Essentials.NAME)

public class Main {
	
	@Instance
	public static Main instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		ItemsGalore.init();
		ToolMaterials.init();
		ArmorMaterials.init();
		BlocksGalore.init();
		TilesGalore.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
	@EventHandler
	public void serverStart(FMLServerStartingEvent e) {
		
	}
	
	@EventHandler
	public void serverStop(FMLServerStoppingEvent e) {
		
	}

}
