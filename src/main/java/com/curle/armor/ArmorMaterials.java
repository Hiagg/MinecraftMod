package com.curle.armor;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterials {
	public static ArmorMaterial MaterialArmorSpark;
	
	public static void init() {
		MaterialArmorSpark = EnumHelper.addArmorMaterial("MaterialArmorSpark", -1, new int[]{3, 8, 6, 3}, 35);
	}

}
