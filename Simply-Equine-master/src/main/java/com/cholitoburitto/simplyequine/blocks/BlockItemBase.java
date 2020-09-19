package com.cholitoburitto.simplyequine.blocks;


import com.cholitoburitto.simplyequine.simply_equine;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(simply_equine.EQUINE_BLOCKS));
    }
}
