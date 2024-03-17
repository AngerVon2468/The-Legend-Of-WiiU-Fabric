package net.mavity.the_legend_of_wiiu.blockregister.blocktyperegister;

import net.mavity.the_legend_of_wiiu.TheLegendOfWiiU;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CrashType extends Block {
    public CrashType(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        world.playSound(player, pos, SoundEvents.BLOCK_ANVIL_DESTROY, SoundCategory.BLOCKS, 1f, 1f);
        world.disconnect();
        return ActionResult.SUCCESS;
    }
    public static void registerCrashType() {
        TheLegendOfWiiU.LOGGER.info(TheLegendOfWiiU.MOD_ID + " has registered a blocktype named CrashType.");
    }
}