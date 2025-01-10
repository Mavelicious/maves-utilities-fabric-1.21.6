package com.mavesutilities;

import com.mavesutilities.block.MavesBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MavesUtilitiesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.APPLE_TREE_SAPLING, RenderLayer.getCutout());
	}
}