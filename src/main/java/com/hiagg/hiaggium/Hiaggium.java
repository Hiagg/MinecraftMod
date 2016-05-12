/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.Mod
 *  cpw.mods.fml.common.Mod$EventHandler
 *  cpw.mods.fml.common.event.FMLInitializationEvent
 *  cpw.mods.fml.common.event.FMLPostInitializationEvent
 *  cpw.mods.fml.common.event.FMLPreInitializationEvent
 */
package com.hiagg.hiaggium;

import com.hiagg.blocks.ModBlocks;
import com.hiagg.blocks.tile.ModTileEntities;
import com.hiagg.creativetabs.ModTabs;
import com.hiagg.hiaggium.CraftingManager;
import com.hiagg.item.ModItems;
import com.hiagg.lib.KeyInputHandler;
import com.hiagg.lib.RefStrings;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=RefStrings.MODID, name=RefStrings.NAME, version=RefStrings.VERSION)

public class Hiaggium {
	

	@Instance("hiagg")
	public static Hiaggium instance;
	
    @EventHandler
    public static void PreLoad(FMLPreInitializationEvent event) {
        ModTabs.intialiseTabs();
        ModItems.mainRegistry();
        ModBlocks.mainRegistry();
        ModTileEntities.registerTileEntities();
        CraftingManager.mainRegistry();
    }

    @EventHandler
    public static void Load(FMLInitializationEvent event) {
    	FMLCommonHandler.instance().bus().register(new KeyInputHandler());
    }

    @EventHandler
    public static void PostLoad(FMLPostInitializationEvent event) {
    }
}

