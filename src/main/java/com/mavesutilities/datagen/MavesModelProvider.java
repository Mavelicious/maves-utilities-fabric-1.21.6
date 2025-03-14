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
            BlockStateModelGenerator generator, Block block, Property<Integer> stageProperty, int tintColor, int... stages
    ) {
        if (stageProperty.getValues().size() != stages.length) {
            throw new IllegalArgumentException("missing values for property: " + stageProperty);
        } else {
            BlockStateVariantMap blockStateVarientMap = BlockStateVariantMap.create(stageProperty).register(stage -> {
                String string = "_stage" + stages[stage];
                TextureMap textureMap = TextureMap.all(TextureMap.getSubId(block, string));
                Identifier identifier = Models.LEAVES.upload(block, string, textureMap, generator.modelCollector);
                return BlockStateVariant.create().put(VariantSettings.MODEL, identifier);
            });
            generator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(blockStateVarientMap));
            String itemModelString = "_stage" + stages[stages.length - 1];
            generator.registerTintedItemModel(block, Identifier.of(ModelIds.getBlockModelId(block) + itemModelString), ItemModels.constantTintSource(tintColor));
        }
    }

    public final void registerBlockWithStages(
            BlockStateModelGenerator generator, Block block, Property<Integer> stageProperty, int... stages
    ) {
        if (stageProperty.getValues().size() != stages.length) {
            throw new IllegalArgumentException("missing values for property: " + stageProperty);
        } else {
            BlockStateVariantMap blockStateVariantMap = BlockStateVariantMap.create(stageProperty).register(stage -> {
                String string = "_stage" + stages[stage];
                TextureMap textureMap = TextureMap.all(TextureMap.getSubId(block, string));
                Identifier identifier = Models.LEAVES.upload(block, string, textureMap, generator.modelCollector);
                return BlockStateVariant.create().put(VariantSettings.MODEL, identifier);
            });
            generator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(blockStateVariantMap));
            String itemModelString = "_stage" + stages[stages.length - 1];
            generator.registerItemModel(block.asItem(), Identifier.of(ModelIds.getBlockModelId(block) + itemModelString));
        }
    }

    private void registerPalePumpkins(BlockStateModelGenerator generator) {
        TextureMap textureMap = TextureMap.sideEnd(MavesBlocks.PALE_PUMPKIN);
        Identifier modelId = Models.CUBE_COLUMN.upload(MavesBlocks.PALE_PUMPKIN, textureMap, generator.modelCollector);
        generator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(MavesBlocks.PALE_PUMPKIN, modelId));
        generator.registerNorthDefaultHorizontalRotatable(MavesBlocks.CARVED_PALE_PUMPKIN, textureMap);
        generator.registerNorthDefaultHorizontalRotatable(MavesBlocks.PALE_JACK_O_LANTERN, textureMap);
    }

    public void registerBlockCopy(BlockStateModelGenerator generator, Block block, Block textureBlock) {
        TextureMap textureMap = TextureMap.sideAndEndForTop(textureBlock);
        Identifier modelId = Models.CUBE_COLUMN.upload(block, textureMap, generator.modelCollector);
        Identifier modelId2 = Models.CUBE_COLUMN_HORIZONTAL.upload(block, textureMap, generator.modelCollector);
        generator.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(block, modelId, modelId2));
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        registerBlockCopy(generator, MavesBlocks.OAK_BLOCK, Blocks.OAK_LOG);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_OAK_BLOCK, Blocks.STRIPPED_OAK_LOG);
        registerBlockCopy(generator, MavesBlocks.SPRUCE_BLOCK, Blocks.SPRUCE_LOG);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_SPRUCE_BLOCK, Blocks.STRIPPED_SPRUCE_LOG);
        registerBlockCopy(generator, MavesBlocks.BIRCH_BLOCK, Blocks.BIRCH_LOG);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_BIRCH_BLOCK, Blocks.STRIPPED_BIRCH_LOG);
        registerBlockCopy(generator, MavesBlocks.JUNGLE_BLOCK, Blocks.JUNGLE_LOG);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_JUNGLE_BLOCK, Blocks.STRIPPED_JUNGLE_LOG);
        registerBlockCopy(generator, MavesBlocks.ACACIA_BLOCK, Blocks.ACACIA_LOG);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_ACACIA_BLOCK, Blocks.STRIPPED_ACACIA_LOG);
        registerBlockCopy(generator, MavesBlocks.DARK_OAK_BLOCK, Blocks.DARK_OAK_LOG);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_DARK_OAK_BLOCK, Blocks.STRIPPED_DARK_OAK_LOG);
        registerBlockCopy(generator, MavesBlocks.MANGROVE_BLOCK, Blocks.MANGROVE_LOG);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_MANGROVE_BLOCK, Blocks.STRIPPED_MANGROVE_LOG);
        registerBlockCopy(generator, MavesBlocks.CHERRY_BLOCK, Blocks.CHERRY_LOG);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_CHERRY_BLOCK, Blocks.STRIPPED_CHERRY_LOG);
        registerBlockCopy(generator, MavesBlocks.PALE_OAK_BLOCK, Blocks.PALE_OAK_LOG);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_PALE_OAK_BLOCK, Blocks.STRIPPED_PALE_OAK_LOG);
        registerBlockCopy(generator, MavesBlocks.APPLE_TREE_BLOCK, MavesBlocks.APPLE_TREE_LOG);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_APPLE_TREE_BLOCK, MavesBlocks.STRIPPED_APPLE_TREE_LOG);
        registerBlockCopy(generator, MavesBlocks.AZALEA_BLOCK, MavesBlocks.AZALEA_STEM);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_AZALEA_BLOCK, MavesBlocks.STRIPPED_AZALEA_STEM);
        registerBlockCopy(generator, MavesBlocks.CACAO_TREE_BLOCK, MavesBlocks.CACAO_TREE_LOG);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_CACAO_TREE_BLOCK, MavesBlocks.STRIPPED_CACAO_TREE_LOG);
        registerBlockCopy(generator, MavesBlocks.RUBBER_BLOCK, MavesBlocks.RUBBER_LOG);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_RUBBER_BLOCK, MavesBlocks.STRIPPED_RUBBER_LOG);
        registerBlockCopy(generator, MavesBlocks.WILLOW_BLOCK, MavesBlocks.WILLOW_LOG);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_WILLOW_BLOCK, MavesBlocks.STRIPPED_WILLOW_LOG);
        registerBlockCopy(generator, MavesBlocks.CRIMSON_BLOCK, Blocks.CRIMSON_STEM);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_CRIMSON_BLOCK, Blocks.STRIPPED_CRIMSON_STEM);
        registerBlockCopy(generator, MavesBlocks.WARPED_BLOCK, Blocks.WARPED_STEM);
        registerBlockCopy(generator, MavesBlocks.STRIPPED_WARPED_BLOCK, Blocks.STRIPPED_WARPED_STEM);

        generator.registerLog(MavesBlocks.APPLE_TREE_LOG)
                .log(MavesBlocks.APPLE_TREE_LOG).wood(MavesBlocks.APPLE_TREE_WOOD);
        generator.registerLog(MavesBlocks.AZALEA_STEM)
                .log(MavesBlocks.AZALEA_STEM).wood(MavesBlocks.AZALEA_WOOD);
        generator.registerLog(MavesBlocks.CACAO_TREE_LOG)
                .log(MavesBlocks.CACAO_TREE_LOG).wood(MavesBlocks.CACAO_TREE_WOOD);
        generator.registerLog(MavesBlocks.RUBBER_LOG)
                .log(MavesBlocks.RUBBER_LOG).wood(MavesBlocks.RUBBER_WOOD);
        generator.registerLog(MavesBlocks.WILLOW_LOG)
                .log(MavesBlocks.WILLOW_LOG).wood(MavesBlocks.WILLOW_WOOD);
        generator.registerLog(MavesBlocks.STRIPPED_APPLE_TREE_LOG)
                .log(MavesBlocks.STRIPPED_APPLE_TREE_LOG).wood(MavesBlocks.STRIPPED_APPLE_TREE_WOOD);
        generator.registerLog(MavesBlocks.STRIPPED_AZALEA_STEM)
                .log(MavesBlocks.STRIPPED_AZALEA_STEM).wood(MavesBlocks.STRIPPED_AZALEA_WOOD);
        generator.registerLog(MavesBlocks.STRIPPED_CACAO_TREE_LOG)
                .log(MavesBlocks.STRIPPED_CACAO_TREE_LOG).wood(MavesBlocks.STRIPPED_CACAO_TREE_WOOD);
        generator.registerLog(MavesBlocks.STRIPPED_RUBBER_LOG)
                .log(MavesBlocks.STRIPPED_RUBBER_LOG).wood(MavesBlocks.STRIPPED_RUBBER_WOOD);
        generator.registerLog(MavesBlocks.STRIPPED_WILLOW_LOG)
                .log(MavesBlocks.STRIPPED_WILLOW_LOG).wood(MavesBlocks.STRIPPED_WILLOW_WOOD);

        registerTintableBlockWithStages(generator, MavesBlocks.ACACIA_FLOWERING_LEAVES,
                Properties.AGE_3, -12012264, 0, 1, 2, 3);
        generator.registerTintedBlockAndItem(MavesBlocks.ACACIA_FLOWERED_LEAVES,
                TexturedModel.LEAVES, -12012264);
        registerTintableBlockWithStages(generator, MavesBlocks.BIRCH_FLOWERING_LEAVES,
                Properties.AGE_3, -8345771, 0, 1, 2, 3);
        registerBlockWithStages(generator, MavesBlocks.CHERRY_FLOWERING_LEAVES,
                Properties.AGE_3, 0, 1, 2, 3);
        registerTintableBlockWithStages(generator, MavesBlocks.DARK_OAK_FLOWERING_LEAVES,
                Properties.AGE_3, -12012264, 0, 1, 2, 3);
        registerTintableBlockWithStages(generator, MavesBlocks.JUNGLE_FLOWERING_LEAVES,
                Properties.AGE_3, -12012264, 0, 1, 2, 3);
        registerTintableBlockWithStages(generator, MavesBlocks.OAK_FLOWERING_LEAVES,
                Properties.AGE_3, -12012264, 0, 1, 2, 3);
        registerBlockWithStages(generator, MavesBlocks.PALE_OAK_FLOWERING_LEAVES,
                Properties.AGE_3, 0, 1, 2, 3);

        generator.registerTintedBlockAndItem(MavesBlocks.APPLE_TREE_LEAVES,
                TexturedModel.LEAVES, 0xbeff00);
        registerTintableBlockWithStages(generator, MavesBlocks.APPLE_TREE_FLOWERING_LEAVES,
                Properties.AGE_3, 0xbeff00, 0, 1, 2, 3);
        generator.registerTintedBlockAndItem(MavesBlocks.APPLE_TREE_FLOWERED_LEAVES,
                TexturedModel.LEAVES, 0xbeff00);
        generator.registerTintedBlockAndItem(MavesBlocks.CACAO_TREE_LEAVES,
                TexturedModel.LEAVES, 0x97ff00);
        generator.registerTintedBlockAndItem(MavesBlocks.RUBBER_LEAVES,
                TexturedModel.LEAVES, 0x00ff03);
        generator.registerTintedBlockAndItem(MavesBlocks.WILLOW_LEAVES,
                TexturedModel.LEAVES, 0x67ff00);
        generator.registerFlowerPotPlantAndItem(MavesBlocks.APPLE_TREE_SAPLING,
                MavesBlocks.POTTED_APPLE_TREE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        generator.registerFlowerPotPlantAndItem(MavesBlocks.CACAO_TREE_SAPLING,
                MavesBlocks.POTTED_CACAO_TREE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        generator.registerFlowerPotPlantAndItem(MavesBlocks.RUBBER_SAPLING,
                MavesBlocks.POTTED_RUBBER_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        generator.registerFlowerPotPlantAndItem(MavesBlocks.WILLOW_SAPLING,
                MavesBlocks.POTTED_WILLOW_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool appleTreePool = generator
                .registerCubeAllModelTexturePool(MavesBlocks.APPLE_TREE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool azaleaPool = generator
                .registerCubeAllModelTexturePool(MavesBlocks.AZALEA_PLANKS);
        BlockStateModelGenerator.BlockTexturePool cacaoTreePool = generator
                .registerCubeAllModelTexturePool(MavesBlocks.CACAO_TREE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool rubberPool = generator
                .registerCubeAllModelTexturePool(MavesBlocks.RUBBER_PLANKS);
        BlockStateModelGenerator.BlockTexturePool willowPool = generator
                .registerCubeAllModelTexturePool(MavesBlocks.WILLOW_PLANKS);

        appleTreePool.button(MavesBlocks.APPLE_TREE_BUTTON);
        appleTreePool.fence(MavesBlocks.APPLE_TREE_FENCE);
        appleTreePool.fenceGate(MavesBlocks.APPLE_TREE_FENCE_GATE);
        appleTreePool.pressurePlate(MavesBlocks.APPLE_TREE_PRESSURE_PLATE);
        appleTreePool.slab(MavesBlocks.APPLE_TREE_SLAB);
        appleTreePool.stairs(MavesBlocks.APPLE_TREE_STAIRS);
        appleTreePool.family(MavesBlocks.APPLE_TREE_FAMILY);

        generator.registerDoor(MavesBlocks.APPLE_TREE_DOOR);
        generator.registerOrientableTrapdoor(MavesBlocks.APPLE_TREE_TRAPDOOR);
        generator.registerHangingSign(MavesBlocks.STRIPPED_APPLE_TREE_LOG,
                MavesBlocks.APPLE_TREE_HANGING_SIGN, MavesBlocks.APPLE_TREE_WALL_HANGING_SIGN);

        azaleaPool.button(MavesBlocks.AZALEA_BUTTON);
        azaleaPool.fence(MavesBlocks.AZALEA_FENCE);
        azaleaPool.fenceGate(MavesBlocks.AZALEA_FENCE_GATE);
        azaleaPool.pressurePlate(MavesBlocks.AZALEA_PRESSURE_PLATE);
        azaleaPool.slab(MavesBlocks.AZALEA_SLAB);
        azaleaPool.stairs(MavesBlocks.AZALEA_STAIRS);
        azaleaPool.family(MavesBlocks.AZALEA_FAMILY);

        generator.registerDoor(MavesBlocks.AZALEA_DOOR);
        generator.registerOrientableTrapdoor(MavesBlocks.AZALEA_TRAPDOOR);
        generator.registerHangingSign(MavesBlocks.STRIPPED_AZALEA_STEM,
                MavesBlocks.AZALEA_HANGING_SIGN, MavesBlocks.AZALEA_WALL_HANGING_SIGN);

        cacaoTreePool.button(MavesBlocks.CACAO_TREE_BUTTON);
        cacaoTreePool.fence(MavesBlocks.CACAO_TREE_FENCE);
        cacaoTreePool.fenceGate(MavesBlocks.CACAO_TREE_FENCE_GATE);
        cacaoTreePool.pressurePlate(MavesBlocks.CACAO_TREE_PRESSURE_PLATE);
        cacaoTreePool.slab(MavesBlocks.CACAO_TREE_SLAB);
        cacaoTreePool.stairs(MavesBlocks.CACAO_TREE_STAIRS);
        cacaoTreePool.family(MavesBlocks.CACAO_TREE_FAMILY);

        generator.registerDoor(MavesBlocks.CACAO_TREE_DOOR);
        generator.registerOrientableTrapdoor(MavesBlocks.CACAO_TREE_TRAPDOOR);
        generator.registerHangingSign(MavesBlocks.STRIPPED_CACAO_TREE_LOG,
                MavesBlocks.CACAO_TREE_HANGING_SIGN, MavesBlocks.CACAO_TREE_WALL_HANGING_SIGN);

        rubberPool.button(MavesBlocks.RUBBER_BUTTON);
        rubberPool.fence(MavesBlocks.RUBBER_FENCE);
        rubberPool.fenceGate(MavesBlocks.RUBBER_FENCE_GATE);
        rubberPool.pressurePlate(MavesBlocks.RUBBER_PRESSURE_PLATE);
        rubberPool.slab(MavesBlocks.RUBBER_SLAB);
        rubberPool.stairs(MavesBlocks.RUBBER_STAIRS);
        rubberPool.family(MavesBlocks.RUBBER_FAMILY);

        generator.registerDoor(MavesBlocks.RUBBER_DOOR);
        generator.registerOrientableTrapdoor(MavesBlocks.RUBBER_TRAPDOOR);
        generator.registerHangingSign(MavesBlocks.STRIPPED_RUBBER_LOG,
                MavesBlocks.RUBBER_HANGING_SIGN, MavesBlocks.RUBBER_WALL_HANGING_SIGN);

        willowPool.button(MavesBlocks.WILLOW_BUTTON);
        willowPool.fence(MavesBlocks.WILLOW_FENCE);
        willowPool.fenceGate(MavesBlocks.WILLOW_FENCE_GATE);
        willowPool.pressurePlate(MavesBlocks.WILLOW_PRESSURE_PLATE);
        willowPool.slab(MavesBlocks.WILLOW_SLAB);
        willowPool.stairs(MavesBlocks.WILLOW_STAIRS);
        willowPool.family(MavesBlocks.WILLOW_FAMILY);

        generator.registerDoor(MavesBlocks.WILLOW_DOOR);
        generator.registerOrientableTrapdoor(MavesBlocks.WILLOW_TRAPDOOR);
        generator.registerHangingSign(MavesBlocks.STRIPPED_WILLOW_LOG,
                MavesBlocks.WILLOW_HANGING_SIGN, MavesBlocks.WILLOW_WALL_HANGING_SIGN);

        generator.registerGourd(MavesBlocks.PALE_PUMPKIN_STEM,
                MavesBlocks.ATTACHED_PALE_PUMPKIN_STEM);
        registerPalePumpkins(generator);
    }

    @Override
    public void generateItemModels(net.minecraft.client.data.ItemModelGenerator itemModelGenerator) {
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
        itemModelGenerator.register(MavesItems.MILK_CHOCOLATE, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WHITE_CHOCOLATE, Models.GENERATED);
        itemModelGenerator.register(MavesItems.DARK_CHOCOLATE, Models.GENERATED);

        itemModelGenerator.register(MavesItems.ACORN, Models.GENERATED);
        itemModelGenerator.register(MavesItems.DARK_ACORN, Models.GENERATED);
        itemModelGenerator.register(MavesItems.PALE_ACORN, Models.GENERATED);
        itemModelGenerator.register(MavesItems.ACACIA_POD, Models.GENERATED);
        itemModelGenerator.register(MavesItems.SPRUCE_CONE, Models.GENERATED);

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
        itemModelGenerator.register(MavesItems.RUBBER_BOAT, Models.GENERATED);
        itemModelGenerator.register(MavesItems.RUBBER_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WILLOW_BOAT, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WILLOW_CHEST_BOAT, Models.GENERATED);
    }
}