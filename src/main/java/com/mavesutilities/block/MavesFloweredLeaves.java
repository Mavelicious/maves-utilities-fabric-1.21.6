package com.mavesutilities.block;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.*;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MavesFloweredLeaves extends LeavesBlock {
    public static final int MAX_DISTANCE = 7;
    public static final IntProperty DISTANCE = Properties.DISTANCE_1_7;
    public static final BooleanProperty PERSISTENT = Properties.PERSISTENT;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    private static final int field_31112 = 1;
    private final Item flowerItem;
    private final Block shearedLeaves;

    public MavesFloweredLeaves(AbstractBlock.Settings settings, Item flowerItem, Block shearedLeaves) {
        super(settings);
        this.setDefaultState(
                this.stateManager.getDefaultState().with(DISTANCE, Integer.valueOf(7)).with(PERSISTENT, Boolean.valueOf(false)).with(WATERLOGGED, Boolean.valueOf(false)));

        this.flowerItem = flowerItem;
        this.shearedLeaves = shearedLeaves;
    }

    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            dropStack(world, pos, new ItemStack(flowerItem));

            BlockState newState = shearedLeaves.getDefaultState();
            world.setBlockState(pos, newState, Block.NOTIFY_LISTENERS);

            world.playSound(null, pos, SoundEvents.BLOCK_GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);

            return ActionResult.SUCCESS;
        } else {
            return super.onUse(state, world, pos, player, hit);
        }
    }
}
