package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InfuserCore extends Item {
	public InfuserCore() {
		setUnlocalizedName("InfuserCore");
		setTextureName(Essentials.MODID + ":InfuserCore");
		setCreativeTab(Tab.tabMatGalItems);
	}
	@Override
	public boolean hasEffect(ItemStack i, int in) {
		return true;
	}

}
