package com.hiagg.item;

import com.hiagg.creativetabs.ModTabs;

import net.minecraft.client.Minecraft;
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
    public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int dim, float p, float ya, float r) {
        player.setGameType(GameType.CREATIVE);
		player.inventory.openInventory();
		player.setGameType(GameType.SURVIVAL);
		return true;
    }

}
