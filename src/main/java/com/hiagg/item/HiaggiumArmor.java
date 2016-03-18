package com.hiagg.item;

import java.util.Collection;

import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
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
        if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals((Object)ModItems.HiaggiumHelmet) && player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals((Object)ModItems.HiaggiumChestplate) && player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals((Object)ModItems.HiaggiumLeggings) && player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals((Object)ModItems.HiaggiumBoots)) {
         //   player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 15, 255));
            player.isImmuneToFire();
            player.canBreatheUnderwater();
            player.setHealth(3000);
            player.fireResistance = 20000;
            player.capabilities.allowFlying = true;
           if (!player.isSneaking()){ player.stepHeight = 1;} else {player.stepHeight = 0;}
            if(player.isBurning()) {
            	player.extinguish();
            }
            }
        else {
        player.capabilities.allowFlying = false;
        player.stepHeight = 0;
        player.fireResistance = 20;
        }
    }
}