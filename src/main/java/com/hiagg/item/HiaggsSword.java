/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.EnumChatFormatting
 *  net.minecraft.world.World
 */
package com.hiagg.item;

import java.util.List;
import java.util.Vector;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class HiaggsSword extends ItemSword {
    public HiaggsSword() {
        super(ModItems.HiaggTools);
        this.setUnlocalizedName("HiaggsSword");
        this.setTextureName("hiaggium:WyrmheroBlade");
        this.setFull3D();
    }

    public boolean ItemStack(ItemStack stack, EntityLivingBase enemy, EntityLivingBase player) {
        stack.damageItem(1, player);
        return true;
    }

    public void onItemTick(ItemStack stack, World world, EntityPlayer player) {
    	if (player.getDisplayName().equals("Hiagg") || player.getDisplayName().equals("Curle")){
    		player.addPotionEffect(new PotionEffect(Potion.heal.getId(), 5, 255));
    	} else {
    		player.clearItemInUse();
    	}
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
        list.add(EnumChatFormatting.GOLD + "" + EnumChatFormatting.ITALIC + "This is the sword of Hiagg. No, you can't touch it...");
        list.add(EnumChatFormatting.GOLD + "" + EnumChatFormatting.ITALIC + "Well, you can for now.");
    }
    
    
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
    	
    	return stack;
    }
}

