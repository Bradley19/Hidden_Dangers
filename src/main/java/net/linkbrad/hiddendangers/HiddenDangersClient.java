package net.linkbrad.hiddendangers;

import net.fabricmc.api.ClientModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.linkbrad.hiddendangers.fluid.ModFluids;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class HiddenDangersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.HEAVYMETALSSTILL, ModFluids.HEAVYMETALSFLOWING,
                new SimpleFluidRenderHandler(
                Identifier.of("minecraft:block/water_still"),
                Identifier.of("minecraft:block/water_flow"),
                0xd9283743
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.HEAVYMETALSSTILL,ModFluids.HEAVYMETALSFLOWING);
    }
}
