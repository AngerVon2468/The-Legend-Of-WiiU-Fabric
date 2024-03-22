package net.mavity.the_legend_of_wiiu.blockregister.blocktyperegister;

import net.mavity.the_legend_of_wiiu.TheLegendOfWiiU;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class PotType extends HorizontalFacingBlock {
    public PotType(Settings settings) {
        super(settings);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0, 0.1875, 0.8125, 0.6875, 0.8125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.4375, 0.6875, 0.4375, 0.5625, 0.8125, 0.5625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.375, 0.6875, 0.4375, 0.4375, 0.8125, 0.5625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.5625, 0.6875, 0.4375, 0.625, 0.8125, 0.5625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.4375, 0.6875, 0.5625, 0.5625, 0.8125, 0.625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.4375, 0.6875, 0.375, 0.5625, 0.8125, 0.4375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.8125, 0.3125, 0.6875, 0.9375, 0.6875));

        return shape;
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            player.sendMessage(Text.literal("You know you want to... just... BREAK THE POT ALREADY!!!"), false);
        }

        return ActionResult.SUCCESS;
    }
    //Leave this at the bottom just in case
    public static void registerPotType() {
        TheLegendOfWiiU.LOGGER.info(TheLegendOfWiiU.MOD_ID + " has registered a blocktype named PotType.");
    }
}
