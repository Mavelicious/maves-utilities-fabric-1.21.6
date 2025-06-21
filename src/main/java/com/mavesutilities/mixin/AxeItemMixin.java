package com.mavesutilities.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItems;
import net.minecraft.block.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.*;

@Mixin(AxeItem.class)
public class AxeItemMixin {
    private static final Map<Block, ItemStack> BARK_DROPS = new HashMap<>();

    static {
        BARK_DROPS.put(Blocks.STRIPPED_OAK_LOG, new ItemStack(MavesItems.OAK_BARK, 4));
        BARK_DROPS.put(Blocks.STRIPPED_DARK_OAK_LOG, new ItemStack(MavesItems.DARK_OAK_BARK, 4));
        BARK_DROPS.put(Blocks.STRIPPED_PALE_OAK_LOG, new ItemStack(MavesItems.PALE_OAK_BARK, 4));
        BARK_DROPS.put(Blocks.STRIPPED_ACACIA_LOG, new ItemStack(MavesItems.ACACIA_BARK, 4));
        BARK_DROPS.put(Blocks.STRIPPED_CHERRY_LOG, new ItemStack(MavesItems.CHERRY_BARK, 4));
        BARK_DROPS.put(Blocks.STRIPPED_BIRCH_LOG, new ItemStack(MavesItems.BIRCH_BARK, 4));
        BARK_DROPS.put(Blocks.STRIPPED_JUNGLE_LOG, new ItemStack(MavesItems.JUNGLE_BARK, 4));
        BARK_DROPS.put(Blocks.STRIPPED_SPRUCE_LOG, new ItemStack(MavesItems.SPRUCE_BARK, 4));
        BARK_DROPS.put(Blocks.STRIPPED_MANGROVE_LOG, new ItemStack(MavesItems.MANGROVE_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_APPLE_TREE_LOG, new ItemStack(MavesItems.APPLE_TREE_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_AZALEA_STEM, new ItemStack(MavesItems.AZALEA_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_CACAO_TREE_LOG, new ItemStack(MavesItems.CACAO_TREE_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_HANGING_BLACK_WIDOW_STEM, new ItemStack(MavesItems.HANGING_BLACK_WIDOW_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_RUBBER_LOG, new ItemStack(MavesItems.RUBBER_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_WILLOW_LOG, new ItemStack(MavesItems.WILLOW_BARK, 4));
        BARK_DROPS.put(Blocks.STRIPPED_CRIMSON_STEM, new ItemStack(MavesItems.CRIMSON_BARK, 4));
        BARK_DROPS.put(Blocks.STRIPPED_WARPED_STEM, new ItemStack(MavesItems.WARPED_BARK, 4));

        BARK_DROPS.put(Blocks.STRIPPED_OAK_WOOD, new ItemStack(MavesItems.OAK_BARK, 6));
        BARK_DROPS.put(Blocks.STRIPPED_DARK_OAK_WOOD, new ItemStack(MavesItems.DARK_OAK_BARK, 6));
        BARK_DROPS.put(Blocks.STRIPPED_PALE_OAK_WOOD, new ItemStack(MavesItems.PALE_OAK_BARK, 6));
        BARK_DROPS.put(Blocks.STRIPPED_ACACIA_WOOD, new ItemStack(MavesItems.ACACIA_BARK, 6));
        BARK_DROPS.put(Blocks.STRIPPED_CHERRY_WOOD, new ItemStack(MavesItems.CHERRY_BARK, 6));
        BARK_DROPS.put(Blocks.STRIPPED_BIRCH_WOOD, new ItemStack(MavesItems.BIRCH_BARK, 6));
        BARK_DROPS.put(Blocks.STRIPPED_JUNGLE_WOOD, new ItemStack(MavesItems.JUNGLE_BARK, 6));
        BARK_DROPS.put(Blocks.STRIPPED_SPRUCE_WOOD, new ItemStack(MavesItems.SPRUCE_BARK, 6));
        BARK_DROPS.put(Blocks.STRIPPED_MANGROVE_WOOD, new ItemStack(MavesItems.MANGROVE_BARK, 6));
        BARK_DROPS.put(MavesBlocks.STRIPPED_APPLE_TREE_WOOD, new ItemStack(MavesItems.APPLE_TREE_BARK, 6));
        BARK_DROPS.put(MavesBlocks.STRIPPED_AZALEA_WOOD, new ItemStack(MavesItems.AZALEA_BARK, 6));
        BARK_DROPS.put(MavesBlocks.STRIPPED_CACAO_TREE_WOOD, new ItemStack(MavesItems.CACAO_TREE_BARK, 6));
        BARK_DROPS.put(MavesBlocks.STRIPPED_RUBBER_WOOD, new ItemStack(MavesItems.RUBBER_BARK, 6));
        BARK_DROPS.put(MavesBlocks.STRIPPED_WILLOW_WOOD, new ItemStack(MavesItems.WILLOW_BARK, 6));
        BARK_DROPS.put(Blocks.STRIPPED_CRIMSON_HYPHAE, new ItemStack(MavesItems.CRIMSON_BARK, 6));
        BARK_DROPS.put(Blocks.STRIPPED_WARPED_HYPHAE, new ItemStack(MavesItems.WARPED_BARK, 6));

        BARK_DROPS.put(MavesBlocks.STRIPPED_OAK_BLOCK, new ItemStack(MavesItems.OAK_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_DARK_OAK_BLOCK, new ItemStack(MavesItems.DARK_OAK_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_PALE_OAK_BLOCK, new ItemStack(MavesItems.PALE_OAK_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_ACACIA_BLOCK, new ItemStack(MavesItems.ACACIA_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_CHERRY_BLOCK, new ItemStack(MavesItems.CHERRY_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_BIRCH_BLOCK, new ItemStack(MavesItems.BIRCH_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_JUNGLE_BLOCK, new ItemStack(MavesItems.JUNGLE_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_SPRUCE_BLOCK, new ItemStack(MavesItems.SPRUCE_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_MANGROVE_BLOCK, new ItemStack(MavesItems.MANGROVE_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_APPLE_TREE_BLOCK, new ItemStack(MavesItems.APPLE_TREE_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_AZALEA_BLOCK, new ItemStack(MavesItems.AZALEA_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_CACAO_TREE_BLOCK, new ItemStack(MavesItems.CACAO_TREE_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_RUBBER_BLOCK, new ItemStack(MavesItems.RUBBER_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_WILLOW_BLOCK, new ItemStack(MavesItems.WILLOW_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_CRIMSON_BLOCK, new ItemStack(MavesItems.CRIMSON_BARK, 4));
        BARK_DROPS.put(MavesBlocks.STRIPPED_WARPED_BLOCK, new ItemStack(MavesItems.WARPED_BARK, 4));
    }

    @Inject(method = "useOnBlock", at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/item/ItemUsageContext;getStack()Lnet/minecraft/item/ItemStack;"))
    void onUseOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir, @Local Optional<BlockState> optional) {
        if (context.getWorld() instanceof ClientWorld) {
            return;
        }
        optional.ifPresent(blockState -> {
            ItemStack barkStack = BARK_DROPS.get(blockState.getBlock());
            if (barkStack != null) {
                BlockPos pos = context.getBlockPos();
                context.getWorld().spawnEntity(new ItemEntity(context.getWorld(), pos.getX(), pos.getY(), pos.getZ(), barkStack.copy()));
            }
        });
    }
}