package net.mavity.the_legend_of_wiiu.other;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mavity.the_legend_of_wiiu.TheLegendOfWiiU;
import net.mavity.the_legend_of_wiiu.blockregister.BlockInit;
import net.mavity.the_legend_of_wiiu.itemregister.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TLOWCreativeModeTabs {
    public static final ItemGroup TLOW_WEAPONRY = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheLegendOfWiiU.MOD_ID, "tlow_weaponry"),
            FabricItemGroup.builder().displayName(Text.translatable("tab.the_legend_of_wiiu.tlow_weaponry"))
                    .icon(() -> new ItemStack(ItemInit.ROYAL_GUARDS_SWORD)).entries((displayContext, entries) -> {
                        entries.add(ItemInit.ROYAL_GUARDS_SWORD);
                        entries.add(ItemInit.THE_MASTER_SWORD);
                        entries.add(ItemInit.THE_AWAKENED_MASTER_SWORD);
                    }).build());
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
                        entries.add(ItemInit.THE_WIIU);
                        entries.add(ItemInit.ROYAL_GUARDS_SWORD);
                        entries.add(ItemInit.THE_MASTER_SWORD);
                        entries.add(ItemInit.THE_AWAKENED_MASTER_SWORD);
                        entries.add(ItemInit.MAJORAS_MASK);
                        entries.add(BlockInit.EXAMPLE_BLOCK);
                        entries.add(BlockInit.RUPEE_POT);
                        entries.add(BlockInit.PED_WITH_MS);
                    }).build());
    public static final ItemGroup TLOW_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheLegendOfWiiU.MOD_ID, "tlow_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("tab.the_legend_of_wiiu.tlow_blocks"))
                    .icon(() -> new ItemStack(BlockInit.EXAMPLE_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(BlockInit.EXAMPLE_BLOCK);
                        entries.add(BlockInit.PED_WITH_MS);
                        entries.add(BlockInit.RUPEE_POT);
                    }).build());

    public static void registerItemGroups() {
        TheLegendOfWiiU.LOGGER.info(TheLegendOfWiiU.MOD_ID + " has registered its' Creative Mode Tabs.");
    }
}