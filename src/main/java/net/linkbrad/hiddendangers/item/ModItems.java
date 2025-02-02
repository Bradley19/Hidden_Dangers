package net.linkbrad.hiddendangers.item;

import net.linkbrad.hiddendangers.HiddenDangers;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItems {



    public static final Item POLLUTIONSCANNER = registerItem("pollution_scanner",new Item(new Item.Settings()));
    public static final Item PLASTICSHEET = registerItem("plastic_sheet",new Item(new Item.Settings()));
    public static final Item EMPTYPOLLUTIONCONTAINER = registerItem("empty_pollution_container",new Item(new Item.Settings().maxCount(8)));







    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(HiddenDangers.MOD_ID,name),item);
    }

    public static void registerModItems() {

        HiddenDangers.LOGGER.info("Registering Mod Items For " + HiddenDangers.MOD_ID);
    }
}
