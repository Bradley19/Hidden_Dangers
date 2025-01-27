package net.linkbrad.hiddendangers;

import net.fabricmc.api.ModInitializer;

import net.linkbrad.hiddendangers.block.ModBlocks;
import net.linkbrad.hiddendangers.item.ModItemGroups;
import net.linkbrad.hiddendangers.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HiddenDangers implements ModInitializer {
	public static final String MOD_ID = "hidden-dangers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}