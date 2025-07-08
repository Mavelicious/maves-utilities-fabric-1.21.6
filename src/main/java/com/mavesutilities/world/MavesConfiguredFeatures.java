package com.mavesutilities.world;

import com.google.common.collect.ImmutableList;
import com.mavesutilities.MavesUtilitiesMod;
import com.mavesutilities.block.MavesBlocks;
import net.minecraft.block.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.Pool;
import net.minecraft.util.math.intprovider.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.*;
import net.minecraft.world.gen.treedecorator.CocoaTreeDecorator;
import net.minecraft.world.gen.trunk.*;

public class MavesConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> APPLE_TREE_KEY = registerKey("apple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AZALEA_GIANT_BUSH_KEY = registerKey("azalea_giant_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CACAO_TREE_KEY = registerKey("cacao_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HANGING_BLACK_WIDOW_KEY = registerKey("hanging_black_widow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBBER_TREE_KEY = registerKey("rubber_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WILLOW_TREE_KEY = registerKey("willow_tree");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PALE_PUMPKIN_KEY = registerKey("pale_pumpkin");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, APPLE_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MavesBlocks.APPLE_TREE_LOG),
                new BendingTrunkPlacer(4,2,0,3, UniformIntProvider.create(1, 2)),
                new WeightedBlockStateProvider(
                        Pool.<BlockState>builder().add(MavesBlocks.APPLE_TREE_LEAVES.getDefaultState(), 3)
                                .add(MavesBlocks.APPLE_TREE_FLOWERING_LEAVES.getDefaultState(), 1)
                ),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)
                )
                .build()
        );
        register(context, AZALEA_GIANT_BUSH_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MavesBlocks.AZALEA_STEM),
                new StraightTrunkPlacer(1, 0, 0),
                new WeightedBlockStateProvider(
                        Pool.<BlockState>builder().add(Blocks.AZALEA_LEAVES.getDefaultState(), 3)
                                .add(Blocks.FLOWERING_AZALEA_LEAVES.getDefaultState(), 1)
                ),
                new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                new TwoLayersFeatureSize(0, 0, 0)
                )
                .build()
        );
        register(context, CACAO_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MavesBlocks.CACAO_TREE_LOG),
                new StraightTrunkPlacer(5, 2, 1),
                BlockStateProvider.of(MavesBlocks.CACAO_TREE_LEAVES),
                new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
                new TwoLayersFeatureSize(2, 0, 2)
                )
                .decorators(ImmutableList.of(new CocoaTreeDecorator(0.85F)))
                .ignoreVines()
                .build()
        );
        register(context, HANGING_BLACK_WIDOW_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(MavesBlocks.HANGING_BLACK_WIDOW_STEM),
                        new StraightTrunkPlacer(1, 0, 0),
                        BlockStateProvider.of(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_HEAD),
                        new RandomSpreadFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), ConstantIntProvider.create(1), 50),
                        new TwoLayersFeatureSize(1, 0, 1)
                )
                        .build()
        );
        register(context, RUBBER_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MavesBlocks.RUBBER_LOG),
                new BendingTrunkPlacer(5,3,0,4, UniformIntProvider.create(1, 2)),
                BlockStateProvider.of(MavesBlocks.RUBBER_LEAVES),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                new TwoLayersFeatureSize(3, 0, 3)
                )
                .build()
        );
        register(context, WILLOW_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MavesBlocks.WILLOW_LOG),
                new BendingTrunkPlacer(4,2,0,3, UniformIntProvider.create(1, 2)),
                BlockStateProvider.of(MavesBlocks.WILLOW_LEAVES),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)
                )
                .build()
        );

        register(context, PALE_PUMPKIN_KEY, Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(MavesBlocks.PALE_PUMPKIN))
        );
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MavesUtilitiesMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
