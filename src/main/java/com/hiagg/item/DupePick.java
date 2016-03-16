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
	
	
    protected DupePick(Item.ToolMaterial Debug) {
        super(Debug);
        this.setTextureName("hiaggium:DupePick");
    }
    
    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, int i, int j, int k, EntityPlayer player) {
    	worldObj = player.worldObj;
    	worldObj.setBlock(i, j, k, Blocks.air);
    	itemObj = Item.getItemFromBlock(worldObj.getBlock(i, j, k));
    	//Add check for full inv
    	player.inventory.addItemStackToInventory(new ItemStack(itemObj, 2));
    	
    	
    	return true;
    }

}

