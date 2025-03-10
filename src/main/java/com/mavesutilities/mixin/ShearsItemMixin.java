package com.mavesutilities.mixin;

import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItems;
import net.minecraft.block.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.*;

@Mixin(ShearsItem.class)
public class ShearsItemMixin {
    private static final Random RANDOM = new Random();
    private static final Map<Block, Block> LEAF_TRANSFORMATIONS = new HashMap<>();
    private static final Map<Block, ItemStack> BLOSSOM_DROPS = new HashMap<>();

    static {
        LEAF_TRANSFORMATIONS.put(MavesBlocks.ACACIA_FLOWERED_LEAVES, Blocks.ACACIA_LEAVES);
        LEAF_TRANSFORMATIONS.put(MavesBlocks.APPLE_TREE_FLOWERED_LEAVES, MavesBlocks.APPLE_TREE_LEAVES);
        LEAF_TRANSFORMATIONS.put(Blocks.FLOWERING_AZALEA_LEAVES, Blocks.AZALEA_LEAVES);

        BLOSSOM_DROPS.put(MavesBlocks.ACACIA_FLOWERED_LEAVES, new ItemStack(MavesItems.ACACIA_BLOSSOM));
        BLOSSOM_DROPS.put(MavesBlocks.APPLE_TREE_FLOWERED_LEAVES, new ItemStack(MavesItems.APPLE_BLOSSOM));
        BLOSSOM_DROPS.put(Blocks.FLOWERING_AZALEA_LEAVES, new ItemStack(MavesItems.AZALEA_BLOSSOM));
    }

    @Inject(method = "useOnBlock", at = @At("HEAD"), cancellable = true)
    private void onUseOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (LEAF_TRANSFORMATIONS.containsKey(block)) {
            PlayerEntity playerEntity = context.getPlayer();
            ItemStack itemStack = context.getStack();
            int dropCount = 2 + RANDOM.nextInt(4);

            if (!world.isClient) {
                ItemStack blossomStack = BLOSSOM_DROPS.get(block).copy();
                blossomStack.setCount(dropCount);
                world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), blossomStack));

                Block newBlock = LEAF_TRANSFORMATIONS.get(block);
                BlockState newState = newBlock.getDefaultState()
                        .with(LeavesBlock.DISTANCE, Integer.valueOf(7))
                        .with(LeavesBlock.PERSISTENT, Boolean.valueOf(false))
                        .with(LeavesBlock.WATERLOGGED, Boolean.valueOf(false));
                world.setBlockState(pos, newState, Block.NOTIFY_LISTENERS);

                world.playSound(null, pos, SoundEvents.BLOCK_GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);

                itemStack.damage(1, playerEntity, LivingEntity.getSlotForHand(context.getHand()));
            }

            cir.setReturnValue(ActionResult.SUCCESS);
        }
    }
}