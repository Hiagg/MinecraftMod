package com.hiagg.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiInfuser implements IGuiHandler {
	 
	 
	 @Override
	 public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	  return new MaterialInfuserContainer();
	 }
	 
	 @Override
	 public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	  if(ID == GUIs.INFUSER.ordinal()) return new GuiInfuser(player, world, x, y, z);
	  else return null;
	 }
}