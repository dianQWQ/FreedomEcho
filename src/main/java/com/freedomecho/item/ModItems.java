package com.freedomecho.item;

import com.freedomecho.item.items.LieQi;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItems {

    private ModItems(){}

    private static final FoodComponent LIE_QI_FOOD_COMPONENT = new FoodComponent.Builder()
                            .nutrition(50)
                            .saturationModifier(100)
                            .alwaysEdible()
                            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,2550,15),1.0f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,2550,10),1.0f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS,2550,10),1.0f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,2550,10),1.0f)
                            .build();

    public static final LieQi LIE_QI = register("lie_qi",new LieQi(
            new Item.Settings()
                .maxCount(5)
                    .food(LIE_QI_FOOD_COMPONENT)
            )
    );

    //猎奇剑
    public static final Item LIE_QI_SWORD = register("lie_qi_sword",new SwordItem(LIE_QI_SWORD_MATERIAL.INSTANCE,new Item.Settings()));

    public static <T extends Item> T register(String Path,T item){
        return Registry.register(Registries.ITEM, Identifier.of("freedomecho",Path),item);
    }

    public static void initialize(){
        FuelRegistry.INSTANCE.add(LIE_QI,12800);
    }
}
