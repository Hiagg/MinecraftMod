/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.PlayerCapabilities
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.world.World
 */
package com.hiagg.item;

import com.hiagg.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings;

public class HiaggsArmor
extends ItemArmor {
    public HiaggsArmor(ItemArmor.ArmorMaterial armorMaterial, int renderIndex, int armorType) {
        super(armorMaterial, renderIndex, armorType);
        double totalAbsorbtion = 200;
    }

    public String getArmorTexture(ItemStack stack, Entity entity, String type) {
        if (this.renderIndex == 2) {
            return "tutorialmod:textures/models/armor/hiagg_layer_2.png";
        }
        return "tutorialmod:textures/models/armor/hiagg_layer_1.png";
    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
        if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals((Object)ModItems.HiaggsHelmet) && player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals((Object)ModItems.HiaggsChestplate) && player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals((Object)ModItems.HiaggsLeggings) && player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals((Object)ModItems.HiaggsBoots) && player.getDisplayName().equals("JoshuaE")){
            player.setGameType(WorldSettings.GameType.CREATIVE);
            player.isImmuneToFire();
            player.canBreatheUnderwater();
            player.fireResistance = 2000000000;
            player.setHealth(100000.0f);
            player.capabilities.allowFlying = true;
            player.capabilities.setPlayerWalkSpeed(0.5f);
            player.capabilities.setFlySpeed(0.2f);
            player.capabilities.disableDamage = true;
            player.stepHeight = 1;
            
        } else if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals((Object)ModItems.HiaggsHelmet) && player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals((Object)ModItems.HiaggsChestplate) && player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals((Object)ModItems.HiaggsLeggings) && player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals((Object)ModItems.HiaggsBoots) != player.getDisplayName().equals("JoshuaE")) {
        	
            player.destroyCurrentEquippedItem();
            player.canEat(false);
            player.setDead();
            player.capabilities.allowFlying = false;
            player.capabilities.allowEdit = false;
            
        }
    }
}

