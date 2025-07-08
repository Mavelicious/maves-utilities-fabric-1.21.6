package com.mavesutilities.datagen;

import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.enchantment.*;
import net.minecraft.loot.entry.*;
import net.minecraft.loot.function.*;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.*;

import java.util.concurrent.CompletableFuture;

public class MavesLootTableProvider extends FabricBlockLootTableProvider {
    public MavesLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    private void addSliverDrop(Block block, Item sliverItem, RegistryWrapper.Impl<Enchantment> impl) {
        addDrop(block, b -> dropsWithSilkTouch(b,
                (LootPoolEntry.Builder<?>) applyExplosionDecay(
                        b,
                        ItemEntry.builder(sliverItem)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0F, 4.0F)))
                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);

        addDrop(MavesBlocks.OAK_BLOCK);
        addDrop(MavesBlocks.STRIPPED_OAK_BLOCK);
        addDrop(MavesBlocks.SPRUCE_BLOCK);
        addDrop(MavesBlocks.STRIPPED_SPRUCE_BLOCK);
        addDrop(MavesBlocks.BIRCH_BLOCK);
        addDrop(MavesBlocks.STRIPPED_BIRCH_BLOCK);
        addDrop(MavesBlocks.JUNGLE_BLOCK);
        addDrop(MavesBlocks.STRIPPED_JUNGLE_BLOCK);
        addDrop(MavesBlocks.ACACIA_BLOCK);
        addDrop(MavesBlocks.STRIPPED_ACACIA_BLOCK);
        addDrop(MavesBlocks.DARK_OAK_BLOCK);
        addDrop(MavesBlocks.STRIPPED_DARK_OAK_BLOCK);
        addDrop(MavesBlocks.MANGROVE_BLOCK);
        addDrop(MavesBlocks.STRIPPED_MANGROVE_BLOCK);
        addDrop(MavesBlocks.CHERRY_BLOCK);
        addDrop(MavesBlocks.STRIPPED_CHERRY_BLOCK);
        addDrop(MavesBlocks.PALE_OAK_BLOCK);
        addDrop(MavesBlocks.STRIPPED_PALE_OAK_BLOCK);
        addDrop(MavesBlocks.CRIMSON_BLOCK);
        addDrop(MavesBlocks.STRIPPED_CRIMSON_BLOCK);
        addDrop(MavesBlocks.WARPED_BLOCK);
        addDrop(MavesBlocks.STRIPPED_WARPED_BLOCK);

        addSliverDrop(Blocks.OAK_LOG, MavesItems.OAK_SLIVER, impl);
        addSliverDrop(Blocks.STRIPPED_OAK_LOG, MavesItems.OAK_SLIVER, impl);
        addSliverDrop(Blocks.SPRUCE_LOG, MavesItems.SPRUCE_SLIVER, impl);
        addSliverDrop(Blocks.STRIPPED_SPRUCE_LOG, MavesItems.SPRUCE_SLIVER, impl);
        addSliverDrop(Blocks.BIRCH_LOG, MavesItems.BIRCH_SLIVER, impl);
        addSliverDrop(Blocks.STRIPPED_BIRCH_LOG, MavesItems.BIRCH_SLIVER, impl);
        addSliverDrop(Blocks.JUNGLE_LOG, MavesItems.JUNGLE_SLIVER, impl);
        addSliverDrop(Blocks.STRIPPED_JUNGLE_LOG, MavesItems.JUNGLE_SLIVER, impl);
        addSliverDrop(Blocks.ACACIA_LOG, MavesItems.ACACIA_SLIVER, impl);
        addSliverDrop(Blocks.STRIPPED_ACACIA_LOG, MavesItems.ACACIA_SLIVER, impl);
        addSliverDrop(Blocks.DARK_OAK_LOG, MavesItems.DARK_OAK_SLIVER, impl);
        addSliverDrop(Blocks.STRIPPED_DARK_OAK_LOG, MavesItems.DARK_OAK_SLIVER, impl);
        addSliverDrop(Blocks.MANGROVE_LOG, MavesItems.MANGROVE_SLIVER, impl);
        addSliverDrop(Blocks.STRIPPED_MANGROVE_LOG, MavesItems.MANGROVE_SLIVER, impl);
        addSliverDrop(Blocks.CHERRY_LOG, MavesItems.CHERRY_SLIVER, impl);
        addSliverDrop(Blocks.STRIPPED_CHERRY_LOG, MavesItems.CHERRY_SLIVER, impl);
        addSliverDrop(Blocks.PALE_OAK_LOG, MavesItems.PALE_OAK_SLIVER, impl);
        addSliverDrop(Blocks.STRIPPED_PALE_OAK_LOG, MavesItems.PALE_OAK_SLIVER, impl);
        addSliverDrop(Blocks.CRIMSON_STEM, MavesItems.CRIMSON_SLIVER, impl);
        addSliverDrop(Blocks.STRIPPED_CRIMSON_STEM, MavesItems.CRIMSON_SLIVER, impl);
        addSliverDrop(Blocks.WARPED_STEM, MavesItems.WARPED_SLIVER, impl);
        addSliverDrop(Blocks.STRIPPED_WARPED_STEM, MavesItems.WARPED_SLIVER, impl);

