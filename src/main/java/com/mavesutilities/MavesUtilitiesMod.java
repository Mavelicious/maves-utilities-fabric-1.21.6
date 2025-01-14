package com.mavesutilities;

import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItemGroups;
import com.mavesutilities.item.MavesItems;
import com.mavesutilities.world.gen.MavesWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
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

		MavesWorldGeneration.generateMavesWorldGen();

		StrippableBlockRegistry.register(MavesBlocks.APPLE_TREE_LOG, MavesBlocks.STRIPPED_APPLE_TREE_LOG);
		StrippableBlockRegistry.register(MavesBlocks.AZALEA_STEM, MavesBlocks.STRIPPED_AZALEA_STEM);
		StrippableBlockRegistry.register(MavesBlocks.COCOA_TREE_LOG, MavesBlocks.STRIPPED_COCOA_TREE_LOG);
		StrippableBlockRegistry.register(MavesBlocks.RUBBER_LOG, MavesBlocks.STRIPPED_RUBBER_LOG);
		StrippableBlockRegistry.register(MavesBlocks.WILLOW_LOG, MavesBlocks.STRIPPED_WILLOW_LOG);
		StrippableBlockRegistry.register(MavesBlocks.APPLE_TREE_WOOD, MavesBlocks.STRIPPED_APPLE_TREE_WOOD);
		StrippableBlockRegistry.register(MavesBlocks.AZALEA_HYPHAE, MavesBlocks.STRIPPED_AZALEA_HYPHAE);
		StrippableBlockRegistry.register(MavesBlocks.COCOA_TREE_WOOD, MavesBlocks.STRIPPED_COCOA_TREE_WOOD);
		StrippableBlockRegistry.register(MavesBlocks.RUBBER_WOOD, MavesBlocks.STRIPPED_RUBBER_WOOD);
		StrippableBlockRegistry.register(MavesBlocks.WILLOW_WOOD, MavesBlocks.STRIPPED_WILLOW_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.APPLE_TREE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.AZALEA_STEM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.COCOA_TREE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.RUBBER_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.WILLOW_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.APPLE_TREE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.AZALEA_HYPHAE, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.COCOA_TREE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.RUBBER_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.WILLOW_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.STRIPPED_APPLE_TREE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.STRIPPED_AZALEA_STEM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.STRIPPED_COCOA_TREE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.STRIPPED_RUBBER_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.STRIPPED_WILLOW_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.AZALEA_HYPHAE, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.STRIPPED_COCOA_TREE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.STRIPPED_RUBBER_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.STRIPPED_WILLOW_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.APPLE_TREE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.AZALEA_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.COCOA_TREE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.RUBBER_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.WILLOW_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.APPLE_TREE_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.COCOA_TREE_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.RUBBER_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(MavesBlocks.WILLOW_LEAVES, 30, 60);
	}
}