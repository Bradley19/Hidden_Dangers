package net.linkbrad.hiddendangers.util;

import net.linkbrad.hiddendangers.HiddenDangers;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {


    public static class Blocks{


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(HiddenDangers.MOD_ID, name));
        }
    }



    private static class Items{


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(HiddenDangers.MOD_ID, name));
        }

    }






}
