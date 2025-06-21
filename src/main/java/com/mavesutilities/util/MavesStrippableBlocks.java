package com.mavesutilities.util;

import com.mavesutilities.block.MavesBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class MavesStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(MavesBlocks.OAK_BLOCK, MavesBlocks.STRIPPED_OAK_BLOCK);
        StrippableBlockRegistry.register(MavesBlocks.SPRUCE_BLOCK, MavesBlocks.STRIPPED_SPRUCE_BLOCK);
        StrippableBlockRegistry.register(MavesBlocks.BIRCH_BLOCK, MavesBlocks.STRIPPED_BIRCH_BLOCK);
        StrippableBlockRegistry.register(MavesBlocks.JUNGLE_BLOCK, MavesBlocks.STRIPPED_JUNGLE_BLOCK);
        StrippableBlockRegistry.register(MavesBlocks.ACACIA_BLOCK, MavesBlocks.STRIPPED_ACACIA_BLOCK);
        StrippableBlockRegistry.register(MavesBlocks.DARK_OAK_BLOCK, MavesBlocks.STRIPPED_DARK_OAK_BLOCK);
        StrippableBlockRegistry.register(MavesBlocks.MANGROVE_BLOCK, MavesBlocks.STRIPPED_MANGROVE_BLOCK);
        StrippableBlockRegistry.register(MavesBlocks.CHERRY_BLOCK, MavesBlocks.STRIPPED_CHERRY_BLOCK);
        StrippableBlockRegistry.register(MavesBlocks.PALE_OAK_BLOCK, MavesBlocks.STRIPPED_PALE_OAK_BLOCK);
        StrippableBlockRegistry.register(MavesBlocks.CRIMSON_BLOCK, MavesBlocks.STRIPPED_CRIMSON_BLOCK);
        StrippableBlockRegistry.register(MavesBlocks.WARPED_BLOCK, MavesBlocks.STRIPPED_WARPED_BLOCK);

        StrippableBlockRegistry.register(MavesBlocks.APPLE_TREE_BLOCK, MavesBlocks.STRIPPED_APPLE_TREE_BLOCK);
        StrippableBlockRegistry.register(MavesBlocks.AZALEA_BLOCK, MavesBlocks.STRIPPED_AZALEA_BLOCK);
        StrippableBlockRegistry.register(MavesBlocks.CACAO_TREE_BLOCK, MavesBlocks.STRIPPED_CACAO_TREE_BLOCK);
        StrippableBlockRegistry.register(MavesBlocks.RUBBER_BLOCK, MavesBlocks.STRIPPED_RUBBER_BLOCK);
        StrippableBlockRegistry.register(MavesBlocks.WILLOW_BLOCK, MavesBlocks.STRIPPED_WILLOW_BLOCK);

        StrippableBlockRegistry.register(MavesBlocks.APPLE_TREE_LOG, MavesBlocks.STRIPPED_APPLE_TREE_LOG);
        StrippableBlockRegistry.register(MavesBlocks.APPLE_TREE_WOOD, MavesBlocks.STRIPPED_APPLE_TREE_WOOD);

        StrippableBlockRegistry.register(MavesBlocks.AZALEA_STEM, MavesBlocks.STRIPPED_AZALEA_STEM);
        StrippableBlockRegistry.register(MavesBlocks.AZALEA_WOOD, MavesBlocks.STRIPPED_AZALEA_WOOD);

        StrippableBlockRegistry.register(MavesBlocks.CACAO_TREE_LOG, MavesBlocks.STRIPPED_CACAO_TREE_LOG);
        StrippableBlockRegistry.register(MavesBlocks.CACAO_TREE_WOOD, MavesBlocks.STRIPPED_CACAO_TREE_WOOD);

        StrippableBlockRegistry.register(MavesBlocks.HANGING_BLACK_WIDOW_STEM, MavesBlocks.STRIPPED_HANGING_BLACK_WIDOW_STEM);

        StrippableBlockRegistry.register(MavesBlocks.RUBBER_LOG, MavesBlocks.STRIPPED_RUBBER_LOG);
        StrippableBlockRegistry.register(MavesBlocks.RUBBER_WOOD, MavesBlocks.STRIPPED_RUBBER_WOOD);

        StrippableBlockRegistry.register(MavesBlocks.WILLOW_LOG, MavesBlocks.STRIPPED_WILLOW_LOG);
        StrippableBlockRegistry.register(MavesBlocks.WILLOW_WOOD, MavesBlocks.STRIPPED_WILLOW_WOOD);
    }
}