package net.mavity.the_legend_of_wiiu;

import net.fabricmc.api.ClientModInitializer;

public class TheLegendOfWiiUClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

    }
    public static void registerTLOWClient() {
        TheLegendOfWiiU.LOGGER.info(TheLegendOfWiiU.MOD_ID + " has registered its' Client.");
    }
}
