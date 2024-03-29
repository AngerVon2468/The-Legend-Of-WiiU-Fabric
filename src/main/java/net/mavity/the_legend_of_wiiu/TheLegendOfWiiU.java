package net.mavity.the_legend_of_wiiu;

import net.fabricmc.api.ModInitializer;

import net.mavity.the_legend_of_wiiu.blockregister.BlockInit;
import net.mavity.the_legend_of_wiiu.blockregister.blocktyperegister.CrashType;
import net.mavity.the_legend_of_wiiu.blockregister.blocktyperegister.PotType;
import net.mavity.the_legend_of_wiiu.itemregister.ItemInit;
import net.mavity.the_legend_of_wiiu.other.TLOWCreativeModeTabs;
import net.mavity.the_legend_of_wiiu.propertymanager.TLOWProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheLegendOfWiiU implements ModInitializer {
	public static final String MOD_ID = "the_legend_of_wiiu";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info(TheLegendOfWiiU.MOD_ID + " has registered its' main class.");
		ItemInit.registerItemInit();
		TLOWCreativeModeTabs.registerItemGroups();
		BlockInit.registerBlockInit();
		CrashType.registerCrashType();
		TLOWProperties.registerPropertiesEvent();
		TheLegendOfWiiUClient.registerTLOWClient();
		TheLegendOfWiiUDataGenerator.registerTLOWDataGen();
		PotType.registerPotType();
	}
}