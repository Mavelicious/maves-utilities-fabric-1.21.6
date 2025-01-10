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
                .add(MavesBlocks.APPLE_TREE_WOOD.asItem())
                .add(MavesBlocks.STRIPPED_APPLE_TREE_LOG.asItem())
                .add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(MavesBlocks.APPLE_TREE_PLANKS.asItem());
    }
}
