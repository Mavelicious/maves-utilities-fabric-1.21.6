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

        blockStateModelGenerator.registerLog(MavesBlocks.APPLE_TREE_LOG).log(MavesBlocks.APPLE_TREE_LOG).wood(MavesBlocks.APPLE_TREE_WOOD);
        blockStateModelGenerator.registerLog(MavesBlocks.STRIPPED_APPLE_TREE_LOG).log(MavesBlocks.STRIPPED_APPLE_TREE_LOG).wood(MavesBlocks.STRIPPED_APPLE_TREE_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(MavesBlocks.APPLE_TREE_PLANKS);
        blockStateModelGenerator.registerSingleton(MavesBlocks.APPLE_TREE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(MavesBlocks.APPLE_TREE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

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