//Based on TestMachine from Hiagg
package com.curle.block.machines;

import com.curle.block.tiles.TileEntityMatInf;
import com.curle.deltaseven.Main;
import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;
import com.curle.utils.Utilities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class MaterialInfuser extends BlockContainer {
	
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	
	public MaterialInfuser() {
		super(Material.iron);
		setBlockName("MaterialInfuser");
		//setBlockTextureName("hiaggium:TestMachine");
		this.setHardness(15.0f);
        this.setResistance(270.0f);
        this.setHarvestLevel("pickaxe", 3);
        this.setCreativeTab(Tab.tabMatGalBlocks);
        //this.setStepSound(soundTypeStone);
		//Move all operative code to the TileEntityTestMachine class.
		
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityMatInf();
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconregister) {
		blockIcon = iconregister.registerIcon(Essentials.MODID + ":MaterialInfuserSide");
		front = iconregister.registerIcon(Essentials.MODID + ":MaterialInfuser");
		top = iconregister.registerIcon(Essentials.MODID + ":MaterialInfuserTop");
	}

	public IIcon getIcon(int side, int meta) {
		if (side == 1) {
			return top;
		} else if (side == 3) {
			return front;
		} else {
			return blockIcon;
		}
	}
    
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i1, float f1, float f2, float f3) {
        if(world.isRemote) {
        Utilities.postToDebug(EnumChatFormatting.YELLOW + "Received packet $192BlockUsed on block at " + x + y + z);
        player.openGui(Main.instance, 0, world, x, y, z); }
        return true;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase placer, ItemStack item) {
        if (item.hasDisplayName()) {
            ((TileEntityMatInf) world.getTileEntity(x, y, z)).setCustomName(item.getDisplayName());
        }
    }

}
