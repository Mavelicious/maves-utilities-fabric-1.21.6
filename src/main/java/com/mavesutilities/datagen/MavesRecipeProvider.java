package com.mavesutilities.datagen;

import java.util.concurrent.CompletableFuture;

import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItems;
import com.mavesutilities.util.MavesTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

public class MavesRecipeProvider extends FabricRecipeProvider {
    public MavesRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {

                createShapeless(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.APPLE_TREE_PLANKS, 4)
                        .input(MavesTags.Items.APPLE_TREE_LOGS)
                        .group("planks")
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.AZALEA_PLANKS, 4)
                        .input(MavesTags.Items.AZALEA_STEMS)
                        .group("planks")
                        .criterion(hasItem(MavesBlocks.AZALEA_PLANKS),
                                conditionsFromItem(MavesBlocks.AZALEA_PLANKS))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.COCOA_TREE_PLANKS, 4)
                        .input(MavesTags.Items.COCOA_TREE_LOGS)
                        .group("planks")
                        .criterion(hasItem(MavesBlocks.COCOA_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.COCOA_TREE_PLANKS))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.RUBBER_PLANKS, 4)
                        .input(MavesTags.Items.RUBBER_TREE_LOGS)
                        .group("planks")
                        .criterion(hasItem(MavesBlocks.RUBBER_PLANKS),
                                conditionsFromItem(MavesBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.WILLOW_PLANKS, 4)
                        .input(MavesTags.Items.WILLOW_LOGS)
                        .group("planks")
                        .criterion(hasItem(MavesBlocks.WILLOW_PLANKS),
                                conditionsFromItem(MavesBlocks.WILLOW_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, Blocks.ACACIA_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.ACACIA_BARK)
                        .input('y', Blocks.STRIPPED_ACACIA_LOG)
                        .criterion(hasItem(Blocks.ACACIA_LOG),
                                conditionsFromItem(Blocks.ACACIA_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, MavesBlocks.APPLE_TREE_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.APPLE_TREE_BARK)
                        .input('y', MavesBlocks.STRIPPED_APPLE_TREE_LOG)
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_LOG),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, MavesBlocks.AZALEA_STEM)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.AZALEA_BARK)
                        .input('y', MavesBlocks.STRIPPED_AZALEA_STEM)
                        .criterion(hasItem(MavesBlocks.AZALEA_STEM),
                                conditionsFromItem(MavesBlocks.AZALEA_STEM))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, Blocks.BIRCH_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.BIRCH_BARK)
                        .input('y', Blocks.STRIPPED_BIRCH_LOG)
                        .criterion(hasItem(Blocks.BIRCH_LOG),
                                conditionsFromItem(Blocks.BIRCH_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, Blocks.CHERRY_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.CHERRY_BARK)
                        .input('y', Blocks.STRIPPED_CHERRY_LOG)
                        .criterion(hasItem(Blocks.CHERRY_LOG),
                                conditionsFromItem(Blocks.CHERRY_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, MavesBlocks.COCOA_TREE_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.COCOA_TREE_BARK)
                        .input('y', MavesBlocks.STRIPPED_COCOA_TREE_LOG)
                        .criterion(hasItem(MavesBlocks.COCOA_TREE_LOG),
                                conditionsFromItem(MavesBlocks.COCOA_TREE_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, Blocks.CRIMSON_STEM)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.CRIMSON_BARK)
                        .input('y', Blocks.STRIPPED_CRIMSON_STEM)
                        .criterion(hasItem(Blocks.CRIMSON_STEM),
                                conditionsFromItem(Blocks.CRIMSON_STEM))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, Blocks.DARK_OAK_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.DARK_OAK_BARK)
                        .input('y', Blocks.STRIPPED_DARK_OAK_LOG)
                        .criterion(hasItem(Blocks.DARK_OAK_LOG),
                                conditionsFromItem(Blocks.DARK_OAK_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, Blocks.JUNGLE_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.JUNGLE_BARK)
                        .input('y', Blocks.STRIPPED_JUNGLE_LOG)
                        .criterion(hasItem(Blocks.JUNGLE_LOG),
                                conditionsFromItem(Blocks.JUNGLE_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, Blocks.MANGROVE_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.MANGROVE_BARK)
                        .input('y', Blocks.STRIPPED_MANGROVE_LOG)
                        .criterion(hasItem(Blocks.MANGROVE_LOG),
                                conditionsFromItem(Blocks.MANGROVE_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, Blocks.OAK_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.OAK_BARK)
                        .input('y', Blocks.STRIPPED_OAK_LOG)
                        .criterion(hasItem(Blocks.OAK_LOG),
                                conditionsFromItem(Blocks.OAK_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, Blocks.PALE_OAK_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.PALE_OAK_BARK)
                        .input('y', Blocks.STRIPPED_PALE_OAK_LOG)
                        .criterion(hasItem(Blocks.PALE_OAK_LOG),
                                conditionsFromItem(Blocks.PALE_OAK_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, MavesBlocks.RUBBER_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.RUBBER_BARK)
                        .input('y', MavesBlocks.STRIPPED_RUBBER_LOG)
                        .criterion(hasItem(MavesBlocks.RUBBER_LOG),
                                conditionsFromItem(MavesBlocks.RUBBER_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, Blocks.SPRUCE_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.SPRUCE_BARK)
                        .input('y', Blocks.STRIPPED_SPRUCE_LOG)
                        .criterion(hasItem(Blocks.SPRUCE_LOG),
                                conditionsFromItem(Blocks.SPRUCE_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, Blocks.WARPED_STEM)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.CHERRY_BARK)
                        .input('y', Blocks.STRIPPED_WARPED_STEM)
                        .criterion(hasItem(Blocks.WARPED_STEM),
                                conditionsFromItem(Blocks.WARPED_STEM))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, MavesBlocks.WILLOW_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.WILLOW_BARK)
                        .input('y', MavesBlocks.STRIPPED_WILLOW_LOG)
                        .criterion(hasItem(MavesBlocks.WILLOW_LOG),
                                conditionsFromItem(MavesBlocks.WILLOW_LOG))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName () {
        return "MavesRecipeProvider";
    }
}
