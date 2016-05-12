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
	// DO NOT USE EXPONENTS ON MATERIALS - ADD INSTANT KILLING/BREAKING CODE TO TOOLS. CAUSES INCOMPATIBILITIES
	public static Item.ToolMaterial Debug = EnumHelper.addToolMaterial("Debug", 10, -1, 8.0f, 3.0f, 10);
    public static ItemArmor.ArmorMaterial Hiagg = EnumHelper.addArmorMaterial("Hiagg", -1, new int[]{5, 9, 7, 4}, 255);
    public static Item.ToolMaterial HiaggTools = EnumHelper.addToolMaterial("HiaggTools", 5, -1, 10000.0F, 12.0F, 500);
    public static Item.ToolMaterial UnrefHiaggIngot = EnumHelper.addToolMaterial("Unrefined Hiaggium Ingot", 4, 15000, 20.0f, 12.0f, 35);
    public static ItemArmor.ArmorMaterial UnrefHiaggArmor = EnumHelper.addArmorMaterial("Unrefined Hiaggium", 20000, new int[]{5, 9, 7, 4}, 35); //Infinite protection armor adds up to 25
    public static ItemArmor.ArmorMaterial HiaggiumA = EnumHelper.addArmorMaterial("HiaggiumA", -1, new int[]{12, 20, 16, 8}, 50);
    public static Item.ToolMaterial HiaggiumT = EnumHelper.addToolMaterial("HiaggiumT", 5, -1, 10000.0f, 31.5f, 50);
    public static Item.ToolMaterial ElementalT = EnumHelper.addToolMaterial("ElementalT", 5, 5000, 12.0f, 23.5f, 30);
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
        GameRegistry.registerItem(DebugPick, DebugPick.getUnlocalizedName());
        GameRegistry.registerItem(DupePick, DupePick.getUnlocalizedName());
        GameRegistry.registerItem(SkyStick, SkyStick.getUnlocalizedName());
        GameRegistry.registerItem(OpApple, OpApple.getUnlocalizedName());
        GameRegistry.registerItem(MeltCompDia, MeltCompDia.getUnlocalizedName());
        GameRegistry.registerItem(HardRod, HardRod.getUnlocalizedName());
        GameRegistry.registerItem(UnrefHiagg, UnrefHiagg.getUnlocalizedName());
        GameRegistry.registerItem(Hiaggium, Hiaggium.getUnlocalizedName());
        GameRegistry.registerItem(UnrefHiaggPick, UnrefHiaggPick.getUnlocalizedName());
        GameRegistry.registerItem(UnrefHiaggShovel, UnrefHiaggShovel.getUnlocalizedName());
        GameRegistry.registerItem(UnrefHiaggAxe, UnrefHiaggAxe.getUnlocalizedName());
        GameRegistry.registerItem(UnrefHiaggSword, UnrefHiaggSword.getUnlocalizedName());
        GameRegistry.registerItem(UnrefHiaggHoe, UnrefHiaggHoe.getUnlocalizedName());
        GameRegistry.registerItem(UnrefHiaggHelmet, UnrefHiaggHelmet.getUnlocalizedName());
        GameRegistry.registerItem(UnrefHiaggChestplate, UnrefHiaggChestplate.getUnlocalizedName());
        GameRegistry.registerItem(UnrefHiaggLeggings, UnrefHiaggLeggings.getUnlocalizedName());
        GameRegistry.registerItem(UnrefHiaggBoots, UnrefHiaggBoots.getUnlocalizedName());
        GameRegistry.registerItem(HiaggiumPick, HiaggiumPick.getUnlocalizedName());
        GameRegistry.registerItem(HiaggiumSword, HiaggiumSword.getUnlocalizedName());
        GameRegistry.registerItem(HiaggiumShovel, HiaggiumShovel.getUnlocalizedName());
        GameRegistry.registerItem(HiaggiumAxe, HiaggiumAxe.getUnlocalizedName());
        GameRegistry.registerItem(HiaggiumHoe, HiaggiumHoe.getUnlocalizedName());
        GameRegistry.registerItem(HiaggiumHelmet, HiaggiumHelmet.getUnlocalizedName());
        GameRegistry.registerItem(HiaggiumChestplate, HiaggiumChestplate.getUnlocalizedName());
        GameRegistry.registerItem(HiaggiumLeggings, HiaggiumLeggings.getUnlocalizedName());
        GameRegistry.registerItem(HiaggiumBoots, HiaggiumBoots.getUnlocalizedName());
        GameRegistry.registerItem(IceSword, IceSword.getUnlocalizedName());
        GameRegistry.registerItem(HiaggsHelmet, HiaggsHelmet.getUnlocalizedName());
        GameRegistry.registerItem(HiaggsChestplate, HiaggsChestplate.getUnlocalizedName());
        GameRegistry.registerItem(HiaggsLeggings, HiaggsLeggings.getUnlocalizedName());
        GameRegistry.registerItem(HiaggsBoots, HiaggsBoots.getUnlocalizedName());
        GameRegistry.registerItem(HiaggsSword, HiaggsSword.getUnlocalizedName());
        GameRegistry.registerItem(TestBow, TestBow.getUnlocalizedName());
    }
}

