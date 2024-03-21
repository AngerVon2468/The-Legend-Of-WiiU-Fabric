package net.mavity.the_legend_of_wiiu.blockregister;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mavity.the_legend_of_wiiu.TheLegendOfWiiU;
import net.mavity.the_legend_of_wiiu.blockregister.blocktyperegister.CrashType;
import net.mavity.the_legend_of_wiiu.blockregister.blocktyperegister.PotType;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockInit {
    //testing to see if I can register a block or not
    public static final Block EXAMPLE_BLOCK = registerBlock("example_block",
            new CrashType(FabricBlockSettings.create().noCollision().notSolid()));
    public static final Block PED_WITH_MS = registerBlock("ped_with_ms",
            new Block(FabricBlockSettings.create().nonOpaque()));
    public static final Block RUPEE_POT = registerBlock("rupee_pot",
            new PotType(FabricBlockSettings.create().nonOpaque().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TheLegendOfWiiU.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TheLegendOfWiiU.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().maxCount(64)));
    }

    public static void registerBlockInit() {
        TheLegendOfWiiU.LOGGER.info(TheLegendOfWiiU.MOD_ID + " has registered its' blocks.");
    }
}
