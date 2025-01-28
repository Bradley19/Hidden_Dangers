package net.linkbrad.hiddendangers.item.custom;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.linkbrad.hiddendangers.HiddenDangers;
import net.linkbrad.hiddendangers.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;




public class ModFuelItems implements ModInitializer {


    public static final Item FAILEDPLASTICMOLDING = registerItem("failed_plastic_molding",new Item(new Item.Settings()));
    public static final Item LIQUIFIEDHYDROGENCANISTER = registerItem("liquidfied_hydrogen_canister",new Item(new Item.Settings()));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(HiddenDangers.MOD_ID,name),item);
    }

    public static void registerModfuelItem(){
        HiddenDangers.LOGGER.info("Registering Mod Fuel Items For " + HiddenDangers.MOD_ID);
        FuelRegistry.INSTANCE.add(ModFuelItems.FAILEDPLASTICMOLDING, 200);
        FuelRegistry.INSTANCE.add(ModFuelItems.LIQUIFIEDHYDROGENCANISTER, 1000);
    }




    @Override
        //registers items as fuel and sets burn time in ticks (20 ticks per second)
        public void onInitialize() {



        }



    }






