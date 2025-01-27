package net.linkbrad.hiddendangers.block;

import net.linkbrad.hiddendangers.HiddenDangers;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block TAR_BLOCK = registerBlock("tar_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIRT)));






private static  Block registerBlock(String name,Block block){
    registerBlockItem(name, block);
    return Registry.register(Registries.BLOCK, Identifier.of(HiddenDangers.MOD_ID,name),block);
}


    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(HiddenDangers.MOD_ID,name),
                new BlockItem(block, new Item.Settings()));

}


    public static void registerModItems() {

        HiddenDangers.LOGGER.info("Registering Mod Blocks For " + HiddenDangers.MOD_ID);
}



}
