package com.hiagg.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import com.hiagg.lib.RefStrings;

public class GUITEstMachine extends GuiScreen{
	
	private ResourceLocation backgroundImage = new ResourceLocation(RefStrings.MODID + ":/textures/gui/TestMachineGUI.png");
	 
	 private int x, y, z;
	 private EntityPlayer player;
	 private World world;
	 private int xSize, ySize;
	 
	 public GUITEstMachine(EntityPlayer player, World world, int x, int y, int z) {
	  
	  this.x = x;
	  this.y = y;
	  this.z = z;
	  this.player = player;
	  this.world = world;
	  xSize = 176;
	  ySize = 214;
	 }
	 
	 @Override
	 public void drawScreen(int mouseX, int mouseY, float renderPartialTicks) {
	  this.mc.getTextureManager().bindTexture(backgroundImage);
	  int x = (this.width - xSize) / 2;
	  int y = (this.height - ySize) / 2;
	  drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	  
	 }
	 
	 @Override
	 public boolean doesGuiPauseGame() {
	  return false;
	 }
}
