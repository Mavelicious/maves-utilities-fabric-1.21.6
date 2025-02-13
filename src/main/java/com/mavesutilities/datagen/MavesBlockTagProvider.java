package com.mavesutilities.datagen;

import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.util.MavesTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class MavesBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public MavesBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(MavesBlocks.APPLE_TREE_PLANKS)
                .add(MavesBlocks.AZALEA_PLANKS)
                .add(MavesBlocks.COCOA_TREE_PLANKS)
                .add(MavesBlocks.RUBBER_PLANKS)
                .add(MavesBlocks.WILLOW_PLANKS);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(MavesBlocks.APPLE_TREE_LEAVES)
                .add(MavesBlocks.COCOA_TREE_LEAVES)
                .add(MavesBlocks.RUBBER_LEAVES)
                .add(MavesBlocks.WILLOW_LEAVES);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(MavesBlocks.APPLE_TREE_SAPLING)
                .add(MavesBlocks.COCOA_TREE_SAPLING)
                .add(MavesBlocks.RUBBER_SAPLING)
                .add(MavesBlocks.WILLOW_SAPLING);

        getOrCreateTagBuilder(MavesTags.Blocks.APPLE_TREE_LOGS)
                .add(MavesBlocks.APPLE_TREE_LOG)
                .add(MavesBlocks.APPLE_TREE_WOOD)
                .add(MavesBlocks.STRIPPED_APPLE_TREE_LOG)
                .add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD);

        getOrCreateTagBuilder(MavesTags.Blocks.AZALEA_STEMS)
                .add(MavesBlocks.AZALEA_STEM)
                .add(MavesBlocks.AZALEA_WOOD)
                .add(MavesBlocks.STRIPPED_AZALEA_STEM)
                .add(MavesBlocks.STRIPPED_AZALEA_WOOD);

        getOrCreateTagBuilder(MavesTags.Blocks.COCOA_TREE_LOGS)
                .add(MavesBlocks.COCOA_TREE_LOG)
                .add(MavesBlocks.COCOA_TREE_WOOD)
                .add(MavesBlocks.STRIPPED_COCOA_TREE_LOG)
                .add(MavesBlocks.STRIPPED_COCOA_TREE_WOOD);

        getOrCreateTagBuilder(MavesTags.Blocks.RUBBER_TREE_LOGS)
                .add(MavesBlocks.RUBBER_LOG)
                .add(MavesBlocks.RUBBER_WOOD)
                .add(MavesBlocks.STRIPPED_RUBBER_LOG)
                .add(MavesBlocks.STRIPPED_RUBBER_WOOD);

        getOrCreateTagBuilder(MavesTags.Blocks.WILLOW_LOGS)
                .add(MavesBlocks.WILLOW_LOG)
                .add(MavesBlocks.WILLOW_WOOD)
                .add(MavesBlocks.STRIPPED_WILLOW_LOG)
                .add(MavesBlocks.STRIPPED_WILLOW_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .addTag(MavesTags.Blocks.APPLE_TREE_LOGS)
                .addTag(MavesTags.Blocks.AZALEA_STEMS)
                .addTag(MavesTags.Blocks.COCOA_TREE_LOGS)
                .addTag(MavesTags.Blocks.RUBBER_TREE_LOGS)
                .addTag(MavesTags.Blocks.WILLOW_LOGS);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(MavesBlocks.APPLE_TREE_BUTTON)
                .add(MavesBlocks.AZALEA_BUTTON)
                .add(MavesBlocks.COCOA_TREE_BUTTON)
                .add(MavesBlocks.RUBBER_BUTTON)
                .add(MavesBlocks.WILLOW_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(MavesBlocks.APPLE_TREE_DOOR)
                .add(MavesBlocks.AZALEA_DOOR)
                .add(MavesBlocks.COCOA_TREE_DOOR)
                .add(MavesBlocks.RUBBER_DOOR)
                .add(MavesBlocks.WILLOW_DOOR);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(MavesBlocks.APPLE_TREE_FENCE_GATE)
                .add(MavesBlocks.AZALEA_FENCE_GATE)
                .add(MavesBlocks.COCOA_TREE_FENCE_GATE)
                .add(MavesBlocks.RUBBER_FENCE_GATE)
                .add(MavesBlocks.WILLOW_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(MavesBlocks.APPLE_TREE_FENCE)
                .add(MavesBlocks.AZALEA_FENCE)
                .add(MavesBlocks.COCOA_TREE_FENCE)
                .add(MavesBlocks.RUBBER_FENCE)
                .add(MavesBlocks.WILLOW_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(MavesBlocks.APPLE_TREE_PRESSURE_PLATE)
                .add(MavesBlocks.AZALEA_PRESSURE_PLATE)
                .add(MavesBlocks.COCOA_TREE_PRESSURE_PLATE)
                .add(MavesBlocks.RUBBER_PRESSURE_PLATE)
                .add(MavesBlocks.WILLOW_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(MavesBlocks.APPLE_TREE_SLAB)
                .add(MavesBlocks.AZALEA_SLAB)
                .add(MavesBlocks.COCOA_TREE_SLAB)
                .add(MavesBlocks.RUBBER_SLAB)
                .add(MavesBlocks.WILLOW_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(MavesBlocks.APPLE_TREE_STAIRS)
                .add(MavesBlocks.AZALEA_STAIRS)
                .add(MavesBlocks.COCOA_TREE_STAIRS)
                .add(MavesBlocks.RUBBER_STAIRS)
                .add(MavesBlocks.WILLOW_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(MavesBlocks.APPLE_TREE_TRAPDOOR)
                .add(MavesBlocks.AZALEA_TRAPDOOR)
                .add(MavesBlocks.COCOA_TREE_TRAPDOOR)
                .add(MavesBlocks.RUBBER_TRAPDOOR)
                .add(MavesBlocks.WILLOW_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(MavesBlocks.POTTED_APPLE_TREE_SAPLING)
                .add(MavesBlocks.POTTED_COCOA_TREE_SAPLING)
                .add(MavesBlocks.POTTED_RUBBER_SAPLING)
                .add(MavesBlocks.POTTED_WILLOW_SAPLING);

        getOrCreateTagBuilder(MavesTags.Blocks.BARK_LOGS)
                .add(Blocks.ACACIA_LOG)
                .add(MavesBlocks.APPLE_TREE_LOG)
                .add(MavesBlocks.AZALEA_STEM)
                .add(Blocks.BIRCH_LOG)
                .add(Blocks.CHERRY_LOG)
                .add(MavesBlocks.COCOA_TREE_LOG)
                .add(Blocks.CRIMSON_STEM)
                .add(Blocks.DARK_OAK_LOG)
                .add(Blocks.JUNGLE_LOG)
                .add(Blocks.MANGROVE_LOG)
                .add(Blocks.OAK_LOG)
                .add(Blocks.PALE_OAK_LOG)
                .add(MavesBlocks.RUBBER_LOG)
                .add(Blocks.SPRUCE_LOG)
                .add(Blocks.WARPED_STEM)
                .add(MavesBlocks.WILLOW_LOG);

        getOrCreateTagBuilder(MavesTags.Blocks.BARK_WOODS)
                .add(Blocks.ACACIA_WOOD)
                .add(MavesBlocks.APPLE_TREE_WOOD)
                .add(MavesBlocks.AZALEA_WOOD)
                .add(Blocks.BIRCH_WOOD)
                .add(Blocks.CHERRY_WOOD)
                .add(MavesBlocks.COCOA_TREE_WOOD)
                .add(Blocks.CRIMSON_HYPHAE)
                .add(Blocks.DARK_OAK_WOOD)
                .add(Blocks.JUNGLE_WOOD)
                .add(Blocks.MANGROVE_WOOD)
                .add(Blocks.OAK_WOOD)
                .add(Blocks.PALE_OAK_WOOD)
                .add(MavesBlocks.RUBBER_WOOD)
                .add(Blocks.SPRUCE_WOOD)
                .add(Blocks.WARPED_HYPHAE)
                .add(MavesBlocks.WILLOW_WOOD);
    }
}