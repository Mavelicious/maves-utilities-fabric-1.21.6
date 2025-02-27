package com.mavesutilities.datagen;


import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItems;
import net.minecraft.client.render.item.tint.TintSource;
import net.minecraft.item.Item;
import net.minecraft.state.property.*;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.*;
import net.minecraft.client.data.*;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class MavesModelProvider extends FabricModelProvider {

    public MavesModelProvider(FabricDataOutput output, BiConsumer<Identifier, ModelSupplier> modelCollector) {
        super(output);
    }

    public final void registerTintableBlockStateWithStages(
            BlockStateModelGenerator generator, Block block, Property<Integer> stageProperty, int tintColor, int... stages
    ) {
        if (stageProperty.getValues().size() != stages.length) {
            throw new IllegalArgumentException("missing values for property: " + stageProperty);
        } else {
            BlockStateVariantMap blockStateVariantMap = BlockStateVariantMap.create(stageProperty).register(stage -> {
                String string = "_stage" + stages[stage];
                TextureMap textureMap = TextureMap.all(TextureMap.getSubId(block, string));
                Identifier identifier = Models.CUBE_ALL.upload(block, string, textureMap, generator.modelCollector);
                return BlockStateVariant.create().put(VariantSettings.MODEL, identifier);
            });
            generator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(blockStateVariantMap));
            String itemModelString = "_stage" + stages[stages.length - 1];
            generator.registerTintedItemModel(block, Identifier.of(ModelIds.getBlockModelId(block) + itemModelString), ItemModels.constantTintSource(tintColor));
        }
    }

    public final void registerBlockStateWithStages(
            BlockStateModelGenerator generator, Block block, Property<Integer> stageProperty, int... stages
    ) {
        if (stageProperty.getValues().size() != stages.length) {
            throw new IllegalArgumentException("missing values for property: " + stageProperty);
        } else {
            BlockStateVariantMap blockStateVariantMap = BlockStateVariantMap.create(stageProperty).register(stage -> {
                String string = "_stage" + stages[stage];
                TextureMap textureMap = TextureMap.all(TextureMap.getSubId(block, string));
                Identifier identifier = Models.CUBE_ALL.upload(block, string, textureMap, generator.modelCollector);
                return BlockStateVariant.create().put(VariantSettings.MODEL, identifier);
            });
            generator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(blockStateVariantMap));
            String itemModelString = "_stage" + stages[stages.length - 1];
            generator.registerItemModel(Item.fromBlock(block), Identifier.of(ModelIds.getBlockModelId(block) + itemModelString));
        }
    }



    @Override
    public void generateBlockStateModels(net.minecraft.client.data.BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerLog(MavesBlocks.APPLE_TREE_LOG).log(MavesBlocks.APPLE_TREE_LOG)
                .wood(MavesBlocks.APPLE_TREE_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.AZALEA_STEM).log(MavesBlocks.AZALEA_STEM)
                .wood(MavesBlocks.AZALEA_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.CACAO_TREE_LOG).log(MavesBlocks.CACAO_TREE_LOG)
                .wood(MavesBlocks.CACAO_TREE_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.RUBBER_LOG).log(MavesBlocks.RUBBER_LOG)
                .wood(MavesBlocks.RUBBER_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.WILLOW_LOG).log(MavesBlocks.WILLOW_LOG)
                .wood(MavesBlocks.WILLOW_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_APPLE_TREE_LOG).log(MavesBlocks.STRIPPED_APPLE_TREE_LOG)
                .wood(MavesBlocks.STRIPPED_APPLE_TREE_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_AZALEA_STEM).log(MavesBlocks.STRIPPED_AZALEA_STEM)
                .wood(MavesBlocks.STRIPPED_AZALEA_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_CACAO_TREE_LOG).log(MavesBlocks.STRIPPED_CACAO_TREE_LOG)
                .wood(MavesBlocks.STRIPPED_CACAO_TREE_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_RUBBER_LOG).log(MavesBlocks.STRIPPED_RUBBER_LOG)
                .wood(MavesBlocks.STRIPPED_RUBBER_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_WILLOW_LOG).log(MavesBlocks.STRIPPED_WILLOW_LOG)
                .wood(MavesBlocks.STRIPPED_WILLOW_WOOD);

        registerTintableBlockStateWithStages(blockStateModelGenerator, MavesBlocks.ACACIA_FLOWERING_LEAVES,
                Properties.AGE_3, -12012264, 0, 1, 2, 3);
        blockStateModelGenerator.registerTintedBlockAndItem(MavesBlocks.ACACIA_FLOWERED_LEAVES,
                TexturedModel.LEAVES, -12012264);
        registerTintableBlockStateWithStages(blockStateModelGenerator, MavesBlocks.BIRCH_FLOWERING_LEAVES,
                Properties.AGE_3, -8345771, 0, 1, 2, 3);
        registerBlockStateWithStages(blockStateModelGenerator, MavesBlocks.CHERRY_FLOWERING_LEAVES,
                Properties.AGE_3, 0, 1, 2, 3);
        registerTintableBlockStateWithStages(blockStateModelGenerator, MavesBlocks.DARK_OAK_FLOWERING_LEAVES,
                Properties.AGE_3, -12012264, 0, 1, 2, 3);
        registerTintableBlockStateWithStages(blockStateModelGenerator, MavesBlocks.JUNGLE_FLOWERING_LEAVES,
                Properties.AGE_3, -12012264, 0, 1, 2, 3);
        registerTintableBlockStateWithStages(blockStateModelGenerator, MavesBlocks.OAK_FLOWERING_LEAVES,
                Properties.AGE_3, -12012264, 0, 1, 2, 3);
        registerBlockStateWithStages(blockStateModelGenerator, MavesBlocks.PALE_OAK_FLOWERING_LEAVES,
                Properties.AGE_3, 0, 1, 2, 3);

        blockStateModelGenerator.registerTintedBlockAndItem(MavesBlocks.APPLE_TREE_LEAVES,
                TexturedModel.LEAVES, 0xbeff00);
        registerTintableBlockStateWithStages(blockStateModelGenerator, MavesBlocks.APPLE_TREE_FLOWERING_LEAVES,
                Properties.AGE_3, 0xbeff00, 0, 1, 2, 3);
        blockStateModelGenerator.registerTintedBlockAndItem(MavesBlocks.APPLE_TREE_FLOWERED_LEAVES,
                TexturedModel.LEAVES, 0xbeff00);
        blockStateModelGenerator.registerTintedBlockAndItem(MavesBlocks.CACAO_TREE_LEAVES,
                TexturedModel.LEAVES, 0x97ff00);
        blockStateModelGenerator.registerTintedBlockAndItem(MavesBlocks.RUBBER_LEAVES,
                TexturedModel.LEAVES, 0x00ff03);
        blockStateModelGenerator.registerTintedBlockAndItem(MavesBlocks.WILLOW_LEAVES,
                TexturedModel.LEAVES, 0x67ff00);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(MavesBlocks.APPLE_TREE_SAPLING,
                MavesBlocks.POTTED_APPLE_TREE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(MavesBlocks.CACAO_TREE_SAPLING,
                MavesBlocks.POTTED_CACAO_TREE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(MavesBlocks.RUBBER_SAPLING,
                MavesBlocks.POTTED_RUBBER_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(MavesBlocks.WILLOW_SAPLING,
                MavesBlocks.POTTED_WILLOW_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool appleTreePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(MavesBlocks.APPLE_TREE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool azaleaPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(MavesBlocks.AZALEA_PLANKS);
        BlockStateModelGenerator.BlockTexturePool cacaoTreePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(MavesBlocks.CACAO_TREE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool rubberPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(MavesBlocks.RUBBER_PLANKS);
        BlockStateModelGenerator.BlockTexturePool willowPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(MavesBlocks.WILLOW_PLANKS);

        appleTreePool.button(MavesBlocks.APPLE_TREE_BUTTON);
        appleTreePool.fence(MavesBlocks.APPLE_TREE_FENCE);
        appleTreePool.fenceGate(MavesBlocks.APPLE_TREE_FENCE_GATE);
        appleTreePool.pressurePlate(MavesBlocks.APPLE_TREE_PRESSURE_PLATE);
        appleTreePool.slab(MavesBlocks.APPLE_TREE_SLAB);
        appleTreePool.stairs(MavesBlocks.APPLE_TREE_STAIRS);
        appleTreePool.family(MavesBlocks.APPLE_TREE_FAMILY);

        blockStateModelGenerator.registerDoor(MavesBlocks.APPLE_TREE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(MavesBlocks.APPLE_TREE_TRAPDOOR);
        blockStateModelGenerator.registerHangingSign(MavesBlocks.STRIPPED_APPLE_TREE_LOG,
                MavesBlocks.APPLE_TREE_HANGING_SIGN, MavesBlocks.APPLE_TREE_WALL_HANGING_SIGN);

        azaleaPool.button(MavesBlocks.AZALEA_BUTTON);
        azaleaPool.fence(MavesBlocks.AZALEA_FENCE);
        azaleaPool.fenceGate(MavesBlocks.AZALEA_FENCE_GATE);
        azaleaPool.pressurePlate(MavesBlocks.AZALEA_PRESSURE_PLATE);
        azaleaPool.slab(MavesBlocks.AZALEA_SLAB);
        azaleaPool.stairs(MavesBlocks.AZALEA_STAIRS);
        azaleaPool.family(MavesBlocks.AZALEA_FAMILY);

        blockStateModelGenerator.registerDoor(MavesBlocks.AZALEA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(MavesBlocks.AZALEA_TRAPDOOR);
        blockStateModelGenerator.registerHangingSign(MavesBlocks.STRIPPED_AZALEA_STEM,
                MavesBlocks.AZALEA_HANGING_SIGN, MavesBlocks.AZALEA_WALL_HANGING_SIGN);

        cacaoTreePool.button(MavesBlocks.CACAO_TREE_BUTTON);
        cacaoTreePool.fence(MavesBlocks.CACAO_TREE_FENCE);
        cacaoTreePool.fenceGate(MavesBlocks.CACAO_TREE_FENCE_GATE);
        cacaoTreePool.pressurePlate(MavesBlocks.CACAO_TREE_PRESSURE_PLATE);
        cacaoTreePool.slab(MavesBlocks.CACAO_TREE_SLAB);
        cacaoTreePool.stairs(MavesBlocks.CACAO_TREE_STAIRS);
        cacaoTreePool.family(MavesBlocks.CACAO_TREE_FAMILY);

        blockStateModelGenerator.registerDoor(MavesBlocks.CACAO_TREE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(MavesBlocks.CACAO_TREE_TRAPDOOR);
        blockStateModelGenerator.registerHangingSign(MavesBlocks.STRIPPED_CACAO_TREE_LOG,
                MavesBlocks.CACAO_TREE_HANGING_SIGN, MavesBlocks.CACAO_TREE_WALL_HANGING_SIGN);

        rubberPool.button(MavesBlocks.RUBBER_BUTTON);
        rubberPool.fence(MavesBlocks.RUBBER_FENCE);
        rubberPool.fenceGate(MavesBlocks.RUBBER_FENCE_GATE);
        rubberPool.pressurePlate(MavesBlocks.RUBBER_PRESSURE_PLATE);
        rubberPool.slab(MavesBlocks.RUBBER_SLAB);
        rubberPool.stairs(MavesBlocks.RUBBER_STAIRS);
        rubberPool.family(MavesBlocks.RUBBER_FAMILY);

        blockStateModelGenerator.registerDoor(MavesBlocks.RUBBER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(MavesBlocks.RUBBER_TRAPDOOR);
        blockStateModelGenerator.registerHangingSign(MavesBlocks.STRIPPED_RUBBER_LOG,
                MavesBlocks.RUBBER_HANGING_SIGN, MavesBlocks.RUBBER_WALL_HANGING_SIGN);

        willowPool.button(MavesBlocks.WILLOW_BUTTON);
        willowPool.fence(MavesBlocks.WILLOW_FENCE);
        willowPool.fenceGate(MavesBlocks.WILLOW_FENCE_GATE);
        willowPool.pressurePlate(MavesBlocks.WILLOW_PRESSURE_PLATE);
        willowPool.slab(MavesBlocks.WILLOW_SLAB);
        willowPool.stairs(MavesBlocks.WILLOW_STAIRS);
        willowPool.family(MavesBlocks.WILLOW_FAMILY);

        blockStateModelGenerator.registerDoor(MavesBlocks.WILLOW_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(MavesBlocks.WILLOW_TRAPDOOR);
        blockStateModelGenerator.registerHangingSign(MavesBlocks.STRIPPED_WILLOW_LOG,
                MavesBlocks.WILLOW_HANGING_SIGN, MavesBlocks.WILLOW_WALL_HANGING_SIGN);

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

        itemModelGenerator.register(MavesItems.GREEN_APPLE, Models.GENERATED);
        itemModelGenerator.register(MavesItems.PUMPKIN_SLICE, Models.GENERATED);
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