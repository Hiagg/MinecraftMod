package com.curle.item.tools;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class SwordLapis extends ItemSword {
	public SwordLapis(ToolMaterial sparkMaterial, float damage) {
		super(sparkMaterial);
		setUnlocalizedName("SwordLapis");
		setTextureName(Essentials.MODID + ":SwordLapis");
		setCreativeTab(Tab.tabMatGalItems);
		this.weaponDamage = damage;
	}
	protected final float weaponDamage;
}