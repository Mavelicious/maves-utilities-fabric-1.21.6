package com.mavesutilities.block;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.*;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.*;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.*;
import net.minecraft.world.event.GameEvent;

public class MavesFloweringLeaves extends LeavesBlock implements Fertilizable {
    public static final int MAX_AGE = 3;
    public static final int MAX_DISTANCE = 7;
    public static final IntProperty DISTANCE = Properties.DISTANCE_1_7;
    public static final BooleanProperty PERSISTENT = Properties.PERSISTENT;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    private static final int field_31112 = 1;
    public static final IntProperty AGE = Properties.AGE_3;
    private final ItemStack fruitItem;
    private final Block shearedLeaves;

    public MavesFloweringLeaves(AbstractBlock.Settings settings, ItemStack fruitItem, Block shearedLeaves) {
        super(settings);
        this.fruitItem = fruitItem;
        this.shearedLeaves = shearedLeaves;
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(AGE, Integer.valueOf(3))
                .with(DISTANCE, Integer.valueOf(7))
                .with(PERSISTENT, Boolean.valueOf(false))
                .with(WATERLOGGED, Boolean.valueOf(false)));
    }

    @Override
    protected ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state, boolean includeData) {
        return fruitItem.copy();
    }

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return (Integer)state.get(AGE) < 3 || ((Integer)state.get(DISTANCE) == 7 && !(Boolean)state.get(PERSISTENT));
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int i = (Integer)state.get(AGE);
        if (i < 3 && random.nextInt(5) == 0 && world.getBaseLightLevel(pos.up(), 0) >= 9) {
            BlockState blockState = state.with(AGE, Integer.valueOf(i + 1));
            world.setBlockState(pos, blockState, Block.NOTIFY_LISTENERS);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(blockState));
        }
    }

    @Override
    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int i = (Integer) state.get(AGE);
        boolean bl = i == 3;

        return (!bl && stack.isOf(Items.BONE_MEAL)) ? ActionResult.PASS : super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        int i = (Integer) state.get(AGE);
        boolean bl = i == 3;

        if (player.getStackInHand(Hand.MAIN_HAND).getItem() instanceof ShearsItem) {
            BlockState newState = shearedLeaves.getDefaultState();
            world.setBlockState(pos, newState, Block.NOTIFY_LISTENERS);
            return ActionResult.SUCCESS;
        }

        if (i > 1) {
            int j = 1 + world.random.nextInt(2);
            ItemStack dropStack = fruitItem.copy();
            dropStack.setCount(j + (bl ? 1 : 0));
            dropStack(world, pos, dropStack);
            world.playSound(null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
            BlockState blockState = state.with(AGE, Integer.valueOf(1));
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));
            return ActionResult.SUCCESS;
        } else {
            return super.onUse(state, world, pos, player, hit);
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE, DISTANCE, PERSISTENT, WATERLOGGED);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return (Integer)state.get(AGE) < 3;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        int i = Math.min(3, (Integer)state.get(AGE) + 1);
        world.setBlockState(pos, state.with(AGE, Integer.valueOf(i)), Block.NOTIFY_LISTENERS);
    }
}