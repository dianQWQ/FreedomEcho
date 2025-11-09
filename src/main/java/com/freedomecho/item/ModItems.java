package com.freedomecho.item;

import com.freedomecho.item.items.LieQi;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.UnbreakableComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private ModItems(){}

    public static final LieQi LIE_QI = register("lie_qi",new LieQi(
            new Item.Settings()
                .maxCount(5)
            )
    );

    public static <T extends Item> T register(String Path,T item){
        return Registry.register(Registries.ITEM, Identifier.of("freedomecho",Path),item);
    }

    public static void initialize(){
        FuelRegistry.INSTANCE.add(LIE_QI,12800);
    }
}
