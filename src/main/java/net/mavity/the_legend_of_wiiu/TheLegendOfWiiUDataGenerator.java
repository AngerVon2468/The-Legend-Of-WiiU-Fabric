package net.mavity.the_legend_of_wiiu;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TheLegendOfWiiUDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

	}
	public static void registerTLOWDataGen() {
		TheLegendOfWiiU.LOGGER.info(TheLegendOfWiiU.MOD_ID + " has registered its' Data Generator.");
	}
}
