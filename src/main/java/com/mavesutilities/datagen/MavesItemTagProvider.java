package com.mavesutilities.datagen;

import com.mavesutilities.block.MavesBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class MavesItemTagProvider extends FabricTagProvider.ItemTagProvider {


    public MavesItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(MavesBlocks.APPLE_TREE_LOG.asItem())
                .add(MavesBlocks.AZALEA_STEM.asItem())
                .add(MavesBlocks.COCOA_TREE_LOG.asItem())
                .add(MavesBlocks.RUBBER_LOG.asItem())
                .add(MavesBlocks.WILLOW_LOG.asItem())
                .add(MavesBlocks.APPLE_TREE_WOOD.asItem())
                .add(MavesBlocks.AZALEA_HYPHAE.asItem())
                .add(MavesBlocks.COCOA_TREE_WOOD.asItem())
                .add(MavesBlocks.RUBBER_WOOD.asItem())
                .add(MavesBlocks.WILLOW_WOOD.asItem())
                .add(MavesBlocks.STRIPPED_APPLE_TREE_LOG.asItem())
                .add(MavesBlocks.STRIPPED_AZALEA_STEM.asItem())
                .add(MavesBlocks.STRIPPED_COCOA_TREE_LOG.asItem())
                .add(MavesBlocks.STRIPPED_RUBBER_LOG.asItem())
                .add(MavesBlocks.STRIPPED_WILLOW_LOG.asItem())
                .add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD.asItem())
                .add(MavesBlocks.STRIPPED_AZALEA_HYPHAE.asItem())
                .add(MavesBlocks.STRIPPED_COCOA_TREE_WOOD.asItem())
                .add(MavesBlocks.STRIPPED_RUBBER_WOOD.asItem())
                .add(MavesBlocks.STRIPPED_WILLOW_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(MavesBlocks.APPLE_TREE_PLANKS.asItem())
                .add(MavesBlocks.AZALEA_PLANKS.asItem())
                .add(MavesBlocks.COCOA_TREE_PLANKS.asItem())
                .add(MavesBlocks.RUBBER_PLANKS.asItem())
                .add(MavesBlocks.WILLOW_PLANKS.asItem());
    }
}
