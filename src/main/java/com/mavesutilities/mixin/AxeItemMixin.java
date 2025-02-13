package com.mavesutilities.mixin;

import com.google.common.collect.ImmutableMap;
import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItems;
import com.mavesutilities.util.MavesTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(AxeItem.class)
public class AxeItemMixin {

    private static final ImmutableMap<Block, Item> BARKS = new ImmutableMap.Builder<Block, Item>()
            .put(Blocks.STRIPPED_ACACIA_LOG, MavesItems.ACACIA_BARK)
            .put(Blocks.STRIPPED_ACACIA_WOOD, MavesItems.ACACIA_BARK)
            .put(MavesBlocks.STRIPPED_APPLE_TREE_LOG, MavesItems.APPLE_TREE_BARK)
            .put(MavesBlocks.STRIPPED_APPLE_TREE_WOOD, MavesItems.APPLE_TREE_BARK)
            .put(MavesBlocks.STRIPPED_AZALEA_STEM, MavesItems.AZALEA_BARK)
            .put(MavesBlocks.STRIPPED_AZALEA_WOOD, MavesItems.AZALEA_BARK)
            .put(Blocks.STRIPPED_BIRCH_LOG, MavesItems.BIRCH_BARK)
            .put(Blocks.STRIPPED_BIRCH_WOOD, MavesItems.BIRCH_BARK)
            .put(Blocks.STRIPPED_CHERRY_LOG, MavesItems.CHERRY_BARK)
            .put(Blocks.STRIPPED_CHERRY_WOOD, MavesItems.CHERRY_BARK)
            .put(MavesBlocks.STRIPPED_COCOA_TREE_LOG, MavesItems.COCOA_TREE_BARK)
            .put(MavesBlocks.STRIPPED_COCOA_TREE_WOOD, MavesItems.COCOA_TREE_BARK)
            .put(Blocks.STRIPPED_CRIMSON_STEM, MavesItems.CRIMSON_BARK)
            .put(Blocks.STRIPPED_CRIMSON_HYPHAE, MavesItems.CRIMSON_BARK)
            .put(Blocks.STRIPPED_DARK_OAK_LOG, MavesItems.DARK_OAK_BARK)
            .put(Blocks.STRIPPED_DARK_OAK_WOOD, MavesItems.DARK_OAK_BARK)
            .put(Blocks.STRIPPED_JUNGLE_LOG, MavesItems.JUNGLE_BARK)
            .put(Blocks.STRIPPED_JUNGLE_WOOD, MavesItems.JUNGLE_BARK)
            .put(Blocks.STRIPPED_MANGROVE_LOG, MavesItems.MANGROVE_BARK)
            .put(Blocks.STRIPPED_MANGROVE_WOOD, MavesItems.MANGROVE_BARK)
            .put(Blocks.STRIPPED_OAK_LOG, MavesItems.OAK_BARK)
            .put(Blocks.STRIPPED_OAK_WOOD, MavesItems.OAK_BARK)
            .put(Blocks.STRIPPED_PALE_OAK_LOG, MavesItems.PALE_OAK_BARK)
            .put(Blocks.STRIPPED_PALE_OAK_WOOD, MavesItems.PALE_OAK_BARK)
            .put(MavesBlocks.STRIPPED_RUBBER_LOG, MavesItems.RUBBER_BARK)
            .put(MavesBlocks.STRIPPED_RUBBER_WOOD, MavesItems.RUBBER_BARK)
            .put(Blocks.STRIPPED_SPRUCE_LOG, MavesItems.SPRUCE_BARK)
            .put(Blocks.STRIPPED_SPRUCE_WOOD, MavesItems.SPRUCE_BARK)
            .put(Blocks.STRIPPED_WARPED_STEM, MavesItems.WARPED_BARK)
            .put(Blocks.STRIPPED_WARPED_HYPHAE, MavesItems.WARPED_BARK)
            .put(MavesBlocks.STRIPPED_WILLOW_LOG, MavesItems.WILLOW_BARK)
            .put(MavesBlocks.STRIPPED_WILLOW_WOOD, MavesItems.WILLOW_BARK)
            .build();

    @Inject(method = "tryStrip", at = @At(value = "RETURN", ordinal = 0), cancellable = true)
    private void beforeReturnOptional(World world, BlockPos pos, PlayerEntity player, BlockState state, CallbackInfoReturnable<Optional<BlockState>> cir) {

        Optional<BlockState> optional = cir.getReturnValue();

        if (optional.isPresent()) {
            if (!world.isClient) {
                Item item = BARKS.get(optional.get().getBlock());
                if (state.isIn(MavesTags.Blocks.BARK_LOGS)){
                    Block.dropStack(world, pos, new ItemStack(item, 4));
                }else if (state.isIn(MavesTags.Blocks.BARK_WOODS)){
                    Block.dropStack(world, pos, new ItemStack(item, 6));
                }
            }
        }
    }
}
