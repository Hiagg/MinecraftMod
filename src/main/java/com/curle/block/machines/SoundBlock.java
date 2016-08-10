package com.curle.block.machines;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.curle.utils.Essentials;

public class SoundBlock extends Block {
	
	public SoundBlock() {
		super(Material.iron);
		setBlockName("SoundBlock");
		setBlockTextureName(Essentials.MODID + ":SoundBlock");
	}
	
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int in, float f1, float f2, float f3) {
        Minecraft.getMinecraft().theWorld.playSoundAtEntity(player, "deltaseven:sikritsound", 0, 0);
    	return false;
    }

}
