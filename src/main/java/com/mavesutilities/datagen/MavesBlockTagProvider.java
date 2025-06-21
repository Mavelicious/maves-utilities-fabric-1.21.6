package com.mavesutilities.datagen;

import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.util.MavesTags;
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

        valueLookupBuilder(BlockTags.PLANKS)
                .add(MavesBlocks.APPLE_TREE_PLANKS)
                .add(MavesBlocks.AZALEA_PLANKS)
                .add(MavesBlocks.CACAO_TREE_PLANKS)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_PLANKS)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC)
                .add(MavesBlocks.RUBBER_PLANKS)
                .add(MavesBlocks.WILLOW_PLANKS);

        valueLookupBuilder(BlockTags.LEAVES)
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
                .add(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_TAIL)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_HEAD)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_BODY)
                .add(MavesBlocks.RUBBER_LEAVES)
                .add(MavesBlocks.WILLOW_LEAVES);

        valueLookupBuilder(BlockTags.SAPLINGS)
                .add(MavesBlocks.APPLE_TREE_SAPLING)
                .add(MavesBlocks.CACAO_TREE_SAPLING)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_SAPLING)
                .add(MavesBlocks.RUBBER_SAPLING)
                .add(MavesBlocks.WILLOW_SAPLING);

        valueLookupBuilder(MavesTags.Blocks.APPLE_TREE_LOGS)
                .add(MavesBlocks.APPLE_TREE_BLOCK)
                .add(MavesBlocks.APPLE_TREE_LOG)
                .add(MavesBlocks.APPLE_TREE_WOOD)
                .add(MavesBlocks.STRIPPED_APPLE_TREE_BLOCK)
                .add(MavesBlocks.STRIPPED_APPLE_TREE_LOG)
                .add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD);

        valueLookupBuilder(MavesTags.Blocks.AZALEA_STEMS)
                .add(MavesBlocks.AZALEA_BLOCK)
                .add(MavesBlocks.AZALEA_STEM)
                .add(MavesBlocks.AZALEA_WOOD)
                .add(MavesBlocks.STRIPPED_AZALEA_BLOCK)
                .add(MavesBlocks.STRIPPED_AZALEA_STEM)
                .add(MavesBlocks.STRIPPED_AZALEA_WOOD);

        valueLookupBuilder(MavesTags.Blocks.CACAO_TREE_LOGS)
                .add(MavesBlocks.CACAO_TREE_BLOCK)
                .add(MavesBlocks.CACAO_TREE_LOG)
                .add(MavesBlocks.CACAO_TREE_WOOD)
                .add(MavesBlocks.STRIPPED_CACAO_TREE_BLOCK)
                .add(MavesBlocks.STRIPPED_CACAO_TREE_LOG)
                .add(MavesBlocks.STRIPPED_CACAO_TREE_WOOD);

        valueLookupBuilder(MavesTags.Blocks.HANGING_BLACK_WIDOW_STEMS)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_STEM)
                .add(MavesBlocks.STRIPPED_HANGING_BLACK_WIDOW_STEM);

        valueLookupBuilder(MavesTags.Blocks.RUBBER_TREE_LOGS)
                .add(MavesBlocks.RUBBER_BLOCK)
                .add(MavesBlocks.RUBBER_LOG)
                .add(MavesBlocks.RUBBER_WOOD)
                .add(MavesBlocks.STRIPPED_RUBBER_BLOCK)
                .add(MavesBlocks.STRIPPED_RUBBER_LOG)
                .add(MavesBlocks.STRIPPED_RUBBER_WOOD);

        valueLookupBuilder(MavesTags.Blocks.WILLOW_LOGS)
                .add(MavesBlocks.WILLOW_BLOCK)
                .add(MavesBlocks.WILLOW_LOG)
                .add(MavesBlocks.WILLOW_WOOD)
                .add(MavesBlocks.STRIPPED_WILLOW_BLOCK)
                .add(MavesBlocks.STRIPPED_WILLOW_LOG)
                .add(MavesBlocks.STRIPPED_WILLOW_WOOD);

        valueLookupBuilder(BlockTags.OAK_LOGS)
                .add(MavesBlocks.OAK_BLOCK)
                .add(MavesBlocks.STRIPPED_OAK_BLOCK);

        valueLookupBuilder(BlockTags.SPRUCE_LOGS)
                .add(MavesBlocks.SPRUCE_BLOCK)
                .add(MavesBlocks.STRIPPED_SPRUCE_BLOCK);

        valueLookupBuilder(BlockTags.BIRCH_LOGS)
                .add(MavesBlocks.BIRCH_BLOCK)
                .add(MavesBlocks.STRIPPED_BIRCH_BLOCK);

        valueLookupBuilder(BlockTags.JUNGLE_LOGS)
                .add(MavesBlocks.JUNGLE_BLOCK)
                .add(MavesBlocks.STRIPPED_JUNGLE_BLOCK);

        valueLookupBuilder(BlockTags.ACACIA_LOGS)
                .add(MavesBlocks.ACACIA_BLOCK)
                .add(MavesBlocks.STRIPPED_ACACIA_BLOCK);

        valueLookupBuilder(BlockTags.DARK_OAK_LOGS)
                .add(MavesBlocks.DARK_OAK_BLOCK)
                .add(MavesBlocks.STRIPPED_DARK_OAK_BLOCK);

        valueLookupBuilder(BlockTags.MANGROVE_LOGS)
                .add(MavesBlocks.MANGROVE_BLOCK)
                .add(MavesBlocks.STRIPPED_MANGROVE_BLOCK);

        valueLookupBuilder(BlockTags.CHERRY_LOGS)
                .add(MavesBlocks.CHERRY_BLOCK)
                .add(MavesBlocks.STRIPPED_CHERRY_BLOCK);

        valueLookupBuilder(BlockTags.PALE_OAK_LOGS)
                .add(MavesBlocks.PALE_OAK_BLOCK)
                .add(MavesBlocks.STRIPPED_PALE_OAK_BLOCK);

        valueLookupBuilder(BlockTags.CRIMSON_STEMS)
                .add(MavesBlocks.CRIMSON_BLOCK)
                .add(MavesBlocks.STRIPPED_CRIMSON_BLOCK);

        valueLookupBuilder(BlockTags.WARPED_STEMS)
                .add(MavesBlocks.WARPED_BLOCK)
                .add(MavesBlocks.STRIPPED_WARPED_BLOCK);

        valueLookupBuilder(BlockTags.LOGS_THAT_BURN)
                .addTag(MavesTags.Blocks.APPLE_TREE_LOGS)
                .addTag(MavesTags.Blocks.AZALEA_STEMS)
                .addTag(MavesTags.Blocks.CACAO_TREE_LOGS)
                .addTag(MavesTags.Blocks.HANGING_BLACK_WIDOW_STEMS)
                .addTag(MavesTags.Blocks.RUBBER_TREE_LOGS)
                .addTag(MavesTags.Blocks.WILLOW_LOGS);

        valueLookupBuilder(BlockTags.WOODEN_BUTTONS)
                .add(MavesBlocks.APPLE_TREE_BUTTON)
                .add(MavesBlocks.AZALEA_BUTTON)
                .add(MavesBlocks.CACAO_TREE_BUTTON)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_BUTTON)
                .add(MavesBlocks.RUBBER_BUTTON)
                .add(MavesBlocks.WILLOW_BUTTON);

        valueLookupBuilder(BlockTags.WOODEN_DOORS)
                .add(MavesBlocks.APPLE_TREE_DOOR)
                .add(MavesBlocks.AZALEA_DOOR)
                .add(MavesBlocks.CACAO_TREE_DOOR)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_DOOR)
                .add(MavesBlocks.RUBBER_DOOR)
                .add(MavesBlocks.WILLOW_DOOR);

        valueLookupBuilder(BlockTags.FENCE_GATES)
                .add(MavesBlocks.APPLE_TREE_FENCE_GATE)
                .add(MavesBlocks.AZALEA_FENCE_GATE)
                .add(MavesBlocks.CACAO_TREE_FENCE_GATE)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_FENCE_GATE)
                .add(MavesBlocks.RUBBER_FENCE_GATE)
                .add(MavesBlocks.WILLOW_FENCE_GATE);

        valueLookupBuilder(BlockTags.WOODEN_FENCES)
                .add(MavesBlocks.APPLE_TREE_FENCE)
                .add(MavesBlocks.AZALEA_FENCE)
                .add(MavesBlocks.CACAO_TREE_FENCE)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_FENCE)
                .add(MavesBlocks.RUBBER_FENCE)
                .add(MavesBlocks.WILLOW_FENCE);

        valueLookupBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(MavesBlocks.APPLE_TREE_PRESSURE_PLATE)
                .add(MavesBlocks.AZALEA_PRESSURE_PLATE)
                .add(MavesBlocks.CACAO_TREE_PRESSURE_PLATE)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_PRESSURE_PLATE)
                .add(MavesBlocks.RUBBER_PRESSURE_PLATE)
                .add(MavesBlocks.WILLOW_PRESSURE_PLATE);

        valueLookupBuilder(BlockTags.WOODEN_SLABS)
                .add(MavesBlocks.APPLE_TREE_SLAB)
                .add(MavesBlocks.AZALEA_SLAB)
                .add(MavesBlocks.CACAO_TREE_SLAB)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_SLAB)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC_SLAB)
                .add(MavesBlocks.RUBBER_SLAB)
                .add(MavesBlocks.WILLOW_SLAB);

        valueLookupBuilder(BlockTags.WOODEN_STAIRS)
                .add(MavesBlocks.APPLE_TREE_STAIRS)
                .add(MavesBlocks.AZALEA_STAIRS)
                .add(MavesBlocks.CACAO_TREE_STAIRS)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_STAIRS)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC_STAIRS)
                .add(MavesBlocks.RUBBER_STAIRS)
                .add(MavesBlocks.WILLOW_STAIRS);

        valueLookupBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(MavesBlocks.APPLE_TREE_TRAPDOOR)
                .add(MavesBlocks.AZALEA_TRAPDOOR)
                .add(MavesBlocks.CACAO_TREE_TRAPDOOR)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_TRAPDOOR)
                .add(MavesBlocks.RUBBER_TRAPDOOR)
                .add(MavesBlocks.WILLOW_TRAPDOOR);
        
        valueLookupBuilder(BlockTags.STANDING_SIGNS)
                .add(MavesBlocks.APPLE_TREE_SIGN)
                .add(MavesBlocks.AZALEA_SIGN)
                .add(MavesBlocks.CACAO_TREE_SIGN)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_SIGN)
                .add(MavesBlocks.RUBBER_SIGN)
                .add(MavesBlocks.WILLOW_SIGN);

        valueLookupBuilder(BlockTags.WALL_SIGNS)
                .add(MavesBlocks.APPLE_TREE_WALL_SIGN)
                .add(MavesBlocks.AZALEA_WALL_SIGN)
                .add(MavesBlocks.CACAO_TREE_WALL_SIGN)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_WALL_SIGN)
                .add(MavesBlocks.RUBBER_WALL_SIGN)
                .add(MavesBlocks.WILLOW_WALL_SIGN);

        valueLookupBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(MavesBlocks.APPLE_TREE_HANGING_SIGN)
                .add(MavesBlocks.AZALEA_HANGING_SIGN)
                .add(MavesBlocks.CACAO_TREE_HANGING_SIGN)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_HANGING_SIGN)
                .add(MavesBlocks.RUBBER_HANGING_SIGN)
                .add(MavesBlocks.WILLOW_HANGING_SIGN);

        valueLookupBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(MavesBlocks.APPLE_TREE_WALL_HANGING_SIGN)
                .add(MavesBlocks.AZALEA_WALL_HANGING_SIGN)
                .add(MavesBlocks.CACAO_TREE_WALL_HANGING_SIGN)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_WALL_HANGING_SIGN)
                .add(MavesBlocks.RUBBER_WALL_HANGING_SIGN)
                .add(MavesBlocks.WILLOW_WALL_HANGING_SIGN);

        valueLookupBuilder(BlockTags.FLOWER_POTS)
                .add(MavesBlocks.POTTED_APPLE_TREE_SAPLING)
                .add(MavesBlocks.POTTED_CACAO_TREE_SAPLING)
                .add(MavesBlocks.POTTED_HANGING_BLACK_WIDOW_SAPLING)
                .add(MavesBlocks.POTTED_RUBBER_SAPLING)
                .add(MavesBlocks.POTTED_WILLOW_SAPLING);

        valueLookupBuilder(BlockTags.AXE_MINEABLE)
                .add(MavesBlocks.HANGING_BLACK_WIDOW_BLOCK)
                .add(MavesBlocks.PALE_PUMPKIN)
                .add(MavesBlocks.CARVED_PALE_PUMPKIN)
                .add(MavesBlocks.PALE_JACK_O_LANTERN)
                .add(MavesBlocks.PALE_PUMPKIN_STEM)
                .add(MavesBlocks.ATTACHED_PALE_PUMPKIN_STEM);

        valueLookupBuilder(BlockTags.CROPS)
                .add(MavesBlocks.PALE_PUMPKIN_STEM);
    }
}