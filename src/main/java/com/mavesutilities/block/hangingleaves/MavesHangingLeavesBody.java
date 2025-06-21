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

public class MavesHangingLeavesBody extends MavesHangingLeaves{
    public static final MapCodec<MavesHangingLeavesBody> CODEC = createCodec(MavesHangingLeavesBody::new);

    public MavesHangingLeavesBody(Settings settings) {
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
        if (!world.isClient && state.get(AGE) < 3 && random.nextInt(5) == 0) {
            world.setBlockState(pos, state.with(AGE, state.get(AGE) + 1), Block.NOTIFY_LISTENERS);
        }
    }
}