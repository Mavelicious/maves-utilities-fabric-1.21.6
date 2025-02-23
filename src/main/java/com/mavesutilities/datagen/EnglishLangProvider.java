package com.mavesutilities.datagen;

import com.mavesutilities.MavesUtilitiesMod;
import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItemGroups;
import com.mavesutilities.item.MavesItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EnglishLangProvider extends FabricLanguageProvider {
    public EnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            MavesUtilitiesMod.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {

        addText(translationBuilder, MavesItemGroups.MAVES_ITEMS, "Mave's Items");
        addText(translationBuilder, MavesItemGroups.MAVES_BLOCKS, "Mave's Blocks");

        translationBuilder.add(MavesItems.OAK_BARK, "Oak Bark");
        translationBuilder.add(MavesItems.SPRUCE_BARK, "Spruce Bark");
        translationBuilder.add(MavesItems.BIRCH_BARK, "Birch Bark");
        translationBuilder.add(MavesItems.JUNGLE_BARK, "Jungle Bark");
        translationBuilder.add(MavesItems.ACACIA_BARK, "Acacia Bark");
        translationBuilder.add(MavesItems.DARK_OAK_BARK, "Dark Oak Bark");
        translationBuilder.add(MavesItems.MANGROVE_BARK, "Mangrove Bark");
        translationBuilder.add(MavesItems.CHERRY_BARK, "Cherry Bark");
        translationBuilder.add(MavesItems.PALE_OAK_BARK, "Pale Oak Bark");
        translationBuilder.add(MavesItems.APPLE_TREE_BARK, "Apple Tree Bark");
        translationBuilder.add(MavesItems.AZALEA_BARK, "Azalea Bark");
        translationBuilder.add(MavesItems.CACAO_TREE_BARK, "Cacao Tree Bark");
        translationBuilder.add(MavesItems.RUBBER_BARK, "Rubber Bark");
        translationBuilder.add(MavesItems.WILLOW_BARK, "Willow Bark");
        translationBuilder.add(MavesItems.CRIMSON_BARK, "Crimson Bark");
        translationBuilder.add(MavesItems.WARPED_BARK, "Warped Bark");

        translationBuilder.add(MavesItems.GREEN_APPLE, "Green Apple");
        translationBuilder.add(MavesItems.PUMPKIN_SLICE, "Pumpkin Slice");
        translationBuilder.add(MavesItems.CHERRIES, "Cherries");
        translationBuilder.add(MavesItems.WILD_BERRIES_BLUE, "Blue Wild Berries");
        translationBuilder.add(MavesItems.WILD_BERRIES_GREEN, "Green Wild Berries");
        translationBuilder.add(MavesItems.WILD_BERRIES_YELLOW, "Yellow Wild Berries");
        translationBuilder.add(MavesItems.MILK_CHOCOLATE, "Milk Chocolate");
        translationBuilder.add(MavesItems.WHITE_CHOCOLATE, "White Chocolate");
        translationBuilder.add(MavesItems.DARK_CHOCOLATE, "Dark Chocolate");

        translationBuilder.add(MavesItems.ACORN, "Acorn");
        translationBuilder.add(MavesItems.DARK_ACORN, "Dark Acorn");
        translationBuilder.add(MavesItems.PALE_ACORN, "Pale Acorn");

        translationBuilder.add(MavesItems.APPLE_TREE_BOAT, "Apple Tree Boat");
        translationBuilder.add(MavesItems.APPLE_TREE_CHEST_BOAT, "Apple Tree Boat with Chest");
        translationBuilder.add(MavesItems.AZALEA_BOAT, "Azalea Boat");
        translationBuilder.add(MavesItems.AZALEA_CHEST_BOAT, "Azalea Boat with Chest");
        translationBuilder.add(MavesItems.CACAO_TREE_BOAT, "Cacao Tree Boat");
        translationBuilder.add(MavesItems.CACAO_TREE_CHEST_BOAT, "Cacao Tree Boat with Chest");
        translationBuilder.add(MavesItems.RUBBER_BOAT, "Rubber Boat");
        translationBuilder.add(MavesItems.RUBBER_CHEST_BOAT, "Rubber Boat with Chest");
        translationBuilder.add(MavesItems.WILLOW_BOAT, "Willow Boat");
        translationBuilder.add(MavesItems.WILLOW_CHEST_BOAT, "Willow Boat with Chest");

        translationBuilder.add(MavesBlocks.APPLE_TREE_LOG.asItem(), "Apple Tree Log");
        translationBuilder.add(MavesBlocks.APPLE_TREE_WOOD.asItem(), "Apple Tree Wood");
        translationBuilder.add(MavesBlocks.STRIPPED_APPLE_TREE_LOG.asItem(), "Stripped Apple Tree Log");
        translationBuilder.add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD.asItem(), "Stripped Apple Tree Wood");
        translationBuilder.add(MavesBlocks.APPLE_TREE_LEAVES.asItem(), "Apple Tree Leaves");
        translationBuilder.add(MavesBlocks.APPLE_TREE_SAPLING.asItem(), "Apple Tree Sapling");
        translationBuilder.add(MavesBlocks.POTTED_APPLE_TREE_SAPLING.asItem(), "Potted Apple Tree Sapling");
        translationBuilder.add(MavesBlocks.APPLE_TREE_PLANKS.asItem(), "Apple Tree Planks");
        translationBuilder.add(MavesBlocks.APPLE_TREE_BUTTON.asItem(), "Apple Tree Button");
        translationBuilder.add(MavesBlocks.APPLE_TREE_DOOR.asItem(), "Apple Tree Door");
        translationBuilder.add(MavesBlocks.APPLE_TREE_FENCE.asItem(), "Apple Tree Fence");
        translationBuilder.add(MavesBlocks.APPLE_TREE_FENCE_GATE.asItem(), "Apple Tree Fence Gate");
        translationBuilder.add(MavesBlocks.APPLE_TREE_PRESSURE_PLATE.asItem(), "Apple Tree Pressure Plate");
        translationBuilder.add(MavesBlocks.APPLE_TREE_SLAB.asItem(), "Apple Tree Slab");
        translationBuilder.add(MavesBlocks.APPLE_TREE_STAIRS.asItem(), "Apple Tree Stairs");
        translationBuilder.add(MavesBlocks.APPLE_TREE_TRAPDOOR.asItem(), "Apple Tree Trapdoor");

        translationBuilder.add(MavesBlocks.AZALEA_STEM.asItem(), "Azalea Stem");
        translationBuilder.add(MavesBlocks.AZALEA_WOOD.asItem(), "Azalea Wood");
        translationBuilder.add(MavesBlocks.STRIPPED_AZALEA_STEM.asItem(), "Stripped Azalea Stem");
        translationBuilder.add(MavesBlocks.STRIPPED_AZALEA_WOOD.asItem(), "Stripped Azalea Wood");
        translationBuilder.add(MavesBlocks.AZALEA_PLANKS.asItem(), "Azalea Planks");
        translationBuilder.add(MavesBlocks.AZALEA_BUTTON.asItem(), "Azalea Button");
        translationBuilder.add(MavesBlocks.AZALEA_DOOR.asItem(), "Azalea Door");
        translationBuilder.add(MavesBlocks.AZALEA_FENCE.asItem(), "Azalea Fence");
        translationBuilder.add(MavesBlocks.AZALEA_FENCE_GATE.asItem(), "Azalea Fence Gate");
        translationBuilder.add(MavesBlocks.AZALEA_PRESSURE_PLATE.asItem(), "Azalea Pressure Plate");
        translationBuilder.add(MavesBlocks.AZALEA_SLAB.asItem(), "Azalea Slab");
        translationBuilder.add(MavesBlocks.AZALEA_STAIRS.asItem(), "Azalea Stairs");
        translationBuilder.add(MavesBlocks.AZALEA_TRAPDOOR.asItem(), "Azalea Trapdoor");

        translationBuilder.add(MavesBlocks.CACAO_TREE_LOG.asItem(), "Cacao Tree Log");
        translationBuilder.add(MavesBlocks.CACAO_TREE_WOOD.asItem(), "Cacao Tree Wood");
        translationBuilder.add(MavesBlocks.STRIPPED_CACAO_TREE_LOG.asItem(), "Stripped Cacao Tree Log");
        translationBuilder.add(MavesBlocks.STRIPPED_CACAO_TREE_WOOD.asItem(), "Stripped Cacao Tree Wood");
        translationBuilder.add(MavesBlocks.CACAO_TREE_LEAVES.asItem(), "Cacao Tree Leaves");
        translationBuilder.add(MavesBlocks.CACAO_TREE_SAPLING.asItem(), "Cacao Tree Sapling");
        translationBuilder.add(MavesBlocks.POTTED_CACAO_TREE_SAPLING.asItem(), "Potted Cacao Tree Sapling");
        translationBuilder.add(MavesBlocks.CACAO_TREE_PLANKS.asItem(), "Cacao Tree Planks");
        translationBuilder.add(MavesBlocks.CACAO_TREE_BUTTON.asItem(), "Cacao Tree Button");
        translationBuilder.add(MavesBlocks.CACAO_TREE_DOOR.asItem(), "Cacao Tree Door");
        translationBuilder.add(MavesBlocks.CACAO_TREE_FENCE.asItem(), "Cacao Tree Fence");
        translationBuilder.add(MavesBlocks.CACAO_TREE_FENCE_GATE.asItem(), "Cacao Tree Fence Gate");
        translationBuilder.add(MavesBlocks.CACAO_TREE_PRESSURE_PLATE.asItem(), "Cacao Tree Pressure Plate");
        translationBuilder.add(MavesBlocks.CACAO_TREE_SLAB.asItem(), "Cacao Tree Slab");
        translationBuilder.add(MavesBlocks.CACAO_TREE_STAIRS.asItem(), "Cacao Tree Stairs");
        translationBuilder.add(MavesBlocks.CACAO_TREE_TRAPDOOR.asItem(), "Cacao Tree Trapdoor");

        translationBuilder.add(MavesBlocks.RUBBER_LOG.asItem(), "Rubber Log");
        translationBuilder.add(MavesBlocks.RUBBER_WOOD.asItem(), "Rubber Wood");
        translationBuilder.add(MavesBlocks.STRIPPED_RUBBER_LOG.asItem(), "Stripped Rubber Log");
        translationBuilder.add(MavesBlocks.STRIPPED_RUBBER_WOOD.asItem(), "Stripped Rubber Wood");
        translationBuilder.add(MavesBlocks.RUBBER_LEAVES.asItem(), "Rubber Leaves");
        translationBuilder.add(MavesBlocks.RUBBER_SAPLING.asItem(), "Rubber Sapling");
        translationBuilder.add(MavesBlocks.POTTED_RUBBER_SAPLING.asItem(), "Potted Rubber Sapling");
        translationBuilder.add(MavesBlocks.RUBBER_PLANKS.asItem(), "Rubber Planks");
        translationBuilder.add(MavesBlocks.RUBBER_BUTTON.asItem(), "Rubber Button");
        translationBuilder.add(MavesBlocks.RUBBER_DOOR.asItem(), "Rubber Door");
        translationBuilder.add(MavesBlocks.RUBBER_FENCE.asItem(), "Rubber Fence");
        translationBuilder.add(MavesBlocks.RUBBER_FENCE_GATE.asItem(), "Rubber Fence Gate");
        translationBuilder.add(MavesBlocks.RUBBER_PRESSURE_PLATE.asItem(), "Rubber Pressure Plate");
        translationBuilder.add(MavesBlocks.RUBBER_SLAB.asItem(), "Rubber Slab");
        translationBuilder.add(MavesBlocks.RUBBER_STAIRS.asItem(), "Rubber Stairs");
        translationBuilder.add(MavesBlocks.RUBBER_TRAPDOOR.asItem(), "Rubber Trapdoor");

        translationBuilder.add(MavesBlocks.WILLOW_LOG.asItem(), "Willow Log");
        translationBuilder.add(MavesBlocks.WILLOW_WOOD.asItem(), "Willow Wood");
        translationBuilder.add(MavesBlocks.STRIPPED_WILLOW_LOG.asItem(), "Stripped Willow Log");
        translationBuilder.add(MavesBlocks.STRIPPED_WILLOW_WOOD.asItem(), "Stripped Willow Wood");
        translationBuilder.add(MavesBlocks.WILLOW_LEAVES.asItem(), "Willow Leaves");
        translationBuilder.add(MavesBlocks.WILLOW_SAPLING.asItem(), "Willow Sapling");
        translationBuilder.add(MavesBlocks.POTTED_WILLOW_SAPLING.asItem(), "Potted Willow Sapling");
        translationBuilder.add(MavesBlocks.WILLOW_PLANKS.asItem(), "Willow Planks");
        translationBuilder.add(MavesBlocks.WILLOW_BUTTON.asItem(), "Willow Button");
        translationBuilder.add(MavesBlocks.WILLOW_DOOR.asItem(), "Willow Door");
        translationBuilder.add(MavesBlocks.WILLOW_FENCE.asItem(), "Willow Fence");
        translationBuilder.add(MavesBlocks.WILLOW_FENCE_GATE.asItem(), "Willow Fence Gate");
        translationBuilder.add(MavesBlocks.WILLOW_PRESSURE_PLATE.asItem(), "Willow Pressure Plate");
        translationBuilder.add(MavesBlocks.WILLOW_SLAB.asItem(), "Willow Slab");
        translationBuilder.add(MavesBlocks.WILLOW_STAIRS.asItem(), "Willow Stairs");
        translationBuilder.add(MavesBlocks.WILLOW_TRAPDOOR.asItem(), "Willow Trapdoor");

        translationBuilder.add(MavesBlocks.APPLE_TREE_LOG, "Apple Tree Log");
        translationBuilder.add(MavesBlocks.APPLE_TREE_WOOD, "Apple Tree Wood");
        translationBuilder.add(MavesBlocks.STRIPPED_APPLE_TREE_LOG, "Stripped Apple Tree Log");
        translationBuilder.add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD, "Stripped Apple Tree Wood");
        translationBuilder.add(MavesBlocks.APPLE_TREE_LEAVES, "Apple Tree Leaves");
        translationBuilder.add(MavesBlocks.APPLE_TREE_SAPLING, "Apple Tree Sapling");
        translationBuilder.add(MavesBlocks.POTTED_APPLE_TREE_SAPLING, "Potted Apple Tree Sapling");
        translationBuilder.add(MavesBlocks.APPLE_TREE_PLANKS, "Apple Tree Planks");
        translationBuilder.add(MavesBlocks.APPLE_TREE_BUTTON, "Apple Tree Button");
        translationBuilder.add(MavesBlocks.APPLE_TREE_DOOR, "Apple Tree Door");
        translationBuilder.add(MavesBlocks.APPLE_TREE_FENCE, "Apple Tree Fence");
        translationBuilder.add(MavesBlocks.APPLE_TREE_FENCE_GATE, "Apple Tree Fence Gate");
        translationBuilder.add(MavesBlocks.APPLE_TREE_HANGING_SIGN, "Apple Tree Hanging Sign");
        translationBuilder.add(MavesBlocks.APPLE_TREE_WALL_HANGING_SIGN.toString(), "Apple Tree Hanging Sign");
        translationBuilder.add(MavesBlocks.APPLE_TREE_PRESSURE_PLATE, "Apple Tree Pressure Plate");
        translationBuilder.add(MavesBlocks.APPLE_TREE_SIGN, "Apple Tree Sign");
        translationBuilder.add(MavesBlocks.APPLE_TREE_WALL_SIGN.toString(), "Apple Tree Sign");
        translationBuilder.add(MavesBlocks.APPLE_TREE_SLAB, "Apple Tree Slab");
        translationBuilder.add(MavesBlocks.APPLE_TREE_STAIRS, "Apple Tree Stairs");
        translationBuilder.add(MavesBlocks.APPLE_TREE_TRAPDOOR, "Apple Tree Trapdoor");

        translationBuilder.add(MavesBlocks.AZALEA_STEM, "Azalea Stem");
        translationBuilder.add(MavesBlocks.AZALEA_WOOD, "Azalea Wood");
        translationBuilder.add(MavesBlocks.STRIPPED_AZALEA_STEM, "Stripped Azalea Stem");
        translationBuilder.add(MavesBlocks.STRIPPED_AZALEA_WOOD, "Stripped Azalea Wood");
        translationBuilder.add(MavesBlocks.AZALEA_PLANKS, "Azalea Planks");
        translationBuilder.add(MavesBlocks.AZALEA_BUTTON, "Azalea Button");
        translationBuilder.add(MavesBlocks.AZALEA_DOOR, "Azalea Door");
        translationBuilder.add(MavesBlocks.AZALEA_FENCE, "Azalea Fence");
        translationBuilder.add(MavesBlocks.AZALEA_FENCE_GATE, "Azalea Fence Gate");
        translationBuilder.add(MavesBlocks.AZALEA_HANGING_SIGN, "Azalea Hanging Sign");
        translationBuilder.add(MavesBlocks.AZALEA_WALL_HANGING_SIGN.toString(), "Azalea Hanging Sign");
        translationBuilder.add(MavesBlocks.AZALEA_PRESSURE_PLATE, "Azalea Pressure Plate");
        translationBuilder.add(MavesBlocks.AZALEA_SIGN, "Azalea Sign");
        translationBuilder.add(MavesBlocks.AZALEA_WALL_SIGN.toString(), "Azalea Sign");
        translationBuilder.add(MavesBlocks.AZALEA_SLAB, "Azalea Slab");
        translationBuilder.add(MavesBlocks.AZALEA_STAIRS, "Azalea Stairs");
        translationBuilder.add(MavesBlocks.AZALEA_TRAPDOOR, "Azalea Trapdoor");

        translationBuilder.add(MavesBlocks.CACAO_TREE_LOG, "Cacao Tree Log");
        translationBuilder.add(MavesBlocks.CACAO_TREE_WOOD, "Cacao Tree Wood");
        translationBuilder.add(MavesBlocks.STRIPPED_CACAO_TREE_LOG, "Stripped Cacao Tree Log");
        translationBuilder.add(MavesBlocks.STRIPPED_CACAO_TREE_WOOD, "Stripped Cacao Tree Wood");
        translationBuilder.add(MavesBlocks.CACAO_TREE_LEAVES, "Cacao Tree Leaves");
        translationBuilder.add(MavesBlocks.CACAO_TREE_SAPLING, "Cacao Tree Sapling");
        translationBuilder.add(MavesBlocks.POTTED_CACAO_TREE_SAPLING, "Potted Cacao Tree Sapling");
        translationBuilder.add(MavesBlocks.CACAO_TREE_PLANKS, "Cacao Tree Planks");
        translationBuilder.add(MavesBlocks.CACAO_TREE_BUTTON, "Cacao Tree Button");
        translationBuilder.add(MavesBlocks.CACAO_TREE_DOOR, "Cacao Tree Door");
        translationBuilder.add(MavesBlocks.CACAO_TREE_FENCE, "Cacao Tree Fence");
        translationBuilder.add(MavesBlocks.CACAO_TREE_FENCE_GATE, "Cacao Tree Fence Gate");
        translationBuilder.add(MavesBlocks.CACAO_TREE_HANGING_SIGN, "Cacao Tree Hanging Sign");
        translationBuilder.add(MavesBlocks.CACAO_TREE_WALL_HANGING_SIGN.toString(), "Cacao Tree Hanging Sign");
        translationBuilder.add(MavesBlocks.CACAO_TREE_PRESSURE_PLATE, "Cacao Tree Pressure Plate");
        translationBuilder.add(MavesBlocks.CACAO_TREE_SIGN, "Cacao Tree Sign");
        translationBuilder.add(MavesBlocks.CACAO_TREE_WALL_SIGN.toString(), "Cacao Tree Sign");
        translationBuilder.add(MavesBlocks.CACAO_TREE_SLAB, "Cacao Tree Slab");
        translationBuilder.add(MavesBlocks.CACAO_TREE_STAIRS, "Cacao Tree Stairs");
        translationBuilder.add(MavesBlocks.CACAO_TREE_TRAPDOOR, "Cacao Tree Trapdoor");

        translationBuilder.add(MavesBlocks.RUBBER_LOG, "Rubber Log");
        translationBuilder.add(MavesBlocks.RUBBER_WOOD, "Rubber Wood");
        translationBuilder.add(MavesBlocks.STRIPPED_RUBBER_LOG, "Stripped Rubber Log");
        translationBuilder.add(MavesBlocks.STRIPPED_RUBBER_WOOD, "Stripped Rubber Wood");
        translationBuilder.add(MavesBlocks.RUBBER_LEAVES, "Rubber Leaves");
        translationBuilder.add(MavesBlocks.RUBBER_SAPLING, "Rubber Sapling");
        translationBuilder.add(MavesBlocks.POTTED_RUBBER_SAPLING, "Potted Rubber Sapling");
        translationBuilder.add(MavesBlocks.RUBBER_PLANKS, "Rubber Planks");
        translationBuilder.add(MavesBlocks.RUBBER_BUTTON, "Rubber Button");
        translationBuilder.add(MavesBlocks.RUBBER_DOOR, "Rubber Door");
        translationBuilder.add(MavesBlocks.RUBBER_FENCE, "Rubber Fence");
        translationBuilder.add(MavesBlocks.RUBBER_FENCE_GATE, "Rubber Fence Gate");
        translationBuilder.add(MavesBlocks.RUBBER_HANGING_SIGN, "Rubber Hanging Sign");
        translationBuilder.add(MavesBlocks.RUBBER_WALL_HANGING_SIGN.toString(), "Rubber Hanging Sign");
        translationBuilder.add(MavesBlocks.RUBBER_PRESSURE_PLATE, "Rubber Pressure Plate");
        translationBuilder.add(MavesBlocks.RUBBER_SIGN, "Rubber Sign");
        translationBuilder.add(MavesBlocks.RUBBER_WALL_SIGN.toString(), "Rubber Sign");
        translationBuilder.add(MavesBlocks.RUBBER_SLAB, "Rubber Slab");
        translationBuilder.add(MavesBlocks.RUBBER_STAIRS, "Rubber Stairs");
        translationBuilder.add(MavesBlocks.RUBBER_TRAPDOOR, "Rubber Trapdoor");

        translationBuilder.add(MavesBlocks.WILLOW_LOG, "Willow Log");
        translationBuilder.add(MavesBlocks.WILLOW_WOOD, "Willow Wood");
        translationBuilder.add(MavesBlocks.STRIPPED_WILLOW_LOG, "Stripped Willow Log");
        translationBuilder.add(MavesBlocks.STRIPPED_WILLOW_WOOD, "Stripped Willow Wood");
        translationBuilder.add(MavesBlocks.WILLOW_LEAVES, "Willow Leaves");
        translationBuilder.add(MavesBlocks.WILLOW_SAPLING, "Willow Sapling");
        translationBuilder.add(MavesBlocks.POTTED_WILLOW_SAPLING, "Potted Willow Sapling");
        translationBuilder.add(MavesBlocks.WILLOW_PLANKS, "Willow Planks");
        translationBuilder.add(MavesBlocks.WILLOW_BUTTON, "Willow Button");
        translationBuilder.add(MavesBlocks.WILLOW_DOOR, "Willow Door");
        translationBuilder.add(MavesBlocks.WILLOW_FENCE, "Willow Fence");
        translationBuilder.add(MavesBlocks.WILLOW_FENCE_GATE, "Willow Fence Gate");
        translationBuilder.add(MavesBlocks.WILLOW_HANGING_SIGN, "Willow Hanging Sign");
        translationBuilder.add(MavesBlocks.WILLOW_WALL_HANGING_SIGN.toString(), "Willow Hanging Sign");
        translationBuilder.add(MavesBlocks.WILLOW_PRESSURE_PLATE, "Willow Pressure Plate");
        translationBuilder.add(MavesBlocks.WILLOW_SIGN, "Willow Sign");
        translationBuilder.add(MavesBlocks.WILLOW_WALL_SIGN.toString(), "Willow Sign");
        translationBuilder.add(MavesBlocks.WILLOW_SLAB, "Willow Slab");
        translationBuilder.add(MavesBlocks.WILLOW_STAIRS, "Willow Stairs");
        translationBuilder.add(MavesBlocks.WILLOW_TRAPDOOR, "Willow Trapdoor");

    }
}