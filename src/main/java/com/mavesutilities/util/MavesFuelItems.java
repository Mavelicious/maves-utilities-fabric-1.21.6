package com.mavesutilities.util;

import com.mavesutilities.item.MavesItems;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;

public class MavesFuelItems {

    public static void registerMavesFuelItems() {
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(MavesItems.OAK_BARK, 20 * 15 / 2);
            builder.add(MavesItems.SPRUCE_BARK, 20 * 15 / 2);
            builder.add(MavesItems.BIRCH_BARK, 20 * 15 / 2);
            builder.add(MavesItems.JUNGLE_BARK, 20 * 15 / 2);
            builder.add(MavesItems.ACACIA_BARK, 20 * 15 / 2);
            builder.add(MavesItems.DARK_OAK_BARK, 20 * 15 / 2);
            builder.add(MavesItems.MANGROVE_BARK, 20 * 15 / 2);
            builder.add(MavesItems.CHERRY_BARK, 20 * 15 / 2);
            builder.add(MavesItems.PALE_OAK_BARK, 20 * 15 / 2);
            builder.add(MavesItems.APPLE_TREE_BARK, 20 * 15 / 2);
            builder.add(MavesItems.AZALEA_BARK, 20 * 15 / 2);
            builder.add(MavesItems.CACAO_TREE_BARK, 20 * 15 / 2);
            builder.add(MavesItems.HANGING_BLACK_WIDOW_BARK, 20 * 15 / 2);
            builder.add(MavesItems.RUBBER_BARK, 20 * 15 / 2);
            builder.add(MavesItems.WILLOW_BARK, 20 * 15 / 2);
            builder.add(MavesItems.CRIMSON_BARK, 20 * 15 / 2);
            builder.add(MavesItems.WARPED_BARK, 20 * 15 / 2);

            builder.add(MavesItems.OAK_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.SPRUCE_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.BIRCH_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.JUNGLE_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.ACACIA_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.DARK_OAK_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.MANGROVE_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.CHERRY_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.PALE_OAK_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.APPLE_TREE_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.AZALEA_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.CACAO_TREE_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.RUBBER_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.WILLOW_SLIVER, 20 * 30 / 2);

            builder.add(MavesItems.STRIPPED_OAK_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.STRIPPED_SPRUCE_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.STRIPPED_BIRCH_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.STRIPPED_JUNGLE_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.STRIPPED_ACACIA_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.STRIPPED_DARK_OAK_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.STRIPPED_MANGROVE_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.STRIPPED_CHERRY_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.STRIPPED_PALE_OAK_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.STRIPPED_APPLE_TREE_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.STRIPPED_AZALEA_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.STRIPPED_CACAO_TREE_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.STRIPPED_RUBBER_SLIVER, 20 * 30 / 2);
            builder.add(MavesItems.STRIPPED_WILLOW_SLIVER, 20 * 30 / 2);

            builder.add(MavesItems.SPRUCE_CONE, 200 / 4);
        });
    }
}
