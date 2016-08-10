package com.curle.block.ores;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreRhodium extends Block {
	public OreRhodium() {
		super(Material.rock);
		setBlockName("OreRhodium");
		setBlockTextureName(Essentials.MODID + ":OreRhodium");
		setCreativeTab(Tab.tabMatGalBlocks);
		setHardness(30.0F);
	}

}
