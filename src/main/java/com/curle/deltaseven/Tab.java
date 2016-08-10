package com.curle.deltaseven;

import com.curle.block.BlocksGalore;
import com.curle.item.ItemsGalore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tab {
	
	public static CreativeTabs tabMatGalItems = new CreativeTabs("tabMatGalItems") {
		public Item getTabIconItem() {
			return ItemsGalore.GemSpark;
		}
	};
	
	public static CreativeTabs tabMatGalBlocks = new CreativeTabs("tabMatGalBlocks") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(BlocksGalore.ObsRhydian);
		}
	};

}
