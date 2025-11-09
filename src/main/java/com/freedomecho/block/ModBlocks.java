package com.freedomecho.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {
    private ModBlocks(){}

//    private static Block register(String id,Block block){
//        return Registry.register(Registries.BLOCK, Identifier.of("freedomecho",id),block);
//    }
    public static Block register(String name,Block block,boolean shouldRegisterItem) {
        // Register the block and its item.
        Identifier id = Identifier.of("freedomecho", name);
    
        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
    
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static final Block LIE_QI_BLOCK = register(
            "lie_qi_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIRT)),
            true);

    public static void initialize(){

    }
}
