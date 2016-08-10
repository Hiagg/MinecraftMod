package com.curle.armor; 

import com.curle.item.ItemsGalore;
import com.curle.utils.Essentials;

import net.minecraft.client.main.Main;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ArmorSpark extends ItemArmor {
	
	public String textureName;

	public ArmorSpark(String name, ArmorMaterial material, int num) {
	    super(material, 0, num);
	    textureName = name;
	    setUnlocalizedName(name);
	    setTextureName(Essentials.MODID + ":" + name);
	}
	
	@Override
	public String getArmorTexture(ItemStack i, Entity entity, int slot, String layer) {
		if((i.getItem() == ItemsGalore.ArmorSparkHelm) || (i.getItem() == ItemsGalore.ArmorSparkChest) || (i.getItem() == ItemsGalore.ArmorSparkBoots)) { 
			return Essentials.MODID + ":textures/models/armor/SparkArmor1.png"; 
		} 
		if(i.getItem() == ItemsGalore.ArmorSparkLegs) { 
			return Essentials.MODID + ":textures/models/armor/SparkArmor2.png"; 
		} 
			return null; 
		}
	
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) { 
		ItemStack chest = player.getCurrentArmor(2);
		
		if(chest != null) {
    		if (chest.getItem() == ItemsGalore.ArmorSparkChest) {
    			
    			player.capabilities.disableDamage = true;
    		}
    		else {
    			player.capabilities.disableDamage = false;
    		}
		}
		super.onArmorTick(world, player, itemStack);
	}

}
