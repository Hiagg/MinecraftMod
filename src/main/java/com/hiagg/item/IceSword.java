/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.world.World
 */
package com.hiagg.item;

import com.hiagg.creativetabs.ModTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class IceSword
extends ItemSword {
    public IceSword(Item.ToolMaterial p_i45356_1_) {
        super(p_i45356_1_);
        this.setCreativeTab(ModTabs.tabGear);
        this.setUnlocalizedName("IceSword");
        this.setTextureName("hiaggium:IceSword");
    }

    public boolean func_77644_a(ItemStack stack, EntityLivingBase enemy, EntityLivingBase player) {
        stack.damageItem(1, player);
        enemy.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 200, 4));
        return true;
    }

    public void onUpdate(ItemStack stack, Entity entity, World world, int par4, boolean par5) {
        super.onUpdate(stack, world, entity, par4, par5);
        EntityPlayer player = (EntityPlayer)entity;
        ItemStack equip = player.getCurrentEquippedItem();
        if (equip == stack) {
            player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 100, 9));
        }
    }
}