        addDrop(MavesBlocks.APPLE_TREE_BLOCK);
        addSliverDrop(MavesBlocks.APPLE_TREE_LOG, MavesItems.APPLE_TREE_SLIVER, impl);
        addDrop(MavesBlocks.APPLE_TREE_WOOD);
        addDrop(MavesBlocks.STRIPPED_APPLE_TREE_BLOCK);
        addSliverDrop(MavesBlocks.STRIPPED_APPLE_TREE_LOG, MavesItems.APPLE_TREE_SLIVER, impl);
        addDrop(MavesBlocks.STRIPPED_APPLE_TREE_WOOD);
        addDrop(MavesBlocks.APPLE_TREE_SAPLING);
        addPottedPlantDrops(MavesBlocks.POTTED_APPLE_TREE_SAPLING);
        addDrop(MavesBlocks.APPLE_TREE_PLANKS);
        addDrop(MavesBlocks.APPLE_TREE_BUTTON);
        addDrop(MavesBlocks.APPLE_TREE_DOOR, doorDrops(MavesBlocks.APPLE_TREE_DOOR));
        addDrop(MavesBlocks.APPLE_TREE_FENCE);
        addDrop(MavesBlocks.APPLE_TREE_FENCE_GATE);
        addDrop(MavesBlocks.APPLE_TREE_HANGING_SIGN);
        addDrop(MavesBlocks.APPLE_TREE_PRESSURE_PLATE);
        addDrop(MavesBlocks.APPLE_TREE_SIGN);
        addDrop(MavesBlocks.APPLE_TREE_SLAB, slabDrops(MavesBlocks.APPLE_TREE_SLAB));
        addDrop(MavesBlocks.APPLE_TREE_STAIRS);
        addDrop(MavesBlocks.APPLE_TREE_TRAPDOOR);

        addDrop(MavesBlocks.AZALEA_BLOCK);
        addSliverDrop(MavesBlocks.AZALEA_STEM, MavesItems.AZALEA_SLIVER, impl);
        addDrop(MavesBlocks.AZALEA_WOOD);
        addDrop(MavesBlocks.STRIPPED_AZALEA_BLOCK);
        addSliverDrop(MavesBlocks.STRIPPED_AZALEA_STEM, MavesItems.AZALEA_SLIVER, impl);
        addDrop(MavesBlocks.STRIPPED_AZALEA_WOOD);
        addDrop(MavesBlocks.AZALEA_PLANKS);
        addDrop(MavesBlocks.AZALEA_BUTTON);
        addDrop(MavesBlocks.AZALEA_DOOR, doorDrops(MavesBlocks.AZALEA_DOOR));
        addDrop(MavesBlocks.AZALEA_FENCE);
        addDrop(MavesBlocks.AZALEA_FENCE_GATE);
        addDrop(MavesBlocks.AZALEA_HANGING_SIGN);
        addDrop(MavesBlocks.AZALEA_PRESSURE_PLATE);
        addDrop(MavesBlocks.AZALEA_SIGN);
        addDrop(MavesBlocks.AZALEA_SLAB, slabDrops(MavesBlocks.AZALEA_SLAB));
        addDrop(MavesBlocks.AZALEA_STAIRS);
        addDrop(MavesBlocks.AZALEA_TRAPDOOR);

        addDrop(MavesBlocks.CACAO_TREE_BLOCK);
        addSliverDrop(MavesBlocks.CACAO_TREE_LOG, MavesItems.CACAO_TREE_SLIVER, impl);
        addDrop(MavesBlocks.CACAO_TREE_WOOD);
        addDrop(MavesBlocks.STRIPPED_CACAO_TREE_BLOCK);
        addSliverDrop(MavesBlocks.STRIPPED_CACAO_TREE_LOG, MavesItems.CACAO_TREE_SLIVER, impl);
        addDrop(MavesBlocks.STRIPPED_CACAO_TREE_WOOD);
        addDrop(MavesBlocks.CACAO_TREE_SAPLING);
        addPottedPlantDrops(MavesBlocks.POTTED_CACAO_TREE_SAPLING);
        addDrop(MavesBlocks.CACAO_TREE_PLANKS);
        addDrop(MavesBlocks.CACAO_TREE_BUTTON);
        addDrop(MavesBlocks.CACAO_TREE_DOOR, doorDrops(MavesBlocks.CACAO_TREE_DOOR));
        addDrop(MavesBlocks.CACAO_TREE_FENCE);
        addDrop(MavesBlocks.CACAO_TREE_FENCE_GATE);
        addDrop(MavesBlocks.CACAO_TREE_HANGING_SIGN);
        addDrop(MavesBlocks.CACAO_TREE_PRESSURE_PLATE);
        addDrop(MavesBlocks.CACAO_TREE_SIGN);
        addDrop(MavesBlocks.CACAO_TREE_SLAB, slabDrops(MavesBlocks.CACAO_TREE_SLAB));
        addDrop(MavesBlocks.CACAO_TREE_STAIRS);
        addDrop(MavesBlocks.CACAO_TREE_TRAPDOOR);

