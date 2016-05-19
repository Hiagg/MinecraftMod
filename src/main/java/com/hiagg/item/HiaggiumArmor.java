package com.hiagg.item;

import java.util.List;

import com.hiagg.lib.Util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class HiaggiumArmor
extends ItemArmor {
    public HiaggiumArmor(ItemArmor.ArmorMaterial armorMaterial, int renderIndex, int armorType) {
        super(armorMaterial, renderIndex, armorType);
        double totalAbsorbtion = 2;
    }
    

    public String getArmorTexture(ItemStack stack, Entity entity, String type) {
        if (this.renderIndex == 2) {
            return "hiaggium:textures/models/armor/hiaggium_layer_2.png";
        }
        return "hiaggium:textures/models/armor/hiaggium_layer_1.png";
    }
    
    
    public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
    	
    	boolean FullHiaggArmor = player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(ModItems.HiaggiumHelmet) && player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(ModItems.HiaggiumChestplate) && player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ModItems.HiaggiumLeggings) && player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(ModItems.HiaggiumBoots);
    	
        if (FullHiaggArmor) {
        //    player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 15, 255));
            player.isImmuneToFire();
     //       player.capabilities.disableDamage = true;
            player.canBreatheUnderwater();
            player.setHealth(3000);
            player.fireResistance = 20000;
            player.capabilities.allowFlying = true;
           if (!player.isSneaking()){ player.stepHeight = 10;} else {player.stepHeight = 0;}
            if(player.isBurning()) {
            	player.extinguish();
            }
              
        else {
        player.capabilities.allowFlying = false;
        player.stepHeight = 0;
        player.fireResistance = 20;
        } 
        }       
    }
    
    public void onHit(World world, EntityPlayer player, ItemStack stack, EntityMob mob, Entity entity){
    	boolean FullHiaggArmor = player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(ModItems.HiaggiumHelmet) && player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(ModItems.HiaggiumChestplate) && player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ModItems.HiaggiumLeggings) && player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(ModItems.HiaggiumBoots);
    	if (FullHiaggArmor) {
        	if (player.hitByEntity(player) || player.hitByEntity(mob) || player.hitByEntity(entity)){
            	List<EntityLivingBase> entities = world.getEntitiesWithinAABB(EntityLivingBase.class, player.getBoundingBox().expand(8.0D, 4.0D, 8.0D));
            
            	
           
            	
            	
        	}
        	
        	/*else if (player.hitByEntity(player)){
        		
        		List<EntityLivingBase> entities = world.getEntitiesWithinAABB(EntityLivingBase.class, player.getBoundingBox().expand(8.0D, 4.0D, 8.0D));
				
        	}*/
        }
    }

}

