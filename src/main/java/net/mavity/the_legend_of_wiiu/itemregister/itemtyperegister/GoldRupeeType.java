package net.mavity.the_legend_of_wiiu.itemregister.itemtyperegister;


import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GoldRupeeType extends Item {
    public GoldRupeeType(Item.Settings settings) {
        super(settings);
    }
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.translatable("tooltip.the_legend_of_wiiu.goldrupeetype"));
        super.appendTooltip(stack, world, tooltip, options);
    }
}
