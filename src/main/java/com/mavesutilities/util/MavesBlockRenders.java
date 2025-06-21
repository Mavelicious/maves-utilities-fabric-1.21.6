package com.mavesutilities.util;

import com.mavesutilities.block.MavesBlocks;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

public class MavesBlockRenders {

    public static void registerBlockRenders() {
        BlockRenderLayerMap.putBlock(MavesBlocks.APPLE_TREE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.CACAO_TREE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.HANGING_BLACK_WIDOW_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.RUBBER_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.WILLOW_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.PALE_PUMPKIN_STEM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.ATTACHED_PALE_PUMPKIN_STEM, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(MavesBlocks.APPLE_TREE_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.APPLE_TREE_DOOR, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MavesBlocks.APPLE_TREE_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.APPLE_TREE_TRAPDOOR, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MavesBlocks.AZALEA_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.AZALEA_DOOR, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MavesBlocks.AZALEA_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.AZALEA_TRAPDOOR, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MavesBlocks.CACAO_TREE_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.CACAO_TREE_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.HANGING_BLACK_WIDOW_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.HANGING_BLACK_WIDOW_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.RUBBER_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.RUBBER_DOOR, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MavesBlocks.RUBBER_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.RUBBER_TRAPDOOR, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MavesBlocks.WILLOW_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.WILLOW_DOOR, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MavesBlocks.WILLOW_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MavesBlocks.WILLOW_TRAPDOOR, BlockRenderLayer.TRANSLUCENT);
    }
}
