/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemBow
 */
package com.hiagg.item;

import com.hiagg.creativetabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBow;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.EnumHelper;

public class TestBow extends ItemBow {
    public static final String[] PullIcons = new String[] {"Stage_1", "Stage_2", "Stage_3"};
    
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;
    
    public TestBow() {
		setUnlocalizedName("hiaggium:TestBow");
		setTextureName("hiaggium:TestBow");
		setCreativeTab(ModTabs.tabGear);
		setMaxDamage(3000);
	}
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iicon)
    {
        this.itemIcon = iicon.registerIcon(this.getIconString() + "_Standby");
        this.icons = new IIcon[PullIcons.length];

        for (int i = 0; i < this.icons.length; ++i)
        {
            this.icons[i] = iicon.registerIcon(this.getIconString() + "_" + PullIcons[i]);
        }
    }
    
	@Override
    @SideOnly(Side.CLIENT)
    public IIcon getItemIconForUseDuration(int i)
    {
        return this.icons[i];
    }
}

