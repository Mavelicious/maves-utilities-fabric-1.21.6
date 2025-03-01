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

import java.util.Optional;

@Mixin(AxeItem.class)
public class AxeItemMixin {
    @Inject(method = "useOnBlock", at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/item/ItemUsageContext;getStack()Lnet/minecraft/item/ItemStack;"))
    void onUseOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir, @Local Optional<BlockState> optional){
        if(context.getWorld() instanceof ClientWorld){
            return;
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_OAK_LOG) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.OAK_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_DARK_OAK_LOG) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.DARK_OAK_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_PALE_OAK_LOG) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.PALE_OAK_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_ACACIA_LOG) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.ACACIA_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_CHERRY_LOG) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.CHERRY_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_BIRCH_LOG) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.BIRCH_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_JUNGLE_LOG) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.JUNGLE_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.SPRUCE_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_MANGROVE_LOG) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.MANGROVE_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == MavesBlocks.STRIPPED_APPLE_TREE_LOG) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.APPLE_TREE_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == MavesBlocks.STRIPPED_AZALEA_STEM) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.AZALEA_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == MavesBlocks.STRIPPED_CACAO_TREE_LOG) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.CACAO_TREE_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == MavesBlocks.STRIPPED_RUBBER_LOG) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.RUBBER_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == MavesBlocks.STRIPPED_WILLOW_LOG) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.WILLOW_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_CRIMSON_STEM) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.CRIMSON_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_WARPED_STEM) {
            BlockPos pos = context.getBlockPos();
            int quantity = 4;
            ItemStack oakBarkStack = new ItemStack(MavesItems.WARPED_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_OAK_WOOD) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.OAK_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_DARK_OAK_WOOD) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.DARK_OAK_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_PALE_OAK_WOOD) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.PALE_OAK_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_ACACIA_WOOD) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.ACACIA_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_CHERRY_WOOD) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.CHERRY_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_BIRCH_WOOD) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.BIRCH_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_JUNGLE_WOOD) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.JUNGLE_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_SPRUCE_WOOD) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.SPRUCE_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_MANGROVE_WOOD) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.MANGROVE_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == MavesBlocks.STRIPPED_APPLE_TREE_WOOD) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.APPLE_TREE_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == MavesBlocks.STRIPPED_AZALEA_WOOD) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.AZALEA_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == MavesBlocks.STRIPPED_CACAO_TREE_WOOD) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.CACAO_TREE_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == MavesBlocks.STRIPPED_RUBBER_WOOD) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.RUBBER_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == MavesBlocks.STRIPPED_WILLOW_WOOD) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.WILLOW_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_CRIMSON_HYPHAE) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.CRIMSON_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }
        if(optional.isPresent() && optional.get().getBlock() == Blocks.STRIPPED_WARPED_HYPHAE) {
            BlockPos pos = context.getBlockPos();
            int quantity = 6;
            ItemStack oakBarkStack = new ItemStack(MavesItems.WARPED_BARK, quantity);
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(),
                    pos.getX(), pos.getY(), pos.getZ(), oakBarkStack));
        }

    }
}