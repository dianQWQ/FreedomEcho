package com.freedomecho.item;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class LIE_QI_SWORD_MATERIAL implements ToolMaterial {
    public static final LIE_QI_SWORD_MATERIAL INSTANCE = new LIE_QI_SWORD_MATERIAL() ;

    @Override
    public int getDurability() {
        return 455;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 100;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return null;
    }

    @Override
    public int getEnchantability() {
        return 50;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.LIE_QI_SWORD,Items.ROTTEN_FLESH);
    }
}
