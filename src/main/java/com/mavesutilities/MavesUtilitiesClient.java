package com.mavesutilities;

import com.mavesutilities.block.MavesBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.render.RenderLayer;

public class MavesUtilitiesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		//MavesTreeGeneration.generateTrees();

		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.APPLE_TREE_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.COCOA_TREE_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.RUBBER_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.WILLOW_SAPLING, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.APPLE_TREE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.APPLE_TREE_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.AZALEA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.AZALEA_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.COCOA_TREE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.COCOA_TREE_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.RUBBER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.RUBBER_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.WILLOW_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.WILLOW_TRAPDOOR, RenderLayer.getCutout());

		ColorProviderRegistry.BLOCK.register((state, view, pos,
											  tintIndex) -> 0xbeff00, MavesBlocks.APPLE_TREE_LEAVES);
		ColorProviderRegistry.BLOCK.register((state, view, pos,
											  tintIndex) -> 0x97ff00, MavesBlocks.COCOA_TREE_LEAVES);
		ColorProviderRegistry.BLOCK.register((state, view, pos,
											  tintIndex) -> 0x00ff03, MavesBlocks.RUBBER_LEAVES);
		ColorProviderRegistry.BLOCK.register((state, view, pos,
											  tintIndex) -> 0x67ff00, MavesBlocks.WILLOW_LEAVES);
	}
}