package com.mavesutilities.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.*;
import net.minecraft.util.math.*;
import net.minecraft.util.shape.*;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.util.function.BooleanBiFunction;

public class MavesHangingStem extends PillarBlock {
    public static final MapCodec<MavesHangingStem> CODEC = createCodec(MavesHangingStem::new);
    public static final EnumProperty<Direction> FACING = Properties.FACING;

    @Override
    public MapCodec<? extends MavesHangingStem> getCodec() {
        return CODEC;
    }

    public MavesHangingStem(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(AXIS, Direction.Axis.Y).with(FACING, Direction.DOWN));
    }

    public VoxelShape makeShape() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.combine(shape, VoxelShapes.cuboid(0.0625, 0, 0.0625, 0.9375, 0.125, 0.9375), BooleanBiFunction.OR);
        shape = VoxelShapes.combine(shape, VoxelShapes.cuboid(0.3125, 0.125, 0.3125, 0.6875, 0.75, 0.6875), BooleanBiFunction.OR);
        return shape;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return makeShape();
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AXIS, FACING);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction direction = ctx.getSide();
        BlockState blockState = this.getDefaultState().with(FACING, direction == Direction.DOWN ? Direction.DOWN : Direction.UP);
        return blockState.with(AXIS, direction.getAxis());
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return direction.getAxis().isVertical() ? state.with(FACING, direction) : state;
    }
}