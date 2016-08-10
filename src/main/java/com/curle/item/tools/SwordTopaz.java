package com.curle.item.tools;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class SwordTopaz extends ItemSword {
	public SwordTopaz(ToolMaterial material, float damage) {
		super(material);
		setUnlocalizedName("SwordTopaz");
		setTextureName(Essentials.MODID + ":SwordTopaz");
		setCreativeTab(Tab.tabMatGalItems);
		this.weaponDamage = damage;
	}
	
	protected final float weaponDamage;
}