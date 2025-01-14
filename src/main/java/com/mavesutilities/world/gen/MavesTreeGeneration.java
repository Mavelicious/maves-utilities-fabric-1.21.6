package com.mavesutilities.world.gen;

import com.mavesutilities.world.MavesPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class MavesTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.APPLE_TREE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA_PLATEAU,
                        BiomeKeys.WINDSWEPT_SAVANNA, BiomeKeys.WOODED_BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.RUBBER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_HILLS,
                        BiomeKeys.WINDSWEPT_FOREST, BiomeKeys.FOREST, BiomeKeys.SNOWY_TAIGA,
                        BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, MavesPlacedFeatures.WILLOW_PLACED_KEY);
    }
}