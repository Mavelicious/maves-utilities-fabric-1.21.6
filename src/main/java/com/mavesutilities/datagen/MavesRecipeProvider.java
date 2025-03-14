package com.mavesutilities.datagen;

import java.util.concurrent.CompletableFuture;

import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItems;
import com.mavesutilities.util.MavesTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
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

                createShapeless(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.CACAO_TREE_PLANKS, 4)
                        .input(MavesTags.Items.CACAO_TREE_LOGS)
                        .group("planks")
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_PLANKS))
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

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.ACACIA_BARK)
                        .input('y', Blocks.STRIPPED_ACACIA_LOG)
                        .group("logs")
                        .criterion(hasItem(Blocks.ACACIA_LOG),
                                conditionsFromItem(Blocks.ACACIA_LOG))
                        .offerTo(exporter, "acacia_log_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.APPLE_TREE_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.APPLE_TREE_BARK)
                        .input('y', MavesBlocks.STRIPPED_APPLE_TREE_LOG)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_LOG),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_LOG))
                        .offerTo(exporter, "apple_tree_log_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.AZALEA_STEM)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.AZALEA_BARK)
                        .input('y', MavesBlocks.STRIPPED_AZALEA_STEM)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.AZALEA_STEM),
                                conditionsFromItem(MavesBlocks.AZALEA_STEM))
                        .offerTo(exporter, "azalea_stem_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.BIRCH_BARK)
                        .input('y', Blocks.STRIPPED_BIRCH_LOG)
                        .group("logs")
                        .criterion(hasItem(Blocks.BIRCH_LOG),
                                conditionsFromItem(Blocks.BIRCH_LOG))
                        .offerTo(exporter, "birch_log_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.CHERRY_BARK)
                        .input('y', Blocks.STRIPPED_CHERRY_LOG)
                        .group("logs")
                        .criterion(hasItem(Blocks.CHERRY_LOG),
                                conditionsFromItem(Blocks.CHERRY_LOG))
                        .offerTo(exporter, "cherry_log_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.CACAO_TREE_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.CACAO_TREE_BARK)
                        .input('y', MavesBlocks.STRIPPED_CACAO_TREE_LOG)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_LOG),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_LOG))
                        .offerTo(exporter, "cacao_tree_log_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_STEM)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.CRIMSON_BARK)
                        .input('y', Blocks.STRIPPED_CRIMSON_STEM)
                        .group("logs")
                        .criterion(hasItem(Blocks.CRIMSON_STEM),
                                conditionsFromItem(Blocks.CRIMSON_STEM))
                        .offerTo(exporter, "crimson_stem_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.DARK_OAK_BARK)
                        .input('y', Blocks.STRIPPED_DARK_OAK_LOG)
                        .group("logs")
                        .criterion(hasItem(Blocks.DARK_OAK_LOG),
                                conditionsFromItem(Blocks.DARK_OAK_LOG))
                        .offerTo(exporter, "dark_oak_log_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.JUNGLE_BARK)
                        .input('y', Blocks.STRIPPED_JUNGLE_LOG)
                        .group("logs")
                        .criterion(hasItem(Blocks.JUNGLE_LOG),
                                conditionsFromItem(Blocks.JUNGLE_LOG))
                        .offerTo(exporter, "jungle_log_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.MANGROVE_BARK)
                        .input('y', Blocks.STRIPPED_MANGROVE_LOG)
                        .group("logs")
                        .criterion(hasItem(Blocks.MANGROVE_LOG),
                                conditionsFromItem(Blocks.MANGROVE_LOG))
                        .offerTo(exporter, "mangrove_log_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.OAK_BARK)
                        .input('y', Blocks.STRIPPED_OAK_LOG)
                        .group("logs")
                        .criterion(hasItem(Blocks.OAK_LOG),
                                conditionsFromItem(Blocks.OAK_LOG))
                        .offerTo(exporter, "oak_log_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_OAK_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.PALE_OAK_BARK)
                        .input('y', Blocks.STRIPPED_PALE_OAK_LOG)
                        .group("logs")
                        .criterion(hasItem(Blocks.PALE_OAK_LOG),
                                conditionsFromItem(Blocks.PALE_OAK_LOG))
                        .offerTo(exporter, "pale_oak_log_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.RUBBER_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.RUBBER_BARK)
                        .input('y', MavesBlocks.STRIPPED_RUBBER_LOG)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.RUBBER_LOG),
                                conditionsFromItem(MavesBlocks.RUBBER_LOG))
                        .offerTo(exporter, "rubber_log_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.SPRUCE_BARK)
                        .input('y', Blocks.STRIPPED_SPRUCE_LOG)
                        .group("logs")
                        .criterion(hasItem(Blocks.SPRUCE_LOG),
                                conditionsFromItem(Blocks.SPRUCE_LOG))
                        .offerTo(exporter, "spruce_log_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_STEM)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.WARPED_BARK)
                        .input('y', Blocks.STRIPPED_WARPED_STEM)
                        .group("logs")
                        .criterion(hasItem(Blocks.WARPED_STEM),
                                conditionsFromItem(Blocks.WARPED_STEM))
                        .offerTo(exporter, "warped_stem_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.WILLOW_LOG)
                        .pattern("x x")
                        .pattern(" y ")
                        .pattern("x x")
                        .input('x', MavesItems.WILLOW_BARK)
                        .input('y', MavesBlocks.STRIPPED_WILLOW_LOG)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.WILLOW_LOG),
                                conditionsFromItem(MavesBlocks.WILLOW_LOG))
                        .offerTo(exporter, "willow_log_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_WOOD)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.ACACIA_BARK)
                        .input('y', Blocks.STRIPPED_ACACIA_LOG)
                        .criterion(hasItem(Blocks.ACACIA_LOG),
                                conditionsFromItem(Blocks.ACACIA_LOG))
                        .offerTo(exporter, "acacia_wood_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.APPLE_TREE_WOOD)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.APPLE_TREE_BARK)
                        .input('y', MavesBlocks.STRIPPED_APPLE_TREE_LOG)
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_LOG),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_LOG))
                        .offerTo(exporter, "apple_tree_wood_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.AZALEA_WOOD)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.AZALEA_BARK)
                        .input('y', MavesBlocks.STRIPPED_AZALEA_STEM)
                        .criterion(hasItem(MavesBlocks.AZALEA_STEM),
                                conditionsFromItem(MavesBlocks.AZALEA_STEM))
                        .offerTo(exporter, "azalea_wood_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_WOOD)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.BIRCH_BARK)
                        .input('y', Blocks.STRIPPED_BIRCH_LOG)
                        .criterion(hasItem(Blocks.BIRCH_LOG),
                                conditionsFromItem(Blocks.BIRCH_LOG))
                        .offerTo(exporter, "birch_wood_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_WOOD)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.CHERRY_BARK)
                        .input('y', Blocks.STRIPPED_CHERRY_LOG)
                        .criterion(hasItem(Blocks.CHERRY_LOG),
                                conditionsFromItem(Blocks.CHERRY_LOG))
                        .offerTo(exporter, "cherry_wood_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.CACAO_TREE_WOOD)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.CACAO_TREE_BARK)
                        .input('y', MavesBlocks.STRIPPED_CACAO_TREE_LOG)
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_LOG),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_LOG))
                        .offerTo(exporter, "cacao_tree_wood_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_HYPHAE)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.CRIMSON_BARK)
                        .input('y', Blocks.STRIPPED_CRIMSON_STEM)
                        .criterion(hasItem(Blocks.CRIMSON_STEM),
                                conditionsFromItem(Blocks.CRIMSON_STEM))
                        .offerTo(exporter, "crimson_hyphae_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_WOOD)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.DARK_OAK_BARK)
                        .input('y', Blocks.STRIPPED_DARK_OAK_LOG)
                        .criterion(hasItem(Blocks.DARK_OAK_LOG),
                                conditionsFromItem(Blocks.DARK_OAK_LOG))
                        .offerTo(exporter, "dark_oak_wood_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_WOOD)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.JUNGLE_BARK)
                        .input('y', Blocks.STRIPPED_JUNGLE_LOG)
                        .criterion(hasItem(Blocks.JUNGLE_LOG),
                                conditionsFromItem(Blocks.JUNGLE_LOG))
                        .offerTo(exporter, "jungle_wood_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_WOOD)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.MANGROVE_BARK)
                        .input('y', Blocks.STRIPPED_MANGROVE_LOG)
                        .criterion(hasItem(Blocks.MANGROVE_LOG),
                                conditionsFromItem(Blocks.MANGROVE_LOG))
                        .offerTo(exporter, "mangrove_wood_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_WOOD)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.OAK_BARK)
                        .input('y', Blocks.STRIPPED_OAK_LOG)
                        .criterion(hasItem(Blocks.OAK_LOG),
                                conditionsFromItem(Blocks.OAK_LOG))
                        .offerTo(exporter, "oak_wood_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_OAK_WOOD)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.PALE_OAK_BARK)
                        .input('y', Blocks.STRIPPED_PALE_OAK_LOG)
                        .criterion(hasItem(Blocks.PALE_OAK_LOG),
                                conditionsFromItem(Blocks.PALE_OAK_LOG))
                        .offerTo(exporter, "pale_oak_wood_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.RUBBER_WOOD)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.RUBBER_BARK)
                        .input('y', MavesBlocks.STRIPPED_RUBBER_LOG)
                        .criterion(hasItem(MavesBlocks.RUBBER_LOG),
                                conditionsFromItem(MavesBlocks.RUBBER_LOG))
                        .offerTo(exporter, "rubber_wood_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_WOOD)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.SPRUCE_BARK)
                        .input('y', Blocks.STRIPPED_SPRUCE_LOG)
                        .criterion(hasItem(Blocks.SPRUCE_LOG),
                                conditionsFromItem(Blocks.SPRUCE_LOG))
                        .offerTo(exporter, "spruce_wood_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_HYPHAE)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.WARPED_BARK)
                        .input('y', Blocks.STRIPPED_WARPED_STEM)
                        .criterion(hasItem(Blocks.WARPED_STEM),
                                conditionsFromItem(Blocks.WARPED_STEM))
                        .offerTo(exporter, "warped_hyphae_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.WILLOW_WOOD)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern("xxx")
                        .input('x', MavesItems.WILLOW_BARK)
                        .input('y', MavesBlocks.STRIPPED_WILLOW_LOG)
                        .criterion(hasItem(MavesBlocks.WILLOW_LOG),
                                conditionsFromItem(MavesBlocks.WILLOW_LOG))
                        .offerTo(exporter, "willow_wood_from_bark");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_WOOD)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.ACACIA_BARK)
                        .input('y', Blocks.ACACIA_LOG)
                        .criterion(hasItem(Blocks.ACACIA_LOG),
                                conditionsFromItem(Blocks.ACACIA_LOG))
                        .offerTo(exporter, "acacia_wood_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.APPLE_TREE_WOOD)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.APPLE_TREE_BARK)
                        .input('y', MavesBlocks.APPLE_TREE_LOG)
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_LOG),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_LOG))
                        .offerTo(exporter, "apple_tree_wood_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.AZALEA_WOOD)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.AZALEA_BARK)
                        .input('y', MavesBlocks.AZALEA_STEM)
                        .criterion(hasItem(MavesBlocks.AZALEA_STEM),
                                conditionsFromItem(MavesBlocks.AZALEA_STEM))
                        .offerTo(exporter, "azalea_wood_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_WOOD)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.BIRCH_BARK)
                        .input('y', Blocks.BIRCH_LOG)
                        .criterion(hasItem(Blocks.BIRCH_LOG),
                                conditionsFromItem(Blocks.BIRCH_LOG))
                        .offerTo(exporter, "birch_wood_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_WOOD)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.CHERRY_BARK)
                        .input('y', Blocks.CHERRY_LOG)
                        .criterion(hasItem(Blocks.CHERRY_LOG),
                                conditionsFromItem(Blocks.CHERRY_LOG))
                        .offerTo(exporter, "cherry_wood_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.CACAO_TREE_WOOD)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.CACAO_TREE_BARK)
                        .input('y', MavesBlocks.CACAO_TREE_LOG)
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_LOG),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_LOG))
                        .offerTo(exporter, "cacao_tree_wood_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_HYPHAE)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.CRIMSON_BARK)
                        .input('y', Blocks.CRIMSON_STEM)
                        .criterion(hasItem(Blocks.CRIMSON_STEM),
                                conditionsFromItem(Blocks.CRIMSON_STEM))
                        .offerTo(exporter, "crimson_hyphae_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_WOOD)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.DARK_OAK_BARK)
                        .input('y', Blocks.DARK_OAK_LOG)
                        .criterion(hasItem(Blocks.DARK_OAK_LOG),
                                conditionsFromItem(Blocks.DARK_OAK_LOG))
                        .offerTo(exporter, "dark_oak_wood_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_WOOD)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.JUNGLE_BARK)
                        .input('y', Blocks.JUNGLE_LOG)
                        .criterion(hasItem(Blocks.JUNGLE_LOG),
                                conditionsFromItem(Blocks.JUNGLE_LOG))
                        .offerTo(exporter, "jungle_wood_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_WOOD)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.MANGROVE_BARK)
                        .input('y', Blocks.MANGROVE_LOG)
                        .criterion(hasItem(Blocks.MANGROVE_LOG),
                                conditionsFromItem(Blocks.MANGROVE_LOG))
                        .offerTo(exporter, "mangrove_wood_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_WOOD)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.OAK_BARK)
                        .input('y', Blocks.OAK_LOG)
                        .criterion(hasItem(Blocks.OAK_LOG),
                                conditionsFromItem(Blocks.OAK_LOG))
                        .offerTo(exporter, "oak_wood_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_OAK_WOOD)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.PALE_OAK_BARK)
                        .input('y', Blocks.PALE_OAK_LOG)
                        .criterion(hasItem(Blocks.PALE_OAK_LOG),
                                conditionsFromItem(Blocks.PALE_OAK_LOG))
                        .offerTo(exporter, "pale_oak_wood_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.RUBBER_WOOD)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.RUBBER_BARK)
                        .input('y', MavesBlocks.RUBBER_LOG)
                        .criterion(hasItem(MavesBlocks.RUBBER_LOG),
                                conditionsFromItem(MavesBlocks.RUBBER_LOG))
                        .offerTo(exporter, "rubber_wood_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_WOOD)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.SPRUCE_BARK)
                        .input('y', Blocks.SPRUCE_LOG)
                        .criterion(hasItem(Blocks.SPRUCE_LOG),
                                conditionsFromItem(Blocks.SPRUCE_LOG))
                        .offerTo(exporter, "spruce_wood_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_HYPHAE)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.WARPED_BARK)
                        .input('y', Blocks.WARPED_STEM)
                        .criterion(hasItem(Blocks.WARPED_STEM),
                                conditionsFromItem(Blocks.WARPED_STEM))
                        .offerTo(exporter, "warped_hyphae_from_bark_log");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.WILLOW_WOOD)
                        .pattern(" x ")
                        .pattern(" y ")
                        .pattern(" x ")
                        .input('x', MavesItems.WILLOW_BARK)
                        .input('y', MavesBlocks.WILLOW_LOG)
                        .criterion(hasItem(MavesBlocks.WILLOW_LOG),
                                conditionsFromItem(MavesBlocks.WILLOW_LOG))
                        .offerTo(exporter, "willow_wood_from_bark_log");

                createButtonRecipe(MavesBlocks.APPLE_TREE_BUTTON, 
                        Ingredient.ofItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .group("wooden_button")
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .offerTo(exporter);

                createButtonRecipe(MavesBlocks.AZALEA_BUTTON,
                        Ingredient.ofItem(MavesBlocks.AZALEA_PLANKS))
                        .group("wooden_button")
                        .criterion(hasItem(MavesBlocks.AZALEA_PLANKS),
                                conditionsFromItem(MavesBlocks.AZALEA_PLANKS))
                        .offerTo(exporter);

                createButtonRecipe(MavesBlocks.CACAO_TREE_BUTTON,
                        Ingredient.ofItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .group("wooden_button")
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .offerTo(exporter);

                createButtonRecipe(MavesBlocks.RUBBER_BUTTON,
                        Ingredient.ofItem(MavesBlocks.RUBBER_PLANKS))
                        .group("wooden_button")
                        .criterion(hasItem(MavesBlocks.RUBBER_PLANKS),
                                conditionsFromItem(MavesBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createButtonRecipe(MavesBlocks.WILLOW_BUTTON,
                        Ingredient.ofItem(MavesBlocks.WILLOW_PLANKS))
                        .group("wooden_button")
                        .criterion(hasItem(MavesBlocks.WILLOW_PLANKS),
                                conditionsFromItem(MavesBlocks.WILLOW_PLANKS))
                        .offerTo(exporter);

                createDoorRecipe(MavesBlocks.APPLE_TREE_DOOR, 
                        Ingredient.ofItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .group("wooden_door")
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .offerTo(exporter);

                createDoorRecipe(MavesBlocks.AZALEA_DOOR,
                        Ingredient.ofItem(MavesBlocks.AZALEA_PLANKS))
                        .group("wooden_door")
                        .criterion(hasItem(MavesBlocks.AZALEA_PLANKS),
                                conditionsFromItem(MavesBlocks.AZALEA_PLANKS))
                        .offerTo(exporter);

                createDoorRecipe(MavesBlocks.CACAO_TREE_DOOR,
                        Ingredient.ofItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .group("wooden_door")
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .offerTo(exporter);

                createDoorRecipe(MavesBlocks.RUBBER_DOOR,
                        Ingredient.ofItem(MavesBlocks.RUBBER_PLANKS))
                        .group("wooden_door")
                        .criterion(hasItem(MavesBlocks.RUBBER_PLANKS),
                                conditionsFromItem(MavesBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createDoorRecipe(MavesBlocks.WILLOW_DOOR,
                        Ingredient.ofItem(MavesBlocks.WILLOW_PLANKS))
                        .group("wooden_door")
                        .criterion(hasItem(MavesBlocks.WILLOW_PLANKS),
                                conditionsFromItem(MavesBlocks.WILLOW_PLANKS))
                        .offerTo(exporter);

                createFenceRecipe(MavesBlocks.APPLE_TREE_FENCE,
                        Ingredient.ofItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .group("wooden_fence")
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .offerTo(exporter);

                createFenceRecipe(MavesBlocks.AZALEA_FENCE,
                        Ingredient.ofItem(MavesBlocks.AZALEA_PLANKS))
                        .group("wooden_fence")
                        .criterion(hasItem(MavesBlocks.AZALEA_PLANKS),
                                conditionsFromItem(MavesBlocks.AZALEA_PLANKS))
                        .offerTo(exporter);

                createFenceRecipe(MavesBlocks.CACAO_TREE_FENCE,
                        Ingredient.ofItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .group("wooden_fence")
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .offerTo(exporter);

                createFenceRecipe(MavesBlocks.RUBBER_FENCE,
                        Ingredient.ofItem(MavesBlocks.RUBBER_PLANKS))
                        .group("wooden_fence")
                        .criterion(hasItem(MavesBlocks.RUBBER_PLANKS),
                                conditionsFromItem(MavesBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createFenceRecipe(MavesBlocks.WILLOW_FENCE,
                        Ingredient.ofItem(MavesBlocks.WILLOW_PLANKS))
                        .group("wooden_fence")
                        .criterion(hasItem(MavesBlocks.WILLOW_PLANKS),
                                conditionsFromItem(MavesBlocks.WILLOW_PLANKS))
                        .offerTo(exporter);

                createFenceGateRecipe(MavesBlocks.APPLE_TREE_FENCE_GATE,
                        Ingredient.ofItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .group("wooden_fence_gate")
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .offerTo(exporter);

                createFenceGateRecipe(MavesBlocks.AZALEA_FENCE_GATE,
                        Ingredient.ofItem(MavesBlocks.AZALEA_PLANKS))
                        .group("wooden_fence_gate")
                        .criterion(hasItem(MavesBlocks.AZALEA_PLANKS),
                                conditionsFromItem(MavesBlocks.AZALEA_PLANKS))
                        .offerTo(exporter);

                createFenceGateRecipe(MavesBlocks.CACAO_TREE_FENCE_GATE,
                        Ingredient.ofItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .group("wooden_fence_gate")
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .offerTo(exporter);

                createFenceGateRecipe(MavesBlocks.RUBBER_FENCE_GATE,
                        Ingredient.ofItem(MavesBlocks.RUBBER_PLANKS))
                        .group("wooden_fence_gate")
                        .criterion(hasItem(MavesBlocks.RUBBER_PLANKS),
                                conditionsFromItem(MavesBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createFenceGateRecipe(MavesBlocks.WILLOW_FENCE_GATE,
                        Ingredient.ofItem(MavesBlocks.WILLOW_PLANKS))
                        .group("wooden_fence_gate")
                        .criterion(hasItem(MavesBlocks.WILLOW_PLANKS),
                                conditionsFromItem(MavesBlocks.WILLOW_PLANKS))
                        .offerTo(exporter);

                createPressurePlateRecipe(RecipeCategory.REDSTONE, MavesBlocks.APPLE_TREE_PRESSURE_PLATE,
                        Ingredient.ofItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .group("wooden_pressure_plate")
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .offerTo(exporter);

                createPressurePlateRecipe(RecipeCategory.REDSTONE, MavesBlocks.AZALEA_PRESSURE_PLATE,
                        Ingredient.ofItem(MavesBlocks.AZALEA_PLANKS))
                        .group("wooden_pressure_plate")
                        .criterion(hasItem(MavesBlocks.AZALEA_PLANKS),
                                conditionsFromItem(MavesBlocks.AZALEA_PLANKS))
                        .offerTo(exporter);

                createPressurePlateRecipe(RecipeCategory.REDSTONE, MavesBlocks.CACAO_TREE_PRESSURE_PLATE,
                        Ingredient.ofItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .group("wooden_pressure_plate")
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .offerTo(exporter);

                createPressurePlateRecipe(RecipeCategory.REDSTONE, MavesBlocks.RUBBER_PRESSURE_PLATE,
                        Ingredient.ofItem(MavesBlocks.RUBBER_PLANKS))
                        .group("wooden_pressure_plate")
                        .criterion(hasItem(MavesBlocks.RUBBER_PLANKS),
                                conditionsFromItem(MavesBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createPressurePlateRecipe(RecipeCategory.REDSTONE, MavesBlocks.WILLOW_PRESSURE_PLATE,
                        Ingredient.ofItem(MavesBlocks.WILLOW_PLANKS))
                        .group("wooden_pressure_plate")
                        .criterion(hasItem(MavesBlocks.WILLOW_PLANKS),
                                conditionsFromItem(MavesBlocks.WILLOW_PLANKS))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.APPLE_TREE_SLAB,
                        Ingredient.ofItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .group("wooden_slab")
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.AZALEA_SLAB,
                        Ingredient.ofItem(MavesBlocks.AZALEA_PLANKS))
                        .group("wooden_slab")
                        .criterion(hasItem(MavesBlocks.AZALEA_PLANKS),
                                conditionsFromItem(MavesBlocks.AZALEA_PLANKS))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.CACAO_TREE_SLAB,
                        Ingredient.ofItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .group("wooden_slab")
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.RUBBER_SLAB,
                        Ingredient.ofItem(MavesBlocks.RUBBER_PLANKS))
                        .group("wooden_slab")
                        .criterion(hasItem(MavesBlocks.RUBBER_PLANKS),
                                conditionsFromItem(MavesBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.WILLOW_SLAB,
                        Ingredient.ofItem(MavesBlocks.WILLOW_PLANKS))
                        .group("wooden_slab")
                        .criterion(hasItem(MavesBlocks.WILLOW_PLANKS),
                                conditionsFromItem(MavesBlocks.WILLOW_PLANKS))
                        .offerTo(exporter);

                createStairsRecipe(MavesBlocks.APPLE_TREE_STAIRS,
                        Ingredient.ofItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .group("wooden_stairs")
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .offerTo(exporter);

                createStairsRecipe(MavesBlocks.AZALEA_STAIRS,
                        Ingredient.ofItem(MavesBlocks.AZALEA_PLANKS))
                        .group("wooden_stairs")
                        .criterion(hasItem(MavesBlocks.AZALEA_PLANKS),
                                conditionsFromItem(MavesBlocks.AZALEA_PLANKS))
                        .offerTo(exporter);

                createStairsRecipe(MavesBlocks.CACAO_TREE_STAIRS,
                        Ingredient.ofItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .group("wooden_stairs")
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .offerTo(exporter);

                createStairsRecipe(MavesBlocks.RUBBER_STAIRS,
                        Ingredient.ofItem(MavesBlocks.RUBBER_PLANKS))
                        .group("wooden_stairs")
                        .criterion(hasItem(MavesBlocks.RUBBER_PLANKS),
                                conditionsFromItem(MavesBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createStairsRecipe(MavesBlocks.WILLOW_STAIRS,
                        Ingredient.ofItem(MavesBlocks.WILLOW_PLANKS))
                        .group("wooden_stairs")
                        .criterion(hasItem(MavesBlocks.WILLOW_PLANKS),
                                conditionsFromItem(MavesBlocks.WILLOW_PLANKS))
                        .offerTo(exporter);

                createTrapdoorRecipe(MavesBlocks.APPLE_TREE_TRAPDOOR,
                        Ingredient.ofItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .group("wooden_trapdoor")
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .offerTo(exporter);

                createTrapdoorRecipe(MavesBlocks.AZALEA_TRAPDOOR,
                        Ingredient.ofItem(MavesBlocks.AZALEA_PLANKS))
                        .group("wooden_trapdoor")
                        .criterion(hasItem(MavesBlocks.AZALEA_PLANKS),
                                conditionsFromItem(MavesBlocks.AZALEA_PLANKS))
                        .offerTo(exporter);

                createTrapdoorRecipe(MavesBlocks.CACAO_TREE_TRAPDOOR,
                        Ingredient.ofItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .group("wooden_trapdoor")
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .offerTo(exporter);

                createTrapdoorRecipe(MavesBlocks.RUBBER_TRAPDOOR,
                        Ingredient.ofItem(MavesBlocks.RUBBER_PLANKS))
                        .group("wooden_trapdoor")
                        .criterion(hasItem(MavesBlocks.RUBBER_PLANKS),
                                conditionsFromItem(MavesBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createTrapdoorRecipe(MavesBlocks.WILLOW_TRAPDOOR,
                        Ingredient.ofItem(MavesBlocks.WILLOW_PLANKS))
                        .group("wooden_trapdoor")
                        .criterion(hasItem(MavesBlocks.WILLOW_PLANKS),
                                conditionsFromItem(MavesBlocks.WILLOW_PLANKS))
                        .offerTo(exporter);

                createSignRecipe(MavesBlocks.APPLE_TREE_SIGN,
                        Ingredient.ofItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .offerTo(exporter);

                createSignRecipe(MavesBlocks.AZALEA_SIGN,
                        Ingredient.ofItem(MavesBlocks.AZALEA_PLANKS))
                        .criterion(hasItem(MavesBlocks.AZALEA_PLANKS),
                                conditionsFromItem(MavesBlocks.AZALEA_PLANKS))
                        .offerTo(exporter);

                createSignRecipe(MavesBlocks.CACAO_TREE_SIGN,
                        Ingredient.ofItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .offerTo(exporter);

                createSignRecipe(MavesBlocks.RUBBER_SIGN,
                        Ingredient.ofItem(MavesBlocks.RUBBER_PLANKS))
                        .criterion(hasItem(MavesBlocks.RUBBER_PLANKS),
                                conditionsFromItem(MavesBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createSignRecipe(MavesBlocks.WILLOW_SIGN,
                        Ingredient.ofItem(MavesBlocks.WILLOW_PLANKS))
                        .criterion(hasItem(MavesBlocks.WILLOW_PLANKS),
                                conditionsFromItem(MavesBlocks.WILLOW_PLANKS))
                        .offerTo(exporter);

                offerHangingSignRecipe(MavesBlocks.APPLE_TREE_HANGING_SIGN,
                        MavesBlocks.STRIPPED_APPLE_TREE_LOG);

                offerHangingSignRecipe(MavesBlocks.AZALEA_HANGING_SIGN,
                        MavesBlocks.STRIPPED_AZALEA_STEM);

                offerHangingSignRecipe(MavesBlocks.CACAO_TREE_HANGING_SIGN,
                        MavesBlocks.STRIPPED_CACAO_TREE_LOG);

                offerHangingSignRecipe(MavesBlocks.RUBBER_HANGING_SIGN,
                        MavesBlocks.STRIPPED_RUBBER_LOG);

                offerHangingSignRecipe(MavesBlocks.WILLOW_HANGING_SIGN,
                        MavesBlocks.STRIPPED_WILLOW_LOG);

                offerBoatRecipe(MavesItems.APPLE_TREE_BOAT,
                        MavesBlocks.APPLE_TREE_PLANKS);

                offerChestBoatRecipe(MavesItems.APPLE_TREE_CHEST_BOAT,
                        MavesBlocks.APPLE_TREE_PLANKS);

                offerBoatRecipe(MavesItems.AZALEA_BOAT,
                        MavesBlocks.AZALEA_PLANKS);

                offerChestBoatRecipe(MavesItems.AZALEA_CHEST_BOAT,
                        MavesBlocks.AZALEA_PLANKS);

                offerBoatRecipe(MavesItems.CACAO_TREE_BOAT,
                        MavesBlocks.CACAO_TREE_PLANKS);

                offerChestBoatRecipe(MavesItems.CACAO_TREE_CHEST_BOAT,
                        MavesBlocks.CACAO_TREE_PLANKS);

                offerBoatRecipe(MavesItems.RUBBER_BOAT,
                        MavesBlocks.RUBBER_PLANKS);

                offerChestBoatRecipe(MavesItems.RUBBER_CHEST_BOAT,
                        MavesBlocks.RUBBER_PLANKS);

                offerBoatRecipe(MavesItems.WILLOW_BOAT,
                        MavesBlocks.WILLOW_PLANKS);

                offerChestBoatRecipe(MavesItems.WILLOW_CHEST_BOAT,
                        MavesBlocks.WILLOW_PLANKS);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.APPLE_TREE_WOOD, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesBlocks.APPLE_TREE_LOG)
                        .group("bark")
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_LOG),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.AZALEA_WOOD, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesBlocks.AZALEA_STEM)
                        .group("bark")
                        .criterion(hasItem(MavesBlocks.AZALEA_STEM),
                                conditionsFromItem(MavesBlocks.AZALEA_STEM))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.CACAO_TREE_WOOD, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesBlocks.CACAO_TREE_LOG)
                        .group("bark")
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_LOG),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.RUBBER_WOOD, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesBlocks.RUBBER_LOG)
                        .group("bark")
                        .criterion(hasItem(MavesBlocks.RUBBER_LOG),
                                conditionsFromItem(MavesBlocks.RUBBER_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.WILLOW_WOOD, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesBlocks.WILLOW_LOG)
                        .group("bark")
                        .criterion(hasItem(MavesBlocks.WILLOW_LOG),
                                conditionsFromItem(MavesBlocks.WILLOW_LOG))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Items.YELLOW_DYE)
                        .input(MavesItems.ACACIA_BLOSSOM)
                        .group("yellow_dye")
                        .criterion(hasItem(MavesItems.ACACIA_BLOSSOM),
                                conditionsFromItem(MavesItems.ACACIA_BLOSSOM))
                        .offerTo(exporter, "yellow_dye_from_acacia_blossom");

                createShapeless(RecipeCategory.MISC, Items.WHITE_DYE)
                        .input(MavesItems.APPLE_BLOSSOM)
                        .group("white_dye")
                        .criterion(hasItem(MavesItems.APPLE_BLOSSOM),
                                conditionsFromItem(MavesItems.APPLE_BLOSSOM))
                        .offerTo(exporter, "white_dye_from_apple_blossom");

                createShapeless(RecipeCategory.MISC, Items.PINK_DYE)
                        .input(MavesItems.AZALEA_BLOSSOM)
                        .group("pink_dye")
                        .criterion(hasItem(MavesItems.AZALEA_BLOSSOM),
                                conditionsFromItem(MavesItems.AZALEA_BLOSSOM))
                        .offerTo(exporter, "pink_dye_from_azalea_blossom");

                createShapeless(RecipeCategory.MISC, Items.BROWN_DYE)
                        .input(MavesItems.BIRCH_CATKINS)
                        .group("brown_dye")
                        .criterion(hasItem(MavesItems.BIRCH_CATKINS),
                                conditionsFromItem(MavesItems.BIRCH_CATKINS))
                        .offerTo(exporter, "brown_dye_from_birch_catkin");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.PUMPKIN)
                        .input(MavesItems.PUMPKIN_SLICE)
                        .input(MavesItems.PUMPKIN_SLICE)
                        .input(MavesItems.PUMPKIN_SLICE)
                        .input(MavesItems.PUMPKIN_SLICE)
                        .input(MavesItems.PUMPKIN_SLICE)
                        .input(MavesItems.PUMPKIN_SLICE)
                        .input(MavesItems.PUMPKIN_SLICE)
                        .input(MavesItems.PUMPKIN_SLICE)
                        .input(MavesItems.PUMPKIN_SLICE)
                        .criterion(hasItem(Items.PUMPKIN),
                                conditionsFromItem(Items.PUMPKIN))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.PALE_PUMPKIN)
                        .input(MavesItems.PALE_PUMPKIN_SLICE)
                        .input(MavesItems.PALE_PUMPKIN_SLICE)
                        .input(MavesItems.PALE_PUMPKIN_SLICE)
                        .input(MavesItems.PALE_PUMPKIN_SLICE)
                        .input(MavesItems.PALE_PUMPKIN_SLICE)
                        .input(MavesItems.PALE_PUMPKIN_SLICE)
                        .input(MavesItems.PALE_PUMPKIN_SLICE)
                        .input(MavesItems.PALE_PUMPKIN_SLICE)
                        .input(MavesItems.PALE_PUMPKIN_SLICE)
                        .criterion(hasItem(MavesBlocks.PALE_PUMPKIN),
                                conditionsFromItem(MavesBlocks.PALE_PUMPKIN))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, MavesItems.PALE_PUMPKIN_SEEDS)
                        .input(MavesItems.PALE_PUMPKIN_SLICE)
                        .criterion(hasItem(MavesItems.PALE_PUMPKIN_SEEDS),
                                conditionsFromItem(MavesItems.PALE_PUMPKIN_SEEDS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.PALE_JACK_O_LANTERN)
                        .input('A', MavesBlocks.CARVED_PALE_PUMPKIN)
                        .input('B', Blocks.SOUL_TORCH)
                        .pattern("A")
                        .pattern("B")
                        .criterion(hasItem(MavesBlocks.CARVED_PALE_PUMPKIN),
                                conditionsFromItem(MavesBlocks.CARVED_PALE_PUMPKIN))
                        .offerTo(exporter);
                
                createShapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_PLANKS)
                        .input(MavesTags.Items.ACACIA_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(Blocks.ACACIA_PLANKS),
                                conditionsFromItem(Blocks.ACACIA_PLANKS))
                        .offerTo(exporter, "acacia_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.APPLE_TREE_PLANKS)
                        .input(MavesTags.Items.APPLE_TREE_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_PLANKS))
                        .offerTo(exporter, "apple_tree_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.AZALEA_PLANKS)
                        .input(MavesTags.Items.AZALEA_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(MavesBlocks.AZALEA_PLANKS),
                                conditionsFromItem(MavesBlocks.AZALEA_PLANKS))
                        .offerTo(exporter, "azalea_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_PLANKS)
                        .input(MavesTags.Items.BIRCH_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(Blocks.BIRCH_PLANKS),
                                conditionsFromItem(Blocks.BIRCH_PLANKS))
                        .offerTo(exporter, "birch_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_PLANKS)
                        .input(MavesTags.Items.CHERRY_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(Blocks.CHERRY_PLANKS),
                                conditionsFromItem(Blocks.CHERRY_PLANKS))
                        .offerTo(exporter, "cherry_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.CACAO_TREE_PLANKS)
                        .input(MavesTags.Items.CACAO_TREE_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_PLANKS),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_PLANKS))
                        .offerTo(exporter, "cacao_tree_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_PLANKS)
                        .input(MavesTags.Items.CRIMSON_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(Blocks.CRIMSON_PLANKS),
                                conditionsFromItem(Blocks.CRIMSON_PLANKS))
                        .offerTo(exporter, "crimson_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_PLANKS)
                        .input(MavesTags.Items.DARK_OAK_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(Blocks.DARK_OAK_PLANKS),
                                conditionsFromItem(Blocks.DARK_OAK_PLANKS))
                        .offerTo(exporter, "dark_oak_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_PLANKS)
                        .input(MavesTags.Items.JUNGLE_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(Blocks.JUNGLE_PLANKS),
                                conditionsFromItem(Blocks.JUNGLE_PLANKS))
                        .offerTo(exporter, "jungle_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_PLANKS)
                        .input(MavesTags.Items.MANGROVE_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(Blocks.MANGROVE_PLANKS),
                                conditionsFromItem(Blocks.MANGROVE_PLANKS))
                        .offerTo(exporter, "mangrove_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_PLANKS)
                        .input(MavesTags.Items.OAK_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(Blocks.OAK_PLANKS),
                                conditionsFromItem(Blocks.OAK_PLANKS))
                        .offerTo(exporter, "oak_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_OAK_PLANKS)
                        .input(MavesTags.Items.PALE_OAK_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(Blocks.PALE_OAK_PLANKS),
                                conditionsFromItem(Blocks.PALE_OAK_PLANKS))
                        .offerTo(exporter, "pale_oak_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.RUBBER_PLANKS)
                        .input(MavesTags.Items.RUBBER_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(MavesBlocks.RUBBER_PLANKS),
                                conditionsFromItem(MavesBlocks.RUBBER_PLANKS))
                        .offerTo(exporter, "rubber_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_PLANKS)
                        .input(MavesTags.Items.SPRUCE_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(Blocks.SPRUCE_PLANKS),
                                conditionsFromItem(Blocks.SPRUCE_PLANKS))
                        .offerTo(exporter, "spruce_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_PLANKS)
                        .input(MavesTags.Items.WARPED_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(Blocks.WARPED_PLANKS),
                                conditionsFromItem(Blocks.WARPED_PLANKS))
                        .offerTo(exporter, "warped_planks_from_sliver");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.WILLOW_PLANKS)
                        .input(MavesTags.Items.WILLOW_SLIVERS)
                        .group("planks")
                        .criterion(hasItem(MavesBlocks.WILLOW_PLANKS),
                                conditionsFromItem(MavesBlocks.WILLOW_PLANKS))
                        .offerTo(exporter, "willow_planks_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.ACACIA_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.ACACIA_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.ACACIA_BLOCK),
                                conditionsFromItem(MavesBlocks.ACACIA_BLOCK))
                        .offerTo(exporter, "acacia_log_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.APPLE_TREE_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.APPLE_TREE_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.APPLE_TREE_BLOCK),
                                conditionsFromItem(MavesBlocks.APPLE_TREE_BLOCK))
                        .offerTo(exporter, "apple_tree_log_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.AZALEA_STEM)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.AZALEA_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.AZALEA_STEM),
                                conditionsFromItem(MavesBlocks.AZALEA_STEM))
                        .offerTo(exporter, "azalea_stem_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.BIRCH_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.BIRCH_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.BIRCH_BLOCK),
                                conditionsFromItem(MavesBlocks.BIRCH_BLOCK))
                        .offerTo(exporter, "birch_log_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.CHERRY_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.CHERRY_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.CHERRY_BLOCK),
                                conditionsFromItem(MavesBlocks.CHERRY_BLOCK))
                        .offerTo(exporter, "cherry_log_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.CACAO_TREE_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.CACAO_TREE_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.CACAO_TREE_BLOCK),
                                conditionsFromItem(MavesBlocks.CACAO_TREE_BLOCK))
                        .offerTo(exporter, "cacao_tree_log_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.CRIMSON_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.CRIMSON_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.CRIMSON_BLOCK),
                                conditionsFromItem(MavesBlocks.CRIMSON_BLOCK))
                        .offerTo(exporter, "crimson_stem_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.DARK_OAK_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.DARK_OAK_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.DARK_OAK_BLOCK),
                                conditionsFromItem(MavesBlocks.DARK_OAK_BLOCK))
                        .offerTo(exporter, "dark_oak_log_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.JUNGLE_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.JUNGLE_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.JUNGLE_BLOCK),
                                conditionsFromItem(MavesBlocks.JUNGLE_BLOCK))
                        .offerTo(exporter, "jungle_log_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.MANGROVE_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.MANGROVE_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.MANGROVE_BLOCK),
                                conditionsFromItem(MavesBlocks.MANGROVE_BLOCK))
                        .offerTo(exporter, "mangrove_log_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.OAK_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.OAK_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.OAK_BLOCK),
                                conditionsFromItem(MavesBlocks.OAK_BLOCK))
                        .offerTo(exporter, "oak_log_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.PALE_OAK_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.PALE_OAK_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.PALE_OAK_BLOCK),
                                conditionsFromItem(MavesBlocks.PALE_OAK_BLOCK))
                        .offerTo(exporter, "pale_oak_log_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.RUBBER_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.RUBBER_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.RUBBER_BLOCK),
                                conditionsFromItem(MavesBlocks.RUBBER_BLOCK))
                        .offerTo(exporter, "rubber_log_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.SPRUCE_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.SPRUCE_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.SPRUCE_BLOCK),
                                conditionsFromItem(MavesBlocks.SPRUCE_BLOCK))
                        .offerTo(exporter, "spruce_log_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.WARPED_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.WARPED_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.WARPED_BLOCK),
                                conditionsFromItem(MavesBlocks.WARPED_BLOCK))
                        .offerTo(exporter, "warped_stem_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.WILLOW_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.WILLOW_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.WILLOW_BLOCK),
                                conditionsFromItem(MavesBlocks.WILLOW_BLOCK))
                        .offerTo(exporter, "willow_log_from_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_ACACIA_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_ACACIA_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_ACACIA_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_ACACIA_BLOCK))
                        .offerTo(exporter, "acacia_log_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_APPLE_TREE_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_APPLE_TREE_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_APPLE_TREE_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_APPLE_TREE_BLOCK))
                        .offerTo(exporter, "apple_tree_log_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_AZALEA_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_AZALEA_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_AZALEA_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_AZALEA_BLOCK))
                        .offerTo(exporter, "azalea_stem_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_BIRCH_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_BIRCH_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_BIRCH_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_BIRCH_BLOCK))
                        .offerTo(exporter, "birch_log_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_CHERRY_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_CHERRY_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_CHERRY_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_CHERRY_BLOCK))
                        .offerTo(exporter, "cherry_log_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_CACAO_TREE_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_CACAO_TREE_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_CACAO_TREE_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_CACAO_TREE_BLOCK))
                        .offerTo(exporter, "cacao_tree_log_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_CRIMSON_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_CRIMSON_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_CRIMSON_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_CRIMSON_BLOCK))
                        .offerTo(exporter, "crimson_stem_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_DARK_OAK_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_DARK_OAK_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_DARK_OAK_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_DARK_OAK_BLOCK))
                        .offerTo(exporter, "dark_oak_log_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_JUNGLE_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_JUNGLE_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_JUNGLE_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_JUNGLE_BLOCK))
                        .offerTo(exporter, "jungle_log_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_MANGROVE_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_MANGROVE_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_MANGROVE_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_MANGROVE_BLOCK))
                        .offerTo(exporter, "mangrove_log_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_OAK_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_OAK_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_OAK_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_OAK_BLOCK))
                        .offerTo(exporter, "oak_log_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_PALE_OAK_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_PALE_OAK_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_PALE_OAK_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_PALE_OAK_BLOCK))
                        .offerTo(exporter, "pale_oak_log_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_RUBBER_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_RUBBER_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_RUBBER_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_RUBBER_BLOCK))
                        .offerTo(exporter, "rubber_log_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_SPRUCE_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_SPRUCE_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_SPRUCE_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_SPRUCE_BLOCK))
                        .offerTo(exporter, "spruce_log_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_WARPED_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_WARPED_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_WARPED_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_WARPED_BLOCK))
                        .offerTo(exporter, "warped_stem_from_stripped_sliver");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MavesBlocks.STRIPPED_WILLOW_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MavesItems.STRIPPED_WILLOW_SLIVER)
                        .group("logs")
                        .criterion(hasItem(MavesBlocks.STRIPPED_WILLOW_BLOCK),
                                conditionsFromItem(MavesBlocks.STRIPPED_WILLOW_BLOCK))
                        .offerTo(exporter, "willow_log_from_stripped_sliver");
            }
        };
    }

    @Override
    public String getName () {
        return "MavesRecipeProvider";
    }
}
