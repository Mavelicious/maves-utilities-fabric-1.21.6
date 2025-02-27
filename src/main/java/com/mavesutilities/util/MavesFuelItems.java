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
            builder.add(MavesItems.RUBBER_BARK, 20 * 15 / 2);
            builder.add(MavesItems.WILLOW_BARK, 20 * 15 / 2);
            builder.add(MavesItems.CRIMSON_BARK, 20 * 15 / 2);
            builder.add(MavesItems.WARPED_BARK, 20 * 15 / 2);
            builder.add(MavesItems.ACACIA_POD, 200 / 4);
            builder.add(MavesItems.SPRUCE_CONE, 200 / 4);
        });
    }
}
