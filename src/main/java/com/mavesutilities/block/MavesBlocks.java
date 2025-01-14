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
    public static final Block AZALEA_STEM = registerBlock("azalea_stem",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_stem")))));
    public static final Block COCOA_TREE_LOG = registerBlock("cocoa_tree_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_log")))));
    public static final Block RUBBER_LOG = registerBlock("rubber_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_log")))));
    public static final Block WILLOW_LOG = registerBlock("willow_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_log")))));
    public static final Block APPLE_TREE_WOOD = registerBlock("apple_tree_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_wood")))));
    public static final Block AZALEA_HYPHAE = registerBlock("azalea_hyphae",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_hyphae")))));
    public static final Block COCOA_TREE_WOOD = registerBlock("cocoa_tree_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_wood")))));
    public static final Block RUBBER_WOOD = registerBlock("rubber_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_wood")))));
    public static final Block WILLOW_WOOD = registerBlock("willow_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_wood")))));
    public static final Block STRIPPED_APPLE_TREE_LOG = registerBlock("stripped_apple_tree_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_apple_tree_log")))));
    public static final Block STRIPPED_AZALEA_STEM = registerBlock("stripped_azalea_stem",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_azalea_stem")))));
    public static final Block STRIPPED_COCOA_TREE_LOG = registerBlock("stripped_cocoa_tree_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_cocoa_tree_log")))));
    public static final Block STRIPPED_RUBBER_LOG = registerBlock("stripped_rubber_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_rubber_log")))));
    public static final Block STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_willow_log")))));
    public static final Block STRIPPED_APPLE_TREE_WOOD = registerBlock("stripped_apple_tree_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_apple_tree_wood")))));
    public static final Block STRIPPED_AZALEA_HYPHAE = registerBlock("stripped_azalea_hyphae",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_azalea_hyphae")))));
    public static final Block STRIPPED_COCOA_TREE_WOOD = registerBlock("stripped_cocoa_tree_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_cocoa_tree_wood")))));
    public static final Block STRIPPED_RUBBER_WOOD = registerBlock("stripped_rubber_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_rubber_wood")))));
    public static final Block STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_willow_wood")))));

    public static final Block APPLE_TREE_PLANKS = registerBlock("apple_tree_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_planks")))));
    public static final Block AZALEA_PLANKS = registerBlock("azalea_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_planks")))));
    public static final Block COCOA_TREE_PLANKS = registerBlock("cocoa_tree_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_planks")))));
    public static final Block RUBBER_PLANKS = registerBlock("rubber_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_planks")))));
    public static final Block WILLOW_PLANKS = registerBlock("willow_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_planks")))));
    public static final Block APPLE_TREE_LEAVES = registerBlock("apple_tree_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_leaves")))));
    public static final Block COCOA_TREE_LEAVES = registerBlock("cocoa_tree_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_leaves")))));
    public static final Block RUBBER_LEAVES = registerBlock("rubber_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_leaves")))));
    public static final Block WILLOW_LEAVES = registerBlock("willow_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_leaves")))));

    public static final Block APPLE_TREE_SAPLING = registerBlock("apple_tree_sapling",
            new SaplingBlock(MavesSaplingGenerators.APPLE_TREE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_sapling")))));
    public static final Block COCOA_TREE_SAPLING = registerBlock("cocoa_tree_sapling",
            new SaplingBlock(MavesSaplingGenerators.COCOA_TREE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_sapling")))));
    public static final Block RUBBER_SAPLING = registerBlock("rubber_sapling",
            new SaplingBlock(MavesSaplingGenerators.RUBBER_TREE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_sapling")))));
    public static final Block WILLOW_SAPLING = registerBlock("willow_sapling",
            new SaplingBlock(MavesSaplingGenerators.WILLOW_TREE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_sapling")))));

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