        addSliverDrop(MavesBlocks.HANGING_BLACK_WIDOW_STEM, MavesItems.HANGING_BLACK_WIDOW_BRANCH, impl);
        addSliverDrop(MavesBlocks.STRIPPED_HANGING_BLACK_WIDOW_STEM, MavesItems.HANGING_BLACK_WIDOW_BRANCH, impl);
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_SAPLING);
        addPottedPlantDrops(MavesBlocks.POTTED_HANGING_BLACK_WIDOW_SAPLING);
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_BLOCK);
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_PLANKS);
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC);
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_BUTTON);
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_DOOR, doorDrops(MavesBlocks.HANGING_BLACK_WIDOW_DOOR));
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_FENCE);
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_FENCE_GATE);
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_HANGING_SIGN);
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_PRESSURE_PLATE);
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_SIGN);
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_SLAB, slabDrops(MavesBlocks.HANGING_BLACK_WIDOW_SLAB));
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC_SLAB, slabDrops(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC_SLAB));
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_STAIRS);
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC_STAIRS);
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_TRAPDOOR);


        addDrop(MavesBlocks.RUBBER_BLOCK);
        addSliverDrop(MavesBlocks.RUBBER_LOG, MavesItems.RUBBER_SLIVER, impl);
        addDrop(MavesBlocks.RUBBER_WOOD);
        addDrop(MavesBlocks.STRIPPED_RUBBER_BLOCK);
        addSliverDrop(MavesBlocks.STRIPPED_RUBBER_LOG, MavesItems.RUBBER_SLIVER, impl);
        addDrop(MavesBlocks.STRIPPED_RUBBER_WOOD);
        addDrop(MavesBlocks.RUBBER_SAPLING);
        addPottedPlantDrops(MavesBlocks.POTTED_RUBBER_SAPLING);
        addDrop(MavesBlocks.RUBBER_PLANKS);
        addDrop(MavesBlocks.RUBBER_BUTTON);
        addDrop(MavesBlocks.RUBBER_DOOR, doorDrops(MavesBlocks.RUBBER_DOOR));
        addDrop(MavesBlocks.RUBBER_FENCE);
        addDrop(MavesBlocks.RUBBER_FENCE_GATE);
        addDrop(MavesBlocks.RUBBER_HANGING_SIGN);
        addDrop(MavesBlocks.RUBBER_PRESSURE_PLATE);
        addDrop(MavesBlocks.RUBBER_SIGN);
        addDrop(MavesBlocks.RUBBER_SLAB, slabDrops(MavesBlocks.RUBBER_SLAB));
        addDrop(MavesBlocks.RUBBER_STAIRS);
        addDrop(MavesBlocks.RUBBER_TRAPDOOR);

        addDrop(MavesBlocks.WILLOW_BLOCK);
        addSliverDrop(MavesBlocks.WILLOW_LOG, MavesItems.WILLOW_SLIVER, impl);
        addDrop(MavesBlocks.WILLOW_WOOD);
        addDrop(MavesBlocks.STRIPPED_WILLOW_BLOCK);
        addSliverDrop(MavesBlocks.STRIPPED_WILLOW_LOG, MavesItems.WILLOW_SLIVER, impl);
        addDrop(MavesBlocks.STRIPPED_WILLOW_WOOD);
        addDrop(MavesBlocks.WILLOW_SAPLING);
        addPottedPlantDrops(MavesBlocks.POTTED_WILLOW_SAPLING);
        addDrop(MavesBlocks.WILLOW_PLANKS);
        addDrop(MavesBlocks.WILLOW_BUTTON);
        addDrop(MavesBlocks.WILLOW_DOOR, doorDrops(MavesBlocks.WILLOW_DOOR));
        addDrop(MavesBlocks.WILLOW_FENCE);
        addDrop(MavesBlocks.WILLOW_FENCE_GATE);
        addDrop(MavesBlocks.WILLOW_HANGING_SIGN);
        addDrop(MavesBlocks.WILLOW_PRESSURE_PLATE);
        addDrop(MavesBlocks.WILLOW_SIGN);
        addDrop(MavesBlocks.WILLOW_SLAB, slabDrops(MavesBlocks.WILLOW_SLAB));
        addDrop(MavesBlocks.WILLOW_STAIRS);
        addDrop(MavesBlocks.WILLOW_TRAPDOOR);

        addDrop(Blocks.PUMPKIN, block -> dropsWithSilkTouch(block,
                (LootPoolEntry.Builder<?>)applyExplosionDecay(block,
                        ItemEntry.builder(MavesItems.PUMPKIN_SLICE)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(5.0F, 9.0F)))
                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));
        addDrop(MavesBlocks.PALE_PUMPKIN, block -> dropsWithSilkTouch(block,
                        (LootPoolEntry.Builder<?>)applyExplosionDecay(block,
                                ItemEntry.builder(MavesItems.PALE_PUMPKIN_SLICE)
                                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(5.0F, 9.0F)))
                                        .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));
        addDrop(MavesBlocks.CARVED_PALE_PUMPKIN);
        addDrop(MavesBlocks.PALE_JACK_O_LANTERN);
        addDrop(MavesBlocks.PALE_PUMPKIN_STEM, block ->
                cropStemDrops(block, MavesItems.PALE_PUMPKIN_SEEDS));
        addDrop(MavesBlocks.ATTACHED_PALE_PUMPKIN_STEM, block ->
                attachedCropStemDrops(block, MavesItems.PALE_PUMPKIN_SEEDS));

        addDrop(MavesBlocks.ACACIA_FLOWERED_LEAVES, leavesDrops(MavesBlocks.ACACIA_FLOWERED_LEAVES,
                Blocks.ACACIA_SAPLING, 0.0625f));
        addDrop(MavesBlocks.CHERRY_FLOWERING_LEAVES, leavesDrops(MavesBlocks.CHERRY_FLOWERING_LEAVES,
                Blocks.CHERRY_SAPLING, 0.0625f));
        addDrop(MavesBlocks.DARK_OAK_FLOWERING_LEAVES, leavesDrops(MavesBlocks.DARK_OAK_FLOWERING_LEAVES,
                Blocks.DARK_OAK_SAPLING, 0.0625f));
        addDrop(MavesBlocks.JUNGLE_FLOWERING_LEAVES, leavesDrops(MavesBlocks.JUNGLE_FLOWERING_LEAVES,
                Blocks.JUNGLE_SAPLING, 0.0625f));
        addDrop(MavesBlocks.OAK_FLOWERING_LEAVES, leavesDrops(MavesBlocks.OAK_FLOWERING_LEAVES,
                Blocks.OAK_SAPLING, 0.0625f));
        addDrop(MavesBlocks.PALE_OAK_FLOWERING_LEAVES, leavesDrops(MavesBlocks.PALE_OAK_FLOWERING_LEAVES,
                Blocks.PALE_OAK_SAPLING, 0.0625f));

        addDrop(MavesBlocks.APPLE_TREE_LEAVES, leavesDrops(MavesBlocks.APPLE_TREE_LEAVES,
                MavesBlocks.APPLE_TREE_SAPLING, 0.0625f));
        addDrop(MavesBlocks.APPLE_TREE_FLOWERING_LEAVES, leavesDrops(MavesBlocks.APPLE_TREE_FLOWERING_LEAVES,
                MavesBlocks.APPLE_TREE_SAPLING, 0.0625f));
        addDrop(MavesBlocks.APPLE_TREE_FLOWERED_LEAVES, leavesDrops(MavesBlocks.APPLE_TREE_FLOWERED_LEAVES,
                MavesBlocks.APPLE_TREE_SAPLING, 0.0625f));
        addDrop(MavesBlocks.CACAO_TREE_LEAVES, leavesDrops(MavesBlocks.CACAO_TREE_LEAVES,
                MavesBlocks.CACAO_TREE_SAPLING, 0.0625f));
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_TAIL, leavesDrops(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_TAIL,
                MavesBlocks.HANGING_BLACK_WIDOW_SAPLING, 0.0625f));
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_BODY, leavesDrops(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_BODY,
                MavesBlocks.HANGING_BLACK_WIDOW_SAPLING, 0.0625f));
        addDrop(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_HEAD, leavesDrops(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_HEAD,
                MavesBlocks.HANGING_BLACK_WIDOW_SAPLING, 0.0625f));
        addDrop(MavesBlocks.RUBBER_LEAVES, leavesDrops(MavesBlocks.RUBBER_LEAVES,
                MavesBlocks.RUBBER_SAPLING, 0.0625f));
        addDrop(MavesBlocks.WILLOW_LEAVES, leavesDrops(MavesBlocks.WILLOW_LEAVES,
                MavesBlocks.WILLOW_SAPLING, 0.0625f));

    }
}
