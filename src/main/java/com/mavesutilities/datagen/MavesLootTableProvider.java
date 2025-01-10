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
        addDrop(MavesBlocks.APPLE_TREE_WOOD);
        addDrop(MavesBlocks.STRIPPED_APPLE_TREE_LOG);
        addDrop(MavesBlocks.STRIPPED_APPLE_TREE_WOOD);
        addDrop(MavesBlocks.APPLE_TREE_PLANKS);
        addDrop(MavesBlocks.APPLE_TREE_SAPLING);

        addDrop(MavesBlocks.APPLE_TREE_LEAVES, oakLeavesDrops(MavesBlocks.APPLE_TREE_LEAVES, MavesBlocks.APPLE_TREE_SAPLING, 0.0625f));

    }
}
