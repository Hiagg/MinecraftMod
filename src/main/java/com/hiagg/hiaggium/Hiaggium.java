package com.hiagg.hiaggium;

import com.hiagg.blocks.ModBlocks;
import com.hiagg.creativetabs.ModTabs;
import com.hiagg.item.ModItems;
import com.hiagg.lib.KeyInputHandler;
import com.hiagg.lib.RefStrings;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=RefStrings.MODID, name=RefStrings.NAME, version=RefStrings.VERSION)

public class Hiaggium {
	@Instance("hiagg")
	 public static Hiaggium instance;
    @Mod.EventHandler
    public static void PreLoad(FMLPreInitializationEvent event) {
        ModTabs.intialiseTabs();
        ModItems.mainRegistry();
        ModBlocks.mainRegistry();
        CraftingManager.mainRegistry();
    }

    @Mod.EventHandler
    public static void Load(FMLInitializationEvent event) {
    	FMLCommonHandler.instance().bus().register(new KeyInputHandler());
    }

    @Mod.EventHandler
    public static void PostLoad(FMLPostInitializationEvent event) {
    }
}
