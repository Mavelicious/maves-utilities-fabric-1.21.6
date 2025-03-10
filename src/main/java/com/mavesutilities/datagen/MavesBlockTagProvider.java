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
                .add(MavesBlocks.CACAO_TREE_PLANKS)
                .add(MavesBlocks.RUBBER_PLANKS)
                .add(MavesBlocks.WILLOW_PLANKS);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(MavesBlocks.ACACIA_FLOWERING_LEAVES)
                .add(MavesBlocks.ACACIA_FLOWERED_LEAVES)
                .add(MavesBlocks.BIRCH_FLOWERING_LEAVES)
                .add(MavesBlocks.CHERRY_FLOWERING_LEAVES)
                .add(MavesBlocks.DARK_OAK_FLOWERING_LEAVES)
                .add(MavesBlocks.JUNGLE_FLOWERING_LEAVES)
                .add(MavesBlocks.OAK_FLOWERING_LEAVES)
                .add(MavesBlocks.PALE_OAK_FLOWERING_LEAVES)
                .add(MavesBlocks.APPLE_TREE_LEAVES)
                .add(MavesBlocks.APPLE_TREE_FLOWERING_LEAVES)
                .add(MavesBlocks.APPLE_TREE_FLOWERED_LEAVES)
                .add(MavesBlocks.CACAO_TREE_LEAVES)
                .add(MavesBlocks.RUBBER_LEAVES)
                .add(MavesBlocks.WILLOW_LEAVES);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(MavesBlocks.APPLE_TREE_SAPLING)
                .add(MavesBlocks.CACAO_TREE_SAPLING)
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

        getOrCreateTagBuilder(MavesTags.Blocks.CACAO_TREE_LOGS)
                .add(MavesBlocks.CACAO_TREE_LOG)
                .add(MavesBlocks.CACAO_TREE_WOOD)
                .add(MavesBlocks.STRIPPED_CACAO_TREE_LOG)
                .add(MavesBlocks.STRIPPED_CACAO_TREE_WOOD);

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
                .addTag(MavesTags.Blocks.CACAO_TREE_LOGS)
                .addTag(MavesTags.Blocks.RUBBER_TREE_LOGS)
                .addTag(MavesTags.Blocks.WILLOW_LOGS);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(MavesBlocks.APPLE_TREE_BUTTON)
                .add(MavesBlocks.AZALEA_BUTTON)
                .add(MavesBlocks.CACAO_TREE_BUTTON)
                .add(MavesBlocks.RUBBER_BUTTON)
                .add(MavesBlocks.WILLOW_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(MavesBlocks.APPLE_TREE_DOOR)
                .add(MavesBlocks.AZALEA_DOOR)
                .add(MavesBlocks.CACAO_TREE_DOOR)
                .add(MavesBlocks.RUBBER_DOOR)
                .add(MavesBlocks.WILLOW_DOOR);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(MavesBlocks.APPLE_TREE_FENCE_GATE)
                .add(MavesBlocks.AZALEA_FENCE_GATE)
                .add(MavesBlocks.CACAO_TREE_FENCE_GATE)
                .add(MavesBlocks.RUBBER_FENCE_GATE)
                .add(MavesBlocks.WILLOW_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(MavesBlocks.APPLE_TREE_FENCE)
                .add(MavesBlocks.AZALEA_FENCE)
                .add(MavesBlocks.CACAO_TREE_FENCE)
                .add(MavesBlocks.RUBBER_FENCE)
                .add(MavesBlocks.WILLOW_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(MavesBlocks.APPLE_TREE_PRESSURE_PLATE)
                .add(MavesBlocks.AZALEA_PRESSURE_PLATE)
                .add(MavesBlocks.CACAO_TREE_PRESSURE_PLATE)
                .add(MavesBlocks.RUBBER_PRESSURE_PLATE)
                .add(MavesBlocks.WILLOW_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(MavesBlocks.APPLE_TREE_SLAB)
                .add(MavesBlocks.AZALEA_SLAB)
                .add(MavesBlocks.CACAO_TREE_SLAB)
                .add(MavesBlocks.RUBBER_SLAB)
                .add(MavesBlocks.WILLOW_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(MavesBlocks.APPLE_TREE_STAIRS)
                .add(MavesBlocks.AZALEA_STAIRS)
                .add(MavesBlocks.CACAO_TREE_STAIRS)
                .add(MavesBlocks.RUBBER_STAIRS)
                .add(MavesBlocks.WILLOW_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(MavesBlocks.APPLE_TREE_TRAPDOOR)
                .add(MavesBlocks.AZALEA_TRAPDOOR)
                .add(MavesBlocks.CACAO_TREE_TRAPDOOR)
                .add(MavesBlocks.RUBBER_TRAPDOOR)
                .add(MavesBlocks.WILLOW_TRAPDOOR);
        
        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(MavesBlocks.APPLE_TREE_SIGN)
                .add(MavesBlocks.AZALEA_SIGN)
                .add(MavesBlocks.CACAO_TREE_SIGN)
                .add(MavesBlocks.RUBBER_SIGN)
                .add(MavesBlocks.WILLOW_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(MavesBlocks.APPLE_TREE_WALL_SIGN)
                .add(MavesBlocks.AZALEA_WALL_SIGN)
                .add(MavesBlocks.CACAO_TREE_WALL_SIGN)
                .add(MavesBlocks.RUBBER_WALL_SIGN)
                .add(MavesBlocks.WILLOW_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(MavesBlocks.APPLE_TREE_HANGING_SIGN)
                .add(MavesBlocks.AZALEA_HANGING_SIGN)
                .add(MavesBlocks.CACAO_TREE_HANGING_SIGN)
                .add(MavesBlocks.RUBBER_HANGING_SIGN)
                .add(MavesBlocks.WILLOW_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(MavesBlocks.APPLE_TREE_WALL_HANGING_SIGN)
                .add(MavesBlocks.AZALEA_WALL_HANGING_SIGN)
                .add(MavesBlocks.CACAO_TREE_WALL_HANGING_SIGN)
                .add(MavesBlocks.RUBBER_WALL_HANGING_SIGN)
                .add(MavesBlocks.WILLOW_WALL_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(MavesBlocks.POTTED_APPLE_TREE_SAPLING)
                .add(MavesBlocks.POTTED_CACAO_TREE_SAPLING)
                .add(MavesBlocks.POTTED_RUBBER_SAPLING)
                .add(MavesBlocks.POTTED_WILLOW_SAPLING);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(MavesBlocks.PALE_PUMPKIN)
                .add(MavesBlocks.CARVED_PALE_PUMPKIN)
                .add(MavesBlocks.PALE_JACK_O_LANTERN)
                .add(MavesBlocks.PALE_PUMPKIN_STEM)
                .add(MavesBlocks.ATTACHED_PALE_PUMPKIN_STEM);

        getOrCreateTagBuilder(BlockTags.CROPS)
                .add(MavesBlocks.PALE_PUMPKIN_STEM);
    }
}