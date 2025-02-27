package com.mavesutilities.util;

import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItems;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;

public class MavesCompostableItems {

    public static void registerMavesCompostableItems() {
        CompostingChanceRegistry.INSTANCE.add(MavesItems.OAK_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.SPRUCE_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.BIRCH_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.JUNGLE_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.ACACIA_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.DARK_OAK_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.MANGROVE_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.CHERRY_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.PALE_OAK_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.APPLE_TREE_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.AZALEA_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.CACAO_TREE_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.RUBBER_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.WILLOW_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.CRIMSON_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.WARPED_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.ACORN, 0.5f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.DARK_ACORN, 0.5f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.PALE_ACORN, 0.5f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.ACACIA_POD, 0.5f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.SPRUCE_CONE, 0.5f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.GREEN_APPLE, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.PUMPKIN_SLICE, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.CHERRIES, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.WILD_BERRIES_BLUE, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.WILD_BERRIES_GREEN, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.WILD_BERRIES_YELLOW, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.ACACIA_BLOSSOM, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.APPLE_BLOSSOM, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.AZALEA_BLOSSOM, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.BIRCH_CATKINS, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.MILK_CHOCOLATE, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.WHITE_CHOCOLATE, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.DARK_CHOCOLATE, 0.65F);

        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.APPLE_TREE_LEAVES.asItem(), 0.3F);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.CACAO_TREE_LEAVES.asItem(), 0.3F);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.RUBBER_LEAVES.asItem(), 0.3F);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.WILLOW_LEAVES.asItem(), 0.3F);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.APPLE_TREE_SAPLING.asItem(), 0.3F);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.CACAO_TREE_SAPLING.asItem(), 0.3F);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.RUBBER_SAPLING.asItem(), 0.3F);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.WILLOW_SAPLING.asItem(), 0.3F);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.ACACIA_FLOWERING_LEAVES.asItem(), 0.5f);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.ACACIA_FLOWERED_LEAVES.asItem(), 0.5f);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.BIRCH_FLOWERING_LEAVES.asItem(), 0.5f);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.CHERRY_FLOWERING_LEAVES.asItem(), 0.5f);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.DARK_OAK_FLOWERING_LEAVES.asItem(), 0.5f);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.JUNGLE_FLOWERING_LEAVES.asItem(), 0.5f);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.OAK_FLOWERING_LEAVES.asItem(), 0.5f);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.PALE_OAK_FLOWERING_LEAVES.asItem(), 0.5f);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.APPLE_TREE_FLOWERING_LEAVES.asItem(), 0.5f);
        CompostingChanceRegistry.INSTANCE.add(MavesBlocks.APPLE_TREE_FLOWERED_LEAVES.asItem(), 0.5f);
    }
}
