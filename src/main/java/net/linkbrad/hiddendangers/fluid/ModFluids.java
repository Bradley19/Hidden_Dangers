package net.linkbrad.hiddendangers.fluid;


import net.linkbrad.hiddendangers.HiddenDangers;
import net.linkbrad.hiddendangers.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModFluids {
    public static FlowableFluid HEAVYMETALSFLOWING;
    public static FlowableFluid HEAVYMETALSSTILL;
    public static Block HEAVYMETALBLOCK;
    public static Item HEAVYMETALCONTAINER;



    public static void register(){


        HEAVYMETALSFLOWING = Registry.register(Registries.FLUID,
                Identifier.of(HiddenDangers.MOD_ID,"heavy_metals_flowing"),new HeavyMetalsFluid.Flowing());
        HEAVYMETALSSTILL = Registry.register(Registries.FLUID,
                Identifier.of(HiddenDangers.MOD_ID,"heavy_metals_still"),new HeavyMetalsFluid.Still());


        HEAVYMETALBLOCK = Registry.register(Registries.BLOCK, Identifier.of(HiddenDangers.MOD_ID,"heavy_metal_block"),
                new FluidBlock(ModFluids.HEAVYMETALSSTILL, AbstractBlock.Settings.copy(Blocks.WATER)){  });

        HEAVYMETALCONTAINER = Registry.register(Registries.ITEM,Identifier.of(HiddenDangers.MOD_ID,"heavy_metal_container"),
                new BucketItem(ModFluids.HEAVYMETALSSTILL, new Item.Settings().recipeRemainder(ModItems.EMPTYPOLLUTIONCONTAINER).maxCount(8)));


    }




}
