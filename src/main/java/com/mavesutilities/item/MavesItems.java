package com.mavesutilities.item;

import com.mavesutilities.MavesUtilitiesMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class MavesItems {

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
    public static final RegistryKey<Item> COCOA_TREE_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_bark"));
    public static final RegistryKey<Item> RUBBER_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_bark"));
    public static final RegistryKey<Item> WILLOW_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_bark"));
    public static final RegistryKey<Item> CRIMSON_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "crimson_bark"));
    public static final RegistryKey<Item> WARPED_BARK_KEY = RegistryKey.of(RegistryKeys.ITEM,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "warped_bark"));

    public static final Item OAK_BARK = registerItem(
            new Item(new Item.Settings().registryKey(OAK_BARK_KEY)),
            OAK_BARK_KEY
    );
    public static final Item SPRUCE_BARK = registerItem(
            new Item(new Item.Settings().registryKey(SPRUCE_BARK_KEY)),
            SPRUCE_BARK_KEY
    );
    public static final Item BIRCH_BARK = registerItem(
            new Item(new Item.Settings().registryKey(BIRCH_BARK_KEY)),
            BIRCH_BARK_KEY
    );
    public static final Item JUNGLE_BARK = registerItem(
            new Item(new Item.Settings().registryKey(JUNGLE_BARK_KEY)),
            JUNGLE_BARK_KEY
    );
    public static final Item ACACIA_BARK = registerItem(
            new Item(new Item.Settings().registryKey(ACACIA_BARK_KEY)),
            ACACIA_BARK_KEY
    );
    public static final Item DARK_OAK_BARK = registerItem(
            new Item(new Item.Settings().registryKey(DARK_OAK_BARK_KEY)),
            DARK_OAK_BARK_KEY
    );
    public static final Item MANGROVE_BARK = registerItem(
            new Item(new Item.Settings().registryKey(MANGROVE_BARK_KEY)),
            MANGROVE_BARK_KEY
    );
    public static final Item CHERRY_BARK = registerItem(
            new Item(new Item.Settings().registryKey(CHERRY_BARK_KEY)),
            CHERRY_BARK_KEY
    );
    public static final Item PALE_OAK_BARK = registerItem(
            new Item(new Item.Settings().registryKey(PALE_OAK_BARK_KEY)),
            PALE_OAK_BARK_KEY
    );
    public static final Item APPLE_TREE_BARK = registerItem(
            new Item(new Item.Settings().registryKey(APPLE_TREE_BARK_KEY)),
            APPLE_TREE_BARK_KEY
    );
    public static final Item AZALEA_BARK = registerItem(
            new Item(new Item.Settings().registryKey(AZALEA_BARK_KEY)),
            AZALEA_BARK_KEY
    );
    public static final Item COCOA_TREE_BARK = registerItem(
            new Item(new Item.Settings().registryKey(COCOA_TREE_BARK_KEY)),
            COCOA_TREE_BARK_KEY
    );
    public static final Item RUBBER_BARK = registerItem(
            new Item(new Item.Settings().registryKey(RUBBER_BARK_KEY)),
            RUBBER_BARK_KEY
    );
    public static final Item WILLOW_BARK = registerItem(
            new Item(new Item.Settings().registryKey(WILLOW_BARK_KEY)),
            WILLOW_BARK_KEY
    );
    public static final Item CRIMSON_BARK = registerItem(
            new Item(new Item.Settings().registryKey(CRIMSON_BARK_KEY)),
            CRIMSON_BARK_KEY
    );
    public static final Item WARPED_BARK = registerItem(
            new Item(new Item.Settings().registryKey(WARPED_BARK_KEY)),
            WARPED_BARK_KEY
    );

    public static Item registerItem(Item item, RegistryKey<Item> registryKey) {
        Item registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);

        return registeredItem;
    }

    public static void registerMavesItems() {
        MavesUtilitiesMod.LOGGER.info("Registering Mave's Items for " + MavesUtilitiesMod.MOD_ID);
    }
}