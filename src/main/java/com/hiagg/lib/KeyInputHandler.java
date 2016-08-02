package com.hiagg.lib;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings;

import org.lwjgl.input.Keyboard;

import com.hiagg.item.ModItems;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

/*     */   public class KeyInputHandler {
/*     */     private static final String desc = "key.hiaggium.desc";
/*     */     private static final int keyValues = 73;
/*     */     private final KeyBinding switchHAGM;
/*     */     
/*     */     public KeyInputHandler() {
/* 124 */       this.switchHAGM = new KeyBinding("key.hiaggium.desc", Keyboard.KEY_NUMPAD9, "key.category.hiagg");
/* 125 */       ClientRegistry.registerKeyBinding(this.switchHAGM);
/*     */     }
/*     */     
/*     */     @SubscribeEvent
/*     */     public void onKeyInput(InputEvent.KeyInputEvent event) {
/* 130 */       if ((!FMLClientHandler.instance().isGUIOpen(GuiChat.class)) && 
/* 131 */         (this.switchHAGM.isPressed())) {
/* 132 */         EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
/* 133 */         int i = (int)entity.serverPosX;
/* 134 */         int j = (int)entity.serverPosY;
/* 135 */         int k = (int)entity.serverPosZ;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */         MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
/* 146 */         World world = server.worldServers[0];
/*     */         ItemStack boots = entity.inventory.armorInventory[0];
				  ItemStack pants = entity.inventory.armorInventory[1];
			   	  ItemStack chest = entity.inventory.armorInventory[2];
				  ItemStack head = entity.inventory.armorInventory[3];
				  if(boots == new ItemStack(ModItems.HiaggiumBoots, 1) && pants == new ItemStack(ModItems.HiaggiumLeggings, 1) && chest == new ItemStack(ModItems.HiaggiumChestplate, 1) && head == new ItemStack(ModItems.HiaggiumHelmet, 1)) {
				  }

/*     */ 
/* 152 */           if ((entity instanceof EntityPlayer && entity.capabilities.isCreativeMode)) {
						entity.setGameType(WorldSettings.GameType.SURVIVAL);
					}	
					else {
						entity.setGameType(WorldSettings.GameType.CREATIVE);
					}
/*     */         }
/*     */       }
/*     */   }
/*     */ 