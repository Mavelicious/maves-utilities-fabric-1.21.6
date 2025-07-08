package com.mavesutilities.item;

import com.mavesutilities.MavesUtilitiesMod;
import com.mavesutilities.block.MavesBlocks;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.minecraft.block.Block;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.EquippableComponent;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MavesItems {

    public static final Identifier APPLE_TREE = Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree");
    public static final Identifier AZALEA = Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea");
    public static final Identifier CACAO_TREE = Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree");
    public static final Identifier HANGING_BLACK_WIDOW = Identifier.of(MavesUtilitiesMod.MOD_ID, "hanging_black_widow");
    public static final Identifier RUBBER = Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber");
    public static final Identifier WILLOW = Identifier.of(MavesUtilitiesMod.MOD_ID, "willow");

    public static final RegistryKey<Item> PALE_PUMPKIN_SEEDS_KEY = of("pale_pumpkin_seeds");

    //Blocks

    public static final Item OAK_FLOWERING_LEAVES = register(MavesBlocks.OAK_FLOWERING_LEAVES);
    public static final Item JUNGLE_FLOWERING_LEAVES = register(MavesBlocks.JUNGLE_FLOWERING_LEAVES);
    public static final Item ACACIA_FLOWERED_LEAVES = register(MavesBlocks.ACACIA_FLOWERED_LEAVES);
    public static final Item DARK_OAK_FLOWERING_LEAVES = register(MavesBlocks.DARK_OAK_FLOWERING_LEAVES);
    public static final Item CHERRY_FLOWERING_LEAVES = register(MavesBlocks.CHERRY_FLOWERING_LEAVES);
    public static final Item PALE_OAK_FLOWERING_LEAVES = register(MavesBlocks.PALE_OAK_FLOWERING_LEAVES);

    public static final Item OAK_BLOCK = register(MavesBlocks.OAK_BLOCK);
    public static final Item SPRUCE_BLOCK = register(MavesBlocks.SPRUCE_BLOCK);
    public static final Item BIRCH_BLOCK = register(MavesBlocks.BIRCH_BLOCK);
    public static final Item JUNGLE_BLOCK = register(MavesBlocks.JUNGLE_BLOCK);
    public static final Item ACACIA_BLOCK = register(MavesBlocks.ACACIA_BLOCK);
    public static final Item DARK_OAK_BLOCK = register(MavesBlocks.DARK_OAK_BLOCK);
    public static final Item MANGROVE_BLOCK = register(MavesBlocks.MANGROVE_BLOCK);
    public static final Item CHERRY_BLOCK = register(MavesBlocks.CHERRY_BLOCK);
    public static final Item PALE_OAK_BLOCK = register(MavesBlocks.PALE_OAK_BLOCK);
    public static final Item CRIMSON_BLOCK = register(MavesBlocks.CRIMSON_BLOCK);
    public static final Item WARPED_BLOCK = register(MavesBlocks.WARPED_BLOCK);

    public static final Item APPLE_TREE_BLOCK = register(MavesBlocks.APPLE_TREE_BLOCK);
    public static final Item AZALEA_BLOCK = register(MavesBlocks.AZALEA_BLOCK);
    public static final Item CACAO_TREE_BLOCK = register(MavesBlocks.CACAO_TREE_BLOCK);
    public static final Item RUBBER_BLOCK = register(MavesBlocks.RUBBER_BLOCK);
    public static final Item WILLOW_BLOCK = register(MavesBlocks.WILLOW_BLOCK);

    public static final Item STRIPPED_OAK_BLOCK = register(MavesBlocks.STRIPPED_OAK_BLOCK);
    public static final Item STRIPPED_SPRUCE_BLOCK = register(MavesBlocks.STRIPPED_SPRUCE_BLOCK);
    public static final Item STRIPPED_BIRCH_BLOCK = register(MavesBlocks.STRIPPED_BIRCH_BLOCK);
    public static final Item STRIPPED_JUNGLE_BLOCK = register(MavesBlocks.STRIPPED_JUNGLE_BLOCK);
    public static final Item STRIPPED_ACACIA_BLOCK = register(MavesBlocks.STRIPPED_ACACIA_BLOCK);
    public static final Item STRIPPED_DARK_OAK_BLOCK = register(MavesBlocks.STRIPPED_DARK_OAK_BLOCK);
    public static final Item STRIPPED_MANGROVE_BLOCK = register(MavesBlocks.STRIPPED_MANGROVE_BLOCK);
    public static final Item STRIPPED_CHERRY_BLOCK = register(MavesBlocks.STRIPPED_CHERRY_BLOCK);
    public static final Item STRIPPED_PALE_OAK_BLOCK = register(MavesBlocks.STRIPPED_PALE_OAK_BLOCK);
    public static final Item STRIPPED_CRIMSON_BLOCK = register(MavesBlocks.STRIPPED_CRIMSON_BLOCK);
    public static final Item STRIPPED_WARPED_BLOCK = register(MavesBlocks.STRIPPED_WARPED_BLOCK);

    public static final Item STRIPPED_APPLE_TREE_BLOCK = register(MavesBlocks.STRIPPED_APPLE_TREE_BLOCK);
    public static final Item STRIPPED_AZALEA_BLOCK = register(MavesBlocks.STRIPPED_AZALEA_BLOCK);
    public static final Item STRIPPED_CACAO_TREE_BLOCK = register(MavesBlocks.STRIPPED_CACAO_TREE_BLOCK);
    public static final Item STRIPPED_RUBBER_BLOCK = register(MavesBlocks.STRIPPED_RUBBER_BLOCK);
    public static final Item STRIPPED_WILLOW_BLOCK = register(MavesBlocks.STRIPPED_WILLOW_BLOCK);

    public static final Item APPLE_TREE_LOG = register(MavesBlocks.APPLE_TREE_LOG);
    public static final Item APPLE_TREE_WOOD = register(MavesBlocks.APPLE_TREE_WOOD);
    public static final Item STRIPPED_APPLE_TREE_LOG = register(MavesBlocks.STRIPPED_APPLE_TREE_LOG);
    public static final Item STRIPPED_APPLE_TREE_WOOD = register(MavesBlocks.STRIPPED_APPLE_TREE_WOOD);
    public static final Item APPLE_TREE_LEAVES = register(MavesBlocks.APPLE_TREE_LEAVES);
    public static final Item APPLE_TREE_FLOWERING_LEAVES = register(MavesBlocks.APPLE_TREE_FLOWERING_LEAVES);
    public static final Item APPLE_TREE_FLOWERED_LEAVES = register(MavesBlocks.APPLE_TREE_FLOWERED_LEAVES);
    public static final Item APPLE_TREE_SAPLING = register(MavesBlocks.APPLE_TREE_SAPLING);
    public static final Item APPLE_TREE_PLANKS = register(MavesBlocks.APPLE_TREE_PLANKS);
    public static final Item APPLE_TREE_BUTTON = register(MavesBlocks.APPLE_TREE_BUTTON);
    public static final Item APPLE_TREE_DOOR = register(MavesBlocks.APPLE_TREE_DOOR, TallBlockItem::new);
    public static final Item APPLE_TREE_FENCE = register(MavesBlocks.APPLE_TREE_FENCE);
    public static final Item APPLE_TREE_FENCE_GATE = register(MavesBlocks.APPLE_TREE_FENCE_GATE);
    public static final Item APPLE_TREE_PRESSURE_PLATE = register(MavesBlocks.APPLE_TREE_PRESSURE_PLATE);
    public static final Item APPLE_TREE_SLAB = register(MavesBlocks.APPLE_TREE_SLAB);
    public static final Item APPLE_TREE_STAIRS = register(MavesBlocks.APPLE_TREE_STAIRS);
    public static final Item APPLE_TREE_TRAPDOOR = register(MavesBlocks.APPLE_TREE_TRAPDOOR);

    public static final Item AZALEA_STEM = register(MavesBlocks.AZALEA_STEM);
    public static final Item AZALEA_WOOD = register(MavesBlocks.AZALEA_WOOD);
    public static final Item STRIPPED_AZALEA_STEM = register(MavesBlocks.STRIPPED_AZALEA_STEM);
    public static final Item STRIPPED_AZALEA_WOOD = register(MavesBlocks.STRIPPED_AZALEA_WOOD);
    public static final Item AZALEA_PLANKS = register(MavesBlocks.AZALEA_PLANKS);
    public static final Item AZALEA_BUTTON = register(MavesBlocks.AZALEA_BUTTON);
    public static final Item AZALEA_DOOR = register(MavesBlocks.AZALEA_DOOR, TallBlockItem::new);
    public static final Item AZALEA_FENCE = register(MavesBlocks.AZALEA_FENCE);
    public static final Item AZALEA_FENCE_GATE = register(MavesBlocks.AZALEA_FENCE_GATE);
    public static final Item AZALEA_PRESSURE_PLATE = register(MavesBlocks.AZALEA_PRESSURE_PLATE);
    public static final Item AZALEA_SLAB = register(MavesBlocks.AZALEA_SLAB);
    public static final Item AZALEA_STAIRS = register(MavesBlocks.AZALEA_STAIRS);
    public static final Item AZALEA_TRAPDOOR = register(MavesBlocks.AZALEA_TRAPDOOR);

    public static final Item CACAO_TREE_LOG = register(MavesBlocks.CACAO_TREE_LOG);
    public static final Item CACAO_TREE_WOOD = register(MavesBlocks.CACAO_TREE_WOOD);
    public static final Item STRIPPED_CACAO_TREE_LOG = register(MavesBlocks.STRIPPED_CACAO_TREE_LOG);
    public static final Item STRIPPED_CACAO_TREE_WOOD = register(MavesBlocks.STRIPPED_CACAO_TREE_WOOD);
    public static final Item CACAO_TREE_LEAVES = register(MavesBlocks.CACAO_TREE_LEAVES);
    public static final Item CACAO_TREE_SAPLING = register(MavesBlocks.CACAO_TREE_SAPLING);
    public static final Item CACAO_TREE_PLANKS = register(MavesBlocks.CACAO_TREE_PLANKS);
    public static final Item CACAO_TREE_BUTTON = register(MavesBlocks.CACAO_TREE_BUTTON);
    public static final Item CACAO_TREE_DOOR = register(MavesBlocks.CACAO_TREE_DOOR, TallBlockItem::new);
    public static final Item CACAO_TREE_FENCE = register(MavesBlocks.CACAO_TREE_FENCE);
    public static final Item CACAO_TREE_FENCE_GATE = register(MavesBlocks.CACAO_TREE_FENCE_GATE);
    public static final Item CACAO_TREE_PRESSURE_PLATE = register(MavesBlocks.CACAO_TREE_PRESSURE_PLATE);
    public static final Item CACAO_TREE_SLAB = register(MavesBlocks.CACAO_TREE_SLAB);
    public static final Item CACAO_TREE_STAIRS = register(MavesBlocks.CACAO_TREE_STAIRS);
    public static final Item CACAO_TREE_TRAPDOOR = register(MavesBlocks.CACAO_TREE_TRAPDOOR);

    public static final Item HANGING_BLACK_WIDOW_STEM = register(MavesBlocks.HANGING_BLACK_WIDOW_STEM);
    public static final Item STRIPPED_HANGING_BLACK_WIDOW_STEM = register(MavesBlocks.STRIPPED_HANGING_BLACK_WIDOW_STEM);
    public static final Item HANGING_BLACK_WIDOW_LEAVES_TAIL = register(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_TAIL);
    public static final Item HANGING_BLACK_WIDOW_LEAVES_BODY = register(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_BODY);
    public static final Item HANGING_BLACK_WIDOW_LEAVES_HEAD = register(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_HEAD);
    public static final Item HANGING_BLACK_WIDOW_SAPLING = register(MavesBlocks.HANGING_BLACK_WIDOW_SAPLING);
    public static final Item HANGING_BLACK_WIDOW_BLOCK = register(MavesBlocks.HANGING_BLACK_WIDOW_BLOCK);
    public static final Item HANGING_BLACK_WIDOW_PLANKS = register(MavesBlocks.HANGING_BLACK_WIDOW_PLANKS);
    public static final Item HANGING_BLACK_WIDOW_MOSAIC = register(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC);
    public static final Item HANGING_BLACK_WIDOW_BUTTON = register(MavesBlocks.HANGING_BLACK_WIDOW_BUTTON);
    public static final Item HANGING_BLACK_WIDOW_DOOR = register(MavesBlocks.HANGING_BLACK_WIDOW_DOOR, TallBlockItem::new);
    public static final Item HANGING_BLACK_WIDOW_FENCE = register(MavesBlocks.HANGING_BLACK_WIDOW_FENCE);
    public static final Item HANGING_BLACK_WIDOW_FENCE_GATE = register(MavesBlocks.HANGING_BLACK_WIDOW_FENCE_GATE);
    public static final Item HANGING_BLACK_WIDOW_PRESSURE_PLATE = register(MavesBlocks.HANGING_BLACK_WIDOW_PRESSURE_PLATE);
    public static final Item HANGING_BLACK_WIDOW_SLAB = register(MavesBlocks.HANGING_BLACK_WIDOW_SLAB);
    public static final Item HANGING_BLACK_WIDOW_MOSAIC_SLAB = register(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC_SLAB);
    public static final Item HANGING_BLACK_WIDOW_STAIRS = register(MavesBlocks.HANGING_BLACK_WIDOW_STAIRS);
    public static final Item HANGING_BLACK_WIDOW_MOSAIC_STAIRS = register(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC_STAIRS);
    public static final Item HANGING_BLACK_WIDOW_TRAPDOOR = register(MavesBlocks.HANGING_BLACK_WIDOW_TRAPDOOR);

    public static final Item PALE_PUMPKIN = register(MavesBlocks.PALE_PUMPKIN);
    public static final Item CARVED_PALE_PUMPKIN = register(MavesBlocks.CARVED_PALE_PUMPKIN,
            (UnaryOperator<Item.Settings>)(settings -> settings.component(
                    DataComponentTypes.EQUIPPABLE,
                    EquippableComponent.builder(EquipmentSlot.HEAD).swappable(false).cameraOverlay(Identifier.ofVanilla("misc/pumpkinblur")).build()
            )));
    public static final Item PALE_JACK_O_LANTERN = register(MavesBlocks.PALE_JACK_O_LANTERN);

    public static final Item RUBBER_LOG = register(MavesBlocks.RUBBER_LOG);
    public static final Item RUBBER_WOOD = register(MavesBlocks.RUBBER_WOOD);
    public static final Item STRIPPED_RUBBER_LOG = register(MavesBlocks.STRIPPED_RUBBER_LOG);
    public static final Item STRIPPED_RUBBER_WOOD = register(MavesBlocks.STRIPPED_RUBBER_WOOD);
    public static final Item RUBBER_LEAVES = register(MavesBlocks.RUBBER_LEAVES);
    public static final Item RUBBER_SAPLING = register(MavesBlocks.RUBBER_SAPLING);
    public static final Item RUBBER_PLANKS = register(MavesBlocks.RUBBER_PLANKS);
    public static final Item RUBBER_BUTTON = register(MavesBlocks.RUBBER_BUTTON);
    public static final Item RUBBER_DOOR = register(MavesBlocks.RUBBER_DOOR, TallBlockItem::new);
    public static final Item RUBBER_FENCE = register(MavesBlocks.RUBBER_FENCE);
    public static final Item RUBBER_FENCE_GATE = register(MavesBlocks.RUBBER_FENCE_GATE);
    public static final Item RUBBER_PRESSURE_PLATE = register(MavesBlocks.RUBBER_PRESSURE_PLATE);
    public static final Item RUBBER_SLAB = register(MavesBlocks.RUBBER_SLAB);
    public static final Item RUBBER_STAIRS = register(MavesBlocks.RUBBER_STAIRS);
    public static final Item RUBBER_TRAPDOOR = register(MavesBlocks.RUBBER_TRAPDOOR);

    public static final Item WILLOW_LOG = register(MavesBlocks.WILLOW_LOG);
    public static final Item WILLOW_WOOD = register(MavesBlocks.WILLOW_WOOD);
    public static final Item STRIPPED_WILLOW_LOG = register(MavesBlocks.STRIPPED_WILLOW_LOG);
    public static final Item STRIPPED_WILLOW_WOOD = register(MavesBlocks.STRIPPED_WILLOW_WOOD);
    public static final Item WILLOW_LEAVES = register(MavesBlocks.WILLOW_LEAVES);
    public static final Item WILLOW_SAPLING = register(MavesBlocks.WILLOW_SAPLING);
    public static final Item WILLOW_PLANKS = register(MavesBlocks.WILLOW_PLANKS);
    public static final Item WILLOW_BUTTON = register(MavesBlocks.WILLOW_BUTTON);
    public static final Item WILLOW_DOOR = register(MavesBlocks.WILLOW_DOOR, TallBlockItem::new);
    public static final Item WILLOW_FENCE = register(MavesBlocks.WILLOW_FENCE);
    public static final Item WILLOW_FENCE_GATE = register(MavesBlocks.WILLOW_FENCE_GATE);
    public static final Item WILLOW_PRESSURE_PLATE = register(MavesBlocks.WILLOW_PRESSURE_PLATE);
    public static final Item WILLOW_SLAB = register(MavesBlocks.WILLOW_SLAB);
    public static final Item WILLOW_STAIRS = register(MavesBlocks.WILLOW_STAIRS);
    public static final Item WILLOW_TRAPDOOR = register(MavesBlocks.WILLOW_TRAPDOOR);

    //Items

    public static final Item OAK_BARK = register("oak_bark");
    public static final Item SPRUCE_BARK = register("spruce_bark");
    public static final Item BIRCH_BARK = register("birch_bark");
    public static final Item JUNGLE_BARK = register("jungle_bark");
    public static final Item ACACIA_BARK = register("acacia_bark");
    public static final Item DARK_OAK_BARK = register("dark_oak_bark");
    public static final Item MANGROVE_BARK = register("mangrove_bark");
    public static final Item CHERRY_BARK = register("cherry_bark");
    public static final Item PALE_OAK_BARK = register("pale_oak_bark");
    public static final Item APPLE_TREE_BARK = register("apple_tree_bark");
    public static final Item AZALEA_BARK = register("azalea_bark");
    public static final Item CACAO_TREE_BARK = register("cacao_tree_bark");
    public static final Item HANGING_BLACK_WIDOW_BARK = register("hanging_black_widow_bark");
    public static final Item RUBBER_BARK = register("rubber_bark");
    public static final Item WILLOW_BARK = register("willow_bark");
    public static final Item CRIMSON_BARK = register("crimson_bark");
    public static final Item WARPED_BARK = register("warped_bark");

    public static final Item OAK_SLIVER = register("oak_sliver");
    public static final Item STRIPPED_OAK_SLIVER = register("stripped_oak_sliver");
    public static final Item SPRUCE_SLIVER = register("spruce_sliver");
    public static final Item STRIPPED_SPRUCE_SLIVER = register("stripped_spruce_sliver");
    public static final Item BIRCH_SLIVER = register("birch_sliver");
    public static final Item STRIPPED_BIRCH_SLIVER = register("stripped_birch_sliver");
    public static final Item JUNGLE_SLIVER = register("jungle_sliver");
    public static final Item STRIPPED_JUNGLE_SLIVER = register("stripped_jungle_sliver");
    public static final Item ACACIA_SLIVER = register("acacia_sliver");
    public static final Item STRIPPED_ACACIA_SLIVER = register("stripped_acacia_sliver");
    public static final Item DARK_OAK_SLIVER = register("dark_oak_sliver");
    public static final Item STRIPPED_DARK_OAK_SLIVER = register("stripped_dark_oak_sliver");
    public static final Item MANGROVE_SLIVER = register("mangrove_sliver");
    public static final Item STRIPPED_MANGROVE_SLIVER = register("stripped_mangrove_sliver");
    public static final Item CHERRY_SLIVER = register("cherry_sliver");
    public static final Item STRIPPED_CHERRY_SLIVER = register("stripped_cherry_sliver");
    public static final Item PALE_OAK_SLIVER = register("pale_oak_sliver");
    public static final Item STRIPPED_PALE_OAK_SLIVER = register("stripped_pale_oak_sliver");
    public static final Item CRIMSON_SLIVER = register("crimson_sliver");
    public static final Item STRIPPED_CRIMSON_SLIVER = register("stripped_crimson_sliver");
    public static final Item WARPED_SLIVER = register("warped_sliver");
    public static final Item STRIPPED_WARPED_SLIVER = register("stripped_warped_sliver");

    public static final Item APPLE_TREE_SLIVER = register("apple_tree_sliver");
    public static final Item STRIPPED_APPLE_TREE_SLIVER = register("stripped_apple_tree_sliver");
    public static final Item AZALEA_SLIVER = register("azalea_sliver");
    public static final Item STRIPPED_AZALEA_SLIVER = register("stripped_azalea_sliver");
    public static final Item CACAO_TREE_SLIVER = register("cacao_tree_sliver");
    public static final Item STRIPPED_CACAO_TREE_SLIVER = register("stripped_cacao_tree_sliver");
    public static final Item RUBBER_SLIVER = register("rubber_sliver");
    public static final Item STRIPPED_RUBBER_SLIVER = register("stripped_rubber_sliver");
    public static final Item WILLOW_SLIVER = register("willow_sliver");
    public static final Item STRIPPED_WILLOW_SLIVER = register("stripped_willow_sliver");

    public static final Item GREEN_APPLE = register("green_apple",
            new Item.Settings().food(MavesFoods.GREEN_APPLE_FOOD_COMPONENT));
    public static final Item PUMPKIN_SLICE = register("pumpkin_slice",
            new Item.Settings().food(MavesFoods.PUMPKIN_SLICE_FOOD_COMPONENT));
    public static final Item PALE_PUMPKIN_SLICE = register("pale_pumpkin_slice",
            new Item.Settings().food(MavesFoods.PALE_PUMPKIN_SLICE_FOOD_COMPONENT));
    public static final Item CHERRIES = register("cherries",
            new Item.Settings().food(MavesFoods.CHERRIES_FOOD_COMPONENT));
    public static final Item WILD_BERRIES_BLUE = register("wild_berries_blue",
            new Item.Settings().food(MavesFoods.WILD_BERRIES_BLUE_FOOD_COMPONENT));
    public static final Item WILD_BERRIES_GREEN = register("wild_berries_green",
            new Item.Settings().food(MavesFoods.WILD_BERRIES_GREEN_FOOD_COMPONENT));
    public static final Item WILD_BERRIES_YELLOW = register("wild_berries_yellow",
            new Item.Settings().food(MavesFoods.WILD_BERRIES_YELLOW_FOOD_COMPONENT));
    public static final Item MILK_CHOCOLATE = register("milk_chocolate",
            new Item.Settings().maxCount(1).food(MavesFoods.MILK_CHOCOLATE_FOOD_COMPONENT).useRemainder(Items.BOWL));
    public static final Item WHITE_CHOCOLATE = register("white_chocolate",
            new Item.Settings().maxCount(1).food(MavesFoods.WHITE_CHOCOLATE_FOOD_COMPONENT).useRemainder(Items.BOWL));
    public static final Item DARK_CHOCOLATE = register("dark_chocolate",
            new Item.Settings().maxCount(1).food(MavesFoods.DARK_CHOCOLATE_FOOD_COMPONENT).useRemainder(Items.BOWL));
    public static final Item BLACK_WIDOW_BERRIES = register("black_widow_berries",
            new Item.Settings().food(MavesFoods.BLACK_WIDOW_BERRIES_FOOD_COMPONENT));

    public static final Item ACORN = register("acorn");
    public static final Item DARK_ACORN = register("dark_acorn");
    public static final Item PALE_ACORN = register("pale_acorn");
    public static final Item SPRUCE_CONE = register("spruce_cone");
    public static final Item PALE_PUMPKIN_SEEDS = register(PALE_PUMPKIN_SEEDS_KEY,
            createBlockItemWithUniqueName(MavesBlocks.PALE_PUMPKIN_STEM));

    public static final Item HANGING_BLACK_WIDOW_BRANCH = register("hanging_black_widow_branch");
    public static final Item LATEX_BOTTLE = register("latex_bottle", new Item.Settings()
                    .recipeRemainder(Items.GLASS_BOTTLE).maxCount(16));

    public static final Item ACACIA_BLOSSOM = register("acacia_blossom");
    public static final Item APPLE_BLOSSOM = register("apple_blossom");
    public static final Item AZALEA_BLOSSOM = register("azalea_blossom");

    public static final Item APPLE_TREE_SIGN = register(MavesBlocks.APPLE_TREE_SIGN,
            (block, settings) -> new SignItem(block, MavesBlocks.APPLE_TREE_WALL_SIGN, settings),
            new Item.Settings().maxCount(16));
    public static final Item APPLE_TREE_HANGING_SIGN = register(MavesBlocks.APPLE_TREE_HANGING_SIGN,
            (block, settings) -> new HangingSignItem(block, MavesBlocks.APPLE_TREE_WALL_HANGING_SIGN, settings),
            new Item.Settings().maxCount(16));
    public static final Item AZALEA_SIGN = register(MavesBlocks.AZALEA_SIGN,
            (block, settings) -> new SignItem(block, MavesBlocks.AZALEA_WALL_SIGN, settings),
            new Item.Settings().maxCount(16));
    public static final Item AZALEA_HANGING_SIGN = register(MavesBlocks.AZALEA_HANGING_SIGN,
            (block, settings) -> new HangingSignItem(block, MavesBlocks.AZALEA_WALL_HANGING_SIGN, settings),
            new Item.Settings().maxCount(16));
    public static final Item CACAO_TREE_SIGN = register(MavesBlocks.CACAO_TREE_SIGN,
            (block, settings) -> new SignItem(block, MavesBlocks.CACAO_TREE_WALL_SIGN, settings),
            new Item.Settings().maxCount(16));
    public static final Item CACAO_TREE_HANGING_SIGN = register(MavesBlocks.CACAO_TREE_HANGING_SIGN,
            (block, settings) -> new HangingSignItem(block, MavesBlocks.CACAO_TREE_WALL_HANGING_SIGN, settings),
            new Item.Settings().maxCount(16));
    public static final Item HANGING_BLACK_WIDOW_SIGN = register(MavesBlocks.HANGING_BLACK_WIDOW_SIGN,
            (block, settings) -> new SignItem(block, MavesBlocks.HANGING_BLACK_WIDOW_WALL_SIGN, settings),
            new Item.Settings().maxCount(16));
    public static final Item HANGING_BLACK_WIDOW_HANGING_SIGN = register(MavesBlocks.HANGING_BLACK_WIDOW_HANGING_SIGN,
            (block, settings) -> new HangingSignItem(block, MavesBlocks.HANGING_BLACK_WIDOW_WALL_HANGING_SIGN, settings),
            new Item.Settings().maxCount(16));
    public static final Item RUBBER_SIGN = register(MavesBlocks.RUBBER_SIGN,
            (block, settings) -> new SignItem(block, MavesBlocks.RUBBER_WALL_SIGN, settings),
            new Item.Settings().maxCount(16));
    public static final Item RUBBER_HANGING_SIGN = register(MavesBlocks.RUBBER_HANGING_SIGN,
            (block, settings) -> new HangingSignItem(block, MavesBlocks.RUBBER_WALL_HANGING_SIGN, settings),
            new Item.Settings().maxCount(16));
    public static final Item WILLOW_SIGN = register(MavesBlocks.WILLOW_SIGN,
            (block, settings) -> new SignItem(block, MavesBlocks.WILLOW_WALL_SIGN, settings),
            new Item.Settings().maxCount(16));
    public static final Item WILLOW_HANGING_SIGN = register(MavesBlocks.WILLOW_HANGING_SIGN,
            (block, settings) -> new HangingSignItem(block, MavesBlocks.WILLOW_WALL_HANGING_SIGN, settings),
            new Item.Settings().maxCount(16));

    public static final Item APPLE_TREE_BOAT = TerraformBoatItemHelper
            .registerBoatItem(APPLE_TREE, false, false);
    public static final Item APPLE_TREE_CHEST_BOAT = TerraformBoatItemHelper
            .registerBoatItem(APPLE_TREE, true, false);
    public static final Item AZALEA_BOAT = TerraformBoatItemHelper
            .registerBoatItem(AZALEA, false, false);
    public static final Item AZALEA_CHEST_BOAT = TerraformBoatItemHelper
            .registerBoatItem(AZALEA, true, false);
    public static final Item CACAO_TREE_BOAT = TerraformBoatItemHelper
            .registerBoatItem(CACAO_TREE, false, false);
    public static final Item CACAO_TREE_CHEST_BOAT = TerraformBoatItemHelper
            .registerBoatItem(CACAO_TREE, true, false);
    public static final Item HANGING_BLACK_WIDOW_RAFT = TerraformBoatItemHelper
            .registerBoatItem(HANGING_BLACK_WIDOW, false, true);
    public static final Item HANGING_BLACK_WIDOW_CHEST_RAFT = TerraformBoatItemHelper
            .registerBoatItem(HANGING_BLACK_WIDOW, true, true);
    public static final Item RUBBER_BOAT = TerraformBoatItemHelper
            .registerBoatItem(RUBBER, false, false);
    public static final Item RUBBER_CHEST_BOAT = TerraformBoatItemHelper
            .registerBoatItem(RUBBER, true, false);
    public static final Item WILLOW_BOAT = TerraformBoatItemHelper
            .registerBoatItem(WILLOW, false, false);
    public static final Item WILLOW_CHEST_BOAT = TerraformBoatItemHelper
            .registerBoatItem(WILLOW, true, false);



    private static RegistryKey<Item> of(String id) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MavesUtilitiesMod.MOD_ID, id));
    }

    private static Function<Item.Settings, Item> createBlockItemWithUniqueName(Block block) {
        return settings -> new BlockItem(block, settings.useItemPrefixedTranslationKey());
    }

    private static RegistryKey<Item> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MavesUtilitiesMod.MOD_ID, id));
    }

    private static RegistryKey<Item> keyOf(RegistryKey<Block> blockKey) {
        return RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());
    }

    public static Item register(Block block) {
        return register(block, BlockItem::new);
    }

    public static Item register(Block block, Item.Settings settings) {
        return register(block, BlockItem::new, settings);
    }

    public static Item register(Block block, UnaryOperator<Item.Settings> settingsOperator) {
        return register(block, (BiFunction<Block, Item.Settings, Item>)((blockx, settings) -> new BlockItem(blockx, (Item.Settings)settingsOperator.apply(settings))));
    }

    public static Item register(Block block, Block... blocks) {
        Item item = register(block);

        for (Block block2 : blocks) {
            Item.BLOCK_ITEMS.put(block2, item);
        }

        return item;
    }

    public static Item register(Block block, BiFunction<Block, Item.Settings, Item> factory) {
        return register(block, factory, new Item.Settings());
    }

    @SuppressWarnings("deprecation")
    public static Item register(Block block, BiFunction<Block, Item.Settings, Item> factory, Item.Settings settings) {
        return register(
                keyOf(block.getRegistryEntry().registryKey()), itemSettings -> (Item)factory.apply(block, itemSettings), settings.useBlockPrefixedTranslationKey()
        );
    }

    public static Item register(String id, Function<Item.Settings, Item> factory) {
        return register(keyOf(id), factory, new Item.Settings());
    }

    public static Item register(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        return register(keyOf(id), factory, settings);
    }

    public static Item register(String id, Item.Settings settings) {
        return register(keyOf(id), Item::new, settings);
    }

    public static Item register(String id) {
        return register(keyOf(id), Item::new, new Item.Settings());
    }

    public static Item register(RegistryKey<Item> key, Function<Item.Settings, Item> factory) {
        return register(key, factory, new Item.Settings());
    }

    public static Item register(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = (Item)factory.apply(settings.registryKey(key));
        if (item instanceof BlockItem blockItem) {
            blockItem.appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
    }

    public static void registerMavesItems() {
        MavesUtilitiesMod.LOGGER.info("Registering Mave's Items for " + MavesUtilitiesMod.MOD_ID);
    }
}