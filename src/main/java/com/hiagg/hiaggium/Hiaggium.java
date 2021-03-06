package com.hiagg.hiaggium;

import com.hiagg.blocks.ModBlocks;
import com.hiagg.creativetabs.ModTabs;
import com.hiagg.gui.GuiHandler;
import com.hiagg.item.ModItems;
import com.hiagg.lib.KeyBindReceiver;
import com.hiagg.lib.KeyBinds;
import com.hiagg.lib.RefStrings;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid=RefStrings.MODID, name=RefStrings.NAME, version=RefStrings.VERSION)

public class Hiaggium {
	@Instance("hiaggium")
	public static Hiaggium instance;
	
    @Mod.EventHandler
    public static void PreLoad(FMLPreInitializationEvent event) {
        ModTabs.intialiseTabs();
        ModItems.mainRegistry();
        ModBlocks.mainRegistry();
        CraftingManager.mainRegistry();
        FMLCommonHandler.instance().bus().register(new KeyBindReceiver());
        KeyBinds.init();
    }

    @Mod.EventHandler
    public static void Load(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    }

    @Mod.EventHandler
    public static void PostLoad(FMLPostInitializationEvent event) {
    }
}
