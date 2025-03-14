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

import java.util.function.Function;

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

    public static final RegistryKey<Block> APPLE_TREE_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK, APPLE_TREE_SIGN_ID);
    public static final RegistryKey<Block> APPLE_TREE_WALL_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK, APPLE_TREE_WALL_SIGN_ID);
    public static final RegistryKey<Block> APPLE_TREE_HANGING_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK, APPLE_TREE_HANGING_SIGN_ID);
    public static final RegistryKey<Block> APPLE_TREE_WALL_HANGING_SIGN_KEY = RegistryKey.of(
            RegistryKeys.BLOCK, APPLE_TREE_WALL_HANGING_SIGN_ID);

    public static final RegistryKey<Block> AZALEA_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_sign"));
    public static final RegistryKey<Block> AZALEA_WALL_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_wall_sign"));
    public static final RegistryKey<Block> AZALEA_HANGING_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_hanging_sign"));
    public static final RegistryKey<Block> AZALEA_WALL_HANGING_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_wall_hanging_sign"));

    public static final RegistryKey<Block> CACAO_TREE_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_sign"));
    public static final RegistryKey<Block> CACAO_TREE_WALL_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_wall_sign"));
    public static final RegistryKey<Block> CACAO_TREE_HANGING_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_hanging_sign"));
    public static final RegistryKey<Block> CACAO_TREE_WALL_HANGING_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_wall_hanging_sign"));

    public static final RegistryKey<Block> RUBBER_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_sign"));
    public static final RegistryKey<Block> RUBBER_WALL_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_wall_sign"));
    public static final RegistryKey<Block> RUBBER_HANGING_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_hanging_sign"));
    public static final RegistryKey<Block> RUBBER_WALL_HANGING_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_wall_hanging_sign"));

    public static final RegistryKey<Block> WILLOW_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_sign"));
    public static final RegistryKey<Block> WILLOW_WALL_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_wall_sign"));
    public static final RegistryKey<Block> WILLOW_HANGING_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_hanging_sign"));
    public static final RegistryKey<Block> WILLOW_WALL_HANGING_SIGN_KEY = RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_wall_hanging_sign"));

    public static final RegistryKey<Block> ACACIA_FLOWERING_LEAVES_KEY = of("acacia_flowering_leaves");
    public static final RegistryKey<Block> BIRCH_FLOWERING_LEAVES_KEY = of("birch_flowering_leaves");
    public static final RegistryKey<Block> CHERRY_FLOWERING_LEAVES_KEY = of("cherry_flowering_leaves");
    public static final RegistryKey<Block> DARK_OAK_FLOWERING_LEAVES_KEY = of("dark_oak_flowering_leaves");
    public static final RegistryKey<Block> OAK_FLOWERING_LEAVES_KEY = of("oak_flowering_leaves");
    public static final RegistryKey<Block> PALE_OAK_FLOWERING_LEAVES_KEY = of("pale_oak_flowering_leaves");
    public static final RegistryKey<Block> APPLE_TREE_SAPLING_KEY = of("apple_tree_sapling");
    public static final RegistryKey<Block> CACAO_TREE_SAPLING_KEY = of("cacao_tree_sapling");
    public static final RegistryKey<Block> RUBBER_SAPLING_KEY = of("rubber_sapling");
    public static final RegistryKey<Block> WILLOW_SAPLING_KEY = of("willow_sapling");
    public static final RegistryKey<Block> PALE_PUMPKIN_KEY = of("pale_pumpkin");
    public static final RegistryKey<Block> CARVED_PALE_PUMPKIN_KEY = of("carved_pale_pumpkin");
    public static final RegistryKey<Block> PALE_JACK_O_LANTERN_KEY = of("pale_jack_o_lantern");
    public static final RegistryKey<Block> ATTACHED_PALE_PUMPKIN_STEM_KEY = of("attached_pale_pumpkin_stem");
    public static final RegistryKey<Block> PALE_PUMPKIN_STEM_KEY = of("pale_pumpkin_stem");

    public static final Block OAK_FLOWERING_LEAVES = register(OAK_FLOWERING_LEAVES_KEY,
            settings -> new MavesFloweringLeaves(MavesItems.ACORN, Blocks.OAK_LEAVES, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly());
    public static final Block BIRCH_FLOWERING_LEAVES = register(BIRCH_FLOWERING_LEAVES_KEY,
            settings -> new MavesFloweringLeaves(MavesItems.BIRCH_CATKINS, Blocks.BIRCH_LEAVES, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly());
    public static final Block JUNGLE_FLOWERING_LEAVES = register("jungle_flowering_leaves", MavesJungleFloweringLeaves::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly());
    public static final Block ACACIA_FLOWERING_LEAVES = register(ACACIA_FLOWERING_LEAVES_KEY,
            settings -> new MavesFloweringLeaves(MavesItems.ACACIA_POD, MavesBlocks.ACACIA_FLOWERED_LEAVES, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly());
    public static final Block ACACIA_FLOWERED_LEAVES = register("acacia_flowered_leaves", LeavesBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES));
    public static final Block DARK_OAK_FLOWERING_LEAVES = register(DARK_OAK_FLOWERING_LEAVES_KEY,
            settings -> new MavesFloweringLeaves(MavesItems.DARK_ACORN, Blocks.DARK_OAK_LEAVES, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly());
    public static final Block CHERRY_FLOWERING_LEAVES = register(CHERRY_FLOWERING_LEAVES_KEY,
            settings -> new MavesFloweringLeaves(MavesItems.CHERRIES, Blocks.CHERRY_LEAVES, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly());
    public static final Block PALE_OAK_FLOWERING_LEAVES = register(PALE_OAK_FLOWERING_LEAVES_KEY,
            settings -> new MavesFloweringLeaves(MavesItems.PALE_ACORN, Blocks.PALE_OAK_LEAVES, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly());

    public static final Block OAK_BLOCK = register("oak_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block SPRUCE_BLOCK = register("spruce_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.SPRUCE_LOG));
    public static final Block BIRCH_BLOCK = register("birch_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.BIRCH_LOG));
    public static final Block JUNGLE_BLOCK = register("jungle_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.JUNGLE_LOG));
    public static final Block ACACIA_BLOCK = register("acacia_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.ACACIA_LOG));
    public static final Block DARK_OAK_BLOCK = register("dark_oak_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.DARK_OAK_LOG));
    public static final Block MANGROVE_BLOCK = register("mangrove_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.MANGROVE_LOG));
    public static final Block CHERRY_BLOCK = register("cherry_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.CHERRY_LOG));
    public static final Block PALE_OAK_BLOCK = register("pale_oak_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.PALE_OAK_LOG));
    public static final Block CRIMSON_BLOCK = register("crimson_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM));
    public static final Block WARPED_BLOCK = register("warped_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.WARPED_STEM));

    public static final Block APPLE_TREE_BLOCK = register("apple_tree_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block AZALEA_BLOCK = register("azalea_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block CACAO_TREE_BLOCK = register("cacao_tree_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block RUBBER_BLOCK = register("rubber_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block WILLOW_BLOCK = register("willow_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LOG));

    public static final Block STRIPPED_OAK_BLOCK = register("stripped_oak_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_SPRUCE_BLOCK = register("stripped_spruce_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_LOG));
    public static final Block STRIPPED_BIRCH_BLOCK = register("stripped_birch_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_LOG));
    public static final Block STRIPPED_JUNGLE_BLOCK = register("stripped_jungle_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_LOG));
    public static final Block STRIPPED_ACACIA_BLOCK = register("stripped_acacia_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_LOG));
    public static final Block STRIPPED_DARK_OAK_BLOCK = register("stripped_dark_oak_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_LOG));
    public static final Block STRIPPED_MANGROVE_BLOCK = register("stripped_mangrove_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_LOG));
    public static final Block STRIPPED_CHERRY_BLOCK = register("stripped_cherry_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_LOG));
    public static final Block STRIPPED_PALE_OAK_BLOCK = register("stripped_pale_oak_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_PALE_OAK_LOG));
    public static final Block STRIPPED_CRIMSON_BLOCK = register("stripped_crimson_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_STEM));
    public static final Block STRIPPED_WARPED_BLOCK = register("stripped_warped_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_STEM));

    public static final Block STRIPPED_APPLE_TREE_BLOCK = register("stripped_apple_tree_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_AZALEA_BLOCK = register("stripped_azalea_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_CACAO_TREE_BLOCK = register("stripped_cacao_tree_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_RUBBER_BLOCK = register("stripped_rubber_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_WILLOW_BLOCK = register("stripped_willow_block", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));

    public static final Block APPLE_TREE_LOG = register("apple_tree_log", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block APPLE_TREE_WOOD = register("apple_tree_wood", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block STRIPPED_APPLE_TREE_LOG = register("stripped_apple_tree_log", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_APPLE_TREE_WOOD = register("stripped_apple_tree_wood", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block APPLE_TREE_LEAVES = register("apple_tree_leaves", LeavesBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES));
    public static final Block APPLE_TREE_FLOWERING_LEAVES = register("apple_tree_flowering_leaves", MavesAppleFloweringLeaves::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).ticksRandomly());
    public static final Block APPLE_TREE_FLOWERED_LEAVES = register("apple_tree_flowered_leaves", LeavesBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES));
    public static final Block APPLE_TREE_SAPLING = register(APPLE_TREE_SAPLING_KEY,
            settings -> new MavesSaplingBlock(MavesSaplingGenerators.APPLE_TREE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Block POTTED_APPLE_TREE_SAPLING = register("potted_apple_tree_sapling",
            settings -> new FlowerPotBlock(MavesBlocks.APPLE_TREE_SAPLING, settings),
            AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING));
    public static final Block APPLE_TREE_PLANKS = register("apple_tree_planks",
            AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));
    public static final Block APPLE_TREE_BUTTON = register("apple_tree_button",
            settings -> new ButtonBlock(APPLE_TREE, 30, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_BUTTON));
    public static final Block APPLE_TREE_DOOR = register("apple_tree_door",
            settings -> new DoorBlock(APPLE_TREE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque());
    public static final Block APPLE_TREE_FENCE = register("apple_tree_fence", FenceBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE));
    public static final Block APPLE_TREE_FENCE_GATE = register("apple_tree_fence_gate",
            settings -> new FenceGateBlock(APPLE_TREE_TYPE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE));
    public static final Block APPLE_TREE_PRESSURE_PLATE = register("apple_tree_pressure_plate",
            settings -> new PressurePlateBlock(APPLE_TREE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE));
    public static final Block APPLE_TREE_SLAB = register("apple_tree_slab", SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_SLAB));
    public static final Block APPLE_TREE_STAIRS = register("apple_tree_stairs",
            settings -> new StairsBlock(APPLE_TREE_PLANKS.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.OAK_STAIRS));
    public static final Block APPLE_TREE_TRAPDOOR = register("apple_tree_trapdoor",
            settings -> new TrapdoorBlock(APPLE_TREE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).nonOpaque());
    public static final Block APPLE_TREE_SIGN = register(APPLE_TREE_SIGN_KEY,
            settings -> new TerraformSignBlock(APPLE_TREE_SIGN_TEXTURE_ID, settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, APPLE_TREE_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_SIGN));
    public static final Block APPLE_TREE_WALL_SIGN = register(APPLE_TREE_WALL_SIGN_KEY,
            settings -> new TerraformWallSignBlock(APPLE_TREE_SIGN_TEXTURE_ID, settings.lootTable(APPLE_TREE_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK, APPLE_TREE_WALL_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN));
    public static final Block APPLE_TREE_HANGING_SIGN = register(APPLE_TREE_HANGING_SIGN_KEY,
            settings -> new TerraformHangingSignBlock(APPLE_TREE_HANGING_SIGN_TEXTURE_ID, APPLE_TREE_GUI_SIGN_TEXTURE_ID, settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, APPLE_TREE_HANGING_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN));
    public static final Block APPLE_TREE_WALL_HANGING_SIGN = register(APPLE_TREE_WALL_HANGING_SIGN_KEY,
            settings -> new TerraformWallHangingSignBlock(APPLE_TREE_HANGING_SIGN_TEXTURE_ID, APPLE_TREE_GUI_SIGN_TEXTURE_ID, settings.lootTable(APPLE_TREE_HANGING_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK, APPLE_TREE_WALL_HANGING_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN));

    public static final Block AZALEA_STEM = register("azalea_stem", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block AZALEA_WOOD = register("azalea_wood", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block STRIPPED_AZALEA_STEM = register("stripped_azalea_stem", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_AZALEA_WOOD = register("stripped_azalea_wood", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block AZALEA_PLANKS = register("azalea_planks",
            AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));
    public static final Block AZALEA_BUTTON = register("azalea_button",
            settings -> new ButtonBlock(AZALEA, 30, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_BUTTON));
    public static final Block AZALEA_DOOR = register("azalea_door",
            settings -> new DoorBlock(AZALEA, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque());
    public static final Block AZALEA_FENCE = register("azalea_fence", FenceBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE));
    public static final Block AZALEA_FENCE_GATE = register("azalea_fence_gate",
            settings -> new FenceGateBlock(AZALEA_TYPE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE));
    public static final Block AZALEA_PRESSURE_PLATE = register("azalea_pressure_plate",
            settings -> new PressurePlateBlock(AZALEA, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE));
    public static final Block AZALEA_SLAB = register("azalea_slab", SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_SLAB));
    public static final Block AZALEA_STAIRS = register("azalea_stairs",
            settings -> new StairsBlock(AZALEA_PLANKS.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.OAK_STAIRS));
    public static final Block AZALEA_TRAPDOOR = register("azalea_trapdoor",
            settings -> new TrapdoorBlock(AZALEA, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).nonOpaque());
    public static final Block AZALEA_SIGN = register(AZALEA_SIGN_KEY,
            settings -> new TerraformSignBlock(AZALEA_SIGN_TEXTURE_ID, settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, AZALEA_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_SIGN));
    public static final Block AZALEA_WALL_SIGN = register(AZALEA_WALL_SIGN_KEY,
            settings -> new TerraformWallSignBlock(AZALEA_SIGN_TEXTURE_ID, settings.lootTable(AZALEA_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK, AZALEA_WALL_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN));
    public static final Block AZALEA_HANGING_SIGN = register(AZALEA_HANGING_SIGN_KEY,
            settings -> new TerraformHangingSignBlock(AZALEA_HANGING_SIGN_TEXTURE_ID, AZALEA_GUI_SIGN_TEXTURE_ID, settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, AZALEA_HANGING_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN));
    public static final Block AZALEA_WALL_HANGING_SIGN = register(AZALEA_WALL_HANGING_SIGN_KEY,
            settings -> new TerraformWallHangingSignBlock(AZALEA_HANGING_SIGN_TEXTURE_ID, AZALEA_GUI_SIGN_TEXTURE_ID, settings.lootTable(AZALEA_HANGING_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK, AZALEA_WALL_HANGING_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN));

    public static final Block CACAO_TREE_LOG = register("cacao_tree_log", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block CACAO_TREE_WOOD = register("cacao_tree_wood", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block STRIPPED_CACAO_TREE_LOG = register("stripped_cacao_tree_log", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_CACAO_TREE_WOOD = register("stripped_cacao_tree_wood", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block CACAO_TREE_LEAVES = register("cacao_tree_leaves", LeavesBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES));
    public static final Block CACAO_TREE_SAPLING = register(CACAO_TREE_SAPLING_KEY,
            settings -> new MavesSaplingBlock(MavesSaplingGenerators.CACAO_TREE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Block POTTED_CACAO_TREE_SAPLING = register("potted_cacao_tree_sapling",
            settings -> new FlowerPotBlock(MavesBlocks.CACAO_TREE_SAPLING, settings),
            AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING));
    public static final Block CACAO_TREE_PLANKS = register("cacao_tree_planks",
            AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));
    public static final Block CACAO_TREE_BUTTON = register("cacao_tree_button",
            settings -> new ButtonBlock(CACAO_TREE, 30, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_BUTTON));
    public static final Block CACAO_TREE_DOOR = register("cacao_tree_door",
            settings -> new DoorBlock(CACAO_TREE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque());
    public static final Block CACAO_TREE_FENCE = register("cacao_tree_fence", FenceBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE));
    public static final Block CACAO_TREE_FENCE_GATE = register("cacao_tree_fence_gate",
            settings -> new FenceGateBlock(CACAO_TREE_TYPE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE));
    public static final Block CACAO_TREE_PRESSURE_PLATE = register("cacao_tree_pressure_plate",
            settings -> new PressurePlateBlock(CACAO_TREE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE));
    public static final Block CACAO_TREE_SLAB = register("cacao_tree_slab", SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_SLAB));
    public static final Block CACAO_TREE_STAIRS = register("cacao_tree_stairs",
            settings -> new StairsBlock(CACAO_TREE_PLANKS.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.OAK_STAIRS));
    public static final Block CACAO_TREE_TRAPDOOR = register("cacao_tree_trapdoor",
            settings -> new TrapdoorBlock(CACAO_TREE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).nonOpaque());
    public static final Block CACAO_TREE_SIGN = register(CACAO_TREE_SIGN_KEY,
            settings -> new TerraformSignBlock(CACAO_TREE_SIGN_TEXTURE_ID, settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, CACAO_TREE_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_SIGN));
    public static final Block CACAO_TREE_WALL_SIGN = register(CACAO_TREE_WALL_SIGN_KEY,
            settings -> new TerraformWallSignBlock(CACAO_TREE_SIGN_TEXTURE_ID, settings.lootTable(CACAO_TREE_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK, CACAO_TREE_WALL_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN));
    public static final Block CACAO_TREE_HANGING_SIGN = register(CACAO_TREE_HANGING_SIGN_KEY,
            settings -> new TerraformHangingSignBlock(CACAO_TREE_HANGING_SIGN_TEXTURE_ID, CACAO_TREE_GUI_SIGN_TEXTURE_ID, settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, CACAO_TREE_HANGING_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN));
    public static final Block CACAO_TREE_WALL_HANGING_SIGN = register(CACAO_TREE_WALL_HANGING_SIGN_KEY,
            settings -> new TerraformWallHangingSignBlock(CACAO_TREE_HANGING_SIGN_TEXTURE_ID, CACAO_TREE_GUI_SIGN_TEXTURE_ID, settings.lootTable(CACAO_TREE_HANGING_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK, CACAO_TREE_WALL_HANGING_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN));

    public static final Block PALE_PUMPKIN = register(PALE_PUMPKIN_KEY, MavesPalePumpkin::new,
            AbstractBlock.Settings.copy(Blocks.PUMPKIN));
    public static final Block CARVED_PALE_PUMPKIN = register(CARVED_PALE_PUMPKIN_KEY, MavesCarvedPalePumpkin::new,
            AbstractBlock.Settings.copy(Blocks.CARVED_PUMPKIN));
    public static final Block PALE_JACK_O_LANTERN = register(PALE_JACK_O_LANTERN_KEY, MavesCarvedPalePumpkin::new,
            AbstractBlock.Settings.copy(Blocks.JACK_O_LANTERN));
    public static final Block ATTACHED_PALE_PUMPKIN_STEM = register(ATTACHED_PALE_PUMPKIN_STEM_KEY,
            settings -> new AttachedStemBlock(PALE_PUMPKIN_STEM_KEY, PALE_PUMPKIN_KEY, MavesItems.PALE_PUMPKIN_SEEDS_KEY, settings),
            AbstractBlock.Settings.copy(Blocks.ATTACHED_PUMPKIN_STEM));
    public static final Block PALE_PUMPKIN_STEM = register(PALE_PUMPKIN_STEM_KEY,
            settings -> new StemBlock(PALE_PUMPKIN_KEY, ATTACHED_PALE_PUMPKIN_STEM_KEY, MavesItems.PALE_PUMPKIN_SEEDS_KEY, settings),
            AbstractBlock.Settings.copy(Blocks.PUMPKIN_STEM));

    public static final Block RUBBER_LOG = register("rubber_log", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block RUBBER_WOOD = register("rubber_wood", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block STRIPPED_RUBBER_LOG = register("stripped_rubber_log", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_RUBBER_WOOD = register("stripped_rubber_wood", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block RUBBER_LEAVES = register("rubber_leaves", LeavesBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES));
    public static final Block RUBBER_SAPLING = register(RUBBER_SAPLING_KEY,
            settings -> new MavesSaplingBlock(MavesSaplingGenerators.RUBBER_TREE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Block POTTED_RUBBER_SAPLING = register("potted_rubber_sapling",
            settings -> new FlowerPotBlock(MavesBlocks.RUBBER_SAPLING, settings),
            AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING));
    public static final Block RUBBER_PLANKS = register("rubber_planks",
            AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));
    public static final Block RUBBER_BUTTON = register("rubber_button",
            settings -> new ButtonBlock(RUBBER, 30, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_BUTTON));
    public static final Block RUBBER_DOOR = register("rubber_door",
            settings -> new DoorBlock(RUBBER, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque());
    public static final Block RUBBER_FENCE = register("rubber_fence", FenceBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE));
    public static final Block RUBBER_FENCE_GATE = register("rubber_fence_gate",
            settings -> new FenceGateBlock(RUBBER_TYPE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE));
    public static final Block RUBBER_PRESSURE_PLATE = register("rubber_pressure_plate",
            settings -> new PressurePlateBlock(RUBBER, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE));
    public static final Block RUBBER_SLAB = register("rubber_slab", SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_SLAB));
    public static final Block RUBBER_STAIRS = register("rubber_stairs",
            settings -> new StairsBlock(RUBBER_PLANKS.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.OAK_STAIRS));
    public static final Block RUBBER_TRAPDOOR = register("rubber_trapdoor",
            settings -> new TrapdoorBlock(RUBBER, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).nonOpaque());
    public static final Block RUBBER_SIGN = register(RUBBER_SIGN_KEY,
            settings -> new TerraformSignBlock(RUBBER_SIGN_TEXTURE_ID, settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, RUBBER_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_SIGN));
    public static final Block RUBBER_WALL_SIGN = register(RUBBER_WALL_SIGN_KEY,
            settings -> new TerraformWallSignBlock(RUBBER_SIGN_TEXTURE_ID, settings.lootTable(RUBBER_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK, RUBBER_WALL_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN));
    public static final Block RUBBER_HANGING_SIGN = register(RUBBER_HANGING_SIGN_KEY,
            settings -> new TerraformHangingSignBlock(RUBBER_HANGING_SIGN_TEXTURE_ID, RUBBER_GUI_SIGN_TEXTURE_ID, settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, RUBBER_HANGING_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN));
    public static final Block RUBBER_WALL_HANGING_SIGN = register(RUBBER_WALL_HANGING_SIGN_KEY,
            settings -> new TerraformWallHangingSignBlock(RUBBER_HANGING_SIGN_TEXTURE_ID, RUBBER_GUI_SIGN_TEXTURE_ID, settings.lootTable(RUBBER_HANGING_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK, RUBBER_WALL_HANGING_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN));

    public static final Block WILLOW_LOG = register("willow_log", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block WILLOW_WOOD = register("willow_wood", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block STRIPPED_WILLOW_LOG = register("stripped_willow_log", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_WILLOW_WOOD = register("stripped_willow_wood", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block WILLOW_LEAVES = register("willow_leaves", LeavesBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES));
    public static final Block WILLOW_SAPLING = register(WILLOW_SAPLING_KEY,
            settings -> new MavesSaplingBlock(MavesSaplingGenerators.WILLOW_TREE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Block POTTED_WILLOW_SAPLING = register("potted_willow_sapling",
            settings -> new FlowerPotBlock(MavesBlocks.WILLOW_SAPLING, settings),
            AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING));
    public static final Block WILLOW_PLANKS = register("willow_planks",
            AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));
    public static final Block WILLOW_BUTTON = register("willow_button",
            settings -> new ButtonBlock(WILLOW, 30, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_BUTTON));
    public static final Block WILLOW_DOOR = register("willow_door",
            settings -> new DoorBlock(WILLOW, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque());
    public static final Block WILLOW_FENCE = register("willow_fence", FenceBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE));
    public static final Block WILLOW_FENCE_GATE = register("willow_fence_gate",
            settings -> new FenceGateBlock(WILLOW_TYPE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE));
    public static final Block WILLOW_PRESSURE_PLATE = register("willow_pressure_plate",
            settings -> new PressurePlateBlock(WILLOW, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE));
    public static final Block WILLOW_SLAB = register("willow_slab", SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_SLAB));
    public static final Block WILLOW_STAIRS = register("willow_stairs",
            settings -> new StairsBlock(WILLOW_PLANKS.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.OAK_STAIRS));
    public static final Block WILLOW_TRAPDOOR = register("willow_trapdoor",
            settings -> new TrapdoorBlock(WILLOW, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).nonOpaque());
    public static final Block WILLOW_SIGN = register(WILLOW_SIGN_KEY,
            settings -> new TerraformSignBlock(WILLOW_SIGN_TEXTURE_ID, settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, WILLOW_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_SIGN));
    public static final Block WILLOW_WALL_SIGN = register(WILLOW_WALL_SIGN_KEY,
            settings -> new TerraformWallSignBlock(WILLOW_SIGN_TEXTURE_ID, settings.lootTable(WILLOW_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK, WILLOW_WALL_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN));
    public static final Block WILLOW_HANGING_SIGN = register(WILLOW_HANGING_SIGN_KEY,
            settings -> new TerraformHangingSignBlock(WILLOW_HANGING_SIGN_TEXTURE_ID, WILLOW_GUI_SIGN_TEXTURE_ID, settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, WILLOW_HANGING_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN));
    public static final Block WILLOW_WALL_HANGING_SIGN = register(WILLOW_WALL_HANGING_SIGN_KEY,
            settings -> new TerraformWallHangingSignBlock(WILLOW_HANGING_SIGN_TEXTURE_ID, WILLOW_GUI_SIGN_TEXTURE_ID, settings.lootTable(WILLOW_HANGING_SIGN.getLootTableKey()).registryKey(RegistryKey.of(RegistryKeys.BLOCK, WILLOW_WALL_HANGING_SIGN_ID))),
            AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN));

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



    private static RegistryKey<Block> of(String id) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, id));
    }

    public static Block register(RegistryKey<Block> key, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = (Block)factory.apply(settings.registryKey(key));
        return Registry.register(Registries.BLOCK, key, block);
    }

    public static Block register(RegistryKey<Block> key, AbstractBlock.Settings settings) {
        return register(key, Block::new, settings);
    }

    private static RegistryKey<Block> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, id));
    }

    private static Block register(String id, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return register(keyOf(id), factory, settings);
    }

    private static Block register(String id, AbstractBlock.Settings settings) {
        return register(id, Block::new, settings);
    }

    static {
        for (Block block : Registries.BLOCK) {
            for (BlockState blockState : block.getStateManager().getStates()) {
                Block.STATE_IDS.add(blockState);
                blockState.initShapeCache();
            }
        }
    }

    public static void registerMavesBlocks() {
        MavesUtilitiesMod.LOGGER.info("Registering Mave's Blocks for " + MavesUtilitiesMod.MOD_ID);


    }
}