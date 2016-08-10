/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemPickaxe
 */
package com.hiagg.item;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;

public class DupePick extends ItemPickaxe {
	private World worldObj;
	private Item itemObj;
	
	
    protected DupePick() {
        super(ModItems.Debug);
        this.setTextureName("hiaggium:DupePick");
    }
    
    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, int i, int j, int k, EntityPlayer player) {
    	worldObj = player.worldObj;
    	itemObj = Item.getItemFromBlock(worldObj.getBlock(i, j, k));
    	int eStack = player.inventory.getFirstEmptyStack();
    	//Add check for full inv
    	if(eStack >= 0) {
    		player.inventory.mainInventory[eStack] = new ItemStack(itemObj, 5); //CRASHES PLAYER ON FULL INV!
    		player.worldObj.setBlock(i, j, k, Blocks.air);
    	} else {
    		player.worldObj.setBlock(i, j, k, Blocks.bedrock);
    	}
    	return true;
    }

}

