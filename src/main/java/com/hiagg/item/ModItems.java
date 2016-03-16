/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.registry.GameRegistry
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraftforge.common.util.EnumHelper
 */
package com.hiagg.item;

import com.hiagg.creativetabs.ModTabs;
import com.hiagg.item.DebugPick;
import com.hiagg.item.DupePick;
import com.hiagg.item.HiaggiumArmor;
import com.hiagg.item.HiaggiumAxe;
import com.hiagg.item.HiaggiumHoe;
import com.hiagg.item.HiaggiumPick;
import com.hiagg.item.HiaggiumShovel;
import com.hiagg.item.HiaggiumSword;
import com.hiagg.item.HiaggsArmor;
import com.hiagg.item.HiaggsSword;
import com.hiagg.item.IceSword;
import com.hiagg.item.UnrefHiaggArmor;
import com.hiagg.item.UnrefHiaggAxe;
import com.hiagg.item.UnrefHiaggHoe;
import com.hiagg.item.UnrefHiaggPick;
import com.hiagg.item.UnrefHiaggShovel;
import com.hiagg.item.UnrefHiaggSword;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
    public static Item.ToolMaterial Debug = EnumHelper.addToolMaterial("Debug", 9999, -1, 8.0f, 3.0f, 10);
    public static ItemArmor.ArmorMaterial Hiagg = EnumHelper.addArmorMaterial("Hiagg", -1, new int[]{20, 20, 20, 20}, 255);
    public static Item.ToolMaterial HiaggTools = EnumHelper.addToolMaterial("HiaggTools", 90001, -1, 2.0E9f, 9.1215224E13f, 500);
    public static Item.ToolMaterial UnrefHiaggIngot = EnumHelper.addToolMaterial("Unrefined Hiaggium Ingot", 9001, 15000, 20.0f, 12.0f, 35);
    public static ItemArmor.ArmorMaterial UnrefHiaggArmor = EnumHelper.addArmorMaterial("Unrefined Hiaggium", 20000, new int[]{12, 20, 16, 8}, 35);
    public static ItemArmor.ArmorMaterial HiaggiumA = EnumHelper.addArmorMaterial("HiaggiumA", -1, new int[]{12, 20, 16, 8}, 50);
    public static Item.ToolMaterial HiaggiumT = EnumHelper.addToolMaterial("HiaggiumT", 9000001, -1, 5.0E8f, 4.2013377E10f, 50);
    public static Item.ToolMaterial ElementalT = EnumHelper.addToolMaterial("ElementalT", 6, 5000, 12.0f, 23.5f, 30);
    // Test stuff
    public static Item TestBow;
    public static Item SkyStick;
    public static Item OpApple;
    public static Item DebugPick;
    public static Item DupePick;
    public static Item IceSword;
    public static Item MeltCompDia;
    // Items
    public static Item UnrefHiagg;
    public static Item Hiaggium;
    public static Item HardRod;
    // Hiagg Items
    public static Item HiaggsHelmet;
    public static Item HiaggsChestplate;
    public static Item HiaggsLeggings;
    public static Item HiaggsBoots;
    public static Item HiaggsSword;
    // Hiaggium Tools/Armor
    public static Item HiaggiumHelmet;
    public static Item HiaggiumChestplate;
    public static Item HiaggiumLeggings;
    public static Item HiaggiumBoots;
    public static Item HiaggiumPick;
    public static Item HiaggiumSword;
    public static Item HiaggiumShovel;
    public static Item HiaggiumAxe;
    public static Item HiaggiumHoe;
    // Unrefined Hiaggium Tools/Armor
    public static Item UnrefHiaggHelmet;
    public static Item UnrefHiaggChestplate;
    public static Item UnrefHiaggLeggings;
    public static Item UnrefHiaggBoots;
    public static Item UnrefHiaggPick;
    public static Item UnrefHiaggShovel;
    public static Item UnrefHiaggSword;
    public static Item UnrefHiaggHoe;
    public static Item UnrefHiaggAxe;
    
    public static void mainRegistry() {
        ModItems.initializeItem();
        ModItems.registerItem();
    }

    public static void initializeItem() {
        TestBow = new Item().setCreativeTab(ModTabs.tabGear).setUnlocalizedName("TestBow");
        DebugPick = new DebugPick(Debug).setCreativeTab(ModTabs.tabGear).setUnlocalizedName("DebugPick");
        DupePick = new DupePick(HiaggTools).setCreativeTab(ModTabs.tabGear).setUnlocalizedName("DupePick");
        SkyStick = new Item().setUnlocalizedName("SkyStick");
        OpApple = new Item().setUnlocalizedName("OpApple").setCreativeTab(ModTabs.tabItems).setTextureName("hiaggium:Err");
        MeltCompDia = new Item().setUnlocalizedName("MeltCompDia").setCreativeTab(ModTabs.tabCraftingComponents).setTextureName("hiaggium:Err");
        UnrefHiagg = new Item().setUnlocalizedName("UnrefHiagg").setCreativeTab(ModTabs.tabGear).setTextureName("hiaggium:UnrefHiaggiumm");
        Hiaggium = new Item().setUnlocalizedName("Hiaggium").setCreativeTab(ModTabs.tabGear).setTextureName("hiaggium:HiaggiumIngot");
        HardRod = new Item().setUnlocalizedName("HardRod").setCreativeTab(ModTabs.tabCraftingComponents).setTextureName("hiaggium:HardBlazeRod");
        UnrefHiaggPick = new UnrefHiaggPick(UnrefHiaggIngot);
        UnrefHiaggSword = new UnrefHiaggSword(UnrefHiaggIngot);
        UnrefHiaggAxe = new UnrefHiaggAxe(UnrefHiaggIngot);
        UnrefHiaggShovel = new UnrefHiaggShovel(UnrefHiaggIngot);
        UnrefHiaggHoe = new UnrefHiaggHoe(UnrefHiaggIngot);
        UnrefHiaggHelmet = new UnrefHiaggArmor(UnrefHiaggArmor, 0, 0).setUnlocalizedName("UnrefHiaggHelmet").setCreativeTab(ModTabs.tabGear).setTextureName("hiaggium:UnrefHiaggHelmet");
        UnrefHiaggChestplate = new UnrefHiaggArmor(UnrefHiaggArmor, 0, 1).setUnlocalizedName("UnrefHiaggChestplate").setCreativeTab(ModTabs.tabGear).setTextureName("hiaggium:UnrefHiaggChestplate");
        UnrefHiaggLeggings = new UnrefHiaggArmor(UnrefHiaggArmor, 0, 2).setUnlocalizedName("UnrefHiaggLeggings").setCreativeTab(ModTabs.tabGear).setTextureName("hiaggium:UnrefHiaggLeggings");
        UnrefHiaggBoots = new UnrefHiaggArmor(UnrefHiaggArmor, 0, 3).setUnlocalizedName("UnrefHiaggBoots").setCreativeTab(ModTabs.tabGear).setTextureName("hiaggium:UnrefHiaggBoots");
        HiaggiumPick = new HiaggiumPick(HiaggiumT);
        HiaggiumSword = new HiaggiumSword(HiaggiumT);
        HiaggiumShovel = new HiaggiumShovel(HiaggiumT);
        HiaggiumAxe = new HiaggiumAxe(HiaggiumT);
        HiaggiumHoe = new HiaggiumHoe(HiaggiumT);
        HiaggiumHelmet = new HiaggiumArmor(HiaggiumA, 0, 0).setUnlocalizedName("HiaggiumHelmet").setCreativeTab(ModTabs.tabGear).setTextureName("hiaggium:HiaggiumHelmet");
        HiaggiumChestplate = new HiaggiumArmor(HiaggiumA, 0, 1).setUnlocalizedName("HiaggiumChestplate").setCreativeTab(ModTabs.tabGear).setTextureName("hiaggium:HiaggiumChestplate");
        HiaggiumLeggings = new HiaggiumArmor(HiaggiumA, 0, 2).setUnlocalizedName("HiaggiumLeggings").setCreativeTab(ModTabs.tabGear).setTextureName("hiaggium:HiaggiumLeggings");
        HiaggiumBoots = new HiaggiumArmor(HiaggiumA, 0, 3).setUnlocalizedName("HiaggiumBoots").setCreativeTab(ModTabs.tabGear).setTextureName("hiaggium:HiaggiumBoots");
        IceSword = new IceSword(ElementalT);
        HiaggsHelmet = new HiaggsArmor(Hiagg, 0, 0).setUnlocalizedName("HiaggsHelmet").setTextureName("hiaggium:HiaggsHelmet");
        HiaggsChestplate = new HiaggsArmor(Hiagg, 0, 1).setUnlocalizedName("HiaggsChestplate").setTextureName("hiaggium:HiaggsChestplate");
        HiaggsLeggings = new HiaggsArmor(Hiagg, 0, 2).setUnlocalizedName("HiaggsLeggings").setTextureName("hiaggium:HiaggsLegginggs");
        HiaggsBoots = new HiaggsArmor(Hiagg, 0, 3).setUnlocalizedName("HiaggsBoots").setTextureName("hiaggium:HiaggsBoots");
        HiaggsSword = new HiaggsSword(HiaggTools);
    }

    public static void registerItem() {
        GameRegistry.registerItem((Item)DebugPick, DebugPick.getUnlocalizedName());
        GameRegistry.registerItem((Item)DupePick, DupePick.getUnlocalizedName());
        GameRegistry.registerItem((Item)SkyStick, SkyStick.getUnlocalizedName());
        GameRegistry.registerItem((Item)OpApple, OpApple.getUnlocalizedName());
        GameRegistry.registerItem((Item)MeltCompDia, MeltCompDia.getUnlocalizedName());
        GameRegistry.registerItem((Item)HardRod, HardRod.getUnlocalizedName());
        GameRegistry.registerItem((Item)UnrefHiagg, UnrefHiagg.getUnlocalizedName());
        GameRegistry.registerItem((Item)Hiaggium, Hiaggium.getUnlocalizedName());
        GameRegistry.registerItem((Item)UnrefHiaggPick, UnrefHiaggPick.getUnlocalizedName());
        GameRegistry.registerItem((Item)UnrefHiaggShovel, UnrefHiaggShovel.getUnlocalizedName());
        GameRegistry.registerItem((Item)UnrefHiaggAxe, UnrefHiaggAxe.getUnlocalizedName());
        GameRegistry.registerItem((Item)UnrefHiaggSword, UnrefHiaggSword.getUnlocalizedName());
        GameRegistry.registerItem((Item)UnrefHiaggHoe, UnrefHiaggHoe.getUnlocalizedName());
        GameRegistry.registerItem((Item)UnrefHiaggHelmet, UnrefHiaggHelmet.getUnlocalizedName());
        GameRegistry.registerItem((Item)UnrefHiaggChestplate, UnrefHiaggChestplate.getUnlocalizedName());
        GameRegistry.registerItem((Item)UnrefHiaggLeggings, UnrefHiaggLeggings.getUnlocalizedName());
        GameRegistry.registerItem((Item)UnrefHiaggBoots, UnrefHiaggBoots.getUnlocalizedName());
        GameRegistry.registerItem((Item)HiaggiumPick, HiaggiumPick.getUnlocalizedName());
        GameRegistry.registerItem((Item)HiaggiumSword, HiaggiumSword.getUnlocalizedName());
        GameRegistry.registerItem((Item)HiaggiumShovel, HiaggiumShovel.getUnlocalizedName());
        GameRegistry.registerItem((Item)HiaggiumAxe, HiaggiumAxe.getUnlocalizedName());
        GameRegistry.registerItem((Item)HiaggiumHoe, HiaggiumHoe.getUnlocalizedName());
        GameRegistry.registerItem((Item)HiaggiumHelmet, HiaggiumHelmet.getUnlocalizedName());
        GameRegistry.registerItem((Item)HiaggiumChestplate, HiaggiumChestplate.getUnlocalizedName());
        GameRegistry.registerItem((Item)HiaggiumLeggings, HiaggiumLeggings.getUnlocalizedName());
        GameRegistry.registerItem((Item)HiaggiumBoots, HiaggiumBoots.getUnlocalizedName());
        GameRegistry.registerItem((Item)IceSword, IceSword.getUnlocalizedName());
        GameRegistry.registerItem((Item)HiaggsHelmet, HiaggsHelmet.getUnlocalizedName());
        GameRegistry.registerItem((Item)HiaggsChestplate, HiaggsChestplate.getUnlocalizedName());
        GameRegistry.registerItem((Item)HiaggsLeggings, HiaggsLeggings.getUnlocalizedName());
        GameRegistry.registerItem((Item)HiaggsBoots, HiaggsBoots.getUnlocalizedName());
        GameRegistry.registerItem((Item)HiaggsSword, HiaggsSword.getUnlocalizedName());
        GameRegistry.registerItem((Item)TestBow, TestBow.getUnlocalizedName());
    }
}

