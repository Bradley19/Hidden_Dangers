package net.linkbrad.hiddendangers.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.linkbrad.hiddendangers.HiddenDangers;
import net.linkbrad.hiddendangers.block.ModBlocks;

import net.linkbrad.hiddendangers.fluid.ModFluids;
import net.linkbrad.hiddendangers.item.custom.ModFuelItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CreativeTabGroup = Registry.register(Registries.ITEM_GROUP, Identifier.of(HiddenDangers.MOD_ID),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.scanner"))
                    .icon(() -> new ItemStack(ModItems.POLLUTIONSCANNER)).entries((displayContext, entries) -> {





                        entries.add(ModItems.POLLUTIONSCANNER);
                        entries.add(ModFuelItems.FAILEDPLASTICMOLDING);
                        entries.add(ModFuelItems.LIQUIFIEDHYDROGENCANISTER);


                        entries.add(ModFluids.HEAVYMETALCONTAINER);
                        entries.add(ModItems.EMPTYPOLLUTIONCONTAINER);


                        entries.add(ModBlocks.TARBLOCK);

                    }).build());









    public static void registerItemGroups(){
        HiddenDangers.LOGGER.info("Registering Creative Tabs for "+ HiddenDangers.MOD_ID);
    }
}