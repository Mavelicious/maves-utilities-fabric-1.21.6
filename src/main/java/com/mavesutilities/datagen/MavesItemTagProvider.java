package com.mavesutilities.datagen;

import com.mavesutilities.item.MavesItems;
import com.mavesutilities.util.MavesTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.GameEventTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class MavesItemTagProvider extends FabricTagProvider.ItemTagProvider {


    public MavesItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(MavesItems.APPLE_TREE_PLANKS)
                .add(MavesItems.AZALEA_PLANKS)
                .add(MavesItems.CACAO_TREE_PLANKS)
                .add(MavesItems.RUBBER_PLANKS)
                .add(MavesItems.WILLOW_PLANKS);

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(MavesItems.APPLE_TREE_LEAVES)
                .add(MavesItems.CACAO_TREE_LEAVES)
                .add(MavesItems.RUBBER_LEAVES)
                .add(MavesItems.WILLOW_LEAVES)
                .add(MavesItems.ACACIA_FLOWERED_LEAVES)
                .add(MavesItems.ACACIA_FLOWERING_LEAVES)
                .add(MavesItems.APPLE_TREE_FLOWERED_LEAVES)
                .add(MavesItems.APPLE_TREE_FLOWERING_LEAVES)
                .add(MavesItems.BIRCH_FLOWERING_LEAVES)
                .add(MavesItems.CHERRY_FLOWERING_LEAVES)
                .add(MavesItems.DARK_OAK_FLOWERING_LEAVES)
                .add(MavesItems.JUNGLE_FLOWERING_LEAVES)
                .add(MavesItems.OAK_FLOWERING_LEAVES)
                .add(MavesItems.PALE_OAK_FLOWERING_LEAVES);

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(MavesItems.APPLE_TREE_SAPLING)
                .add(MavesItems.CACAO_TREE_SAPLING)
                .add(MavesItems.RUBBER_SAPLING)
                .add(MavesItems.WILLOW_SAPLING);

        getOrCreateTagBuilder(MavesTags.Items.APPLE_TREE_LOGS)
                .add(MavesItems.APPLE_TREE_BLOCK)
                .add(MavesItems.APPLE_TREE_LOG)
                .add(MavesItems.APPLE_TREE_WOOD)
                .add(MavesItems.STRIPPED_APPLE_TREE_BLOCK)
                .add(MavesItems.STRIPPED_APPLE_TREE_LOG)
                .add(MavesItems.STRIPPED_APPLE_TREE_WOOD);

        getOrCreateTagBuilder(MavesTags.Items.AZALEA_STEMS)
                .add(MavesItems.AZALEA_BLOCK)
                .add(MavesItems.AZALEA_STEM)
                .add(MavesItems.AZALEA_WOOD)
                .add(MavesItems.STRIPPED_AZALEA_BLOCK)
                .add(MavesItems.STRIPPED_AZALEA_STEM)
                .add(MavesItems.STRIPPED_AZALEA_WOOD);

        getOrCreateTagBuilder(MavesTags.Items.CACAO_TREE_LOGS)
                .add(MavesItems.CACAO_TREE_BLOCK)
                .add(MavesItems.CACAO_TREE_LOG)
                .add(MavesItems.CACAO_TREE_WOOD)
                .add(MavesItems.STRIPPED_CACAO_TREE_BLOCK)
                .add(MavesItems.STRIPPED_CACAO_TREE_LOG)
                .add(MavesItems.STRIPPED_CACAO_TREE_WOOD);

        getOrCreateTagBuilder(MavesTags.Items.RUBBER_TREE_LOGS)
                .add(MavesItems.RUBBER_BLOCK)
                .add(MavesItems.RUBBER_LOG)
                .add(MavesItems.RUBBER_WOOD)
                .add(MavesItems.STRIPPED_RUBBER_BLOCK)
                .add(MavesItems.STRIPPED_RUBBER_LOG)
                .add(MavesItems.STRIPPED_RUBBER_WOOD);

        getOrCreateTagBuilder(MavesTags.Items.WILLOW_LOGS)
                .add(MavesItems.WILLOW_BLOCK)
                .add(MavesItems.WILLOW_LOG)
                .add(MavesItems.WILLOW_WOOD)
                .add(MavesItems.STRIPPED_WILLOW_BLOCK)
                .add(MavesItems.STRIPPED_WILLOW_LOG)
                .add(MavesItems.STRIPPED_WILLOW_WOOD);

        getOrCreateTagBuilder(ItemTags.OAK_LOGS)
                .add(MavesItems.OAK_BLOCK)
                .add(MavesItems.STRIPPED_OAK_BLOCK);

        getOrCreateTagBuilder(ItemTags.SPRUCE_LOGS)
                .add(MavesItems.SPRUCE_BLOCK)
                .add(MavesItems.STRIPPED_SPRUCE_BLOCK);

        getOrCreateTagBuilder(ItemTags.BIRCH_LOGS)
                .add(MavesItems.BIRCH_BLOCK)
                .add(MavesItems.STRIPPED_BIRCH_BLOCK);

        getOrCreateTagBuilder(ItemTags.JUNGLE_LOGS)
                .add(MavesItems.JUNGLE_BLOCK)
                .add(MavesItems.STRIPPED_JUNGLE_BLOCK);

        getOrCreateTagBuilder(ItemTags.ACACIA_LOGS)
                .add(MavesItems.ACACIA_BLOCK)
                .add(MavesItems.STRIPPED_ACACIA_BLOCK);

        getOrCreateTagBuilder(ItemTags.DARK_OAK_LOGS)
                .add(MavesItems.DARK_OAK_BLOCK)
                .add(MavesItems.STRIPPED_DARK_OAK_BLOCK);

        getOrCreateTagBuilder(ItemTags.MANGROVE_LOGS)
                .add(MavesItems.MANGROVE_BLOCK)
                .add(MavesItems.STRIPPED_MANGROVE_BLOCK);

        getOrCreateTagBuilder(ItemTags.CHERRY_LOGS)
                .add(MavesItems.CHERRY_BLOCK)
                .add(MavesItems.STRIPPED_CHERRY_BLOCK);

        getOrCreateTagBuilder(ItemTags.PALE_OAK_LOGS)
                .add(MavesItems.PALE_OAK_BLOCK)
                .add(MavesItems.STRIPPED_PALE_OAK_BLOCK);

        getOrCreateTagBuilder(ItemTags.CRIMSON_STEMS)
                .add(MavesItems.CRIMSON_BLOCK)
                .add(MavesItems.STRIPPED_CRIMSON_BLOCK);

        getOrCreateTagBuilder(ItemTags.WARPED_STEMS)
                .add(MavesItems.WARPED_BLOCK)
                .add(MavesItems.STRIPPED_WARPED_BLOCK);

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .addTag(MavesTags.Items.APPLE_TREE_LOGS)
                .addTag(MavesTags.Items.AZALEA_STEMS)
                .addTag(MavesTags.Items.CACAO_TREE_LOGS)
                .addTag(MavesTags.Items.RUBBER_TREE_LOGS)
                .addTag(MavesTags.Items.WILLOW_LOGS);

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(MavesItems.APPLE_TREE_BUTTON)
                .add(MavesItems.AZALEA_BUTTON)
                .add(MavesItems.CACAO_TREE_BUTTON)
                .add(MavesItems.RUBBER_BUTTON)
                .add(MavesItems.WILLOW_BUTTON);

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(MavesItems.APPLE_TREE_DOOR)
                .add(MavesItems.AZALEA_DOOR)
                .add(MavesItems.CACAO_TREE_DOOR)
                .add(MavesItems.RUBBER_DOOR)
                .add(MavesItems.WILLOW_DOOR);

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(MavesItems.APPLE_TREE_FENCE_GATE)
                .add(MavesItems.AZALEA_FENCE_GATE)
                .add(MavesItems.CACAO_TREE_FENCE_GATE)
                .add(MavesItems.RUBBER_FENCE_GATE)
                .add(MavesItems.WILLOW_FENCE_GATE);

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(MavesItems.APPLE_TREE_FENCE)
                .add(MavesItems.AZALEA_FENCE)
                .add(MavesItems.CACAO_TREE_FENCE)
                .add(MavesItems.RUBBER_FENCE)
                .add(MavesItems.WILLOW_FENCE);

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(MavesItems.APPLE_TREE_PRESSURE_PLATE)
                .add(MavesItems.AZALEA_PRESSURE_PLATE)
                .add(MavesItems.CACAO_TREE_PRESSURE_PLATE)
                .add(MavesItems.RUBBER_PRESSURE_PLATE)
                .add(MavesItems.WILLOW_PRESSURE_PLATE);

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(MavesItems.APPLE_TREE_SLAB)
                .add(MavesItems.AZALEA_SLAB)
                .add(MavesItems.CACAO_TREE_SLAB)
                .add(MavesItems.RUBBER_SLAB)
                .add(MavesItems.WILLOW_SLAB);

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(MavesItems.APPLE_TREE_STAIRS)
                .add(MavesItems.AZALEA_STAIRS)
                .add(MavesItems.CACAO_TREE_STAIRS)
                .add(MavesItems.RUBBER_STAIRS)
                .add(MavesItems.WILLOW_STAIRS);

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(MavesItems.APPLE_TREE_TRAPDOOR)
                .add(MavesItems.AZALEA_TRAPDOOR)
                .add(MavesItems.CACAO_TREE_TRAPDOOR)
                .add(MavesItems.RUBBER_TRAPDOOR)
                .add(MavesItems.WILLOW_TRAPDOOR);

        getOrCreateTagBuilder(MavesTags.Items.APPLES)
                .add(Items.APPLE)
                .add(MavesItems.GREEN_APPLE);

        getOrCreateTagBuilder(MavesTags.Items.WILD_BERRIES)
                .add(MavesItems.WILD_BERRIES_BLUE)
                .add(MavesItems.WILD_BERRIES_GREEN)
                .add(MavesItems.WILD_BERRIES_YELLOW);

        getOrCreateTagBuilder(MavesTags.Items.ACACIA_SLIVERS)
                .add(MavesItems.ACACIA_SLIVER)
                .add(MavesItems.STRIPPED_ACACIA_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.APPLE_TREE_SLIVERS)
                .add(MavesItems.APPLE_TREE_SLIVER)
                .add(MavesItems.STRIPPED_APPLE_TREE_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.AZALEA_SLIVERS)
                .add(MavesItems.AZALEA_SLIVER)
                .add(MavesItems.STRIPPED_AZALEA_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.BIRCH_SLIVERS)
                .add(MavesItems.BIRCH_SLIVER)
                .add(MavesItems.STRIPPED_BIRCH_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.CHERRY_SLIVERS)
                .add(MavesItems.CHERRY_SLIVER)
                .add(MavesItems.STRIPPED_CHERRY_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.CACAO_TREE_SLIVERS)
                .add(MavesItems.CACAO_TREE_SLIVER)
                .add(MavesItems.STRIPPED_CACAO_TREE_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.CRIMSON_SLIVERS)
                .add(MavesItems.CRIMSON_SLIVER)
                .add(MavesItems.STRIPPED_CRIMSON_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.DARK_OAK_SLIVERS)
                .add(MavesItems.DARK_OAK_SLIVER)
                .add(MavesItems.STRIPPED_DARK_OAK_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.JUNGLE_SLIVERS)
                .add(MavesItems.JUNGLE_SLIVER)
                .add(MavesItems.STRIPPED_JUNGLE_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.MANGROVE_SLIVERS)
                .add(MavesItems.MANGROVE_SLIVER)
                .add(MavesItems.STRIPPED_MANGROVE_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.OAK_SLIVERS)
                .add(MavesItems.OAK_SLIVER)
                .add(MavesItems.STRIPPED_OAK_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.PALE_OAK_SLIVERS)
                .add(MavesItems.PALE_OAK_SLIVER)
                .add(MavesItems.STRIPPED_PALE_OAK_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.RUBBER_SLIVERS)
                .add(MavesItems.RUBBER_SLIVER)
                .add(MavesItems.STRIPPED_RUBBER_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.SPRUCE_SLIVERS)
                .add(MavesItems.SPRUCE_SLIVER)
                .add(MavesItems.STRIPPED_SPRUCE_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.WARPED_SLIVERS)
                .add(MavesItems.WARPED_SLIVER)
                .add(MavesItems.STRIPPED_WARPED_SLIVER);

        getOrCreateTagBuilder(MavesTags.Items.WILLOW_SLIVERS)
                .add(MavesItems.WILLOW_SLIVER)
                .add(MavesItems.STRIPPED_WILLOW_SLIVER);

        getOrCreateTagBuilder(ItemTags.BEE_FOOD)
                .add(MavesItems.ACACIA_FLOWERING_LEAVES)
                .add(MavesItems.ACACIA_FLOWERED_LEAVES)
                .add(MavesItems.APPLE_TREE_FLOWERING_LEAVES)
                .add(MavesItems.APPLE_TREE_FLOWERED_LEAVES)
                .add(MavesItems.BIRCH_FLOWERING_LEAVES)
                .add(MavesItems.CHERRY_FLOWERING_LEAVES)
                .add(MavesItems.ACACIA_BLOSSOM)
                .add(MavesItems.APPLE_BLOSSOM)
                .add(MavesItems.AZALEA_BLOSSOM)
                .add(MavesItems.BIRCH_CATKINS);

        getOrCreateTagBuilder(ItemTags.CHICKEN_FOOD)
                .add(MavesItems.PALE_PUMPKIN_SEEDS);

        getOrCreateTagBuilder(ItemTags.FOX_FOOD)
                .addTag(MavesTags.Items.WILD_BERRIES);

        getOrCreateTagBuilder(ItemTags.HORSE_FOOD)
                .add(MavesItems.GREEN_APPLE);

        getOrCreateTagBuilder(ItemTags.PARROT_FOOD)
                .add(MavesItems.PALE_PUMPKIN_SEEDS);
    }
}
