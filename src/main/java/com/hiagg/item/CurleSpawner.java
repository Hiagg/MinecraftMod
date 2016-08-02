package com.hiagg.item;

import com.hiagg.creativetabs.ModTabs;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldSettings.GameType;

public class CurleSpawner extends Item {
	public CurleSpawner() {
		setUnlocalizedName("CurleSpawner");
		setTextureName("hiaggium:CurleSpawner");
		setCreativeTab(ModTabs.tabGear);
	}
	
	@Override
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
        if(world.isRemote) {
        	// player.setGameType(GameType.CREATIVE);
        	// Minecraft.getMinecraft().displayGuiScreen(new GuiInventory(player));
        	// player.setGameType(GameType.SURVIVAL);
        }
    	return item;
    }

}
