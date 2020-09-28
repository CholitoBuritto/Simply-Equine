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

public class JumpStandard extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(3, 1, 0, 4, 17, 1),
            Block.makeCuboidShape(12, 1, 0, 13, 20, 1),
            Block.makeCuboidShape(2, 0, 0, 14, 1, 1),
            Block.makeCuboidShape(2.9507918888983973, 17.4984, -1.1102230246251565e-16, 12.950791888898397, 18.4984, 0.9999999999999999),
            Block.makeCuboidShape(5.25, 0, 0, 5.75, 17, 1),
            Block.makeCuboidShape(7.5, 0, 0, 8.25, 18, 1),
            Block.makeCuboidShape(10.25, 0, 0, 10.75, 19, 1),
            Block.makeCuboidShape(1, 0, -1, 2, 1, 2),
            Block.makeCuboidShape(14, 0, -1, 15, 1, 2),
            Block.makeCuboidShape(14, 1, 0, 15, 2, 1),
            Block.makeCuboidShape(1, 1, 0, 2, 2, 1)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(3, 1, 15, 4, 17, 16),
            Block.makeCuboidShape(12, 1, 15, 13, 20, 16),
            Block.makeCuboidShape(2, 0, 15, 14, 1, 16),
            Block.makeCuboidShape(2.9507918888983973, 17.4984, 15, 12.950791888898397, 18.4984, 16),
            Block.makeCuboidShape(5.25, 0, 15, 5.75, 17, 16),
            Block.makeCuboidShape(7.5, 0, 15, 8.25, 18, 16),
            Block.makeCuboidShape(10.25, 0, 15, 10.75, 19, 16),
            Block.makeCuboidShape(1, 0, 14, 2, 1, 17),
            Block.makeCuboidShape(14, 0, 14, 15, 1, 17),
            Block.makeCuboidShape(14, 1, 15, 15, 2, 16),
            Block.makeCuboidShape(1, 1, 15, 2, 2, 16)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(15, 1, 3, 16, 17, 4),
            Block.makeCuboidShape(15, 1, 12, 16, 20, 13),
            Block.makeCuboidShape(15, 0, 2, 16, 1, 14),
            Block.makeCuboidShape(15, 17.382326504283995, 2.745823586137398, 16, 18.382326504283995, 12.745823586137398),
            Block.makeCuboidShape(15, 0, 5.5, 16, 17, 6),
            Block.makeCuboidShape(15, 0, 7.75, 16, 18, 8.5),
            Block.makeCuboidShape(15, 0, 10, 16, 19, 10.5),
            Block.makeCuboidShape(14, 0, 1, 17, 1, 2),
            Block.makeCuboidShape(14, 0, 14, 17, 1, 15),
            Block.makeCuboidShape(15, 1, 14, 16, 2, 15),
            Block.makeCuboidShape(15, 1, 1, 16, 2, 2)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(0, 1, 3, 1, 17, 4),
            Block.makeCuboidShape(0, 1, 12, 1, 20, 13),
            Block.makeCuboidShape(0, 0, 2, 1, 1, 14),
            Block.makeCuboidShape(0, 17.576789862848827, -0.27654309157820123, 1, 18.576789862848827, 9.723456908421799),
            Block.makeCuboidShape(0, 0, 5.5, 1, 17, 6),
            Block.makeCuboidShape(0, 0, 7.75, 1, 18, 8.5),
            Block.makeCuboidShape(0, 0, 10, 1, 19, 10.5),
            Block.makeCuboidShape(-1, 0, 1, 2, 1, 2),
            Block.makeCuboidShape(-1, 0, 14, 2, 1, 15),
            Block.makeCuboidShape(0, 1, 14, 1, 2, 15),
            Block.makeCuboidShape(0, 1, 1, 1, 2, 2)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();


    public JumpStandard(Properties properties) {
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