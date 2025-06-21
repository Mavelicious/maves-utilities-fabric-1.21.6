package com.mavesutilities.block.hangingleaves;

import com.mavesutilities.block.MavesHangingLeaves;
import com.mavesutilities.item.MavesItems;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;

public class MavesHangingLeavesHead extends MavesHangingLeaves {
    public static final MapCodec<MavesHangingLeavesHead> CODEC = createCodec(MavesHangingLeavesHead::new);

    public MavesHangingLeavesHead(Settings settings) {
        super(0.01F, settings);
    }

    @Override
    public MapCodec<? extends MavesHangingLeaves> getCodec() {
        return CODEC;
    }

    @Override
    protected ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state, boolean includeData) {
        return new ItemStack(MavesItems.BLACK_WIDOW_BERRIES);
    }

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return (Integer)state.get(AGE) < 3 || ((Integer)state.get(DISTANCE) == 7 && !(Boolean)state.get(PERSISTENT));
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!world.isClient) {
            BlockPos belowPos = pos.down();
            BlockState belowState = world.getBlockState(belowPos);
            if (belowState.isAir()) {
                int bodyCount = 0;
                BlockPos checkPos = pos;
                while (world.getBlockState(checkPos.down()).getBlock() instanceof MavesHangingLeavesBody) {
                    bodyCount++;
                    checkPos = checkPos.down();
                }
                if (bodyCount < 5) {
                    world.setBlockState(belowPos, this.getDefaultState());
                    world.setBlockState(pos, state.with(AGE, 0), Block.NOTIFY_LISTENERS);
                }
            }
        }
    }
}