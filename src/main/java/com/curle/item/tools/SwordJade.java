package com.curle.item.tools;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class SwordJade extends ItemSword {
	public SwordJade(ToolMaterial sparkMaterial, float damage) {
		super(sparkMaterial);
		setUnlocalizedName("SwordSpark");
		setTextureName(Essentials.MODID + ":SwordSpark");
		setCreativeTab(Tab.tabMatGalItems);
		this.weaponDamage = damage;
	}
	
	protected final float weaponDamage;
}