package com.curle.block.ores;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreSapphire extends Block {
	public OreSapphire() {
		super(Material.rock);
		setBlockName("OreSapphire");
		setBlockTextureName(Essentials.MODID + ":OreSapphire");
		setCreativeTab(Tab.tabMatGalBlocks);
		setHardness(30.0F);
	}

}
