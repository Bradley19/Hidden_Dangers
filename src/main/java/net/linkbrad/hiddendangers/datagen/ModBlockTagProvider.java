package net.linkbrad.hiddendangers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.linkbrad.hiddendangers.block.ModBlocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)


        ;
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.TARBLOCK)


        ;
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)



        ;
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)



        ;
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_4")))




        ;



        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)

        ;


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)

        ;
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)

                .add(ModBlocks.TARBLOCK);



    }
}
