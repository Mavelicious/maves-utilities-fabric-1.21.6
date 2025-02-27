package com.mavesutilities;

import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItemGroups;
import com.mavesutilities.item.MavesItems;
import com.mavesutilities.util.MavesCompostableItems;
import com.mavesutilities.util.MavesFlammableBlocks;
import com.mavesutilities.util.MavesFuelItems;
import com.mavesutilities.util.MavesStrippableBlocks;
import com.mavesutilities.world.gen.MavesWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MavesUtilitiesMod implements ModInitializer {

	public static final String MOD_ID = "mavesutilities";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MavesItemGroups.registerItemGroups();

		MavesItems.registerMavesItems();
		MavesBlocks.registerMavesBlocks();
		MavesCompostableItems.registerMavesCompostableItems();
		MavesFlammableBlocks.registerFlammableBlocks();
		MavesFuelItems.registerMavesFuelItems();
		MavesStrippableBlocks.registerStrippables();

		MavesWorldGeneration.generateMavesWorldGen();
	}
}