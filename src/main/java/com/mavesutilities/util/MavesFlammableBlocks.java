package com.mavesutilities.util;

import com.mavesutilities.block.MavesBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class MavesFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(MavesBlocks.ACACIA_FLOWERING_LEAVES, 30, 60);
        registry.add(MavesBlocks.ACACIA_FLOWERED_LEAVES, 30, 60);
        registry.add(MavesBlocks.BIRCH_FLOWERING_LEAVES, 30, 60);
        registry.add(MavesBlocks.CHERRY_FLOWERING_LEAVES, 30, 60);
        registry.add(MavesBlocks.DARK_OAK_FLOWERING_LEAVES, 30, 60);
        registry.add(MavesBlocks.JUNGLE_FLOWERING_LEAVES, 30, 60);
        registry.add(MavesBlocks.OAK_FLOWERING_LEAVES, 30, 60);
        registry.add(MavesBlocks.PALE_OAK_FLOWERING_LEAVES, 30, 60);

        registry.add(MavesBlocks.OAK_BLOCK, 5,5);
        registry.add(MavesBlocks.STRIPPED_OAK_BLOCK, 5,5);
        registry.add(MavesBlocks.SPRUCE_BLOCK, 5,5);
        registry.add(MavesBlocks.STRIPPED_SPRUCE_BLOCK, 5,5);
        registry.add(MavesBlocks.BIRCH_BLOCK, 5,5);
        registry.add(MavesBlocks.STRIPPED_BIRCH_BLOCK, 5,5);
        registry.add(MavesBlocks.JUNGLE_BLOCK, 5,5);
        registry.add(MavesBlocks.STRIPPED_JUNGLE_BLOCK, 5,5);
        registry.add(MavesBlocks.ACACIA_BLOCK, 5,5);
        registry.add(MavesBlocks.STRIPPED_ACACIA_BLOCK, 5,5);
        registry.add(MavesBlocks.DARK_OAK_BLOCK, 5,5);
        registry.add(MavesBlocks.STRIPPED_DARK_OAK_BLOCK, 5,5);
        registry.add(MavesBlocks.MANGROVE_BLOCK, 5,5);
        registry.add(MavesBlocks.STRIPPED_MANGROVE_BLOCK, 5,5);
        registry.add(MavesBlocks.CHERRY_BLOCK, 5,5);
        registry.add(MavesBlocks.STRIPPED_CHERRY_BLOCK, 5,5);
        registry.add(MavesBlocks.PALE_OAK_BLOCK, 5,5);
        registry.add(MavesBlocks.STRIPPED_PALE_OAK_BLOCK, 5,5);

        registry.add(MavesBlocks.APPLE_TREE_BLOCK, 5,5);
        registry.add(MavesBlocks.STRIPPED_APPLE_TREE_BLOCK, 5,5);
        registry.add(MavesBlocks.AZALEA_BLOCK, 5,5);
        registry.add(MavesBlocks.STRIPPED_AZALEA_BLOCK, 5,5);
        registry.add(MavesBlocks.CACAO_TREE_BLOCK, 5,5);
        registry.add(MavesBlocks.STRIPPED_CACAO_TREE_BLOCK, 5,5);
        registry.add(MavesBlocks.RUBBER_BLOCK, 5,5);
        registry.add(MavesBlocks.STRIPPED_RUBBER_BLOCK, 5,5);
        registry.add(MavesBlocks.WILLOW_BLOCK, 5,5);
        registry.add(MavesBlocks.STRIPPED_WILLOW_BLOCK, 5,5);

        registry.add(MavesBlocks.APPLE_TREE_LOG, 5, 5);
        registry.add(MavesBlocks.APPLE_TREE_WOOD, 5, 5);
        registry.add(MavesBlocks.STRIPPED_APPLE_TREE_LOG, 5, 5);
        registry.add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD, 5, 5);
        registry.add(MavesBlocks.APPLE_TREE_LEAVES, 30, 60);
        registry.add(MavesBlocks.APPLE_TREE_FLOWERING_LEAVES, 30, 60);
        registry.add(MavesBlocks.APPLE_TREE_FLOWERED_LEAVES, 30, 60);

        registry.add(MavesBlocks.APPLE_TREE_PLANKS, 5, 20);
        registry.add(MavesBlocks.APPLE_TREE_FENCE, 5, 20);
        registry.add(MavesBlocks.APPLE_TREE_FENCE_GATE, 5, 20);
        registry.add(MavesBlocks.APPLE_TREE_SLAB, 5, 20);
        registry.add(MavesBlocks.APPLE_TREE_STAIRS, 5, 20);

        registry.add(MavesBlocks.AZALEA_STEM, 5, 5);
        registry.add(MavesBlocks.AZALEA_WOOD, 5, 5);
        registry.add(MavesBlocks.STRIPPED_AZALEA_STEM, 5, 5);
        registry.add(MavesBlocks.STRIPPED_AZALEA_WOOD, 5, 5);

        registry.add(MavesBlocks.AZALEA_PLANKS, 5, 20);
        registry.add(MavesBlocks.AZALEA_FENCE, 5, 20);
        registry.add(MavesBlocks.AZALEA_FENCE_GATE, 5, 20);
        registry.add(MavesBlocks.AZALEA_SLAB, 5, 20);
        registry.add(MavesBlocks.AZALEA_STAIRS, 5, 20);

        registry.add(MavesBlocks.CACAO_TREE_LOG, 5, 5);
        registry.add(MavesBlocks.CACAO_TREE_WOOD, 5, 5);
        registry.add(MavesBlocks.STRIPPED_CACAO_TREE_LOG, 5, 5);
        registry.add(MavesBlocks.STRIPPED_CACAO_TREE_WOOD, 5, 5);
        registry.add(MavesBlocks.CACAO_TREE_LEAVES, 30, 60);

        registry.add(MavesBlocks.CACAO_TREE_PLANKS, 5, 20);
        registry.add(MavesBlocks.CACAO_TREE_FENCE, 5, 20);
        registry.add(MavesBlocks.CACAO_TREE_FENCE_GATE, 5, 20);
        registry.add(MavesBlocks.CACAO_TREE_SLAB, 5, 20);
        registry.add(MavesBlocks.CACAO_TREE_STAIRS, 5, 20);

        registry.add(MavesBlocks.HANGING_BLACK_WIDOW_STEM, 5, 5);
        registry.add(MavesBlocks.STRIPPED_HANGING_BLACK_WIDOW_STEM, 5, 5);
        registry.add(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_BODY, 30, 60);
        registry.add(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_HEAD, 30, 60);
        registry.add(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_TAIL, 30, 60);

        registry.add(MavesBlocks.HANGING_BLACK_WIDOW_BLOCK, 5, 20);
        registry.add(MavesBlocks.HANGING_BLACK_WIDOW_PLANKS, 5, 20);
        registry.add(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC, 5, 20);
        registry.add(MavesBlocks.HANGING_BLACK_WIDOW_FENCE, 5, 20);
        registry.add(MavesBlocks.HANGING_BLACK_WIDOW_FENCE_GATE, 5, 20);
        registry.add(MavesBlocks.HANGING_BLACK_WIDOW_SLAB, 5, 20);
        registry.add(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC_SLAB, 5, 20);
        registry.add(MavesBlocks.HANGING_BLACK_WIDOW_STAIRS, 5, 20);
        registry.add(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC_STAIRS, 5, 20);

        registry.add(MavesBlocks.RUBBER_LOG, 5, 5);
        registry.add(MavesBlocks.RUBBER_WOOD, 5, 5);
        registry.add(MavesBlocks.STRIPPED_RUBBER_LOG, 5, 5);
        registry.add(MavesBlocks.STRIPPED_RUBBER_WOOD, 5, 5);
        registry.add(MavesBlocks.RUBBER_LEAVES, 30, 60);

        registry.add(MavesBlocks.RUBBER_PLANKS, 5, 20);
        registry.add(MavesBlocks.RUBBER_FENCE, 5, 20);
        registry.add(MavesBlocks.RUBBER_FENCE_GATE, 5, 20);
        registry.add(MavesBlocks.RUBBER_SLAB, 5, 20);
        registry.add(MavesBlocks.RUBBER_STAIRS, 5, 20);

        registry.add(MavesBlocks.WILLOW_LOG, 5, 5);
        registry.add(MavesBlocks.WILLOW_WOOD, 5, 5);
        registry.add(MavesBlocks.STRIPPED_WILLOW_LOG, 5, 5);
        registry.add(MavesBlocks.STRIPPED_WILLOW_WOOD, 5, 5);
        registry.add(MavesBlocks.WILLOW_LEAVES, 30, 60);

        registry.add(MavesBlocks.WILLOW_PLANKS, 5, 20);
        registry.add(MavesBlocks.WILLOW_FENCE, 5, 20);
        registry.add(MavesBlocks.WILLOW_FENCE_GATE, 5, 20);
        registry.add(MavesBlocks.WILLOW_SLAB, 5, 20);
        registry.add(MavesBlocks.WILLOW_STAIRS, 5, 20);
    }
}
