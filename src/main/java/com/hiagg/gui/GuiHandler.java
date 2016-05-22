package com.hiagg.gui;

import com.hiagg.blocks.TestMachine;
import com.hiagg.gui.GUIs.GUInum;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {
	 
	 
	 @Override
	 public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	  return new TestMachine();
	 }
	 
	 @Override
	 public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	  if(ID == GUInum.TESTMACHINE.ordinal()) return new GUITEstMachine(player, world, x, y, z);
	  else return null;
	 }
}