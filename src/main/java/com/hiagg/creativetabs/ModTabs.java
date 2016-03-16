/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 */
package com.hiagg.creativetabs;

import com.hiagg.creativetabs.CreativeTabBlocks;
import com.hiagg.creativetabs.CreativeTabComponents;
import com.hiagg.creativetabs.CreativeTabGear;
import com.hiagg.creativetabs.CreativeTabItems;
import com.hiagg.creativetabs.CreativeTabMachines;
import net.minecraft.creativetab.CreativeTabs;

public class ModTabs {
    public static CreativeTabs tabCraftingComponents;
    public static CreativeTabs tabItems;
    public static CreativeTabs tabBlocks;
    public static CreativeTabs tabGear;
    public static CreativeTabs tabMachines;

    public static void intialiseTabs() {
        tabCraftingComponents = new CreativeTabComponents("CraftingComponentsTab");
        tabItems = new CreativeTabItems("ItemsTab");
        tabBlocks = new CreativeTabBlocks("BlocksTab");
        tabGear = new CreativeTabGear("GearTab");
        tabMachines = new CreativeTabMachines("MachinesTab");
    }
}

