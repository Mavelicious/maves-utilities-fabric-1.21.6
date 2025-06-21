package com.mavesutilities.datagen;

import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class MavesModelProvider extends FabricModelProvider {

    public MavesModelProvider(FabricDataOutput output, BiConsumer<Identifier, ModelSupplier> modelCollector) {
        super(output);
    }

    public final void registerTintableBlockWithStages(
            BlockStateModelGenerator g, Block block, Property<Integer> stageProperty, int tintColor, int... stages
    ) {
        if (stageProperty.getValues().size() != stages.length) {
            throw new IllegalArgumentException("missing values for property: " + stageProperty);
        }
        g.registerTintedItemModel(
                block,
                Identifier.of(ModelIds.getBlockModelId(block) + "_stage" + stages[stages.length - 1]),
                ItemModels.constantTintSource(tintColor)
        );
        g.blockStateCollector.accept(
                VariantsBlockModelDefinitionCreator.of(block).with(
                        BlockStateVariantMap.models(stageProperty).generate(stage -> {
                            int stageValue = stages[stage];
                            String suffix = "_stage" + stageValue;
                            TextureMap textureMap = TextureMap.all(TextureMap.getSubId(block, suffix));
                            Identifier modelId = Models.LEAVES.upload(block, suffix, textureMap, g.modelCollector);
                            return BlockStateModelGenerator.createWeightedVariant(modelId);
                        })
                )
        );
    }

    public final void registerBlockWithStages(
            BlockStateModelGenerator g, Block block, Property<Integer> stageProperty, int... stages
    ) {
        if (stageProperty.getValues().size() != stages.length) {
            throw new IllegalArgumentException("missing values for property: " + stageProperty);
        }
        g.registerItemModel(
                block.asItem(),
                Identifier.of(ModelIds.getBlockModelId(block) + "_stage" + stages[stages.length - 1])
        );
        g.blockStateCollector.accept(
                VariantsBlockModelDefinitionCreator.of(block).with(
                        BlockStateVariantMap.models(stageProperty).generate(stage -> {
                            int stageValue = stages[stage];
                            String suffix = "_stage" + stageValue;
                            TextureMap textureMap = TextureMap.all(TextureMap.getSubId(block, suffix));
                            Identifier modelId = Models.LEAVES.upload(block, suffix, textureMap, g.modelCollector);
                            return BlockStateModelGenerator.createWeightedVariant(modelId);
                        })
                )
        );
    }

    private void registerPalePumpkins(BlockStateModelGenerator g) {
        TextureMap textureMap = TextureMap.sideEnd(MavesBlocks.PALE_PUMPKIN);
        Identifier modelId = Models.CUBE_COLUMN.upload(MavesBlocks.PALE_PUMPKIN, textureMap, g.modelCollector);
        g.blockStateCollector.accept(
                BlockStateModelGenerator.createSingletonBlockState(
                        MavesBlocks.PALE_PUMPKIN,
                        BlockStateModelGenerator.createWeightedVariant(modelId)
                )
        );
        g.registerNorthDefaultHorizontalRotatable(MavesBlocks.CARVED_PALE_PUMPKIN, textureMap);
        g.registerNorthDefaultHorizontalRotatable(MavesBlocks.PALE_JACK_O_LANTERN, textureMap);
    }

    public void registerBlockCopy(
            BlockStateModelGenerator g, Block block, Block textureBlock
    ) {
        TextureMap textureMap = TextureMap.sideAndEndForTop(textureBlock);
        Identifier modelId = Models.CUBE_COLUMN.upload(block, textureMap, g.modelCollector);
        Identifier modelId2 = Models.CUBE_COLUMN_HORIZONTAL.upload(block, textureMap, g.modelCollector);
        g.blockStateCollector.accept(
                BlockStateModelGenerator.createAxisRotatedBlockState(
                        block,
                        BlockStateModelGenerator.createWeightedVariant(modelId),
                        BlockStateModelGenerator.createWeightedVariant(modelId2)
                )
        );
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator g) {
        registerBlockCopy(g, MavesBlocks.OAK_BLOCK, Blocks.OAK_LOG);
        registerBlockCopy(g, MavesBlocks.STRIPPED_OAK_BLOCK, Blocks.STRIPPED_OAK_LOG);
        registerBlockCopy(g, MavesBlocks.SPRUCE_BLOCK, Blocks.SPRUCE_LOG);
        registerBlockCopy(g, MavesBlocks.STRIPPED_SPRUCE_BLOCK, Blocks.STRIPPED_SPRUCE_LOG);
        registerBlockCopy(g, MavesBlocks.BIRCH_BLOCK, Blocks.BIRCH_LOG);
        registerBlockCopy(g, MavesBlocks.STRIPPED_BIRCH_BLOCK, Blocks.STRIPPED_BIRCH_LOG);
        registerBlockCopy(g, MavesBlocks.JUNGLE_BLOCK, Blocks.JUNGLE_LOG);
        registerBlockCopy(g, MavesBlocks.STRIPPED_JUNGLE_BLOCK, Blocks.STRIPPED_JUNGLE_LOG);
        registerBlockCopy(g, MavesBlocks.ACACIA_BLOCK, Blocks.ACACIA_LOG);
        registerBlockCopy(g, MavesBlocks.STRIPPED_ACACIA_BLOCK, Blocks.STRIPPED_ACACIA_LOG);
        registerBlockCopy(g, MavesBlocks.DARK_OAK_BLOCK, Blocks.DARK_OAK_LOG);
        registerBlockCopy(g, MavesBlocks.STRIPPED_DARK_OAK_BLOCK, Blocks.STRIPPED_DARK_OAK_LOG);
        registerBlockCopy(g, MavesBlocks.MANGROVE_BLOCK, Blocks.MANGROVE_LOG);
        registerBlockCopy(g, MavesBlocks.STRIPPED_MANGROVE_BLOCK, Blocks.STRIPPED_MANGROVE_LOG);
        registerBlockCopy(g, MavesBlocks.CHERRY_BLOCK, Blocks.CHERRY_LOG);
        registerBlockCopy(g, MavesBlocks.STRIPPED_CHERRY_BLOCK, Blocks.STRIPPED_CHERRY_LOG);
        registerBlockCopy(g, MavesBlocks.PALE_OAK_BLOCK, Blocks.PALE_OAK_LOG);
        registerBlockCopy(g, MavesBlocks.STRIPPED_PALE_OAK_BLOCK, Blocks.STRIPPED_PALE_OAK_LOG);
        registerBlockCopy(g, MavesBlocks.APPLE_TREE_BLOCK, MavesBlocks.APPLE_TREE_LOG);
        registerBlockCopy(g, MavesBlocks.STRIPPED_APPLE_TREE_BLOCK, MavesBlocks.STRIPPED_APPLE_TREE_LOG);
        registerBlockCopy(g, MavesBlocks.AZALEA_BLOCK, MavesBlocks.AZALEA_STEM);
        registerBlockCopy(g, MavesBlocks.STRIPPED_AZALEA_BLOCK, MavesBlocks.STRIPPED_AZALEA_STEM);
        registerBlockCopy(g, MavesBlocks.CACAO_TREE_BLOCK, MavesBlocks.CACAO_TREE_LOG);
        registerBlockCopy(g, MavesBlocks.STRIPPED_CACAO_TREE_BLOCK, MavesBlocks.STRIPPED_CACAO_TREE_LOG);
        registerBlockCopy(g, MavesBlocks.RUBBER_BLOCK, MavesBlocks.RUBBER_LOG);
        registerBlockCopy(g, MavesBlocks.STRIPPED_RUBBER_BLOCK, MavesBlocks.STRIPPED_RUBBER_LOG);
        registerBlockCopy(g, MavesBlocks.WILLOW_BLOCK, MavesBlocks.WILLOW_LOG);
        registerBlockCopy(g, MavesBlocks.STRIPPED_WILLOW_BLOCK, MavesBlocks.STRIPPED_WILLOW_LOG);
        registerBlockCopy(g, MavesBlocks.CRIMSON_BLOCK, Blocks.CRIMSON_STEM);
        registerBlockCopy(g, MavesBlocks.STRIPPED_CRIMSON_BLOCK, Blocks.STRIPPED_CRIMSON_STEM);
        registerBlockCopy(g, MavesBlocks.WARPED_BLOCK, Blocks.WARPED_STEM);
        registerBlockCopy(g, MavesBlocks.STRIPPED_WARPED_BLOCK, Blocks.STRIPPED_WARPED_STEM);

        g.createLogTexturePool(MavesBlocks.APPLE_TREE_LOG)
                .log(MavesBlocks.APPLE_TREE_LOG).wood(MavesBlocks.APPLE_TREE_WOOD);
        g.createLogTexturePool(MavesBlocks.AZALEA_STEM)
                .log(MavesBlocks.AZALEA_STEM).wood(MavesBlocks.AZALEA_WOOD);
        g.createLogTexturePool(MavesBlocks.CACAO_TREE_LOG)
                .log(MavesBlocks.CACAO_TREE_LOG).wood(MavesBlocks.CACAO_TREE_WOOD);
        g.createLogTexturePool(MavesBlocks.RUBBER_LOG)
                .log(MavesBlocks.RUBBER_LOG).wood(MavesBlocks.RUBBER_WOOD);
        g.createLogTexturePool(MavesBlocks.HANGING_BLACK_WIDOW_STEM)
                .log(MavesBlocks.HANGING_BLACK_WIDOW_STEM);
        g.createLogTexturePool(MavesBlocks.WILLOW_LOG)
                .log(MavesBlocks.WILLOW_LOG).wood(MavesBlocks.WILLOW_WOOD);
        g.createLogTexturePool(MavesBlocks.STRIPPED_APPLE_TREE_LOG)
                .log(MavesBlocks.STRIPPED_APPLE_TREE_LOG).wood(MavesBlocks.STRIPPED_APPLE_TREE_WOOD);
        g.createLogTexturePool(MavesBlocks.STRIPPED_AZALEA_STEM)
                .log(MavesBlocks.STRIPPED_AZALEA_STEM).wood(MavesBlocks.STRIPPED_AZALEA_WOOD);
        g.createLogTexturePool(MavesBlocks.STRIPPED_CACAO_TREE_LOG)
                .log(MavesBlocks.STRIPPED_CACAO_TREE_LOG).wood(MavesBlocks.STRIPPED_CACAO_TREE_WOOD);
        g.createLogTexturePool(MavesBlocks.STRIPPED_HANGING_BLACK_WIDOW_STEM)
                .log(MavesBlocks.STRIPPED_HANGING_BLACK_WIDOW_STEM);
        g.createLogTexturePool(MavesBlocks.STRIPPED_RUBBER_LOG)
                .log(MavesBlocks.STRIPPED_RUBBER_LOG).wood(MavesBlocks.STRIPPED_RUBBER_WOOD);
        g.createLogTexturePool(MavesBlocks.STRIPPED_WILLOW_LOG)
                .log(MavesBlocks.STRIPPED_WILLOW_LOG).wood(MavesBlocks.STRIPPED_WILLOW_WOOD);

        registerTintableBlockWithStages(g, MavesBlocks.ACACIA_FLOWERING_LEAVES,
                Properties.AGE_3, -12012264, 0, 1, 2, 3);
        g.registerTintedBlockAndItem(MavesBlocks.ACACIA_FLOWERED_LEAVES,
                TexturedModel.LEAVES, -12012264);
        registerTintableBlockWithStages(g, MavesBlocks.BIRCH_FLOWERING_LEAVES,
                Properties.AGE_3, -8345771, 0, 1, 2, 3);
        registerBlockWithStages(g, MavesBlocks.CHERRY_FLOWERING_LEAVES,
                Properties.AGE_3, 0, 1, 2, 3);
        registerTintableBlockWithStages(g, MavesBlocks.DARK_OAK_FLOWERING_LEAVES,
                Properties.AGE_3, -12012264, 0, 1, 2, 3);
        registerTintableBlockWithStages(g, MavesBlocks.JUNGLE_FLOWERING_LEAVES,
                Properties.AGE_3, -12012264, 0, 1, 2, 3);
        registerTintableBlockWithStages(g, MavesBlocks.OAK_FLOWERING_LEAVES,
                Properties.AGE_3, -12012264, 0, 1, 2, 3);
        registerBlockWithStages(g, MavesBlocks.PALE_OAK_FLOWERING_LEAVES,
                Properties.AGE_3, 0, 1, 2, 3);

        g.registerTintedBlockAndItem(MavesBlocks.APPLE_TREE_LEAVES,
                TexturedModel.LEAVES, 0xbeff00);
        registerTintableBlockWithStages(g, MavesBlocks.APPLE_TREE_FLOWERING_LEAVES,
                Properties.AGE_3, 0xbeff00, 0, 1, 2, 3);
        g.registerTintedBlockAndItem(MavesBlocks.APPLE_TREE_FLOWERED_LEAVES,
                TexturedModel.LEAVES, 0xbeff00);
        g.registerTintedBlockAndItem(MavesBlocks.CACAO_TREE_LEAVES,
                TexturedModel.LEAVES, 0x97ff00);
        g.registerTintableCrossBlockStateWithStages(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_HEAD,
                BlockStateModelGenerator.CrossType.NOT_TINTED, Properties.AGE_3, 0, 1, 2, 3);
        g.registerTintableCrossBlockStateWithStages(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_BODY,
                BlockStateModelGenerator.CrossType.NOT_TINTED, Properties.AGE_3, 0, 1, 2, 3);
        g.registerTintableCrossBlockStateWithStages(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_TAIL,
                BlockStateModelGenerator.CrossType.NOT_TINTED, Properties.AGE_3, 0, 1, 2, 3);
        g.registerTintedBlockAndItem(MavesBlocks.RUBBER_LEAVES,
                TexturedModel.LEAVES, 0x00ff03);
        g.registerTintedBlockAndItem(MavesBlocks.WILLOW_LEAVES,
                TexturedModel.LEAVES, 0x67ff00);
        g.registerFlowerPotPlantAndItem(MavesBlocks.APPLE_TREE_SAPLING,
                MavesBlocks.POTTED_APPLE_TREE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        g.registerFlowerPotPlantAndItem(MavesBlocks.CACAO_TREE_SAPLING,
                MavesBlocks.POTTED_CACAO_TREE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        g.registerFlowerPotPlantAndItem(MavesBlocks.HANGING_BLACK_WIDOW_SAPLING,
                MavesBlocks.POTTED_HANGING_BLACK_WIDOW_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        g.registerFlowerPotPlantAndItem(MavesBlocks.RUBBER_SAPLING,
                MavesBlocks.POTTED_RUBBER_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        g.registerFlowerPotPlantAndItem(MavesBlocks.WILLOW_SAPLING,
                MavesBlocks.POTTED_WILLOW_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool appleTreePool = g
                .registerCubeAllModelTexturePool(MavesBlocks.APPLE_TREE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool azaleaPool = g
                .registerCubeAllModelTexturePool(MavesBlocks.AZALEA_PLANKS);
        BlockStateModelGenerator.BlockTexturePool cacaoTreePool = g
                .registerCubeAllModelTexturePool(MavesBlocks.CACAO_TREE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool hangingBlackWidowPool = g
                .registerCubeAllModelTexturePool(MavesBlocks.HANGING_BLACK_WIDOW_PLANKS);
        BlockStateModelGenerator.BlockTexturePool hangingBlackWidowMosaicPool = g
                .registerCubeAllModelTexturePool(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool rubberPool = g
                .registerCubeAllModelTexturePool(MavesBlocks.RUBBER_PLANKS);
        BlockStateModelGenerator.BlockTexturePool willowPool = g
                .registerCubeAllModelTexturePool(MavesBlocks.WILLOW_PLANKS);

        appleTreePool.button(MavesBlocks.APPLE_TREE_BUTTON);
        appleTreePool.fence(MavesBlocks.APPLE_TREE_FENCE);
        appleTreePool.fenceGate(MavesBlocks.APPLE_TREE_FENCE_GATE);
        appleTreePool.pressurePlate(MavesBlocks.APPLE_TREE_PRESSURE_PLATE);
        appleTreePool.slab(MavesBlocks.APPLE_TREE_SLAB);
        appleTreePool.stairs(MavesBlocks.APPLE_TREE_STAIRS);
        appleTreePool.family(MavesBlocks.APPLE_TREE_FAMILY);

        g.registerDoor(MavesBlocks.APPLE_TREE_DOOR);
        g.registerOrientableTrapdoor(MavesBlocks.APPLE_TREE_TRAPDOOR);
        g.registerHangingSign(MavesBlocks.STRIPPED_APPLE_TREE_LOG,
                MavesBlocks.APPLE_TREE_HANGING_SIGN, MavesBlocks.APPLE_TREE_WALL_HANGING_SIGN);

        azaleaPool.button(MavesBlocks.AZALEA_BUTTON);
        azaleaPool.fence(MavesBlocks.AZALEA_FENCE);
        azaleaPool.fenceGate(MavesBlocks.AZALEA_FENCE_GATE);
        azaleaPool.pressurePlate(MavesBlocks.AZALEA_PRESSURE_PLATE);
        azaleaPool.slab(MavesBlocks.AZALEA_SLAB);
        azaleaPool.stairs(MavesBlocks.AZALEA_STAIRS);
        azaleaPool.family(MavesBlocks.AZALEA_FAMILY);

        g.registerDoor(MavesBlocks.AZALEA_DOOR);
        g.registerOrientableTrapdoor(MavesBlocks.AZALEA_TRAPDOOR);
        g.registerHangingSign(MavesBlocks.STRIPPED_AZALEA_STEM,
                MavesBlocks.AZALEA_HANGING_SIGN, MavesBlocks.AZALEA_WALL_HANGING_SIGN);

        cacaoTreePool.button(MavesBlocks.CACAO_TREE_BUTTON);
        cacaoTreePool.fence(MavesBlocks.CACAO_TREE_FENCE);
        cacaoTreePool.fenceGate(MavesBlocks.CACAO_TREE_FENCE_GATE);
        cacaoTreePool.pressurePlate(MavesBlocks.CACAO_TREE_PRESSURE_PLATE);
        cacaoTreePool.slab(MavesBlocks.CACAO_TREE_SLAB);
        cacaoTreePool.stairs(MavesBlocks.CACAO_TREE_STAIRS);
        cacaoTreePool.family(MavesBlocks.CACAO_TREE_FAMILY);

        g.registerDoor(MavesBlocks.CACAO_TREE_DOOR);
        g.registerOrientableTrapdoor(MavesBlocks.CACAO_TREE_TRAPDOOR);
        g.registerHangingSign(MavesBlocks.STRIPPED_CACAO_TREE_LOG,
                MavesBlocks.CACAO_TREE_HANGING_SIGN, MavesBlocks.CACAO_TREE_WALL_HANGING_SIGN);

        g.registerSimpleCubeAll(MavesBlocks.HANGING_BLACK_WIDOW_BLOCK);

        hangingBlackWidowPool.button(MavesBlocks.HANGING_BLACK_WIDOW_BUTTON);
        hangingBlackWidowPool.fence(MavesBlocks.HANGING_BLACK_WIDOW_FENCE);
        hangingBlackWidowPool.fenceGate(MavesBlocks.HANGING_BLACK_WIDOW_FENCE_GATE);
        hangingBlackWidowPool.pressurePlate(MavesBlocks.HANGING_BLACK_WIDOW_PRESSURE_PLATE);
        hangingBlackWidowPool.slab(MavesBlocks.HANGING_BLACK_WIDOW_SLAB);
        hangingBlackWidowPool.stairs(MavesBlocks.HANGING_BLACK_WIDOW_STAIRS);
        hangingBlackWidowPool.family(MavesBlocks.HANGING_BLACK_WIDOW_FAMILY);

        hangingBlackWidowMosaicPool.slab(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC_SLAB);
        hangingBlackWidowMosaicPool.stairs(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC_STAIRS);

        g.registerDoor(MavesBlocks.HANGING_BLACK_WIDOW_DOOR);
        g.registerOrientableTrapdoor(MavesBlocks.HANGING_BLACK_WIDOW_TRAPDOOR);
        g.registerHangingSign(MavesBlocks.STRIPPED_HANGING_BLACK_WIDOW_STEM,
                MavesBlocks.HANGING_BLACK_WIDOW_HANGING_SIGN, MavesBlocks.HANGING_BLACK_WIDOW_WALL_HANGING_SIGN);

        rubberPool.button(MavesBlocks.RUBBER_BUTTON);
        rubberPool.fence(MavesBlocks.RUBBER_FENCE);
        rubberPool.fenceGate(MavesBlocks.RUBBER_FENCE_GATE);
        rubberPool.pressurePlate(MavesBlocks.RUBBER_PRESSURE_PLATE);
        rubberPool.slab(MavesBlocks.RUBBER_SLAB);
        rubberPool.stairs(MavesBlocks.RUBBER_STAIRS);
        rubberPool.family(MavesBlocks.RUBBER_FAMILY);

        g.registerDoor(MavesBlocks.RUBBER_DOOR);
        g.registerOrientableTrapdoor(MavesBlocks.RUBBER_TRAPDOOR);
        g.registerHangingSign(MavesBlocks.STRIPPED_RUBBER_LOG,
                MavesBlocks.RUBBER_HANGING_SIGN, MavesBlocks.RUBBER_WALL_HANGING_SIGN);

        willowPool.button(MavesBlocks.WILLOW_BUTTON);
        willowPool.fence(MavesBlocks.WILLOW_FENCE);
        willowPool.fenceGate(MavesBlocks.WILLOW_FENCE_GATE);
        willowPool.pressurePlate(MavesBlocks.WILLOW_PRESSURE_PLATE);
        willowPool.slab(MavesBlocks.WILLOW_SLAB);
        willowPool.stairs(MavesBlocks.WILLOW_STAIRS);
        willowPool.family(MavesBlocks.WILLOW_FAMILY);

        g.registerDoor(MavesBlocks.WILLOW_DOOR);
        g.registerOrientableTrapdoor(MavesBlocks.WILLOW_TRAPDOOR);
        g.registerHangingSign(MavesBlocks.STRIPPED_WILLOW_LOG,
                MavesBlocks.WILLOW_HANGING_SIGN, MavesBlocks.WILLOW_WALL_HANGING_SIGN);

        g.registerGourd(MavesBlocks.PALE_PUMPKIN_STEM,
                MavesBlocks.ATTACHED_PALE_PUMPKIN_STEM);
        registerPalePumpkins(g);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(MavesItems.OAK_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.SPRUCE_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.BIRCH_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.JUNGLE_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.ACACIA_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.DARK_OAK_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.MANGROVE_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.CHERRY_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.PALE_OAK_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.APPLE_TREE_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.AZALEA_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.CACAO_TREE_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.HANGING_BLACK_WIDOW_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.RUBBER_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WILLOW_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.CRIMSON_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WARPED_BARK, Models.GENERATED);

        itemModelGenerator.register(MavesItems.OAK_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.SPRUCE_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.BIRCH_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.JUNGLE_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.ACACIA_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.DARK_OAK_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.MANGROVE_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.CHERRY_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.PALE_OAK_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.APPLE_TREE_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.AZALEA_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.CACAO_TREE_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.RUBBER_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WILLOW_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.CRIMSON_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WARPED_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_OAK_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_SPRUCE_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_BIRCH_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_JUNGLE_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_ACACIA_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_DARK_OAK_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_MANGROVE_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_CHERRY_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_PALE_OAK_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_APPLE_TREE_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_AZALEA_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_CACAO_TREE_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_RUBBER_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_WILLOW_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_CRIMSON_SLIVER, Models.GENERATED);
        itemModelGenerator.register(MavesItems.STRIPPED_WARPED_SLIVER, Models.GENERATED);

        itemModelGenerator.register(MavesItems.GREEN_APPLE, Models.GENERATED);
        itemModelGenerator.register(MavesItems.PUMPKIN_SLICE, Models.GENERATED);
        itemModelGenerator.register(MavesItems.PALE_PUMPKIN_SLICE, Models.GENERATED);
        itemModelGenerator.register(MavesItems.CHERRIES, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WILD_BERRIES_BLUE, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WILD_BERRIES_GREEN, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WILD_BERRIES_YELLOW, Models.GENERATED);
        itemModelGenerator.register(MavesItems.BLACK_WIDOW_BERRIES, Models.GENERATED);
        itemModelGenerator.register(MavesItems.MILK_CHOCOLATE, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WHITE_CHOCOLATE, Models.GENERATED);
        itemModelGenerator.register(MavesItems.DARK_CHOCOLATE, Models.GENERATED);

        itemModelGenerator.register(MavesItems.ACORN, Models.GENERATED);
        itemModelGenerator.register(MavesItems.DARK_ACORN, Models.GENERATED);
        itemModelGenerator.register(MavesItems.PALE_ACORN, Models.GENERATED);
        itemModelGenerator.register(MavesItems.ACACIA_POD, Models.GENERATED);
        itemModelGenerator.register(MavesItems.SPRUCE_CONE, Models.GENERATED);

        itemModelGenerator.register(MavesItems.HANGING_BLACK_WIDOW_BRANCH, Models.GENERATED);
        itemModelGenerator.register(MavesItems.LATEX_BOTTLE, Models.GENERATED);

        itemModelGenerator.register(MavesItems.ACACIA_BLOSSOM, Models.GENERATED);
        itemModelGenerator.register(MavesItems.APPLE_BLOSSOM, Models.GENERATED);
        itemModelGenerator.register(MavesItems.AZALEA_BLOSSOM, Models.GENERATED);
        itemModelGenerator.register(MavesItems.BIRCH_CATKINS, Models.GENERATED);

        itemModelGenerator.register(MavesItems.APPLE_TREE_BOAT, Models.GENERATED);
        itemModelGenerator.register(MavesItems.APPLE_TREE_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(MavesItems.AZALEA_BOAT, Models.GENERATED);
        itemModelGenerator.register(MavesItems.AZALEA_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(MavesItems.CACAO_TREE_BOAT, Models.GENERATED);
        itemModelGenerator.register(MavesItems.CACAO_TREE_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(MavesItems.HANGING_BLACK_WIDOW_BOAT, Models.GENERATED);
        itemModelGenerator.register(MavesItems.HANGING_BLACK_WIDOW_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(MavesItems.RUBBER_BOAT, Models.GENERATED);
        itemModelGenerator.register(MavesItems.RUBBER_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WILLOW_BOAT, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WILLOW_CHEST_BOAT, Models.GENERATED);
    }
}