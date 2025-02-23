package com.mavesutilities.item;

import com.mavesutilities.MavesUtilitiesMod;
import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItemGroups;
import com.mavesutilities.util.MavesTags;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class MavesItems {

    public static final Identifier APPLE_TREE = Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree");
    public static final Identifier AZALEA = Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea");
    public static final Identifier CACAO_TREE = Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree");
    public static final Identifier RUBBER = Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber");
    public static final Identifier WILLOW = Identifier.of(MavesUtilitiesMod.MOD_ID, "willow");

    public static final RegistryKey<Item> OAK_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "oak_bark"));
    public static final RegistryKey<Item> SPRUCE_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "spruce_bark"));
    public static final RegistryKey<Item> BIRCH_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "birch_bark"));
    public static final RegistryKey<Item> JUNGLE_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "jungle_bark"));
    public static final RegistryKey<Item> ACACIA_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "acacia_bark"));
    public static final RegistryKey<Item> DARK_OAK_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "dark_oak_bark"));
    public static final RegistryKey<Item> MANGROVE_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "mangrove_bark"));
    public static final RegistryKey<Item> CHERRY_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cherry_bark"));
    public static final RegistryKey<Item> PALE_OAK_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "pale_oak_bark"));
    public static final RegistryKey<Item> APPLE_TREE_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_bark"));
    public static final RegistryKey<Item> AZALEA_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_bark"));
    public static final RegistryKey<Item> CACAO_TREE_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_bark"));
    public static final RegistryKey<Item> RUBBER_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_bark"));
    public static final RegistryKey<Item> WILLOW_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_bark"));
    public static final RegistryKey<Item> CRIMSON_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "crimson_bark"));
    public static final RegistryKey<Item> WARPED_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "warped_bark"));

    public static final RegistryKey<Item> GREEN_APPLE_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "green_apple"));
    public static final RegistryKey<Item> PUMPKIN_SLICE_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "pumpkin_slice"));
    public static final RegistryKey<Item> CHERRIES_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cherries"));
    public static final RegistryKey<Item> WILD_BERRIES_BLUE_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "wild_berries_blue"));
    public static final RegistryKey<Item> WILD_BERRIES_GREEN_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "wild_berries_green"));
    public static final RegistryKey<Item> WILD_BERRIES_YELLOW_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "wild_berries_yellow"));
    public static final RegistryKey<Item> MILK_CHOCOLATE_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "milk_chocolate"));
    public static final RegistryKey<Item> WHITE_CHOCOLATE_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "white_chocolate"));
    public static final RegistryKey<Item> DARK_CHOCOLATE_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "dark_chocolate"));

    public static final RegistryKey<Item> ACORN_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "acorn"));
    public static final RegistryKey<Item> DARK_ACORN_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "dark_acorn"));
    public static final RegistryKey<Item> PALE_ACORN_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "pale_acorn"));

    public static final RegistryKey<Item> APPLE_TREE_SIGN_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_sign"));
    public static final RegistryKey<Item> APPLE_TREE_HANGING_SIGN_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_hanging_sign"));
    public static final RegistryKey<Item> AZALEA_SIGN_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_sign"));
    public static final RegistryKey<Item> AZALEA_HANGING_SIGN_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_hanging_sign"));
    public static final RegistryKey<Item> CACAO_TREE_SIGN_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_sign"));
    public static final RegistryKey<Item> CACAO_TREE_HANGING_SIGN_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cacao_tree_hanging_sign"));
    public static final RegistryKey<Item> RUBBER_SIGN_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_sign"));
    public static final RegistryKey<Item> RUBBER_HANGING_SIGN_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_hanging_sign"));
    public static final RegistryKey<Item> WILLOW_SIGN_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_sign"));
    public static final RegistryKey<Item> WILLOW_HANGING_SIGN_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_hanging_sign"));



    public static final Item OAK_BARK = registerItem(
            new Item(new Item.Settings().registryKey(OAK_BARK_KEY)), OAK_BARK_KEY);
    public static final Item SPRUCE_BARK = registerItem(
            new Item(new Item.Settings().registryKey(SPRUCE_BARK_KEY)), SPRUCE_BARK_KEY);
    public static final Item BIRCH_BARK = registerItem(
            new Item(new Item.Settings().registryKey(BIRCH_BARK_KEY)), BIRCH_BARK_KEY);
    public static final Item JUNGLE_BARK = registerItem(
            new Item(new Item.Settings().registryKey(JUNGLE_BARK_KEY)), JUNGLE_BARK_KEY);
    public static final Item ACACIA_BARK = registerItem(
            new Item(new Item.Settings().registryKey(ACACIA_BARK_KEY)), ACACIA_BARK_KEY);
    public static final Item DARK_OAK_BARK = registerItem(
            new Item(new Item.Settings().registryKey(DARK_OAK_BARK_KEY)), DARK_OAK_BARK_KEY);
    public static final Item MANGROVE_BARK = registerItem(
            new Item(new Item.Settings().registryKey(MANGROVE_BARK_KEY)), MANGROVE_BARK_KEY);
    public static final Item CHERRY_BARK = registerItem(
            new Item(new Item.Settings().registryKey(CHERRY_BARK_KEY)), CHERRY_BARK_KEY);
    public static final Item PALE_OAK_BARK = registerItem(
            new Item(new Item.Settings().registryKey(PALE_OAK_BARK_KEY)), PALE_OAK_BARK_KEY);
    public static final Item APPLE_TREE_BARK = registerItem(
            new Item(new Item.Settings().registryKey(APPLE_TREE_BARK_KEY)), APPLE_TREE_BARK_KEY);
    public static final Item AZALEA_BARK = registerItem(
            new Item(new Item.Settings().registryKey(AZALEA_BARK_KEY)), AZALEA_BARK_KEY);
    public static final Item CACAO_TREE_BARK = registerItem(
            new Item(new Item.Settings().registryKey(CACAO_TREE_BARK_KEY)), CACAO_TREE_BARK_KEY);
    public static final Item RUBBER_BARK = registerItem(
            new Item(new Item.Settings().registryKey(RUBBER_BARK_KEY)), RUBBER_BARK_KEY);
    public static final Item WILLOW_BARK = registerItem(
            new Item(new Item.Settings().registryKey(WILLOW_BARK_KEY)), WILLOW_BARK_KEY);
    public static final Item CRIMSON_BARK = registerItem(
            new Item(new Item.Settings().registryKey(CRIMSON_BARK_KEY)), CRIMSON_BARK_KEY);
    public static final Item WARPED_BARK = registerItem(
            new Item(new Item.Settings().registryKey(WARPED_BARK_KEY)), WARPED_BARK_KEY);


    public static final Item GREEN_APPLE = registerItem(
            new Item(new Item.Settings().registryKey(GREEN_APPLE_KEY).food(
                    MavesFoods.GREEN_APPLE_FOOD_COMPONENT)), GREEN_APPLE_KEY);
    public static final Item PUMPKIN_SLICE = registerItem(
            new Item(new Item.Settings().registryKey(PUMPKIN_SLICE_KEY).food(
                    MavesFoods.PUMPKIN_SLICE_FOOD_COMPONENT)), PUMPKIN_SLICE_KEY);
    public static final Item CHERRIES = registerItem(
            new Item(new Item.Settings().registryKey(CHERRIES_KEY).food(
                    MavesFoods.CHERRIES_FOOD_COMPONENT)), CHERRIES_KEY);
    public static final Item WILD_BERRIES_BLUE = registerItem(
            new Item(new Item.Settings().registryKey(WILD_BERRIES_BLUE_KEY).food(
                    MavesFoods.WILD_BERRIES_BLUE_FOOD_COMPONENT)), WILD_BERRIES_BLUE_KEY);
    public static final Item WILD_BERRIES_GREEN = registerItem(
            new Item(new Item.Settings().registryKey(WILD_BERRIES_GREEN_KEY).food(
                    MavesFoods.WILD_BERRIES_GREEN_FOOD_COMPONENT)), WILD_BERRIES_GREEN_KEY);
    public static final Item WILD_BERRIES_YELLOW = registerItem(
            new Item(new Item.Settings().registryKey(WILD_BERRIES_YELLOW_KEY).food(
                    MavesFoods.WILD_BERRIES_YELLOW_FOOD_COMPONENT)), WILD_BERRIES_YELLOW_KEY);
    public static final Item MILK_CHOCOLATE = registerItem(
            new Item(new Item.Settings().registryKey(MILK_CHOCOLATE_KEY).maxCount(1).food(
                    MavesFoods.MILK_CHOCOLATE_FOOD_COMPONENT).useRemainder(Items.BOWL)), MILK_CHOCOLATE_KEY);
    public static final Item WHITE_CHOCOLATE = registerItem(
            new Item(new Item.Settings().registryKey(WHITE_CHOCOLATE_KEY).maxCount(1).food(
                    MavesFoods.WHITE_CHOCOLATE_FOOD_COMPONENT).useRemainder(Items.BOWL)), WHITE_CHOCOLATE_KEY);
    public static final Item DARK_CHOCOLATE = registerItem(
            new Item(new Item.Settings().registryKey(DARK_CHOCOLATE_KEY).maxCount(1).food(
                    MavesFoods.DARK_CHOCOLATE_FOOD_COMPONENT).useRemainder(Items.BOWL)), DARK_CHOCOLATE_KEY);

    public static final Item ACORN = registerItem(
            new Item(new Item.Settings().registryKey(ACORN_KEY)), ACORN_KEY);
    public static final Item DARK_ACORN = registerItem(
            new Item(new Item.Settings().registryKey(DARK_ACORN_KEY)), DARK_ACORN_KEY);
    public static final Item PALE_ACORN = registerItem(
            new Item(new Item.Settings().registryKey(PALE_ACORN_KEY)), PALE_ACORN_KEY);

    public static final Item APPLE_TREE_SIGN = registerItem(
            new SignItem(MavesBlocks.APPLE_TREE_SIGN,
            MavesBlocks.APPLE_TREE_WALL_SIGN, new Item.Settings().maxCount(16).
            registryKey(RegistryKey.of(RegistryKeys.ITEM, MavesBlocks.APPLE_TREE_SIGN_ID))
            .useBlockPrefixedTranslationKey()), APPLE_TREE_SIGN_KEY);
    public static final Item APPLE_TREE_HANGING_SIGN = registerItem(
            new HangingSignItem(MavesBlocks.APPLE_TREE_HANGING_SIGN,
            MavesBlocks.APPLE_TREE_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, MavesBlocks.APPLE_TREE_HANGING_SIGN_ID))
            .useBlockPrefixedTranslationKey()), APPLE_TREE_HANGING_SIGN_KEY);
    public static final Item AZALEA_SIGN = registerItem(
            new SignItem(MavesBlocks.AZALEA_SIGN,
            MavesBlocks.AZALEA_WALL_SIGN, new Item.Settings().maxCount(16).
            registryKey(RegistryKey.of(RegistryKeys.ITEM, MavesBlocks.AZALEA_SIGN_ID))
            .useBlockPrefixedTranslationKey()), AZALEA_SIGN_KEY);
    public static final Item AZALEA_HANGING_SIGN = registerItem(
            new HangingSignItem(MavesBlocks.AZALEA_HANGING_SIGN,
            MavesBlocks.AZALEA_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, MavesBlocks.AZALEA_HANGING_SIGN_ID))
            .useBlockPrefixedTranslationKey()), AZALEA_HANGING_SIGN_KEY);
    public static final Item CACAO_TREE_SIGN = registerItem(
            new SignItem(MavesBlocks.CACAO_TREE_SIGN,
            MavesBlocks.CACAO_TREE_WALL_SIGN, new Item.Settings().maxCount(16).
            registryKey(RegistryKey.of(RegistryKeys.ITEM, MavesBlocks.CACAO_TREE_SIGN_ID))
            .useBlockPrefixedTranslationKey()), CACAO_TREE_SIGN_KEY);
    public static final Item CACAO_TREE_HANGING_SIGN = registerItem(
            new HangingSignItem(MavesBlocks.CACAO_TREE_HANGING_SIGN,
            MavesBlocks.CACAO_TREE_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, MavesBlocks.CACAO_TREE_HANGING_SIGN_ID))
            .useBlockPrefixedTranslationKey()), CACAO_TREE_HANGING_SIGN_KEY);
    public static final Item RUBBER_SIGN = registerItem(
            new SignItem(MavesBlocks.RUBBER_SIGN,
            MavesBlocks.RUBBER_WALL_SIGN, new Item.Settings().maxCount(16).
            registryKey(RegistryKey.of(RegistryKeys.ITEM, MavesBlocks.RUBBER_SIGN_ID))
            .useBlockPrefixedTranslationKey()), RUBBER_SIGN_KEY);
    public static final Item RUBBER_HANGING_SIGN = registerItem(
            new HangingSignItem(MavesBlocks.RUBBER_HANGING_SIGN,
            MavesBlocks.RUBBER_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, MavesBlocks.RUBBER_HANGING_SIGN_ID))
            .useBlockPrefixedTranslationKey()), RUBBER_HANGING_SIGN_KEY);
    public static final Item WILLOW_SIGN = registerItem(
            new SignItem(MavesBlocks.WILLOW_SIGN,
            MavesBlocks.WILLOW_WALL_SIGN, new Item.Settings().maxCount(16).
            registryKey(RegistryKey.of(RegistryKeys.ITEM, MavesBlocks.WILLOW_SIGN_ID))
            .useBlockPrefixedTranslationKey()), WILLOW_SIGN_KEY);
    public static final Item WILLOW_HANGING_SIGN = registerItem(
            new HangingSignItem(MavesBlocks.WILLOW_HANGING_SIGN,
            MavesBlocks.WILLOW_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, MavesBlocks.WILLOW_HANGING_SIGN_ID))
            .useBlockPrefixedTranslationKey()), WILLOW_HANGING_SIGN_KEY);


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

    public static Item registerItem(Item item, RegistryKey<Item> registryKey) {
        Item registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);

        return registeredItem;
    }

    public static void registerMavesItems() {
        MavesUtilitiesMod.LOGGER.info("Registering Mave's Items for " + MavesUtilitiesMod.MOD_ID);

        CompostingChanceRegistry.INSTANCE.add(MavesItems.OAK_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.SPRUCE_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.BIRCH_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.JUNGLE_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.ACACIA_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.DARK_OAK_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.MANGROVE_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.CHERRY_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.PALE_OAK_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.APPLE_TREE_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.AZALEA_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.CACAO_TREE_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.RUBBER_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.WILLOW_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.CRIMSON_BARK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MavesItems.WARPED_BARK, 0.3f);

        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(MavesItems.OAK_BARK, 20 * 15 / 2);
            builder.add(MavesItems.SPRUCE_BARK, 20 * 15 / 2);
            builder.add(MavesItems.BIRCH_BARK, 20 * 15 / 2);
            builder.add(MavesItems.JUNGLE_BARK, 20 * 15 / 2);
            builder.add(MavesItems.ACACIA_BARK, 20 * 15 / 2);
            builder.add(MavesItems.DARK_OAK_BARK, 20 * 15 / 2);
            builder.add(MavesItems.MANGROVE_BARK, 20 * 15 / 2);
            builder.add(MavesItems.CHERRY_BARK, 20 * 15 / 2);
            builder.add(MavesItems.PALE_OAK_BARK, 20 * 15 / 2);
            builder.add(MavesItems.APPLE_TREE_BARK, 20 * 15 / 2);
            builder.add(MavesItems.AZALEA_BARK, 20 * 15 / 2);
            builder.add(MavesItems.CACAO_TREE_BARK, 20 * 15 / 2);
            builder.add(MavesItems.RUBBER_BARK, 20 * 15 / 2);
            builder.add(MavesItems.WILLOW_BARK, 20 * 15 / 2);
            builder.add(MavesItems.CRIMSON_BARK, 20 * 15 / 2);
            builder.add(MavesItems.WARPED_BARK, 20 * 15 / 2);
        });
    }
}