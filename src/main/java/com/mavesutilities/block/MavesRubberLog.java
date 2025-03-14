package com.mavesutilities.block;

import com.mavesutilities.item.MavesItems;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.*;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.*;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class MavesRubberLog extends PillarBlock {
    public static final MapCodec<MavesRubberLog> CODEC = createCodec(MavesRubberLog::new);
    public static final BooleanProperty COOLDOWN = BooleanProperty.of("cooldown");

    @Override
    public MapCodec<? extends MavesRubberLog> getCodec() {
        return CODEC;
    }

    public MavesRubberLog(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y).with(COOLDOWN, false));
    }

    public ActionResult onUseWithItem(ItemStack itemStack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (itemStack.isOf(Items.GLASS_BOTTLE) && !state.get(COOLDOWN)) {
            if (!world.isClient) {
                ItemStack filledBottle = new ItemStack(MavesItems.LATEX_BOTTLE);
                itemStack.decrement(1);
                if (itemStack.isEmpty()) {
                    player.setStackInHand(hand, filledBottle);
                } else if (!player.getInventory().insertStack(filledBottle)) {
                    player.dropItem(filledBottle, false);
                }

                world.setBlockState(pos, state.with(COOLDOWN, true));
                world.scheduleBlockTick(pos, this, 400);

                world.emitGameEvent(player, GameEvent.FLUID_PICKUP, pos);
                world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
            return ActionResult.SUCCESS;
        } else {
            return super.onUseWithItem(itemStack, state, world, pos, player, hand, hit);
        }
    }

    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (state.get(COOLDOWN)) {
            world.setBlockState(pos, state.with(COOLDOWN, false));
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AXIS, COOLDOWN);
    }
}