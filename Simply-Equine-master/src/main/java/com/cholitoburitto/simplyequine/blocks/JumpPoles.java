package com.cholitoburitto.simplyequine.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;


public class JumpPoles extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(-7, 6, 7, 23, 8, 9),
            Block.makeCuboidShape(-8, -1.6, 8, -7, 14.4, 11),
            Block.makeCuboidShape(-8, -1.6, 6, -7, 14.4, 9),
            Block.makeCuboidShape(23, -1.6, 6, 24, 14.4, 9),
            Block.makeCuboidShape(23, -1.6, 8, 24, 14.4, 11)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(-7, 6, 7, 23, 8, 9),
            Block.makeCuboidShape(-8, -1.6, 8, -7, 14.4, 11),
            Block.makeCuboidShape(-8, -1.6, 6, -7, 14.4, 9),
            Block.makeCuboidShape(23, -1.6, 6, 24, 14.4, 9),
            Block.makeCuboidShape(23, -1.6, 8, 24, 14.4, 11)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(-7, 6, 7, 23, 8, 9),
            Block.makeCuboidShape(-8, -1.6, 8, -7, 14.4, 11),
            Block.makeCuboidShape(-8, -1.6, 6, -7, 14.4, 9),
            Block.makeCuboidShape(23, -1.6, 6, 24, 14.4, 9),
            Block.makeCuboidShape(23, -1.6, 8, 24, 14.4, 11)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(-7, 6, 7, 23, 8, 9),
            Block.makeCuboidShape(-8, -1.6, 8, -7, 14.4, 11),
            Block.makeCuboidShape(-8, -1.6, 6, -7, 14.4, 9),
            Block.makeCuboidShape(23, -1.6, 6, 24, 14.4, 9),
            Block.makeCuboidShape(23, -1.6, 8, 24, 14.4, 11)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public JumpPoles(Properties properties) {
        super(properties);
        this.setDefaultState(this.getStateContainer().getBaseState().with(FACING, Direction.NORTH));
    }
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
