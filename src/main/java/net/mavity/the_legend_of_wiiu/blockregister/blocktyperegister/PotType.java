package net.mavity.the_legend_of_wiiu.blockregister.blocktyperegister;

import net.mavity.the_legend_of_wiiu.TheLegendOfWiiU;
import net.minecraft.block.HorizontalFacingBlock;

public class PotType extends HorizontalFacingBlock {
    public PotType(Settings settings) {
        super(settings);
    }

    //note to future me: figure out the custom voxelshape for fabric and put it here

    //Leave this at the bottom just in case
    public static void registerPotType() {
        TheLegendOfWiiU.LOGGER.info(TheLegendOfWiiU.MOD_ID + " has registered a blocktype named PotType.");
    }
}
