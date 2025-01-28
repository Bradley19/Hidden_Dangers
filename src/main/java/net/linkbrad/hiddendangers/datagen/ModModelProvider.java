package net.linkbrad.hiddendangers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.linkbrad.hiddendangers.block.ModBlocks;
import net.linkbrad.hiddendangers.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TARBLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLASTICBLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.POLLUTIONSCANNER, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLASTICSHEET, Models.GENERATED);

    }
}
