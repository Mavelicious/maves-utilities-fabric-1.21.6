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
                .wood(MavesBlocks.AZALEA_HYPHAE);
        blockStateModelGenerator.registerLog(MavesBlocks.COCOA_TREE_LOG).log(MavesBlocks.COCOA_TREE_LOG)
                .wood(MavesBlocks.COCOA_TREE_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.RUBBER_LOG).log(MavesBlocks.RUBBER_LOG)
                .wood(MavesBlocks.RUBBER_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.WILLOW_LOG).log(MavesBlocks.WILLOW_LOG)
                .wood(MavesBlocks.WILLOW_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_APPLE_TREE_LOG).log(MavesBlocks.STRIPPED_APPLE_TREE_LOG)
                .wood(MavesBlocks.STRIPPED_APPLE_TREE_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_AZALEA_STEM).log(MavesBlocks.STRIPPED_AZALEA_STEM)
                .wood(MavesBlocks.STRIPPED_AZALEA_HYPHAE);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_COCOA_TREE_LOG).log(MavesBlocks.STRIPPED_COCOA_TREE_LOG)
                .wood(MavesBlocks.STRIPPED_COCOA_TREE_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_RUBBER_LOG).log(MavesBlocks.STRIPPED_RUBBER_LOG)
                .wood(MavesBlocks.STRIPPED_RUBBER_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_WILLOW_LOG).log(MavesBlocks.STRIPPED_WILLOW_LOG)
                .wood(MavesBlocks.STRIPPED_WILLOW_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(MavesBlocks.APPLE_TREE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(MavesBlocks.AZALEA_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(MavesBlocks.COCOA_TREE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(MavesBlocks.RUBBER_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(MavesBlocks.WILLOW_PLANKS);
        blockStateModelGenerator.registerTintedBlockAndItem(MavesBlocks.APPLE_TREE_LEAVES,
                TexturedModel.LEAVES, 0xbeff00);
        blockStateModelGenerator.registerTintedBlockAndItem(MavesBlocks.COCOA_TREE_LEAVES,
                TexturedModel.LEAVES, 0x97ff00);
        blockStateModelGenerator.registerTintedBlockAndItem(MavesBlocks.RUBBER_LEAVES,
                TexturedModel.LEAVES, 0x00ff03);
        blockStateModelGenerator.registerTintedBlockAndItem(MavesBlocks.WILLOW_LEAVES,
                TexturedModel.LEAVES, 0x67ff00);
        blockStateModelGenerator.registerTintableCrossBlockState(MavesBlocks.APPLE_TREE_SAPLING,
                BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(MavesBlocks.COCOA_TREE_SAPLING,
                BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(MavesBlocks.RUBBER_SAPLING,
                BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(MavesBlocks.WILLOW_SAPLING,
                BlockStateModelGenerator.CrossType.NOT_TINTED);

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

    }
}