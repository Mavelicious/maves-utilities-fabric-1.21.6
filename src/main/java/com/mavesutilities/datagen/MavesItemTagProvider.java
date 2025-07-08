package com.mavesutilities.datagen;

import com.mavesutilities.item.MavesItems;
import com.mavesutilities.util.MavesTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class MavesItemTagProvider extends FabricTagProvider.ItemTagProvider {


    public MavesItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(ItemTags.PLANKS)
                .add(MavesItems.APPLE_TREE_PLANKS)
                .add(MavesItems.AZALEA_PLANKS)
                .add(MavesItems.CACAO_TREE_PLANKS)
                .add(MavesItems.HANGING_BLACK_WIDOW_PLANKS)
                .add(MavesItems.HANGING_BLACK_WIDOW_MOSAIC)
                .add(MavesItems.RUBBER_PLANKS)
                .add(MavesItems.WILLOW_PLANKS);

        valueLookupBuilder(ItemTags.LEAVES)
                .add(MavesItems.APPLE_TREE_LEAVES)
                .add(MavesItems.CACAO_TREE_LEAVES)
                .add(MavesItems.HANGING_BLACK_WIDOW_LEAVES_TAIL)
                .add(MavesItems.HANGING_BLACK_WIDOW_LEAVES_HEAD)
                .add(MavesItems.HANGING_BLACK_WIDOW_LEAVES_BODY)
                .add(MavesItems.RUBBER_LEAVES)
                .add(MavesItems.WILLOW_LEAVES)
                .add(MavesItems.ACACIA_FLOWERED_LEAVES)
                .add(MavesItems.APPLE_TREE_FLOWERED_LEAVES)
                .add(MavesItems.APPLE_TREE_FLOWERING_LEAVES)
                .add(MavesItems.CHERRY_FLOWERING_LEAVES)
                .add(MavesItems.DARK_OAK_FLOWERING_LEAVES)
                .add(MavesItems.JUNGLE_FLOWERING_LEAVES)
                .add(MavesItems.OAK_FLOWERING_LEAVES)
                .add(MavesItems.PALE_OAK_FLOWERING_LEAVES);

        valueLookupBuilder(ItemTags.SAPLINGS)
                .add(MavesItems.APPLE_TREE_SAPLING)
                .add(MavesItems.CACAO_TREE_SAPLING)
                .add(MavesItems.HANGING_BLACK_WIDOW_SAPLING)
                .add(MavesItems.RUBBER_SAPLING)
                .add(MavesItems.WILLOW_SAPLING);

        valueLookupBuilder(MavesTags.Items.APPLE_TREE_LOGS)
                .add(MavesItems.APPLE_TREE_BLOCK)
                .add(MavesItems.APPLE_TREE_LOG)
                .add(MavesItems.APPLE_TREE_WOOD)
                .add(MavesItems.STRIPPED_APPLE_TREE_BLOCK)
                .add(MavesItems.STRIPPED_APPLE_TREE_LOG)
                .add(MavesItems.STRIPPED_APPLE_TREE_WOOD);

        valueLookupBuilder(MavesTags.Items.AZALEA_STEMS)
                .add(MavesItems.AZALEA_BLOCK)
                .add(MavesItems.AZALEA_STEM)
                .add(MavesItems.AZALEA_WOOD)
                .add(MavesItems.STRIPPED_AZALEA_BLOCK)
                .add(MavesItems.STRIPPED_AZALEA_STEM)
                .add(MavesItems.STRIPPED_AZALEA_WOOD);

        valueLookupBuilder(MavesTags.Items.CACAO_TREE_LOGS)
                .add(MavesItems.CACAO_TREE_BLOCK)
                .add(MavesItems.CACAO_TREE_LOG)
                .add(MavesItems.CACAO_TREE_WOOD)
                .add(MavesItems.STRIPPED_CACAO_TREE_BLOCK)
                .add(MavesItems.STRIPPED_CACAO_TREE_LOG)
                .add(MavesItems.STRIPPED_CACAO_TREE_WOOD);

        valueLookupBuilder(MavesTags.Items.HANGING_BLACK_WIDOW_STEMS)
                .add(MavesItems.HANGING_BLACK_WIDOW_STEM)
                .add(MavesItems.STRIPPED_HANGING_BLACK_WIDOW_STEM);

        valueLookupBuilder(MavesTags.Items.RUBBER_TREE_LOGS)
                .add(MavesItems.RUBBER_BLOCK)
                .add(MavesItems.RUBBER_LOG)
                .add(MavesItems.RUBBER_WOOD)
                .add(MavesItems.STRIPPED_RUBBER_BLOCK)
                .add(MavesItems.STRIPPED_RUBBER_LOG)
                .add(MavesItems.STRIPPED_RUBBER_WOOD);

        valueLookupBuilder(MavesTags.Items.WILLOW_LOGS)
                .add(MavesItems.WILLOW_BLOCK)
                .add(MavesItems.WILLOW_LOG)
                .add(MavesItems.WILLOW_WOOD)
                .add(MavesItems.STRIPPED_WILLOW_BLOCK)
                .add(MavesItems.STRIPPED_WILLOW_LOG)
                .add(MavesItems.STRIPPED_WILLOW_WOOD);

        valueLookupBuilder(ItemTags.OAK_LOGS)
                .add(MavesItems.OAK_BLOCK)
                .add(MavesItems.STRIPPED_OAK_BLOCK);

        valueLookupBuilder(ItemTags.SPRUCE_LOGS)
                .add(MavesItems.SPRUCE_BLOCK)
                .add(MavesItems.STRIPPED_SPRUCE_BLOCK);

        valueLookupBuilder(ItemTags.BIRCH_LOGS)
                .add(MavesItems.BIRCH_BLOCK)
                .add(MavesItems.STRIPPED_BIRCH_BLOCK);

        valueLookupBuilder(ItemTags.JUNGLE_LOGS)
                .add(MavesItems.JUNGLE_BLOCK)
                .add(MavesItems.STRIPPED_JUNGLE_BLOCK);

        valueLookupBuilder(ItemTags.ACACIA_LOGS)
                .add(MavesItems.ACACIA_BLOCK)
                .add(MavesItems.STRIPPED_ACACIA_BLOCK);

        valueLookupBuilder(ItemTags.DARK_OAK_LOGS)
                .add(MavesItems.DARK_OAK_BLOCK)
                .add(MavesItems.STRIPPED_DARK_OAK_BLOCK);

        valueLookupBuilder(ItemTags.MANGROVE_LOGS)
                .add(MavesItems.MANGROVE_BLOCK)
                .add(MavesItems.STRIPPED_MANGROVE_BLOCK);

        valueLookupBuilder(ItemTags.CHERRY_LOGS)
                .add(MavesItems.CHERRY_BLOCK)
                .add(MavesItems.STRIPPED_CHERRY_BLOCK);

        valueLookupBuilder(ItemTags.PALE_OAK_LOGS)
                .add(MavesItems.PALE_OAK_BLOCK)
                .add(MavesItems.STRIPPED_PALE_OAK_BLOCK);

        valueLookupBuilder(ItemTags.CRIMSON_STEMS)
                .add(MavesItems.CRIMSON_BLOCK)
                .add(MavesItems.STRIPPED_CRIMSON_BLOCK);

        valueLookupBuilder(ItemTags.WARPED_STEMS)
                .add(MavesItems.WARPED_BLOCK)
                .add(MavesItems.STRIPPED_WARPED_BLOCK);

        valueLookupBuilder(ItemTags.LOGS_THAT_BURN)
                .addTag(MavesTags.Items.APPLE_TREE_LOGS)
                .addTag(MavesTags.Items.AZALEA_STEMS)
                .addTag(MavesTags.Items.CACAO_TREE_LOGS)
                .addTag(MavesTags.Items.HANGING_BLACK_WIDOW_STEMS)
                .addTag(MavesTags.Items.RUBBER_TREE_LOGS)
                .addTag(MavesTags.Items.WILLOW_LOGS);

        valueLookupBuilder(ItemTags.WOODEN_BUTTONS)
                .add(MavesItems.APPLE_TREE_BUTTON)
                .add(MavesItems.AZALEA_BUTTON)
                .add(MavesItems.CACAO_TREE_BUTTON)
                .add(MavesItems.HANGING_BLACK_WIDOW_BUTTON)
                .add(MavesItems.RUBBER_BUTTON)
                .add(MavesItems.WILLOW_BUTTON);

        valueLookupBuilder(ItemTags.WOODEN_DOORS)
                .add(MavesItems.APPLE_TREE_DOOR)
                .add(MavesItems.AZALEA_DOOR)
                .add(MavesItems.CACAO_TREE_DOOR)
                .add(MavesItems.HANGING_BLACK_WIDOW_DOOR)
                .add(MavesItems.RUBBER_DOOR)
                .add(MavesItems.WILLOW_DOOR);

        valueLookupBuilder(ItemTags.FENCE_GATES)
                .add(MavesItems.APPLE_TREE_FENCE_GATE)
                .add(MavesItems.AZALEA_FENCE_GATE)
                .add(MavesItems.CACAO_TREE_FENCE_GATE)
                .add(MavesItems.HANGING_BLACK_WIDOW_FENCE_GATE)
                .add(MavesItems.RUBBER_FENCE_GATE)
                .add(MavesItems.WILLOW_FENCE_GATE);

        valueLookupBuilder(ItemTags.WOODEN_FENCES)
                .add(MavesItems.APPLE_TREE_FENCE)
                .add(MavesItems.AZALEA_FENCE)
                .add(MavesItems.CACAO_TREE_FENCE)
                .add(MavesItems.HANGING_BLACK_WIDOW_FENCE)
                .add(MavesItems.RUBBER_FENCE)
                .add(MavesItems.WILLOW_FENCE);

        valueLookupBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(MavesItems.APPLE_TREE_PRESSURE_PLATE)
                .add(MavesItems.AZALEA_PRESSURE_PLATE)
                .add(MavesItems.CACAO_TREE_PRESSURE_PLATE)
                .add(MavesItems.HANGING_BLACK_WIDOW_PRESSURE_PLATE)
                .add(MavesItems.RUBBER_PRESSURE_PLATE)
                .add(MavesItems.WILLOW_PRESSURE_PLATE);

        valueLookupBuilder(ItemTags.WOODEN_SLABS)
                .add(MavesItems.APPLE_TREE_SLAB)
                .add(MavesItems.AZALEA_SLAB)
                .add(MavesItems.CACAO_TREE_SLAB)
                .add(MavesItems.HANGING_BLACK_WIDOW_SLAB)
                .add(MavesItems.HANGING_BLACK_WIDOW_MOSAIC_SLAB)
                .add(MavesItems.RUBBER_SLAB)
                .add(MavesItems.WILLOW_SLAB);

        valueLookupBuilder(ItemTags.WOODEN_STAIRS)
                .add(MavesItems.APPLE_TREE_STAIRS)
                .add(MavesItems.AZALEA_STAIRS)
                .add(MavesItems.CACAO_TREE_STAIRS)
                .add(MavesItems.HANGING_BLACK_WIDOW_STAIRS)
                .add(MavesItems.HANGING_BLACK_WIDOW_MOSAIC_STAIRS)
                .add(MavesItems.RUBBER_STAIRS)
                .add(MavesItems.WILLOW_STAIRS);

        valueLookupBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(MavesItems.APPLE_TREE_TRAPDOOR)
                .add(MavesItems.AZALEA_TRAPDOOR)
                .add(MavesItems.CACAO_TREE_TRAPDOOR)
                .add(MavesItems.HANGING_BLACK_WIDOW_TRAPDOOR)
                .add(MavesItems.RUBBER_TRAPDOOR)
                .add(MavesItems.WILLOW_TRAPDOOR);

        valueLookupBuilder(MavesTags.Items.APPLES)
                .add(Items.APPLE)
                .add(MavesItems.GREEN_APPLE);

        valueLookupBuilder(MavesTags.Items.WILD_BERRIES)
                .add(MavesItems.WILD_BERRIES_BLUE)
                .add(MavesItems.WILD_BERRIES_GREEN)
                .add(MavesItems.WILD_BERRIES_YELLOW);

        valueLookupBuilder(MavesTags.Items.ACACIA_SLIVERS)
                .add(MavesItems.ACACIA_SLIVER)
                .add(MavesItems.STRIPPED_ACACIA_SLIVER);

        valueLookupBuilder(MavesTags.Items.APPLE_TREE_SLIVERS)
                .add(MavesItems.APPLE_TREE_SLIVER)
                .add(MavesItems.STRIPPED_APPLE_TREE_SLIVER);

        valueLookupBuilder(MavesTags.Items.AZALEA_SLIVERS)
                .add(MavesItems.AZALEA_SLIVER)
                .add(MavesItems.STRIPPED_AZALEA_SLIVER);

        valueLookupBuilder(MavesTags.Items.BIRCH_SLIVERS)
                .add(MavesItems.BIRCH_SLIVER)
                .add(MavesItems.STRIPPED_BIRCH_SLIVER);

        valueLookupBuilder(MavesTags.Items.CHERRY_SLIVERS)
                .add(MavesItems.CHERRY_SLIVER)
                .add(MavesItems.STRIPPED_CHERRY_SLIVER);

        valueLookupBuilder(MavesTags.Items.CACAO_TREE_SLIVERS)
                .add(MavesItems.CACAO_TREE_SLIVER)
                .add(MavesItems.STRIPPED_CACAO_TREE_SLIVER);

        valueLookupBuilder(MavesTags.Items.CRIMSON_SLIVERS)
                .add(MavesItems.CRIMSON_SLIVER)
                .add(MavesItems.STRIPPED_CRIMSON_SLIVER);

        valueLookupBuilder(MavesTags.Items.DARK_OAK_SLIVERS)
                .add(MavesItems.DARK_OAK_SLIVER)
                .add(MavesItems.STRIPPED_DARK_OAK_SLIVER);

        valueLookupBuilder(MavesTags.Items.JUNGLE_SLIVERS)
                .add(MavesItems.JUNGLE_SLIVER)
                .add(MavesItems.STRIPPED_JUNGLE_SLIVER);

        valueLookupBuilder(MavesTags.Items.MANGROVE_SLIVERS)
                .add(MavesItems.MANGROVE_SLIVER)
                .add(MavesItems.STRIPPED_MANGROVE_SLIVER);

        valueLookupBuilder(MavesTags.Items.OAK_SLIVERS)
                .add(MavesItems.OAK_SLIVER)
                .add(MavesItems.STRIPPED_OAK_SLIVER);

        valueLookupBuilder(MavesTags.Items.PALE_OAK_SLIVERS)
                .add(MavesItems.PALE_OAK_SLIVER)
                .add(MavesItems.STRIPPED_PALE_OAK_SLIVER);

        valueLookupBuilder(MavesTags.Items.RUBBER_SLIVERS)
                .add(MavesItems.RUBBER_SLIVER)
                .add(MavesItems.STRIPPED_RUBBER_SLIVER);

        valueLookupBuilder(MavesTags.Items.SPRUCE_SLIVERS)
                .add(MavesItems.SPRUCE_SLIVER)
                .add(MavesItems.STRIPPED_SPRUCE_SLIVER);

        valueLookupBuilder(MavesTags.Items.WARPED_SLIVERS)
                .add(MavesItems.WARPED_SLIVER)
                .add(MavesItems.STRIPPED_WARPED_SLIVER);

        valueLookupBuilder(MavesTags.Items.WILLOW_SLIVERS)
                .add(MavesItems.WILLOW_SLIVER)
                .add(MavesItems.STRIPPED_WILLOW_SLIVER);

        valueLookupBuilder(ItemTags.BEE_FOOD)
                .add(MavesItems.ACACIA_FLOWERED_LEAVES)
                .add(MavesItems.APPLE_TREE_FLOWERING_LEAVES)
                .add(MavesItems.APPLE_TREE_FLOWERED_LEAVES)
                .add(MavesItems.CHERRY_FLOWERING_LEAVES)
                .add(MavesItems.ACACIA_BLOSSOM)
                .add(MavesItems.APPLE_BLOSSOM)
                .add(MavesItems.AZALEA_BLOSSOM);

        valueLookupBuilder(ItemTags.CHICKEN_FOOD)
                .add(MavesItems.PALE_PUMPKIN_SEEDS);

        valueLookupBuilder(ItemTags.FOX_FOOD)
                .addTag(MavesTags.Items.WILD_BERRIES);

        valueLookupBuilder(ItemTags.HORSE_FOOD)
                .add(MavesItems.GREEN_APPLE);

        valueLookupBuilder(ItemTags.PARROT_FOOD)
                .add(MavesItems.PALE_PUMPKIN_SEEDS);
    }
}
