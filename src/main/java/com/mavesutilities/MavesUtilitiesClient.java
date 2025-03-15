package com.mavesutilities;

import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItems;
import com.mavesutilities.util.MavesBlockColors;
import com.mavesutilities.world.gen.MavesTreeGeneration;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MavesUtilitiesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		MavesTreeGeneration.generateTrees();
		MavesBlockColors.registerBlockColors();

		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.APPLE_TREE_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.CACAO_TREE_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.RUBBER_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.WILLOW_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.PALE_PUMPKIN_STEM, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.ATTACHED_PALE_PUMPKIN_STEM, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.APPLE_TREE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.APPLE_TREE_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.APPLE_TREE_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.APPLE_TREE_TRAPDOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.AZALEA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.AZALEA_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.AZALEA_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.AZALEA_TRAPDOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.CACAO_TREE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.CACAO_TREE_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.RUBBER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.RUBBER_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.RUBBER_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.RUBBER_TRAPDOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.WILLOW_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.WILLOW_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.WILLOW_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MavesBlocks.WILLOW_TRAPDOOR, RenderLayer.getTranslucent());

		TerraformBoatClientHelper.registerModelLayers(MavesItems.APPLE_TREE);
		TerraformBoatClientHelper.registerModelLayers(MavesItems.AZALEA);
		TerraformBoatClientHelper.registerModelLayers(MavesItems.CACAO_TREE);
		TerraformBoatClientHelper.registerModelLayers(MavesItems.RUBBER);
		TerraformBoatClientHelper.registerModelLayers(MavesItems.WILLOW);
	}
}