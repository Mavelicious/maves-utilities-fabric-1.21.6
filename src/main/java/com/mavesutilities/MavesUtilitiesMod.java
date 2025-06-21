package com.mavesutilities;

import com.mavesutilities.block.*;
import com.mavesutilities.item.*;
import com.mavesutilities.util.*;
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