/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemStack
 */
package com.hiagg.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class UnrefHiaggArmor
extends ItemArmor {
    public UnrefHiaggArmor(ItemArmor.ArmorMaterial armorMaterial, int renderIndex, int armorType) {
        super(armorMaterial, renderIndex, armorType);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, String type) {
        if (this.renderIndex == 2) {
            return "hiaggium:textures/models/armor/unrefhiagg_layer_2.png";
        }
        return "hiaggium:textures/models/armor/unrefhiagg_layer_1.png";
    }
}

