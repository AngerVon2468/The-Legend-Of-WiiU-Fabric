package net.mavity.the_legend_of_wiiu.propertymanager;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mavity.the_legend_of_wiiu.TheLegendOfWiiU;

public class TLOWProperties {
    public static final FabricItemSettings RUPEETYPE = new FabricItemSettings().maxCount(64).fireproof();
    public static void registerPropertiesEvent() {
        TheLegendOfWiiU.LOGGER.info(TheLegendOfWiiU.MOD_ID + " has registered its' properties.");
    }
}