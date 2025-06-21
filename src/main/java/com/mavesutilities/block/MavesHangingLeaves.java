package com.mavesutilities.block;

import com.mavesutilities.item.MavesItems;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
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

public class MavesHangingLeaves extends LeavesBlock implements Fertilizable {
    public static final IntProperty AGE = Properties.AGE_3;
    protected final float leafParticleChance;

    @Override
    public MapCodec<? extends LeavesBlock> getCodec() {
        return null;
    }

    public MavesHangingLeaves(float leafParticleChance, Settings settings) {
        super(leafParticleChance, settings);
        this.leafParticleChance = leafParticleChance;
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(AGE, 0)
                .with(DISTANCE, Integer.valueOf(7))
                .with(PERSISTENT, Boolean.valueOf(false))
                .with(WATERLOGGED, Boolean.valueOf(false)));
    }

    @Override
    protected void spawnLeafParticle(World world, BlockPos pos, Random random) {

    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE, DISTANCE, PERSISTENT, WATERLOGGED);
    }

    @Override
    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int i = (Integer) state.get(AGE);
        boolean bl = i == 3;

        return (!bl && stack.isOf(Items.BONE_MEAL)) ? ActionResult.PASS : super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return state.get(AGE) < 3;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        int newAge = Math.min(3, state.get(AGE) + 1);
        world.setBlockState(pos, state.with(AGE, newAge), Block.NOTIFY_LISTENERS);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int age = state.get(AGE);
        boolean isMature = age == 3;

        if (player.getStackInHand(hand).getItem() instanceof ShearsItem) {
            if (age < 1) {
                world.setBlockState(pos, state.with(AGE, 0), Block.NOTIFY_LISTENERS);
                return ActionResult.SUCCESS;
            }
        }

        if (isMature) {
            ItemStack dropStack = new ItemStack(MavesItems.BLACK_WIDOW_BERRIES, 1 + world.random.nextInt(2));
            dropStack(world, pos, dropStack);
            world.playSound(null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
            world.setBlockState(pos, state.with(AGE, 0), Block.NOTIFY_LISTENERS);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, state));
            return ActionResult.SUCCESS;
        } else {
            return super.onUse(state, world, pos, player, hit);
        }
    }
}