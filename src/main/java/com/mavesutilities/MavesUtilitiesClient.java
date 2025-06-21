package com.mavesutilities;

import com.mavesutilities.item.*;
import com.mavesutilities.util.*;
import com.mavesutilities.world.gen.MavesTreeGeneration;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;

public class MavesUtilitiesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		MavesTreeGeneration.generateTrees();
		MavesBlockColors.registerBlockColors();
		MavesBlockRenders.registerBlockRenders();

		TerraformBoatClientHelper.registerModelLayers(MavesItems.APPLE_TREE);
		TerraformBoatClientHelper.registerModelLayers(MavesItems.AZALEA);
		TerraformBoatClientHelper.registerModelLayers(MavesItems.CACAO_TREE);
		TerraformBoatClientHelper.registerModelLayers(MavesItems.HANGING_BLACK_WIDOW);
		TerraformBoatClientHelper.registerModelLayers(MavesItems.RUBBER);
		TerraformBoatClientHelper.registerModelLayers(MavesItems.WILLOW);
	}
}