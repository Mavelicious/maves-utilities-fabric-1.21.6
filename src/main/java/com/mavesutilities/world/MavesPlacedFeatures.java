package com.mavesutilities.world;

import com.mavesutilities.MavesUtilitiesMod;
import com.mavesutilities.block.MavesBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class MavesPlacedFeatures {

    public static final RegistryKey<PlacedFeature> APPLE_TREE_FOREST_PLACED_KEY = registerKey("apple_tree_forest_placed");
    public static final RegistryKey<PlacedFeature> AZALEA_GIANT_BUSH_FOREST_PLACED_KEY = registerKey("azalea_giant_bush_forest_placed");
    public static final RegistryKey<PlacedFeature> WILLOW_FOREST_PLACED_KEY = registerKey("willow_forest_placed");
    public static final RegistryKey<PlacedFeature> APPLE_TREE_PLAINS_PLACED_KEY = registerKey("apple_tree_plains_placed");
    public static final RegistryKey<PlacedFeature> WILLOW_PLAINS_PLACED_KEY = registerKey("willow_plains_placed");
    public static final RegistryKey<PlacedFeature> APPLE_TREE_FLOWER_FOREST_PLACED_KEY = registerKey("apple_tree_flower_forest_placed");
    public static final RegistryKey<PlacedFeature> AZALEA_GIANT_BUSH_FLOWER_FOREST_PLACED_KEY = registerKey("azalea_giant_bush_flower_forest_placed");
    public static final RegistryKey<PlacedFeature> WILLOW_FLOWER_FOREST_PLACED_KEY = registerKey("willow_flower_forest_placed");
    public static final RegistryKey<PlacedFeature> AZALEA_GIANT_BUSH_MEADOW_PLACED_KEY = registerKey("azalea_giant_bush_meadow_placed");
    public static final RegistryKey<PlacedFeature> WILLOW_MEADOW_PLACED_KEY = registerKey("willow_meadow_placed");
    public static final RegistryKey<PlacedFeature> CACAO_TREE_JUNGLE_PLACED_KEY = registerKey("cacao_tree_jungle_placed");
    public static final RegistryKey<PlacedFeature> RUBBER_JUNGLE_PLACED_KEY = registerKey("rubber_jungle_placed");
    public static final RegistryKey<PlacedFeature> CACAO_TREE_SPARSE_JUNGLE_PLACED_KEY = registerKey("cacao_tree_sparse_jungle_placed");
    public static final RegistryKey<PlacedFeature> RUBBER_SPARSE_JUNGLE_PLACED_KEY = registerKey("rubber_sparse_jungle_placed");
    public static final RegistryKey<PlacedFeature> CACAO_TREE_BAMBOO_JUNGLE_PLACED_KEY = registerKey("cacao_tree_bamboo_jungle_placed");
    public static final RegistryKey<PlacedFeature> RUBBER_BAMBOO_JUNGLE_PLACED_KEY = registerKey("rubber_bamboo_jungle_placed");
    public static final RegistryKey<PlacedFeature> RUBBER_SAVANNA_PLACED_KEY = registerKey("rubber_savanna_placed");
    public static final RegistryKey<PlacedFeature> RUBBER_WINDSWEPT_SAVANNA_PLACED_KEY = registerKey("rubber_windswept_savanna_placed");
    public static final RegistryKey<PlacedFeature> RUBBER_BADLANDS_PLACED_KEY = registerKey("rubber_badlands_placed");
    public static final RegistryKey<PlacedFeature> WILLOW_GROVE_PLACED_KEY = registerKey("willow_grove_placed");
    public static final RegistryKey<PlacedFeature> WILLOW_WINDSWEPT_PLACED_KEY = registerKey("willow_windswept_placed");
    public static final RegistryKey<PlacedFeature> WILLOW_RIVER_PLACED_KEY = registerKey("willow_river_placed");

    public static final RegistryKey<PlacedFeature> PALE_PUMPKIN_PLACED_KEY = registerKey("pale_pumpkin_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntry<ConfiguredFeature<?, ?>> palePumpkinConfiguredFeature = registryEntryLookup.getOrThrow(MavesConfiguredFeatures.PALE_PUMPKIN_KEY);

        register(context, APPLE_TREE_FOREST_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.APPLE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(4, 0.1F, 1),
                        MavesBlocks.APPLE_TREE_SAPLING));
        register(context, AZALEA_GIANT_BUSH_FOREST_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.AZALEA_GIANT_BUSH_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1F, 1),
                        Blocks.AZALEA));
        register(context, WILLOW_FOREST_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.WILLOW_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(4, 0.1F, 1),
                        MavesBlocks.WILLOW_SAPLING));

        register(context, APPLE_TREE_PLAINS_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.APPLE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.05F, 1),
                        MavesBlocks.APPLE_TREE_SAPLING));
        register(context, WILLOW_PLAINS_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.WILLOW_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.05F, 1),
                        MavesBlocks.WILLOW_SAPLING));

        register(context, APPLE_TREE_FLOWER_FOREST_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.APPLE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(6, 0.1F, 1),
                        MavesBlocks.APPLE_TREE_SAPLING));
        register(context, AZALEA_GIANT_BUSH_FLOWER_FOREST_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.AZALEA_GIANT_BUSH_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1F, 1),
                        Blocks.AZALEA));
        register(context, WILLOW_FLOWER_FOREST_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.WILLOW_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(6, 0.1F, 1),
                        MavesBlocks.WILLOW_SAPLING));

        register(context, AZALEA_GIANT_BUSH_MEADOW_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.AZALEA_GIANT_BUSH_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        RarityFilterPlacementModifier.of(100),
                        Blocks.AZALEA));
        register(context, WILLOW_MEADOW_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.WILLOW_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        RarityFilterPlacementModifier.of(100),
                        MavesBlocks.WILLOW_SAPLING));

        register(context, CACAO_TREE_JUNGLE_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.CACAO_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(10, 0.1F, 1),
                        MavesBlocks.CACAO_TREE_SAPLING));
        register(context, RUBBER_JUNGLE_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.RUBBER_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(10, 0.1F, 1),
                        MavesBlocks.RUBBER_SAPLING));

        register(context, CACAO_TREE_SPARSE_JUNGLE_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.CACAO_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(5, 0.1f, 1),
                        MavesBlocks.CACAO_TREE_SAPLING));
        register(context, RUBBER_SPARSE_JUNGLE_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.RUBBER_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(5, 0.1f, 1),
                        MavesBlocks.RUBBER_SAPLING));

        register(context, CACAO_TREE_BAMBOO_JUNGLE_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.CACAO_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.1f, 1),
                        MavesBlocks.CACAO_TREE_SAPLING));
        register(context, RUBBER_BAMBOO_JUNGLE_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.RUBBER_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.1f, 1),
                        MavesBlocks.RUBBER_SAPLING));

        register(context, RUBBER_SAVANNA_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.RUBBER_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1),
                        MavesBlocks.RUBBER_SAPLING));
        register(context, RUBBER_WINDSWEPT_SAVANNA_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.RUBBER_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1f, 1),
                        MavesBlocks.RUBBER_SAPLING));

        register(context, RUBBER_BADLANDS_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.RUBBER_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1f, 1),
                        MavesBlocks.RUBBER_SAPLING));

        register(context, WILLOW_GROVE_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.WILLOW_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(4, 0.1f, 1),
                        MavesBlocks.WILLOW_SAPLING));

        register(context, WILLOW_WINDSWEPT_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.WILLOW_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(3, 0.1f, 1),
                        MavesBlocks.WILLOW_SAPLING));

        register(context, WILLOW_RIVER_PLACED_KEY, configuredFeatures.getOrThrow(MavesConfiguredFeatures.WILLOW_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.1f, 1),
                        MavesBlocks.WILLOW_SAPLING));

        register(context, PALE_PUMPKIN_PLACED_KEY, palePumpkinConfiguredFeature,
                RarityFilterPlacementModifier.of(150),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MavesUtilitiesMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
