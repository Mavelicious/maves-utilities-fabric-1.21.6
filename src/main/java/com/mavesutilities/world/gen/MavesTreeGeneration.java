package com.mavesutilities.world.gen;

import com.mavesutilities.world.MavesPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class MavesTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.APPLE_TREE_FOREST_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.AZALEA_GIANT_BUSH_FOREST_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.WILLOW_FOREST_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.APPLE_TREE_PLAINS_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.WILLOW_PLAINS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.APPLE_TREE_FLOWER_FOREST_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.AZALEA_GIANT_BUSH_FLOWER_FOREST_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.WILLOW_FLOWER_FOREST_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.AZALEA_GIANT_BUSH_MEADOW_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.WILLOW_MEADOW_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.CACAO_TREE_JUNGLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.RUBBER_JUNGLE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.CACAO_TREE_SPARSE_JUNGLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.RUBBER_SPARSE_JUNGLE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BAMBOO_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.CACAO_TREE_BAMBOO_JUNGLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BAMBOO_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.RUBBER_BAMBOO_JUNGLE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA, BiomeKeys.SAVANNA_PLATEAU),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.RUBBER_SAVANNA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.RUBBER_WINDSWEPT_SAVANNA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WOODED_BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.RUBBER_BADLANDS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.WILLOW_GROVE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.WILLOW_WINDSWEPT_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.RIVER),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.WILLOW_RIVER_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PALE_GARDEN),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.PALE_PUMPKIN_PLACED_KEY);
    }
}