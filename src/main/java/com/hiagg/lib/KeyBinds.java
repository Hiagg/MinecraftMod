package com.hiagg.lib;

import org.lwjgl.input.Keyboard;

import com.hiagg.item.ModItems;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings;

public class KeyBinds {
	
	public static KeyBinding testbind;
	
	public static void init() {
		testbind = new KeyBinding("key.hiaggtestbind", Keyboard.KEY_L, "key.categories.hiagg");
		
		ClientRegistry.registerKeyBinding(testbind);
	}

}
