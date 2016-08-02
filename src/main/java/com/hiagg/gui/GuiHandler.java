package com.hiagg.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.hiagg.blocks.tile.TestMachineContainer;
import com.hiagg.gui.GUIs.GUInum;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	 
	 
	 @Override
	 public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	  return new TestMachineContainer();
	 }
	 
	 @Override
	 public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	  if(ID == GUInum.TESTMACHINE.ordinal())
		  return new GUITEstMachine(player, world, x, y, z);
	  else return null;
	 }
}