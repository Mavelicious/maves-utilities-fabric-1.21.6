package com.mavesutilities.datagen;

import com.mavesutilities.block.MavesBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class MavesLootTableProvider extends FabricBlockLootTableProvider {
    public MavesLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(MavesBlocks.APPLE_TREE_LOG);
        addDrop(MavesBlocks.AZALEA_STEM);
        addDrop(MavesBlocks.COCOA_TREE_LOG);
        addDrop(MavesBlocks.RUBBER_LOG);
        addDrop(MavesBlocks.WILLOW_LOG);
        addDrop(MavesBlocks.APPLE_TREE_WOOD);
        addDrop(MavesBlocks.AZALEA_HYPHAE);
        addDrop(MavesBlocks.COCOA_TREE_WOOD);
        addDrop(MavesBlocks.RUBBER_WOOD);
        addDrop(MavesBlocks.WILLOW_WOOD);
        addDrop(MavesBlocks.STRIPPED_APPLE_TREE_LOG);
        addDrop(MavesBlocks.STRIPPED_AZALEA_STEM);
        addDrop(MavesBlocks.STRIPPED_COCOA_TREE_LOG);
        addDrop(MavesBlocks.STRIPPED_RUBBER_LOG);
        addDrop(MavesBlocks.STRIPPED_WILLOW_LOG);
        addDrop(MavesBlocks.STRIPPED_APPLE_TREE_WOOD);
        addDrop(MavesBlocks.STRIPPED_AZALEA_HYPHAE);
        addDrop(MavesBlocks.STRIPPED_COCOA_TREE_WOOD);
        addDrop(MavesBlocks.STRIPPED_RUBBER_WOOD);
        addDrop(MavesBlocks.STRIPPED_WILLOW_WOOD);
        addDrop(MavesBlocks.APPLE_TREE_PLANKS);
        addDrop(MavesBlocks.AZALEA_PLANKS);
        addDrop(MavesBlocks.COCOA_TREE_PLANKS);
        addDrop(MavesBlocks.RUBBER_PLANKS);
        addDrop(MavesBlocks.WILLOW_PLANKS);
        addDrop(MavesBlocks.APPLE_TREE_SAPLING);
        addDrop(MavesBlocks.COCOA_TREE_SAPLING);
        addDrop(MavesBlocks.RUBBER_SAPLING);
        addDrop(MavesBlocks.WILLOW_SAPLING);

        addDrop(MavesBlocks.APPLE_TREE_LEAVES, oakLeavesDrops(MavesBlocks.APPLE_TREE_LEAVES,
                MavesBlocks.APPLE_TREE_SAPLING, 0.0625f));
        addDrop(MavesBlocks.COCOA_TREE_LEAVES, leavesDrops(MavesBlocks.COCOA_TREE_LEAVES,
                MavesBlocks.COCOA_TREE_SAPLING, 0.0625f));
        addDrop(MavesBlocks.RUBBER_LEAVES, leavesDrops(MavesBlocks.RUBBER_LEAVES,
                MavesBlocks.RUBBER_SAPLING, 0.0625f));
        addDrop(MavesBlocks.WILLOW_LEAVES, leavesDrops(MavesBlocks.WILLOW_LEAVES,
                MavesBlocks.WILLOW_SAPLING, 0.0625f));

    }
}
