package com.mavesutilities.world;

import com.mavesutilities.MavesUtilitiesMod;
import com.mavesutilities.block.MavesBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.foliage.SpruceFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.minecraft.world.gen.trunk.UpwardsBranchingTrunkPlacer;

public class MavesConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> APPLE_TREE_KEY = registerKey("apple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COCOA_TREE_KEY = registerKey("cocoa_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBBER_TREE_KEY = registerKey("rubber_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WILLOW_TREE_KEY = registerKey("willow_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, APPLE_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MavesBlocks.APPLE_TREE_LOG),
                new BendingTrunkPlacer(4,2,0,3, UniformIntProvider.create(1, 2)),
                new WeightedBlockStateProvider(
                        DataPool.<BlockState>builder().add(MavesBlocks.APPLE_TREE_LEAVES.getDefaultState(), 3)
                                .add(MavesBlocks.APPLE_TREE_LEAVES.getDefaultState(), 1)
                ),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)
                )
                        .dirtProvider(BlockStateProvider.of(Blocks.DIRT))
                        .build()
        );
        register(context, COCOA_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(MavesBlocks.COCOA_TREE_LOG),
                        new StraightTrunkPlacer(5, 2, 1),
                        BlockStateProvider.of(MavesBlocks.COCOA_TREE_LEAVES),
                        new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
                        new TwoLayersFeatureSize(2, 0, 2)
                )
                        .ignoreVines()
                        .build()
        );
        register(context, RUBBER_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(MavesBlocks.RUBBER_LOG),
                        new BendingTrunkPlacer(5,3,0,4, UniformIntProvider.create(1, 2)),
                        new WeightedBlockStateProvider(
                                DataPool.<BlockState>builder().add(MavesBlocks.RUBBER_LEAVES.getDefaultState(), 3)
                        ),
                        new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                        new TwoLayersFeatureSize(3, 0, 3)
                )
                        .dirtProvider(BlockStateProvider.of(Blocks.DIRT))
                        .build()
        );
        register(context, WILLOW_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(MavesBlocks.WILLOW_LOG),
                        new StraightTrunkPlacer(2, 1, 4),
                        BlockStateProvider.of(MavesBlocks.WILLOW_LEAVES),
                        new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(2, 0, 2)
                )
                        .build()
        );
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MavesUtilitiesMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
