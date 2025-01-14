package com.mavesutilities.world.tree;

import com.mavesutilities.MavesUtilitiesMod;
import com.mavesutilities.world.MavesConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class MavesSaplingGenerators {
    public static final SaplingGenerator APPLE_TREE = new SaplingGenerator(MavesUtilitiesMod.MOD_ID + ":apple_tree",
            Optional.empty(), Optional.of(MavesConfiguredFeatures.APPLE_TREE_KEY), Optional.empty());
    public static final SaplingGenerator COCOA_TREE = new SaplingGenerator(MavesUtilitiesMod.MOD_ID + ":cocoa_tree",
            Optional.empty(), Optional.of(MavesConfiguredFeatures.COCOA_TREE_KEY), Optional.empty());
    public static final SaplingGenerator RUBBER_TREE = new SaplingGenerator(MavesUtilitiesMod.MOD_ID + ":rubber_tree",
            Optional.empty(), Optional.of(MavesConfiguredFeatures.RUBBER_TREE_KEY), Optional.empty());
    public static final SaplingGenerator WILLOW_TREE = new SaplingGenerator(MavesUtilitiesMod.MOD_ID + ":willow_tree",
            Optional.empty(), Optional.of(MavesConfiguredFeatures.WILLOW_TREE_KEY), Optional.empty());
}