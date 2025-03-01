package com.mavesutilities.block;

import com.mavesutilities.MavesUtilitiesMod;
import com.mavesutilities.item.MavesItems;
import com.mavesutilities.world.tree.MavesSaplingGenerators;
import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.minecraft.block.*;
import net.minecraft.data.family.*;
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
    public static final BlockSetType CACAO_TREE = new BlockSetType("cacao_tree", true, true, true,
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
    public static final WoodType CACAO_TREE_TYPE = new WoodType("cacao_tree", CACAO_TREE, BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN, SoundEvents.BLOCK_FENCE_GATE_CLOSE,
            SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final WoodType RUBBER_TYPE = new WoodType("rubber", RUBBER, BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN, SoundEvents.BLOCK_FENCE_GATE_CLOSE,
            SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final WoodType WILLOW_TYPE = new WoodType("willow", WILLOW, BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN, SoundEvents.BLOCK_FENCE_GATE_CLOSE,
            SoundEvents.BLOCK_FENCE_GATE_OPEN);
    
    public static final Identifier APPLE_TREE_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "entity/signs/apple_tree");
    public static final Identifier APPLE_TREE_HANGING_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "entity/signs/hanging/apple_tree");
    public static final Identifier APPLE_TREE_GUI_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "textures/gui/hanging_signs/apple_tree");
    public static final Identifier APPLE_TREE_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_sign");
    public static final Identifier APPLE_TREE_WALL_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_wall_sign");
    public static final Identifier APPLE_TREE_HANGING_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_hanging_sign");
    public static final Identifier APPLE_TREE_WALL_HANGING_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_wall_hanging_sign");

    public static final Identifier AZALEA_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "entity/signs/azalea");
    public static final Identifier AZALEA_HANGING_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "entity/signs/hanging/azalea");
    public static final Identifier AZALEA_GUI_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "textures/gui/hanging_signs/azalea");
    public static final Identifier AZALEA_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_sign");
    public static final Identifier AZALEA_WALL_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_wall_sign");
    public static final Identifier AZALEA_HANGING_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_hanging_sign");
    public static final Identifier AZALEA_WALL_HANGING_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_wall_hanging_sign");

    public static final Identifier CACAO_TREE_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "entity/signs/cacao_tree");
    public static final Identifier CACAO_TREE_HANGING_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "entity/signs/hanging/cacao_tree");
    public static final Identifier CACAO_TREE_GUI_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "textures/gui/hanging_signs/cacao_tree");
    public static final Identifier CACAO_TREE_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_sign");
    public static final Identifier CACAO_TREE_WALL_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_wall_sign");
    public static final Identifier CACAO_TREE_HANGING_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_hanging_sign");
    public static final Identifier CACAO_TREE_WALL_HANGING_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_wall_hanging_sign");

    public static final Identifier RUBBER_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "entity/signs/rubber");
    public static final Identifier RUBBER_HANGING_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "entity/signs/hanging/rubber");
    public static final Identifier RUBBER_GUI_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "textures/gui/hanging_signs/rubber");
    public static final Identifier RUBBER_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_sign");
    public static final Identifier RUBBER_WALL_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_wall_sign");
    public static final Identifier RUBBER_HANGING_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_hanging_sign");
    public static final Identifier RUBBER_WALL_HANGING_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_wall_hanging_sign");

    public static final Identifier WILLOW_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "entity/signs/willow");
    public static final Identifier WILLOW_HANGING_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "entity/signs/hanging/willow");
    public static final Identifier WILLOW_GUI_SIGN_TEXTURE_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "textures/gui/hanging_signs/willow");
    public static final Identifier WILLOW_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_sign");
    public static final Identifier WILLOW_WALL_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_wall_sign");
    public static final Identifier WILLOW_HANGING_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_hanging_sign");
    public static final Identifier WILLOW_WALL_HANGING_SIGN_ID =
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_wall_hanging_sign");


    public static final RegistryKey<Block> ACACIA_FLOWERING_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "acacia_flowering_leaves")
    );
    public static final RegistryKey<Block> ACACIA_FLOWERED_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "acacia_flowered_leaves")
    );

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
    public static final RegistryKey<Block> APPLE_TREE_FLOWERING_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_flowering_leaves")
    );
    public static final RegistryKey<Block> APPLE_TREE_FLOWERED_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_flowered_leaves")
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
    public static final RegistryKey<Block> APPLE_TREE_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK, APPLE_TREE_SIGN_ID
    );
    public static final RegistryKey<Block> APPLE_TREE_WALL_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK, APPLE_TREE_WALL_SIGN_ID
    );
    public static final RegistryKey<Block> APPLE_TREE_HANGING_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK, APPLE_TREE_HANGING_SIGN_ID
    );
    public static final RegistryKey<Block> APPLE_TREE_WALL_HANGING_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK, APPLE_TREE_WALL_HANGING_SIGN_ID
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
    public static final RegistryKey<Block> AZALEA_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_sign")
    );
    public static final RegistryKey<Block> AZALEA_WALL_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_wall_sign")
    );
    public static final RegistryKey<Block> AZALEA_HANGING_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_hanging_sign")
    );
    public static final RegistryKey<Block> AZALEA_WALL_HANGING_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_wall_hanging_sign")
    );


    public static final RegistryKey<Block> BIRCH_FLOWERING_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "birch_flowering_leaves")
    );

    public static final RegistryKey<Block> CACAO_TREE_LOG_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_log")
    );
    public static final RegistryKey<Block> CACAO_TREE_WOOD_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_wood")
    );
    public static final RegistryKey<Block> STRIPPED_CACAO_TREE_LOG_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_cacao_tree_log")
    );
    public static final RegistryKey<Block> STRIPPED_CACAO_TREE_WOOD_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "stripped_cacao_tree_wood")
    );
    public static final RegistryKey<Block> CACAO_TREE_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_leaves")
    );
    public static final RegistryKey<Block> CACAO_TREE_SAPLING_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_sapling")
    );
    public static final RegistryKey<Block> POTTED_CACAO_TREE_SAPLING_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "potted_cacao_tree_sapling")
    );
    public static final RegistryKey<Block> CACAO_TREE_PLANKS_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_planks")
    );
    public static final RegistryKey<Block> CACAO_TREE_BUTTON_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_button")
    );
    public static final RegistryKey<Block> CACAO_TREE_DOOR_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_door")
    );
    public static final RegistryKey<Block> CACAO_TREE_FENCE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_fence")
    );
    public static final RegistryKey<Block> CACAO_TREE_FENCE_GATE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_fence_gate")
    );
    public static final RegistryKey<Block> CACAO_TREE_PRESSURE_PLATE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_pressure_plate")
    );
    public static final RegistryKey<Block> CACAO_TREE_SLAB_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_slab")
    );
    public static final RegistryKey<Block> CACAO_TREE_STAIRS_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_stairs")
    );
    public static final RegistryKey<Block> CACAO_TREE_TRAPDOOR_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_trapdoor")
    );
    public static final RegistryKey<Block> CACAO_TREE_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_sign")
    );
    public static final RegistryKey<Block> CACAO_TREE_WALL_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_wall_sign")
    );
    public static final RegistryKey<Block> CACAO_TREE_HANGING_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_hanging_sign")
    );
    public static final RegistryKey<Block> CACAO_TREE_WALL_HANGING_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_wall_hanging_sign")
    );

    public static final RegistryKey<Block> CHERRY_FLOWERING_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cherry_flowering_leaves")
    );

    public static final RegistryKey<Block> DARK_OAK_FLOWERING_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "dark_oak_flowering_leaves")
    );

    public static final RegistryKey<Block> JUNGLE_FLOWERING_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "jungle_flowering_leaves")
    );

    public static final RegistryKey<Block> OAK_FLOWERING_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "oak_flowering_leaves")
    );

    public static final RegistryKey<Block> PALE_OAK_FLOWERING_LEAVES_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "pale_oak_flowering_leaves")
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
    public static final RegistryKey<Block> RUBBER_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_sign")
    );
    public static final RegistryKey<Block> RUBBER_WALL_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_wall_sign")
    );
    public static final RegistryKey<Block> RUBBER_HANGING_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_hanging_sign")
    );
    public static final RegistryKey<Block> RUBBER_WALL_HANGING_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_wall_hanging_sign")
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
    public static final RegistryKey<Block> WILLOW_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_sign")
    );
    public static final RegistryKey<Block> WILLOW_WALL_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_wall_sign")
    );
    public static final RegistryKey<Block> WILLOW_HANGING_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_hanging_sign")
    );
    public static final RegistryKey<Block> WILLOW_WALL_HANGING_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_wall_hanging_sign")
    );



    public static final Block ACACIA_FLOWERING_LEAVES = registerBlock(
            new MavesFloweringLeaves(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly().registryKey(
                    ACACIA_FLOWERING_LEAVES_KEY), new ItemStack(MavesItems.ACACIA_POD), MavesBlocks.ACACIA_FLOWERED_LEAVES),
            ACACIA_FLOWERING_LEAVES_KEY,
            true
    );
    public static final Block ACACIA_FLOWERED_LEAVES = registerBlock(
            new MavesFloweredLeaves(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).registryKey(
                    ACACIA_FLOWERED_LEAVES_KEY), MavesItems.ACACIA_BLOSSOM, Blocks.ACACIA_LEAVES),
            ACACIA_FLOWERED_LEAVES_KEY,
            true
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
    public static final Block APPLE_TREE_FLOWERING_LEAVES = registerBlock(
            new MavesAppleFloweringLeaves(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly().registryKey(
                    APPLE_TREE_FLOWERING_LEAVES_KEY)),
            APPLE_TREE_FLOWERING_LEAVES_KEY,
            true
    );
    public static final Block APPLE_TREE_FLOWERED_LEAVES = registerBlock(
            new MavesFloweredLeaves(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).registryKey(
                    APPLE_TREE_FLOWERED_LEAVES_KEY), MavesItems.APPLE_BLOSSOM, MavesBlocks.APPLE_TREE_LEAVES),
            APPLE_TREE_FLOWERED_LEAVES_KEY,
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
            new DoorBlock(APPLE_TREE, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque().registryKey(APPLE_TREE_DOOR_KEY)),
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
            new TrapdoorBlock(APPLE_TREE, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).nonOpaque().registryKey(APPLE_TREE_TRAPDOOR_KEY)),
            APPLE_TREE_TRAPDOOR_KEY,
            true
    );

    public static final Block APPLE_TREE_SIGN = registerBlock(
            new TerraformSignBlock(APPLE_TREE_SIGN_TEXTURE_ID,
            AbstractBlock.Settings.copy(Blocks.OAK_SIGN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, APPLE_TREE_SIGN_ID))),
            APPLE_TREE_SIGN_KEY,
            false
    );
    public static final Block APPLE_TREE_WALL_SIGN = registerBlock(
            new TerraformWallSignBlock(APPLE_TREE_SIGN_TEXTURE_ID,
            AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)
                    .lootTable(APPLE_TREE_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            APPLE_TREE_WALL_SIGN_ID))),
            APPLE_TREE_WALL_SIGN_KEY,
            false
    );
    public static final Block APPLE_TREE_HANGING_SIGN = registerBlock(
            new TerraformHangingSignBlock(APPLE_TREE_HANGING_SIGN_TEXTURE_ID,
            APPLE_TREE_GUI_SIGN_TEXTURE_ID, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                    APPLE_TREE_HANGING_SIGN_ID))),
            APPLE_TREE_HANGING_SIGN_KEY,
            false
    );
    public static final Block APPLE_TREE_WALL_HANGING_SIGN = registerBlock(
            new TerraformWallHangingSignBlock(APPLE_TREE_HANGING_SIGN_TEXTURE_ID,
            APPLE_TREE_GUI_SIGN_TEXTURE_ID, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)
            .lootTable(APPLE_TREE_HANGING_SIGN.getLootTableKey())
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, APPLE_TREE_WALL_HANGING_SIGN_ID))),
            APPLE_TREE_WALL_HANGING_SIGN_KEY,
            false
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
            new DoorBlock(AZALEA, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque().registryKey(AZALEA_DOOR_KEY)),
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
            new TrapdoorBlock(AZALEA, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).nonOpaque().registryKey(AZALEA_TRAPDOOR_KEY)),
            AZALEA_TRAPDOOR_KEY,
            true
    );

    public static final Block AZALEA_SIGN = registerBlock(
            new TerraformSignBlock(AZALEA_SIGN_TEXTURE_ID,
                    AbstractBlock.Settings.copy(Blocks.OAK_SIGN)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, AZALEA_SIGN_ID))),
            AZALEA_SIGN_KEY,
            false
    );
    public static final Block AZALEA_WALL_SIGN = registerBlock(
            new TerraformWallSignBlock(AZALEA_SIGN_TEXTURE_ID,
                    AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)
                            .lootTable(AZALEA_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                                    AZALEA_WALL_SIGN_ID))),
            AZALEA_WALL_SIGN_KEY,
            false
    );
    public static final Block AZALEA_HANGING_SIGN = registerBlock(
            new TerraformHangingSignBlock(AZALEA_HANGING_SIGN_TEXTURE_ID,
                    AZALEA_GUI_SIGN_TEXTURE_ID, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            AZALEA_HANGING_SIGN_ID))),
            AZALEA_HANGING_SIGN_KEY,
            false
    );
    public static final Block AZALEA_WALL_HANGING_SIGN = registerBlock(
            new TerraformWallHangingSignBlock(AZALEA_HANGING_SIGN_TEXTURE_ID,
                    AZALEA_GUI_SIGN_TEXTURE_ID, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)
                    .lootTable(AZALEA_HANGING_SIGN.getLootTableKey())
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, AZALEA_WALL_HANGING_SIGN_ID))),
            AZALEA_WALL_HANGING_SIGN_KEY,
            false
    );



    public static final Block BIRCH_FLOWERING_LEAVES = registerBlock(
            new MavesFloweringLeaves(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly().registryKey(
                    BIRCH_FLOWERING_LEAVES_KEY), new ItemStack(MavesItems.BIRCH_CATKINS), Blocks.BIRCH_LEAVES),
            BIRCH_FLOWERING_LEAVES_KEY,
            true
    );



    public static final Block CACAO_TREE_LOG = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).registryKey(CACAO_TREE_LOG_KEY)),
            CACAO_TREE_LOG_KEY,
            true
    );
    public static final Block CACAO_TREE_WOOD = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).registryKey(CACAO_TREE_WOOD_KEY)),
            CACAO_TREE_WOOD_KEY,
            true
    );
    public static final Block STRIPPED_CACAO_TREE_LOG = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).registryKey(STRIPPED_CACAO_TREE_LOG_KEY)),
            STRIPPED_CACAO_TREE_LOG_KEY,
            true
    );
    public static final Block STRIPPED_CACAO_TREE_WOOD = registerBlock(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).registryKey(STRIPPED_CACAO_TREE_WOOD_KEY)),
            STRIPPED_CACAO_TREE_WOOD_KEY,
            true
    );
    public static final Block CACAO_TREE_LEAVES = registerBlock(
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).registryKey(CACAO_TREE_LEAVES_KEY)),
            CACAO_TREE_LEAVES_KEY,
            true
    );
    public static final Block CACAO_TREE_SAPLING = registerBlock(
            new MavesSaplingBlock(MavesSaplingGenerators.CACAO_TREE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).registryKey(CACAO_TREE_SAPLING_KEY)),
            CACAO_TREE_SAPLING_KEY,
            true
    );
    public static final Block POTTED_CACAO_TREE_SAPLING = registerBlock(
            new FlowerPotBlock(MavesBlocks.CACAO_TREE_SAPLING, AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING).registryKey(POTTED_CACAO_TREE_SAPLING_KEY)),
            POTTED_CACAO_TREE_SAPLING_KEY,
            true
    );
    public static final Block CACAO_TREE_PLANKS = registerBlock(
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).registryKey(CACAO_TREE_PLANKS_KEY)),
            CACAO_TREE_PLANKS_KEY,
            true
    );
    public static final Block CACAO_TREE_BUTTON = registerBlock(
            new ButtonBlock(CACAO_TREE, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).registryKey(CACAO_TREE_BUTTON_KEY)),
            CACAO_TREE_BUTTON_KEY,
            true
    );
    public static final Block CACAO_TREE_DOOR = registerBlock(
            new DoorBlock(CACAO_TREE, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).registryKey(CACAO_TREE_DOOR_KEY)),
            CACAO_TREE_DOOR_KEY,
            true
    );
    public static final Block CACAO_TREE_FENCE = registerBlock(
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).registryKey(CACAO_TREE_FENCE_KEY)),
            CACAO_TREE_FENCE_KEY,
            true
    );
    public static final Block CACAO_TREE_FENCE_GATE = registerBlock(
            new FenceGateBlock(CACAO_TREE_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).registryKey(CACAO_TREE_FENCE_GATE_KEY)),
            CACAO_TREE_FENCE_GATE_KEY,
            true
    );
    public static final Block CACAO_TREE_PRESSURE_PLATE = registerBlock(
            new PressurePlateBlock(CACAO_TREE, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE).registryKey(CACAO_TREE_PRESSURE_PLATE_KEY)),
            CACAO_TREE_PRESSURE_PLATE_KEY,
            true
    );
    public static final Block CACAO_TREE_SLAB = registerBlock(
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).registryKey(CACAO_TREE_SLAB_KEY)),
            CACAO_TREE_SLAB_KEY,
            true
    );
    public static final Block CACAO_TREE_STAIRS = registerBlock(
            new StairsBlock(CACAO_TREE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).registryKey(CACAO_TREE_STAIRS_KEY)),
            CACAO_TREE_STAIRS_KEY,
            true
    );
    public static final Block CACAO_TREE_TRAPDOOR = registerBlock(
            new TrapdoorBlock(CACAO_TREE, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).registryKey(CACAO_TREE_TRAPDOOR_KEY)),
            CACAO_TREE_TRAPDOOR_KEY,
            true
    );

    public static final Block CACAO_TREE_SIGN = registerBlock(
            new TerraformSignBlock(CACAO_TREE_SIGN_TEXTURE_ID,
                    AbstractBlock.Settings.copy(Blocks.OAK_SIGN)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, CACAO_TREE_SIGN_ID))),
            CACAO_TREE_SIGN_KEY,
            false
    );
    public static final Block CACAO_TREE_WALL_SIGN = registerBlock(
            new TerraformWallSignBlock(CACAO_TREE_SIGN_TEXTURE_ID,
                    AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)
                            .lootTable(CACAO_TREE_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                                    CACAO_TREE_WALL_SIGN_ID))),
            CACAO_TREE_WALL_SIGN_KEY,
            false
    );
    public static final Block CACAO_TREE_HANGING_SIGN = registerBlock(
            new TerraformHangingSignBlock(CACAO_TREE_HANGING_SIGN_TEXTURE_ID,
                    CACAO_TREE_GUI_SIGN_TEXTURE_ID, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            CACAO_TREE_HANGING_SIGN_ID))),
            CACAO_TREE_HANGING_SIGN_KEY,
            false
    );
    public static final Block CACAO_TREE_WALL_HANGING_SIGN = registerBlock(
            new TerraformWallHangingSignBlock(CACAO_TREE_HANGING_SIGN_TEXTURE_ID,
                    CACAO_TREE_GUI_SIGN_TEXTURE_ID, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)
                    .lootTable(CACAO_TREE_HANGING_SIGN.getLootTableKey())
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, CACAO_TREE_WALL_HANGING_SIGN_ID))),
            CACAO_TREE_WALL_HANGING_SIGN_KEY,
            false
    );



    public static final Block CHERRY_FLOWERING_LEAVES = registerBlock(
            new MavesFloweringLeaves(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly().registryKey(
                    CHERRY_FLOWERING_LEAVES_KEY), new ItemStack(MavesItems.CHERRIES), Blocks.CHERRY_LEAVES),
            CHERRY_FLOWERING_LEAVES_KEY,
            true
    );



    public static final Block DARK_OAK_FLOWERING_LEAVES = registerBlock(
            new MavesFloweringLeaves(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly().registryKey(
                    DARK_OAK_FLOWERING_LEAVES_KEY), new ItemStack(MavesItems.DARK_ACORN), Blocks.DARK_OAK_LEAVES),
            DARK_OAK_FLOWERING_LEAVES_KEY,
            true
    );



    public static final Block JUNGLE_FLOWERING_LEAVES = registerBlock(
            new MavesJungleFloweringLeaves(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly().registryKey(
                    JUNGLE_FLOWERING_LEAVES_KEY)),
            JUNGLE_FLOWERING_LEAVES_KEY,
            true
    );



    public static final Block OAK_FLOWERING_LEAVES = registerBlock(
            new MavesFloweringLeaves(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly().registryKey(
                    OAK_FLOWERING_LEAVES_KEY), new ItemStack(MavesItems.ACORN), Blocks.OAK_LEAVES),
            OAK_FLOWERING_LEAVES_KEY,
            true
    );



    public static final Block PALE_OAK_FLOWERING_LEAVES = registerBlock(
            new MavesFloweringLeaves(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly().registryKey(
                    PALE_OAK_FLOWERING_LEAVES_KEY), new ItemStack(MavesItems.PALE_ACORN), Blocks.PALE_OAK_LEAVES),
            PALE_OAK_FLOWERING_LEAVES_KEY,
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
            new DoorBlock(RUBBER, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque().registryKey(RUBBER_DOOR_KEY)),
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
            new TrapdoorBlock(RUBBER, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).nonOpaque().registryKey(RUBBER_TRAPDOOR_KEY)),
            RUBBER_TRAPDOOR_KEY,
            true
    );

    public static final Block RUBBER_SIGN = registerBlock(
            new TerraformSignBlock(RUBBER_SIGN_TEXTURE_ID,
                    AbstractBlock.Settings.copy(Blocks.OAK_SIGN)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, RUBBER_SIGN_ID))),
            RUBBER_SIGN_KEY,
            false
    );

    public static final Block RUBBER_WALL_SIGN = registerBlock(
            new TerraformWallSignBlock(RUBBER_SIGN_TEXTURE_ID,
                    AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)
                            .lootTable(RUBBER_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                                    RUBBER_WALL_SIGN_ID))),
            RUBBER_WALL_SIGN_KEY,
            false
    );

    public static final Block RUBBER_HANGING_SIGN = registerBlock(
            new TerraformHangingSignBlock(RUBBER_HANGING_SIGN_TEXTURE_ID,
                    RUBBER_GUI_SIGN_TEXTURE_ID, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            RUBBER_HANGING_SIGN_ID))),
            RUBBER_HANGING_SIGN_KEY,
            false
    );

    public static final Block RUBBER_WALL_HANGING_SIGN = registerBlock(
            new TerraformWallHangingSignBlock(RUBBER_HANGING_SIGN_TEXTURE_ID,
                    RUBBER_GUI_SIGN_TEXTURE_ID, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)
                    .lootTable(RUBBER_HANGING_SIGN.getLootTableKey())
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, RUBBER_WALL_HANGING_SIGN_ID))),
            RUBBER_WALL_HANGING_SIGN_KEY,
            false
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
            new DoorBlock(WILLOW, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque().registryKey(WILLOW_DOOR_KEY)),
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
            new TrapdoorBlock(WILLOW, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).nonOpaque().registryKey(WILLOW_TRAPDOOR_KEY)),
            WILLOW_TRAPDOOR_KEY,
            true
    );

    public static final Block WILLOW_SIGN = registerBlock(
            new TerraformSignBlock(WILLOW_SIGN_TEXTURE_ID,
                    AbstractBlock.Settings.copy(Blocks.OAK_SIGN)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, WILLOW_SIGN_ID))),
            WILLOW_SIGN_KEY,
            false
    );

    public static final Block WILLOW_WALL_SIGN = registerBlock(
            new TerraformWallSignBlock(WILLOW_SIGN_TEXTURE_ID,
                    AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)
                            .lootTable(WILLOW_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                                    WILLOW_WALL_SIGN_ID))),
            WILLOW_WALL_SIGN_KEY,
            false
    );

    public static final Block WILLOW_HANGING_SIGN = registerBlock(
            new TerraformHangingSignBlock(WILLOW_HANGING_SIGN_TEXTURE_ID,
                    WILLOW_GUI_SIGN_TEXTURE_ID, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            WILLOW_HANGING_SIGN_ID))),
            WILLOW_HANGING_SIGN_KEY,
            false
    );

    public static final Block WILLOW_WALL_HANGING_SIGN = registerBlock(
            new TerraformWallHangingSignBlock(WILLOW_HANGING_SIGN_TEXTURE_ID,
                    WILLOW_GUI_SIGN_TEXTURE_ID, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)
                    .lootTable(WILLOW_HANGING_SIGN.getLootTableKey())
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, WILLOW_WALL_HANGING_SIGN_ID))),
            WILLOW_WALL_HANGING_SIGN_KEY,
            false
    );



    public static final BlockFamily APPLE_TREE_FAMILY = BlockFamilies.register(MavesBlocks.APPLE_TREE_PLANKS)
            .sign(MavesBlocks.APPLE_TREE_SIGN, MavesBlocks.APPLE_TREE_WALL_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();
    public static final BlockFamily AZALEA_FAMILY = BlockFamilies.register(MavesBlocks.AZALEA_PLANKS)
            .sign(MavesBlocks.AZALEA_SIGN, MavesBlocks.AZALEA_WALL_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();
    public static final BlockFamily CACAO_TREE_FAMILY = BlockFamilies.register(MavesBlocks.CACAO_TREE_PLANKS)
            .sign(MavesBlocks.CACAO_TREE_SIGN, MavesBlocks.CACAO_TREE_WALL_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();
    public static final BlockFamily RUBBER_FAMILY = BlockFamilies.register(MavesBlocks.RUBBER_PLANKS)
            .sign(MavesBlocks.RUBBER_SIGN, MavesBlocks.RUBBER_WALL_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();
    public static final BlockFamily WILLOW_FAMILY = BlockFamilies.register(MavesBlocks.WILLOW_PLANKS)
            .sign(MavesBlocks.WILLOW_SIGN, MavesBlocks.WILLOW_WALL_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static Block registerBlock(Block block, RegistryKey<Block> blockKey, boolean shouldRegisterItem) {
        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());
            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static void registerMavesBlocks() {
        MavesUtilitiesMod.LOGGER.info("Registering Mave's Blocks for " + MavesUtilitiesMod.MOD_ID);


    }
}
