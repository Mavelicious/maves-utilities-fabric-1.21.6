package com.mavesutilities.datagen;

import com.mavesutilities.block.MavesBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class MavesBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public MavesBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(MavesBlocks.APPLE_TREE_LOG)
                .add(MavesBlocks.AZALEA_STEM)
                .add(MavesBlocks.COCOA_TREE_LOG)
                .add(MavesBlocks.RUBBER_LOG)
                .add(MavesBlocks.WILLOW_LOG)
                .add(MavesBlocks.APPLE_TREE_WOOD)
                .add(MavesBlocks.AZALEA_HYPHAE)
                .add(MavesBlocks.COCOA_TREE_WOOD)
                .add(MavesBlocks.RUBBER_WOOD)
                .add(MavesBlocks.WILLOW_WOOD)
                .add(MavesBlocks.STRIPPED_APPLE_TREE_LOG)
                .add(MavesBlocks.STRIPPED_AZALEA_STEM)
                .add(MavesBlocks.STRIPPED_COCOA_TREE_LOG)
                .add(MavesBlocks.STRIPPED_RUBBER_LOG)
                .add(MavesBlocks.STRIPPED_WILLOW_LOG)
                .add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD)
                .add(MavesBlocks.STRIPPED_AZALEA_HYPHAE)
                .add(MavesBlocks.STRIPPED_COCOA_TREE_WOOD)
                .add(MavesBlocks.STRIPPED_RUBBER_WOOD)
                .add(MavesBlocks.STRIPPED_WILLOW_WOOD);
    }
}