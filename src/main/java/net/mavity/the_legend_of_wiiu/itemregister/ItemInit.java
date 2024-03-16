package net.mavity.the_legend_of_wiiu.itemregister;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mavity.the_legend_of_wiiu.TheLegendOfWiiU;
import net.mavity.the_legend_of_wiiu.propertymanager.TLOWProperties;
import net.minecraft.item.*;
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
    private static void addCombatTabMethod(FabricItemGroupEntries entries) {
        entries.add(ROYAL_GUARDS_SWORD);
        entries.add(THE_MASTER_SWORD);
        entries.add(THE_AWAKENED_MASTER_SWORD);
    }

    public static final Item GREEN_RUPEE = registerItem("green_rupee", new Item(TLOWProperties.RUPEETYPE));
    public static final Item BLUE_RUPEE = registerItem("blue_rupee", new Item(TLOWProperties.RUPEETYPE));
    public static final Item YELLOW_RUPEE = registerItem("yellow_rupee", new Item(TLOWProperties.RUPEETYPE));
    public static final Item RED_RUPEE = registerItem("red_rupee", new Item(TLOWProperties.RUPEETYPE));
    public static final Item PURPLE_RUPEE = registerItem("purple_rupee", new Item(TLOWProperties.RUPEETYPE));
    public static final Item SILVER_RUPEE = registerItem("silver_rupee", new Item(TLOWProperties.RUPEETYPE));
    public static final Item GOLD_RUPEE = registerItem("gold_rupee", new Item(TLOWProperties.RUPEETYPE));
    public static final Item THE_WIIU = registerItem("wiiu", new Item(TLOWProperties.RUPEETYPE));
    public static final Item ROYAL_GUARDS_SWORD = registerItem("royal_guards_sword",
            new SwordItem(ToolMaterials.WOOD, 7, -2.4f, new FabricItemSettings().maxDamage(64)));
    public static final Item THE_MASTER_SWORD = registerItem("the_master_sword",
            new SwordItem(ToolMaterials.DIAMOND, 8, -2.4f, new FabricItemSettings().maxDamage(552)));
    public static final Item THE_AWAKENED_MASTER_SWORD = registerItem("the_awakened_master_sword",
            new SwordItem(ToolMaterials.DIAMOND, 14, -2.4f, new FabricItemSettings().maxDamage(1024)));
    public static final Item MAJORAS_MASK = registerItem("majoras_mask", new Item(new FabricItemSettings().maxDamage(0).maxCount(1)));
    public static void registerItemInit() {
        TheLegendOfWiiU.LOGGER.info("Registering Items for TLOW (" + TheLegendOfWiiU.MOD_ID + ")");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ItemInit::addToTabMethod);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ItemInit::addCombatTabMethod);
    }
}
