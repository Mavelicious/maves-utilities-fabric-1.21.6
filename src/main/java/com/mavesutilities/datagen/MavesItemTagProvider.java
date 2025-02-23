package com.mavesutilities.datagen;

import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItems;
import com.mavesutilities.util.MavesTags;
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

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(MavesBlocks.APPLE_TREE_PLANKS.asItem())
                .add(MavesBlocks.AZALEA_PLANKS.asItem())
                .add(MavesBlocks.CACAO_TREE_PLANKS.asItem())
                .add(MavesBlocks.RUBBER_PLANKS.asItem())
                .add(MavesBlocks.WILLOW_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(MavesBlocks.APPLE_TREE_LEAVES.asItem())
                .add(MavesBlocks.CACAO_TREE_LEAVES.asItem())
                .add(MavesBlocks.RUBBER_LEAVES.asItem())
                .add(MavesBlocks.WILLOW_LEAVES.asItem());

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(MavesBlocks.APPLE_TREE_SAPLING.asItem())
                .add(MavesBlocks.CACAO_TREE_SAPLING.asItem())
                .add(MavesBlocks.RUBBER_SAPLING.asItem())
                .add(MavesBlocks.WILLOW_SAPLING.asItem());

        getOrCreateTagBuilder(MavesTags.Items.APPLE_TREE_LOGS)
                .add(MavesBlocks.APPLE_TREE_LOG.asItem())
                .add(MavesBlocks.APPLE_TREE_WOOD.asItem())
                .add(MavesBlocks.STRIPPED_APPLE_TREE_LOG.asItem())
                .add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD.asItem());

        getOrCreateTagBuilder(MavesTags.Items.AZALEA_STEMS)
                .add(MavesBlocks.AZALEA_STEM.asItem())
                .add(MavesBlocks.AZALEA_WOOD.asItem())
                .add(MavesBlocks.STRIPPED_AZALEA_STEM.asItem())
                .add(MavesBlocks.STRIPPED_AZALEA_WOOD.asItem());

        getOrCreateTagBuilder(MavesTags.Items.CACAO_TREE_LOGS)
                .add(MavesBlocks.CACAO_TREE_LOG.asItem())
                .add(MavesBlocks.CACAO_TREE_WOOD.asItem())
                .add(MavesBlocks.STRIPPED_CACAO_TREE_LOG.asItem())
                .add(MavesBlocks.STRIPPED_CACAO_TREE_WOOD.asItem());

        getOrCreateTagBuilder(MavesTags.Items.RUBBER_TREE_LOGS)
                .add(MavesBlocks.RUBBER_LOG.asItem())
                .add(MavesBlocks.RUBBER_WOOD.asItem())
                .add(MavesBlocks.STRIPPED_RUBBER_LOG.asItem())
                .add(MavesBlocks.STRIPPED_RUBBER_WOOD.asItem());

        getOrCreateTagBuilder(MavesTags.Items.WILLOW_LOGS)
                .add(MavesBlocks.WILLOW_LOG.asItem())
                .add(MavesBlocks.WILLOW_WOOD.asItem())
                .add(MavesBlocks.STRIPPED_WILLOW_LOG.asItem())
                .add(MavesBlocks.STRIPPED_WILLOW_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .addTag(MavesTags.Items.APPLE_TREE_LOGS)
                .addTag(MavesTags.Items.AZALEA_STEMS)
                .addTag(MavesTags.Items.CACAO_TREE_LOGS)
                .addTag(MavesTags.Items.RUBBER_TREE_LOGS)
                .addTag(MavesTags.Items.WILLOW_LOGS);

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(MavesBlocks.APPLE_TREE_BUTTON.asItem())
                .add(MavesBlocks.AZALEA_BUTTON.asItem())
                .add(MavesBlocks.CACAO_TREE_BUTTON.asItem())
                .add(MavesBlocks.RUBBER_BUTTON.asItem())
                .add(MavesBlocks.WILLOW_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(MavesBlocks.APPLE_TREE_DOOR.asItem())
                .add(MavesBlocks.AZALEA_DOOR.asItem())
                .add(MavesBlocks.CACAO_TREE_DOOR.asItem())
                .add(MavesBlocks.RUBBER_DOOR.asItem())
                .add(MavesBlocks.WILLOW_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(MavesBlocks.APPLE_TREE_FENCE_GATE.asItem())
                .add(MavesBlocks.AZALEA_FENCE_GATE.asItem())
                .add(MavesBlocks.CACAO_TREE_FENCE_GATE.asItem())
                .add(MavesBlocks.RUBBER_FENCE_GATE.asItem())
                .add(MavesBlocks.WILLOW_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(MavesBlocks.APPLE_TREE_FENCE.asItem())
                .add(MavesBlocks.AZALEA_FENCE.asItem())
                .add(MavesBlocks.CACAO_TREE_FENCE.asItem())
                .add(MavesBlocks.RUBBER_FENCE.asItem())
                .add(MavesBlocks.WILLOW_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(MavesBlocks.APPLE_TREE_PRESSURE_PLATE.asItem())
                .add(MavesBlocks.AZALEA_PRESSURE_PLATE.asItem())
                .add(MavesBlocks.CACAO_TREE_PRESSURE_PLATE.asItem())
                .add(MavesBlocks.RUBBER_PRESSURE_PLATE.asItem())
                .add(MavesBlocks.WILLOW_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(MavesBlocks.APPLE_TREE_SLAB.asItem())
                .add(MavesBlocks.AZALEA_SLAB.asItem())
                .add(MavesBlocks.CACAO_TREE_SLAB.asItem())
                .add(MavesBlocks.RUBBER_SLAB.asItem())
                .add(MavesBlocks.WILLOW_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(MavesBlocks.APPLE_TREE_STAIRS.asItem())
                .add(MavesBlocks.AZALEA_STAIRS.asItem())
                .add(MavesBlocks.CACAO_TREE_STAIRS.asItem())
                .add(MavesBlocks.RUBBER_STAIRS.asItem())
                .add(MavesBlocks.WILLOW_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(MavesBlocks.APPLE_TREE_TRAPDOOR.asItem())
                .add(MavesBlocks.AZALEA_TRAPDOOR.asItem())
                .add(MavesBlocks.CACAO_TREE_TRAPDOOR.asItem())
                .add(MavesBlocks.RUBBER_TRAPDOOR.asItem())
                .add(MavesBlocks.WILLOW_TRAPDOOR.asItem());
    }
}
