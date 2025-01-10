package com.mavesutilities.block;

import com.mavesutilities.MavesUtilitiesMod;
import com.mavesutilities.world.tree.MavesSaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

public class MavesBlocks {

    public static final Block APPLE_TREE_LOG = registerBlock("apple_tree_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_log")))));
    public static final Block APPLE_TREE_WOOD = registerBlock("apple_tree_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_wood")))));
    public static final Block STRIPPED_APPLE_TREE_LOG = registerBlock("stripped_apple_tree_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_apple_tree_log")))));
    public static final Block STRIPPED_APPLE_TREE_WOOD = registerBlock("stripped_apple_tree_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_apple_tree_wood")))));

    public static final Block APPLE_TREE_PLANKS = registerBlock("apple_tree_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_planks")))));
    public static final Block APPLE_TREE_LEAVES = registerBlock("apple_tree_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_leaves")))));

    public static final Block APPLE_TREE_SAPLING = registerBlock("apple_tree_sapling",
            new SaplingBlock(MavesSaplingGenerators.APPLE_TREE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_sapling")))));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MavesUtilitiesMod.MOD_ID, name),
            new BlockItem(block, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MavesUtilitiesMod.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }

    public static void registerMavesBlocks() {
        MavesUtilitiesMod.LOGGER.info("Registering Mave's Blocks for " + MavesUtilitiesMod.MOD_ID);
    }
}
