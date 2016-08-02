package com.hiagg.lib;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class Util {
	
	
	public static void postToChat(String message) {
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(message));
	}
	
	public static void postToDebug(String message) {
		postToChat(EnumChatFormatting.DARK_PURPLE + "[Curle-Debug] " + message);
	}

}
