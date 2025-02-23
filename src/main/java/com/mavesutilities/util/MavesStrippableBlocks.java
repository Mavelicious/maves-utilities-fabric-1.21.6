package com.mavesutilities.util;

import com.mavesutilities.block.MavesBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class MavesStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(MavesBlocks.APPLE_TREE_LOG, MavesBlocks.STRIPPED_APPLE_TREE_LOG);
        StrippableBlockRegistry.register(MavesBlocks.APPLE_TREE_WOOD, MavesBlocks.STRIPPED_APPLE_TREE_WOOD);

        StrippableBlockRegistry.register(MavesBlocks.AZALEA_STEM, MavesBlocks.STRIPPED_AZALEA_STEM);
        StrippableBlockRegistry.register(MavesBlocks.AZALEA_WOOD, MavesBlocks.STRIPPED_AZALEA_WOOD);

        StrippableBlockRegistry.register(MavesBlocks.CACAO_TREE_LOG, MavesBlocks.STRIPPED_CACAO_TREE_LOG);
        StrippableBlockRegistry.register(MavesBlocks.CACAO_TREE_WOOD, MavesBlocks.STRIPPED_CACAO_TREE_WOOD);

        StrippableBlockRegistry.register(MavesBlocks.RUBBER_LOG, MavesBlocks.STRIPPED_RUBBER_LOG);
        StrippableBlockRegistry.register(MavesBlocks.RUBBER_WOOD, MavesBlocks.STRIPPED_RUBBER_WOOD);

        StrippableBlockRegistry.register(MavesBlocks.WILLOW_LOG, MavesBlocks.STRIPPED_WILLOW_LOG);
        StrippableBlockRegistry.register(MavesBlocks.WILLOW_WOOD, MavesBlocks.STRIPPED_WILLOW_WOOD);
    }
}