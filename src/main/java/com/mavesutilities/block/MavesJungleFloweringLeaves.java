package com.mavesutilities.block;

import com.mavesutilities.item.MavesItems;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShearsItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class MavesJungleFloweringLeaves extends MavesFloweringLeaves {
    public static final MapCodec<MavesJungleFloweringLeaves> CODEC = createCodec(MavesJungleFloweringLeaves::new);

    public MavesJungleFloweringLeaves(Settings settings) {
        super(MavesItems.WILD_BERRIES_YELLOW, Blocks.JUNGLE_LEAVES, settings);
    }

    @Override
    public MapCodec<? extends MavesJungleFloweringLeaves> getCodec() {
        return CODEC;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        int i = (Integer) state.get(AGE);
        boolean bl = i == 3;

        if (player.getStackInHand(Hand.MAIN_HAND).getItem() instanceof ShearsItem) {
            if (i < 1) {
            BlockState newState = Blocks.JUNGLE_LEAVES.getDefaultState().with(DISTANCE, Integer.valueOf(7)).with(PERSISTENT, Boolean.valueOf(true)).with(WATERLOGGED, Boolean.valueOf(false));
            world.setBlockState(pos, newState, Block.NOTIFY_LISTENERS);
            return ActionResult.SUCCESS;
            }
        }

        if (i > 1) {
            ItemStack dropStack;
            float chance = world.random.nextFloat();
            if (chance < 0.5f) {
                dropStack = new ItemStack(MavesItems.WILD_BERRIES_GREEN);
            } else if (chance < 0.85f) {
                dropStack = new ItemStack(MavesItems.WILD_BERRIES_YELLOW);
            } else {
                dropStack = new ItemStack(MavesItems.WILD_BERRIES_BLUE);
            }
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
