package com.hiagg.lib;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class Key {
	
	public static KeyBinding hiaggASwitchGM; //Add a Hiaggium Armor - Switch GameMode binding
	
	public static void initBindings() { //Initiate bindings
		
		hiaggASwitchGM = new KeyBinding("key.switchgmhiagg", Keyboard.KEY_NUMPAD9, "key.categories.hiagg"); //Variable = new Keybinding(String unlocalizedName, int Key, String categoryUnlocalizedName)
		
        ClientRegistry.registerKeyBinding(hiaggASwitchGM);
	}

}
