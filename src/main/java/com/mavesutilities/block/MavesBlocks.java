package com.mavesutilities.block;

import com.mavesutilities.MavesUtilitiesMod;
import com.mavesutilities.world.tree.MavesSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.sound.*;

public class MavesBlocks {

    public static final BlockSetType APPLE_TREE = new BlockSetType("apple_Tree", true, true, true,
            BlockSetType.ActivationRule.EVERYTHING, BlockSoundGroup.WOOD,
            SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN,
            SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN,
            SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF,
            SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final BlockSetType AZALEA = new BlockSetType("azalea", true, true, true,
            BlockSetType.ActivationRule.EVERYTHING, BlockSoundGroup.WOOD,
            SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN,
            SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN,
            SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF,
            SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final BlockSetType COCOA_TREE = new BlockSetType("cocoa_tree", true, true, true,
            BlockSetType.ActivationRule.EVERYTHING, BlockSoundGroup.WOOD,
            SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN,
            SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN,
            SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF,
            SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final BlockSetType RUBBER = new BlockSetType("rubber", true, true, true,
            BlockSetType.ActivationRule.EVERYTHING, BlockSoundGroup.WOOD,
            SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN,
            SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN,
            SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF,
            SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final BlockSetType WILLOW = new BlockSetType("willow", true, true, true,
            BlockSetType.ActivationRule.EVERYTHING, BlockSoundGroup.WOOD,
            SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN,
            SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN,
            SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF,
            SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);

    public static final WoodType APPLE_TREE_TYPE = new WoodType("apple_tree", APPLE_TREE, BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN, SoundEvents.BLOCK_FENCE_GATE_CLOSE,
            SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final WoodType AZALEA_TYPE = new WoodType("azalea", AZALEA, BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN, SoundEvents.BLOCK_FENCE_GATE_CLOSE,
            SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final WoodType COCOA_TREE_TYPE = new WoodType("cocoa_tree", COCOA_TREE, BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN, SoundEvents.BLOCK_FENCE_GATE_CLOSE,
            SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final WoodType RUBBER_TYPE = new WoodType("rubber", RUBBER, BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN, SoundEvents.BLOCK_FENCE_GATE_CLOSE,
            SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final WoodType WILLOW_TYPE = new WoodType("willow", WILLOW, BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN, SoundEvents.BLOCK_FENCE_GATE_CLOSE,
            SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final RegistryKey<Block> APPLE_TREE_LOG_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_log")
    );
    public static final RegistryKey<Block> APPLE_TREE_WOOD_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_wood")
    );
    public static final RegistryKey<Block> STRIPPED_APPLE_TREE_LOG_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_apple_tree_log")
    );
    public static final RegistryKey<Block> STRIPPED_APPLE_TREE_WOOD_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_apple_tree_wood")
    );
    public static final RegistryKey<Block> APPLE_TREE_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_leaves")
    );
    public static final RegistryKey<Block> APPLE_TREE_SAPLING_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_sapling")
    );
    public static final RegistryKey<Block> POTTED_APPLE_TREE_SAPLING_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "potted_apple_tree_sapling")
    );
    public static final RegistryKey<Block> APPLE_TREE_PLANKS_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_planks")
    );
    public static final RegistryKey<Block> APPLE_TREE_BUTTON_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_button")
    );
    public static final RegistryKey<Block> APPLE_TREE_DOOR_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_door")
    );
    public static final RegistryKey<Block> APPLE_TREE_FENCE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_fence")
    );
    public static final RegistryKey<Block> APPLE_TREE_FENCE_GATE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_fence_gate")
    );
    public static final RegistryKey<Block> APPLE_TREE_PRESSURE_PLATE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_pressure_plate")
    );
    public static final RegistryKey<Block> APPLE_TREE_SLAB_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_slab")
    );
    public static final RegistryKey<Block> APPLE_TREE_STAIRS_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_stairs")
    );
    public static final RegistryKey<Block> APPLE_TREE_TRAPDOOR_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_trapdoor")
    );

    public static final RegistryKey<Block> AZALEA_STEM_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_stem")
    );
    public static final RegistryKey<Block> AZALEA_WOOD_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_wood")
    );
    public static final RegistryKey<Block> STRIPPED_AZALEA_STEM_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_azalea_stem")
    );
    public static final RegistryKey<Block> STRIPPED_AZALEA_WOOD_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_azalea_wood")
    );
    public static final RegistryKey<Block> AZALEA_PLANKS_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_planks")
    );
    public static final RegistryKey<Block> AZALEA_BUTTON_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_button")
    );
    public static final RegistryKey<Block> AZALEA_DOOR_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_door")
    );
    public static final RegistryKey<Block> AZALEA_FENCE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_fence")
    );
    public static final RegistryKey<Block> AZALEA_FENCE_GATE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_fence_gate")
    );
    public static final RegistryKey<Block> AZALEA_PRESSURE_PLATE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_pressure_plate")
    );
    public static final RegistryKey<Block> AZALEA_SLAB_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_slab")
    );
    public static final RegistryKey<Block> AZALEA_STAIRS_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_stairs")
    );
    public static final RegistryKey<Block> AZALEA_TRAPDOOR_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_trapdoor")
    );

    public static final RegistryKey<Block> COCOA_TREE_LOG_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_log")
    );
    public static final RegistryKey<Block> COCOA_TREE_WOOD_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_wood")
    );
    public static final RegistryKey<Block> STRIPPED_COCOA_TREE_LOG_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_cocoa_tree_log")
    );
    public static final RegistryKey<Block> STRIPPED_COCOA_TREE_WOOD_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_cocoa_tree_wood")
    );
    public static final RegistryKey<Block> COCOA_TREE_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_leaves")
    );
    public static final RegistryKey<Block> COCOA_TREE_SAPLING_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_sapling")
    );
    public static final RegistryKey<Block> POTTED_COCOA_TREE_SAPLING_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "potted_cocoa_tree_sapling")
    );
    public static final RegistryKey<Block> COCOA_TREE_PLANKS_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_planks")
    );
    public static final RegistryKey<Block> COCOA_TREE_BUTTON_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_button")
    );
    public static final RegistryKey<Block> COCOA_TREE_DOOR_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_door")
    );
    public static final RegistryKey<Block> COCOA_TREE_FENCE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_fence")
    );
    public static final RegistryKey<Block> COCOA_TREE_FENCE_GATE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_fence_gate")
    );
    public static final RegistryKey<Block> COCOA_TREE_PRESSURE_PLATE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_pressure_plate")
    );
    public static final RegistryKey<Block> COCOA_TREE_SLAB_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_slab")
    );
    public static final RegistryKey<Block> COCOA_TREE_STAIRS_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_stairs")
    );
    public static final RegistryKey<Block> COCOA_TREE_TRAPDOOR_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_trapdoor")
    );

    public static final RegistryKey<Block> RUBBER_LOG_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_log")
    );
    public static final RegistryKey<Block> RUBBER_WOOD_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_wood")
    );
    public static final RegistryKey<Block> STRIPPED_RUBBER_LOG_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_rubber_log")
    );
    public static final RegistryKey<Block> STRIPPED_RUBBER_WOOD_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_rubber_wood")
    );
    public static final RegistryKey<Block> RUBBER_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_leaves")
    );
    public static final RegistryKey<Block> RUBBER_SAPLING_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_sapling")
    );
    public static final RegistryKey<Block> POTTED_RUBBER_SAPLING_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "potted_rubber_sapling")
    );
    public static final RegistryKey<Block> RUBBER_PLANKS_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_planks")
    );
    public static final RegistryKey<Block> RUBBER_BUTTON_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_button")
    );
    public static final RegistryKey<Block> RUBBER_DOOR_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_door")
    );
    public static final RegistryKey<Block> RUBBER_FENCE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_fence")
    );
    public static final RegistryKey<Block> RUBBER_FENCE_GATE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_fence_gate")
    );
    public static final RegistryKey<Block> RUBBER_PRESSURE_PLATE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_pressure_plate")
    );
    public static final RegistryKey<Block> RUBBER_SLAB_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_slab")
    );
    public static final RegistryKey<Block> RUBBER_STAIRS_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_stairs")
    );
    public static final RegistryKey<Block> RUBBER_TRAPDOOR_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_trapdoor")
    );

    public static final RegistryKey<Block> WILLOW_LOG_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_log")
    );
    public static final RegistryKey<Block> WILLOW_WOOD_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_wood")
    );
    public static final RegistryKey<Block> STRIPPED_WILLOW_LOG_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_willow_log")
    );
    public static final RegistryKey<Block> STRIPPED_WILLOW_WOOD_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_willow_wood")
    );
    public static final RegistryKey<Block> WILLOW_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_leaves")
    );
    public static final RegistryKey<Block> WILLOW_SAPLING_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_sapling")
    );
    public static final RegistryKey<Block> POTTED_WILLOW_SAPLING_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "potted_willow_sapling")
    );
    public static final RegistryKey<Block> WILLOW_PLANKS_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_planks")
    );
    public static final RegistryKey<Block> WILLOW_BUTTON_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_button")
    );
    public static final RegistryKey<Block> WILLOW_DOOR_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_door")
    );
    public static final RegistryKey<Block> WILLOW_FENCE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_fence")
    );
    public static final RegistryKey<Block> WILLOW_FENCE_GATE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_fence_gate")
    );
    public static final RegistryKey<Block> WILLOW_PRESSURE_PLATE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_pressure_plate")
    );
    public static final RegistryKey<Block> WILLOW_SLAB_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_slab")
    );
    public static final RegistryKey<Block> WILLOW_STAIRS_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_stairs")
    );
    public static final RegistryKey<Block> WILLOW_TRAPDOOR_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_trapdoor")
    );

    public static final Block APPLE_TREE_LOG = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).registryKey(APPLE_TREE_LOG_KEY)),
            APPLE_TREE_LOG_KEY,
            true
    );
    public static final Block APPLE_TREE_WOOD = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).registryKey(APPLE_TREE_WOOD_KEY)),
            APPLE_TREE_WOOD_KEY,
            true
    );
    public static final Block STRIPPED_APPLE_TREE_LOG = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).registryKey(STRIPPED_APPLE_TREE_LOG_KEY)),
            STRIPPED_APPLE_TREE_LOG_KEY,
            true
    );
    public static final Block STRIPPED_APPLE_TREE_WOOD = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).registryKey(STRIPPED_APPLE_TREE_WOOD_KEY)),
            STRIPPED_APPLE_TREE_WOOD_KEY,
            true
    );
    public static final Block APPLE_TREE_LEAVES = registerBlock(
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).registryKey(APPLE_TREE_LEAVES_KEY)),
            APPLE_TREE_LEAVES_KEY,
            true
    );
    public static final Block APPLE_TREE_SAPLING = registerBlock(
            new MavesSaplingBlock(MavesSaplingGenerators.APPLE_TREE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).registryKey(APPLE_TREE_SAPLING_KEY)),
            APPLE_TREE_SAPLING_KEY,
            true
    );
    public static final Block POTTED_APPLE_TREE_SAPLING = registerBlock(
            new FlowerPotBlock(MavesBlocks.APPLE_TREE_SAPLING, AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING).registryKey(POTTED_APPLE_TREE_SAPLING_KEY)),
            POTTED_APPLE_TREE_SAPLING_KEY,
            true
    );
    public static final Block APPLE_TREE_PLANKS = registerBlock(
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).registryKey(APPLE_TREE_PLANKS_KEY)),
            APPLE_TREE_PLANKS_KEY,
            true
    );
    public static final Block APPLE_TREE_BUTTON = registerBlock(
            new ButtonBlock(APPLE_TREE, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).registryKey(APPLE_TREE_BUTTON_KEY)),
            APPLE_TREE_BUTTON_KEY,
            true
    );
    public static final Block APPLE_TREE_DOOR = registerBlock(
            new DoorBlock(APPLE_TREE, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).registryKey(APPLE_TREE_DOOR_KEY)),
            APPLE_TREE_DOOR_KEY,
            true
    );
    public static final Block APPLE_TREE_FENCE = registerBlock(
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).registryKey(APPLE_TREE_FENCE_KEY)),
            APPLE_TREE_FENCE_KEY,
            true
    );
    public static final Block APPLE_TREE_FENCE_GATE = registerBlock(
            new FenceGateBlock(APPLE_TREE_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).registryKey(APPLE_TREE_FENCE_GATE_KEY)),
            APPLE_TREE_FENCE_GATE_KEY,
            true
    );
    public static final Block APPLE_TREE_PRESSURE_PLATE = registerBlock(
            new PressurePlateBlock(APPLE_TREE, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE).registryKey(APPLE_TREE_PRESSURE_PLATE_KEY)),
            APPLE_TREE_PRESSURE_PLATE_KEY,
            true
    );
    public static final Block APPLE_TREE_SLAB = registerBlock(
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).registryKey(APPLE_TREE_SLAB_KEY)),
            APPLE_TREE_SLAB_KEY,
            true
    );
    public static final Block APPLE_TREE_STAIRS = registerBlock(
            new StairsBlock(APPLE_TREE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).registryKey(APPLE_TREE_STAIRS_KEY)),
            APPLE_TREE_STAIRS_KEY,
            true
    );
    public static final Block APPLE_TREE_TRAPDOOR = registerBlock(
            new TrapdoorBlock(APPLE_TREE, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).registryKey(APPLE_TREE_TRAPDOOR_KEY)),
            APPLE_TREE_TRAPDOOR_KEY,
            true
    );

    public static final Block AZALEA_STEM = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).registryKey(AZALEA_STEM_KEY)),
            AZALEA_STEM_KEY,
            true
    );
    public static final Block AZALEA_WOOD = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).registryKey(AZALEA_WOOD_KEY)),
            AZALEA_WOOD_KEY,
            true
    );
    public static final Block STRIPPED_AZALEA_STEM = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).registryKey(STRIPPED_AZALEA_STEM_KEY)),
            STRIPPED_AZALEA_STEM_KEY,
            true
    );
    public static final Block STRIPPED_AZALEA_WOOD = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).registryKey(STRIPPED_AZALEA_WOOD_KEY)),
            STRIPPED_AZALEA_WOOD_KEY,
            true
    );
    public static final Block AZALEA_PLANKS = registerBlock(
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).registryKey(AZALEA_PLANKS_KEY)),
            AZALEA_PLANKS_KEY,
            true
    );
    public static final Block AZALEA_BUTTON = registerBlock(
            new ButtonBlock(AZALEA, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).registryKey(AZALEA_BUTTON_KEY)),
            AZALEA_BUTTON_KEY,
            true
    );
    public static final Block AZALEA_DOOR = registerBlock(
            new DoorBlock(AZALEA, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).registryKey(AZALEA_DOOR_KEY)),
            AZALEA_DOOR_KEY,
            true
    );
    public static final Block AZALEA_FENCE = registerBlock(
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).registryKey(AZALEA_FENCE_KEY)),
            AZALEA_FENCE_KEY,
            true
    );
    public static final Block AZALEA_FENCE_GATE = registerBlock(
            new FenceGateBlock(AZALEA_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).registryKey(AZALEA_FENCE_GATE_KEY)),
            AZALEA_FENCE_GATE_KEY,
            true
    );
    public static final Block AZALEA_PRESSURE_PLATE = registerBlock(
            new PressurePlateBlock(AZALEA, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE).registryKey(AZALEA_PRESSURE_PLATE_KEY)),
            AZALEA_PRESSURE_PLATE_KEY,
            true
    );
    public static final Block AZALEA_SLAB = registerBlock(
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).registryKey(AZALEA_SLAB_KEY)),
            AZALEA_SLAB_KEY,
            true
    );
    public static final Block AZALEA_STAIRS = registerBlock(
            new StairsBlock(AZALEA_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).registryKey(AZALEA_STAIRS_KEY)),
            AZALEA_STAIRS_KEY,
            true
    );
    public static final Block AZALEA_TRAPDOOR = registerBlock(
            new TrapdoorBlock(AZALEA, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).registryKey(AZALEA_TRAPDOOR_KEY)),
            AZALEA_TRAPDOOR_KEY,
            true
    );

    public static final Block COCOA_TREE_LOG = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).registryKey(COCOA_TREE_LOG_KEY)),
            COCOA_TREE_LOG_KEY,
            true
    );
    public static final Block COCOA_TREE_WOOD = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).registryKey(COCOA_TREE_WOOD_KEY)),
            COCOA_TREE_WOOD_KEY,
            true
    );
    public static final Block STRIPPED_COCOA_TREE_LOG = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).registryKey(STRIPPED_COCOA_TREE_LOG_KEY)),
            STRIPPED_COCOA_TREE_LOG_KEY,
            true
    );
    public static final Block STRIPPED_COCOA_TREE_WOOD = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).registryKey(STRIPPED_COCOA_TREE_WOOD_KEY)),
            STRIPPED_COCOA_TREE_WOOD_KEY,
            true
    );
    public static final Block COCOA_TREE_LEAVES = registerBlock(
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).registryKey(COCOA_TREE_LEAVES_KEY)),
            COCOA_TREE_LEAVES_KEY,
            true
    );
    public static final Block COCOA_TREE_SAPLING = registerBlock(
            new MavesSaplingBlock(MavesSaplingGenerators.COCOA_TREE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).registryKey(COCOA_TREE_SAPLING_KEY)),
            COCOA_TREE_SAPLING_KEY,
            true
    );
    public static final Block POTTED_COCOA_TREE_SAPLING = registerBlock(
            new FlowerPotBlock(MavesBlocks.COCOA_TREE_SAPLING, AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING).registryKey(POTTED_COCOA_TREE_SAPLING_KEY)),
            POTTED_COCOA_TREE_SAPLING_KEY,
            true
    );
    public static final Block COCOA_TREE_PLANKS = registerBlock(
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).registryKey(COCOA_TREE_PLANKS_KEY)),
            COCOA_TREE_PLANKS_KEY,
            true
    );
    public static final Block COCOA_TREE_BUTTON = registerBlock(
            new ButtonBlock(COCOA_TREE, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).registryKey(COCOA_TREE_BUTTON_KEY)),
            COCOA_TREE_BUTTON_KEY,
            true
    );
    public static final Block COCOA_TREE_DOOR = registerBlock(
            new DoorBlock(COCOA_TREE, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).registryKey(COCOA_TREE_DOOR_KEY)),
            COCOA_TREE_DOOR_KEY,
            true
    );
    public static final Block COCOA_TREE_FENCE = registerBlock(
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).registryKey(COCOA_TREE_FENCE_KEY)),
            COCOA_TREE_FENCE_KEY,
            true
    );
    public static final Block COCOA_TREE_FENCE_GATE = registerBlock(
            new FenceGateBlock(COCOA_TREE_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).registryKey(COCOA_TREE_FENCE_GATE_KEY)),
            COCOA_TREE_FENCE_GATE_KEY,
            true
    );
    public static final Block COCOA_TREE_PRESSURE_PLATE = registerBlock(
            new PressurePlateBlock(COCOA_TREE, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE).registryKey(COCOA_TREE_PRESSURE_PLATE_KEY)),
            COCOA_TREE_PRESSURE_PLATE_KEY,
            true
    );
    public static final Block COCOA_TREE_SLAB = registerBlock(
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).registryKey(COCOA_TREE_SLAB_KEY)),
            COCOA_TREE_SLAB_KEY,
            true
    );
    public static final Block COCOA_TREE_STAIRS = registerBlock(
            new StairsBlock(COCOA_TREE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).registryKey(COCOA_TREE_STAIRS_KEY)),
            COCOA_TREE_STAIRS_KEY,
            true
    );
    public static final Block COCOA_TREE_TRAPDOOR = registerBlock(
            new TrapdoorBlock(COCOA_TREE, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).registryKey(COCOA_TREE_TRAPDOOR_KEY)),
            COCOA_TREE_TRAPDOOR_KEY,
            true
    );

    public static final Block RUBBER_LOG = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).registryKey(RUBBER_LOG_KEY)),
            RUBBER_LOG_KEY,
            true
    );
    public static final Block RUBBER_WOOD = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).registryKey(RUBBER_WOOD_KEY)),
            RUBBER_WOOD_KEY,
            true
    );
    public static final Block STRIPPED_RUBBER_LOG = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).registryKey(STRIPPED_RUBBER_LOG_KEY)),
            STRIPPED_RUBBER_LOG_KEY,
            true
    );
    public static final Block STRIPPED_RUBBER_WOOD = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).registryKey(STRIPPED_RUBBER_WOOD_KEY)),
            STRIPPED_RUBBER_WOOD_KEY,
            true
    );
    public static final Block RUBBER_LEAVES = registerBlock(
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).registryKey(RUBBER_LEAVES_KEY)),
            RUBBER_LEAVES_KEY,
            true
    );
    public static final Block RUBBER_SAPLING = registerBlock(
            new MavesSaplingBlock(MavesSaplingGenerators.RUBBER_TREE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).registryKey(RUBBER_SAPLING_KEY)),
            RUBBER_SAPLING_KEY,
            true
    );
    public static final Block POTTED_RUBBER_SAPLING = registerBlock(
            new FlowerPotBlock(MavesBlocks.RUBBER_SAPLING, AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING).registryKey(POTTED_RUBBER_SAPLING_KEY)),
            POTTED_RUBBER_SAPLING_KEY,
            true
    );
    public static final Block RUBBER_PLANKS = registerBlock(
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).registryKey(RUBBER_PLANKS_KEY)),
            RUBBER_PLANKS_KEY,
            true
    );
    public static final Block RUBBER_BUTTON = registerBlock(
            new ButtonBlock(RUBBER, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).registryKey(RUBBER_BUTTON_KEY)),
            RUBBER_BUTTON_KEY,
            true
    );
    public static final Block RUBBER_DOOR = registerBlock(
            new DoorBlock(RUBBER, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).registryKey(RUBBER_DOOR_KEY)),
            RUBBER_DOOR_KEY,
            true
    );
    public static final Block RUBBER_FENCE = registerBlock(
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).registryKey(RUBBER_FENCE_KEY)),
            RUBBER_FENCE_KEY,
            true
    );
    public static final Block RUBBER_FENCE_GATE = registerBlock(
            new FenceGateBlock(RUBBER_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).registryKey(RUBBER_FENCE_GATE_KEY)),
            RUBBER_FENCE_GATE_KEY,
            true
    );
    public static final Block RUBBER_PRESSURE_PLATE = registerBlock(
            new PressurePlateBlock(RUBBER, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE).registryKey(RUBBER_PRESSURE_PLATE_KEY)),
            RUBBER_PRESSURE_PLATE_KEY,
            true
    );
    public static final Block RUBBER_SLAB = registerBlock(
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).registryKey(RUBBER_SLAB_KEY)),
            RUBBER_SLAB_KEY,
            true
    );
    public static final Block RUBBER_STAIRS = registerBlock(
            new StairsBlock(RUBBER_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).registryKey(RUBBER_STAIRS_KEY)),
            RUBBER_STAIRS_KEY,
            true
    );
    public static final Block RUBBER_TRAPDOOR = registerBlock(
            new TrapdoorBlock(RUBBER, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).registryKey(RUBBER_TRAPDOOR_KEY)),
            RUBBER_TRAPDOOR_KEY,
            true
    );

    public static final Block WILLOW_LOG = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).registryKey(WILLOW_LOG_KEY)),
            WILLOW_LOG_KEY,
            true
    );
    public static final Block WILLOW_WOOD = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).registryKey(WILLOW_WOOD_KEY)),
            WILLOW_WOOD_KEY,
            true
    );
    public static final Block STRIPPED_WILLOW_LOG = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).registryKey(STRIPPED_WILLOW_LOG_KEY)),
            STRIPPED_WILLOW_LOG_KEY,
            true
    );
    public static final Block STRIPPED_WILLOW_WOOD = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).registryKey(STRIPPED_WILLOW_WOOD_KEY)),
            STRIPPED_WILLOW_WOOD_KEY,
            true
    );
    public static final Block WILLOW_LEAVES = registerBlock(
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).registryKey(WILLOW_LEAVES_KEY)),
            WILLOW_LEAVES_KEY,
            true
    );
    public static final Block WILLOW_SAPLING = registerBlock(
            new MavesSaplingBlock(MavesSaplingGenerators.WILLOW_TREE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).registryKey(WILLOW_SAPLING_KEY)),
            WILLOW_SAPLING_KEY,
            true
    );
    public static final Block POTTED_WILLOW_SAPLING = registerBlock(
            new FlowerPotBlock(MavesBlocks.WILLOW_SAPLING, AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING).registryKey(POTTED_WILLOW_SAPLING_KEY)),
            POTTED_WILLOW_SAPLING_KEY,
            true
    );
    public static final Block WILLOW_PLANKS = registerBlock(
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).registryKey(WILLOW_PLANKS_KEY)),
            WILLOW_PLANKS_KEY,
            true
    );
    public static final Block WILLOW_BUTTON = registerBlock(
            new ButtonBlock(WILLOW, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).registryKey(WILLOW_BUTTON_KEY)),
            WILLOW_BUTTON_KEY,
            true
    );
    public static final Block WILLOW_DOOR = registerBlock(
            new DoorBlock(WILLOW, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).registryKey(WILLOW_DOOR_KEY)),
            WILLOW_DOOR_KEY,
            true
    );
    public static final Block WILLOW_FENCE = registerBlock(
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).registryKey(WILLOW_FENCE_KEY)),
            WILLOW_FENCE_KEY,
            true
    );
    public static final Block WILLOW_FENCE_GATE = registerBlock(
            new FenceGateBlock(WILLOW_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).registryKey(WILLOW_FENCE_GATE_KEY)),
            WILLOW_FENCE_GATE_KEY,
            true
    );
    public static final Block WILLOW_PRESSURE_PLATE = registerBlock(
            new PressurePlateBlock(WILLOW, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE).registryKey(WILLOW_PRESSURE_PLATE_KEY)),
            WILLOW_PRESSURE_PLATE_KEY,
            true
    );
    public static final Block WILLOW_SLAB = registerBlock(
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).registryKey(WILLOW_SLAB_KEY)),
            WILLOW_SLAB_KEY,
            true
    );
    public static final Block WILLOW_STAIRS = registerBlock(
            new StairsBlock(WILLOW_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).registryKey(WILLOW_STAIRS_KEY)),
            WILLOW_STAIRS_KEY,
            true
    );
    public static final Block WILLOW_TRAPDOOR = registerBlock(
            new TrapdoorBlock(WILLOW, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).registryKey(WILLOW_TRAPDOOR_KEY)),
            WILLOW_TRAPDOOR_KEY,
            true
    );

    public static Block registerBlock(Block block, RegistryKey<Block> blockKey, boolean shouldRegisterItem) {
        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());
            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static void registerMavesBlocks() {
        MavesUtilitiesMod.LOGGER.info("Registering Mave's Blocks for " + MavesUtilitiesMod.MOD_ID);
    }
}
