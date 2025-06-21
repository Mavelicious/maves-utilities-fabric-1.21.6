package com.mavesutilities.block.floweringleaves;

import com.mavesutilities.block.*;
import com.mavesutilities.item.MavesItems;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.*;
import net.minecraft.state.StateManager;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.*;
import net.minecraft.world.event.GameEvent;

public class MavesOakFloweringLeaves extends MavesFloweringLeaves {
    public static final MapCodec<MavesOakFloweringLeaves> CODEC = createCodec(MavesOakFloweringLeaves::new);

    public MavesOakFloweringLeaves(Settings settings) {
        super(0.01F, MavesItems.ACORN, Blocks.OAK_LEAVES, settings);
    }

    @Override
    public MapCodec<? extends MavesOakFloweringLeaves> getCodec() {
        return CODEC;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        int i = (Integer) state.get(AGE);
        boolean bl = i == 3;

        if (player.getStackInHand(Hand.MAIN_HAND).getItem() instanceof ShearsItem) {
            if (i < 1) {
                BlockState newState = Blocks.OAK_LEAVES.getDefaultState().with(DISTANCE, Integer.valueOf(7)).with(PERSISTENT, Boolean.valueOf(true)).with(WATERLOGGED, Boolean.valueOf(false));
                world.setBlockState(pos, newState, Block.NOTIFY_LISTENERS);
                return ActionResult.SUCCESS;
            }
        }

        if (i > 1) {
            ItemStack dropStack = new ItemStack(MavesItems.ACORN);
            dropStack.setCount(1 + world.random.nextInt(2) + (bl ? 1 : 0));
            dropStack(world, pos, dropStack);
            world.playSound(null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
            BlockState blockState = state.with(AGE, Integer.valueOf(0));
            world.setBlockState(pos, blockState, Block.NOTIFY_LISTENERS);
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
}