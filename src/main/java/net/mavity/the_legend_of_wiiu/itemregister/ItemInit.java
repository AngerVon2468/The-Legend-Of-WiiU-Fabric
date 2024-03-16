package net.mavity.the_legend_of_wiiu.itemregister;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mavity.the_legend_of_wiiu.TheLegendOfWiiU;
import net.mavity.the_legend_of_wiiu.propertymanager.TLOWProperties;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheLegendOfWiiU.MOD_ID, name), item);
    }

    private static void addToTabMethod(FabricItemGroupEntries entries) {
        entries.add(GREEN_RUPEE);
        entries.add(BLUE_RUPEE);
        entries.add(YELLOW_RUPEE);
        entries.add(RED_RUPEE);
        entries.add(PURPLE_RUPEE);
        entries.add(SILVER_RUPEE);
        entries.add(GOLD_RUPEE);
    }

    public static final Item GREEN_RUPEE = registerItem("green_rupee", new Item(TLOWProperties.RUPEETYPE));
    public static final Item BLUE_RUPEE = registerItem("blue_rupee", new Item(TLOWProperties.RUPEETYPE));
    public static final Item YELLOW_RUPEE = registerItem("yellow_rupee", new Item(TLOWProperties.RUPEETYPE));
    public static final Item RED_RUPEE = registerItem("red_rupee", new Item(TLOWProperties.RUPEETYPE));
    public static final Item PURPLE_RUPEE = registerItem("purple_rupee", new Item(TLOWProperties.RUPEETYPE));
    public static final Item SILVER_RUPEE = registerItem("silver_rupee", new Item(TLOWProperties.RUPEETYPE));
    public static final Item GOLD_RUPEE = registerItem("gold_rupee", new Item(TLOWProperties.RUPEETYPE));

    public static void registerItemInit() {
        TheLegendOfWiiU.LOGGER.info("Registering Items for TLOW (" + TheLegendOfWiiU.MOD_ID + ")");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ItemInit::addToTabMethod);
    }
}
