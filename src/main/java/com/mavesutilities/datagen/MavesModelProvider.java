package com.mavesutilities.datagen;


import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.*;

public class MavesModelProvider extends FabricModelProvider {

    public MavesModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(net.minecraft.client.data.BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerLog(MavesBlocks.APPLE_TREE_LOG).log(MavesBlocks.APPLE_TREE_LOG)
                .wood(MavesBlocks.APPLE_TREE_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.AZALEA_STEM).log(MavesBlocks.AZALEA_STEM)
                .wood(MavesBlocks.AZALEA_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.COCOA_TREE_LOG).log(MavesBlocks.COCOA_TREE_LOG)
                .wood(MavesBlocks.COCOA_TREE_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.RUBBER_LOG).log(MavesBlocks.RUBBER_LOG)
                .wood(MavesBlocks.RUBBER_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.WILLOW_LOG).log(MavesBlocks.WILLOW_LOG)
                .wood(MavesBlocks.WILLOW_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_APPLE_TREE_LOG).log(MavesBlocks.STRIPPED_APPLE_TREE_LOG)
                .wood(MavesBlocks.STRIPPED_APPLE_TREE_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_AZALEA_STEM).log(MavesBlocks.STRIPPED_AZALEA_STEM)
                .wood(MavesBlocks.STRIPPED_AZALEA_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_COCOA_TREE_LOG).log(MavesBlocks.STRIPPED_COCOA_TREE_LOG)
                .wood(MavesBlocks.STRIPPED_COCOA_TREE_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_RUBBER_LOG).log(MavesBlocks.STRIPPED_RUBBER_LOG)
                .wood(MavesBlocks.STRIPPED_RUBBER_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_WILLOW_LOG).log(MavesBlocks.STRIPPED_WILLOW_LOG)
                .wood(MavesBlocks.STRIPPED_WILLOW_WOOD);

        blockStateModelGenerator.registerTintedBlockAndItem(MavesBlocks.APPLE_TREE_LEAVES,
                TexturedModel.LEAVES, 0xbeff00);
        blockStateModelGenerator.registerTintedBlockAndItem(MavesBlocks.COCOA_TREE_LEAVES,
                TexturedModel.LEAVES, 0x97ff00);
        blockStateModelGenerator.registerTintedBlockAndItem(MavesBlocks.RUBBER_LEAVES,
                TexturedModel.LEAVES, 0x00ff03);
        blockStateModelGenerator.registerTintedBlockAndItem(MavesBlocks.WILLOW_LEAVES,
                TexturedModel.LEAVES, 0x67ff00);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(MavesBlocks.APPLE_TREE_SAPLING,
                MavesBlocks.POTTED_APPLE_TREE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(MavesBlocks.COCOA_TREE_SAPLING,
                MavesBlocks.POTTED_COCOA_TREE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(MavesBlocks.RUBBER_SAPLING,
                MavesBlocks.POTTED_RUBBER_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(MavesBlocks.WILLOW_SAPLING,
                MavesBlocks.POTTED_WILLOW_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(MavesBlocks.APPLE_TREE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(MavesBlocks.AZALEA_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(MavesBlocks.COCOA_TREE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(MavesBlocks.RUBBER_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(MavesBlocks.WILLOW_PLANKS);

        BlockStateModelGenerator.BlockTexturePool appleTreePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(MavesBlocks.APPLE_TREE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool azaleaPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(MavesBlocks.AZALEA_PLANKS);
        BlockStateModelGenerator.BlockTexturePool cocoaTreePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(MavesBlocks.COCOA_TREE_PLANKS);
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

        blockStateModelGenerator.registerDoor(MavesBlocks.APPLE_TREE_DOOR);
        blockStateModelGenerator.registerTrapdoor(MavesBlocks.APPLE_TREE_TRAPDOOR);

        azaleaPool.button(MavesBlocks.AZALEA_BUTTON);
        azaleaPool.fence(MavesBlocks.AZALEA_FENCE);
        azaleaPool.fenceGate(MavesBlocks.AZALEA_FENCE_GATE);
        azaleaPool.pressurePlate(MavesBlocks.AZALEA_PRESSURE_PLATE);
        azaleaPool.slab(MavesBlocks.AZALEA_SLAB);
        azaleaPool.stairs(MavesBlocks.AZALEA_STAIRS);

        blockStateModelGenerator.registerDoor(MavesBlocks.AZALEA_DOOR);
        blockStateModelGenerator.registerTrapdoor(MavesBlocks.AZALEA_TRAPDOOR);

        cocoaTreePool.button(MavesBlocks.COCOA_TREE_BUTTON);
        cocoaTreePool.fence(MavesBlocks.COCOA_TREE_FENCE);
        cocoaTreePool.fenceGate(MavesBlocks.COCOA_TREE_FENCE_GATE);
        cocoaTreePool.pressurePlate(MavesBlocks.COCOA_TREE_PRESSURE_PLATE);
        cocoaTreePool.slab(MavesBlocks.COCOA_TREE_SLAB);
        cocoaTreePool.stairs(MavesBlocks.COCOA_TREE_STAIRS);

        blockStateModelGenerator.registerDoor(MavesBlocks.COCOA_TREE_DOOR);
        blockStateModelGenerator.registerTrapdoor(MavesBlocks.COCOA_TREE_TRAPDOOR);

        rubberPool.button(MavesBlocks.RUBBER_BUTTON);
        rubberPool.fence(MavesBlocks.RUBBER_FENCE);
        rubberPool.fenceGate(MavesBlocks.RUBBER_FENCE_GATE);
        rubberPool.pressurePlate(MavesBlocks.RUBBER_PRESSURE_PLATE);
        rubberPool.slab(MavesBlocks.RUBBER_SLAB);
        rubberPool.stairs(MavesBlocks.RUBBER_STAIRS);

        blockStateModelGenerator.registerDoor(MavesBlocks.RUBBER_DOOR);
        blockStateModelGenerator.registerTrapdoor(MavesBlocks.RUBBER_TRAPDOOR);

        willowPool.button(MavesBlocks.WILLOW_BUTTON);
        willowPool.fence(MavesBlocks.WILLOW_FENCE);
        willowPool.fenceGate(MavesBlocks.WILLOW_FENCE_GATE);
        willowPool.pressurePlate(MavesBlocks.WILLOW_PRESSURE_PLATE);
        willowPool.slab(MavesBlocks.WILLOW_SLAB);
        willowPool.stairs(MavesBlocks.WILLOW_STAIRS);

        blockStateModelGenerator.registerDoor(MavesBlocks.WILLOW_DOOR);
        blockStateModelGenerator.registerTrapdoor(MavesBlocks.WILLOW_TRAPDOOR);

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
        itemModelGenerator.register(MavesItems.COCOA_TREE_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.RUBBER_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WILLOW_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.CRIMSON_BARK, Models.GENERATED);
        itemModelGenerator.register(MavesItems.WARPED_BARK, Models.GENERATED);

        itemModelGenerator.register(MavesBlocks.APPLE_TREE_SAPLING.asItem(), Models.GENERATED);
        itemModelGenerator.register(MavesBlocks.COCOA_TREE_SAPLING.asItem(), Models.GENERATED);
        itemModelGenerator.register(MavesBlocks.RUBBER_SAPLING.asItem(), Models.GENERATED);
        itemModelGenerator.register(MavesBlocks.WILLOW_SAPLING.asItem(), Models.GENERATED);

    }
}