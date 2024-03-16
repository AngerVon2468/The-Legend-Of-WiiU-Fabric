package net.mavity.the_legend_of_wiiu.itemregister;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mavity.the_legend_of_wiiu.TheLegendOfWiiU;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TLOWCreativeModeTabs {

    public static final ItemGroup TLOW_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheLegendOfWiiU.MOD_ID, "tlow_items"),
            FabricItemGroup.builder().displayName(Text.translatable("tab.the_legend_of_wiiu.tlow_items"))
                    .icon(() -> new ItemStack(ItemInit.GREEN_RUPEE)).entries((displayContext, entries) -> {
                        entries.add(ItemInit.GREEN_RUPEE);
                        entries.add(ItemInit.BLUE_RUPEE);
                        entries.add(ItemInit.YELLOW_RUPEE);
                        entries.add(ItemInit.RED_RUPEE);
                        entries.add(ItemInit.PURPLE_RUPEE);
                        entries.add(ItemInit.SILVER_RUPEE);
                        entries.add(ItemInit.GOLD_RUPEE);
                    }).build());

    public static void registerItemGroups() {
        TheLegendOfWiiU.LOGGER.info("Registering Creative Mode tabs for The Legend Of WiiU");
    }
}
