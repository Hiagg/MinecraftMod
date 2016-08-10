package com.curle.item;

import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.Item.ToolMaterial;

public class ToolMaterials {
	public static ToolMaterial MaterialToolSpark;
	public static ToolMaterial MaterialToolTopaz;
	public static ToolMaterial MaterialToolJade;
	public static ToolMaterial MaterialToolLapis;
	
	public static void init() {
		MaterialToolSpark = EnumHelper.addToolMaterial("MaterialToolSpark", 4, -1, 24.0F, 46.0F, 100);
		MaterialToolJade = EnumHelper.addToolMaterial("MaterialToolJade", 1, 16, 1.0F, 1.0F, 30);
		MaterialToolTopaz = EnumHelper.addToolMaterial("MaterialToolTopaz", 2, 1024, 5.0F, 3.0F, 2);
		MaterialToolLapis = EnumHelper.addToolMaterial("MaterialToolLapis", 0, 2048, 12.0F, 0.0F, 22);
	}

}
