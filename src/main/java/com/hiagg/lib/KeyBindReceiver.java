package com.hiagg.lib;

import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyBindReceiver {
	   
	@SubscribeEvent
	   public void onKeyInput(InputEvent.KeyInputEvent event) {
	       if(KeyBinds.testbind.isPressed())
	           Util.postToDebug("Key " + EnumChatFormatting.DARK_RED + "L " + EnumChatFormatting.WHITE + "pressed.");
	   }

}
