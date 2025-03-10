package com.mavesutilities.item;

import com.mavesutilities.MavesUtilitiesMod;
import com.mavesutilities.block.MavesBlocks;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.minecraft.block.Block;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.EquippableComponent;
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
    public static final Identifier RUBBER = Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber");
    public static final Identifier WILLOW = Identifier.of(MavesUtilitiesMod.MOD_ID, "willow");

    public static final RegistryKey<Item> PALE_PUMPKIN_SEEDS_KEY = of("pale_pumpkin_seeds");

    public static final Item OAK_FLOWERING_LEAVES = register(MavesBlocks.OAK_FLOWERING_LEAVES);
    public static final Item BIRCH_FLOWERING_LEAVES = register(MavesBlocks.BIRCH_FLOWERING_LEAVES);
    public static final Item JUNGLE_FLOWERING_LEAVES = register(MavesBlocks.JUNGLE_FLOWERING_LEAVES);
    public static final Item ACACIA_FLOWERING_LEAVES = register(MavesBlocks.ACACIA_FLOWERING_LEAVES);
    public static final Item ACACIA_FLOWERED_LEAVES = register(MavesBlocks.ACACIA_FLOWERED_LEAVES);
    public static final Item DARK_OAK_FLOWERING_LEAVES = register(MavesBlocks.DARK_OAK_FLOWERING_LEAVES);
    public static final Item CHERRY_FLOWERING_LEAVES = register(MavesBlocks.CHERRY_FLOWERING_LEAVES);
    public static final Item PALE_OAK_FLOWERING_LEAVES = register(MavesBlocks.PALE_OAK_FLOWERING_LEAVES);

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
    public static final Item RUBBER_BARK = register("rubber_bark");
    public static final Item WILLOW_BARK = register("willow_bark");
    public static final Item CRIMSON_BARK = register("crimson_bark");
    public static final Item WARPED_BARK = register("warped_bark");

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

    public static final Item ACORN = register("acorn");
    public static final Item DARK_ACORN = register("dark_acorn");
    public static final Item PALE_ACORN = register("pale_acorn");
    public static final Item ACACIA_POD = register("acacia_pod");
    public static final Item SPRUCE_CONE = register("spruce_cone");
    public static final Item PALE_PUMPKIN_SEEDS = register(PALE_PUMPKIN_SEEDS_KEY,
            createBlockItemWithUniqueName(MavesBlocks.PALE_PUMPKIN_STEM));

    public static final Item ACACIA_BLOSSOM = register("acacia_blossom");
    public static final Item APPLE_BLOSSOM = register("apple_blossom");
    public static final Item AZALEA_BLOSSOM = register("azalea_blossom");
    public static final Item BIRCH_CATKINS = register("birch_catkins");

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
            .registerBoatItem(APPLE_TREE, false);
    public static final Item APPLE_TREE_CHEST_BOAT = TerraformBoatItemHelper
            .registerBoatItem(APPLE_TREE, true);
    public static final Item AZALEA_BOAT = TerraformBoatItemHelper
            .registerBoatItem(AZALEA, false);
    public static final Item AZALEA_CHEST_BOAT = TerraformBoatItemHelper
            .registerBoatItem(AZALEA, true);
    public static final Item CACAO_TREE_BOAT = TerraformBoatItemHelper
            .registerBoatItem(CACAO_TREE, false);
    public static final Item CACAO_TREE_CHEST_BOAT = TerraformBoatItemHelper
            .registerBoatItem(CACAO_TREE, true);
    public static final Item RUBBER_BOAT = TerraformBoatItemHelper
            .registerBoatItem(RUBBER, false);
    public static final Item RUBBER_CHEST_BOAT = TerraformBoatItemHelper
            .registerBoatItem(RUBBER, true);
    public static final Item WILLOW_BOAT = TerraformBoatItemHelper
            .registerBoatItem(WILLOW, false);
    public static final Item WILLOW_CHEST_BOAT = TerraformBoatItemHelper
            .registerBoatItem(WILLOW, true);



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