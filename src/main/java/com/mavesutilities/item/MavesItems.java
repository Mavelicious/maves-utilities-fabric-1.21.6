package com.mavesutilities.item;

import com.mavesutilities.MavesUtilitiesMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class MavesItems {

    //Items
    public static final Item OAK_BARK = registerItem("oak_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "oak_bark")))));
    public static final Item SPRUCE_BARK = registerItem("spruce_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "spruce_bark")))));
    public static final Item BIRCH_BARK = registerItem("birch_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "birch_bark")))));
    public static final Item JUNGLE_BARK = registerItem("jungle_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "jungle_bark")))));
    public static final Item ACACIA_BARK = registerItem("acacia_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "acacia_bark")))));
    public static final Item DARK_OAK_BARK = registerItem("dark_oak_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "dark_oak_bark")))));
    public static final Item MANGROVE_BARK = registerItem("mangrove_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "mangrove_bark")))));
    public static final Item CHERRY_BARK = registerItem("cherry_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "cherry_bark")))));
    public static final Item PALE_OAK_BARK = registerItem("pale_oak_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "pale_oak_bark")))));
    public static final Item APPLE_TREE_BARK = registerItem("apple_tree_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "apple_tree_bark")))));
    public static final Item AZALEA_BARK = registerItem("azalea_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "azalea_bark")))));
    public static final Item COCOA_TREE_BARK = registerItem("cocoa_tree_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "cocoa_tree_bark")))));
    public static final Item RUBBER_BARK = registerItem("rubber_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "rubber_bark")))));
    public static final Item WILLOW_BARK = registerItem("willow_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "willow_bark")))));
    public static final Item CRIMSON_BARK = registerItem("crimson_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "crimson_bark")))));
    public static final Item WARPED_BARK = registerItem("warped_bark", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(MavesUtilitiesMod.MOD_ID, "warped_bark")))));

    private static Item registerItem(String name, Item item) {
     return Registry.register(Registries.ITEM, Identifier.of(MavesUtilitiesMod.MOD_ID, name), item);
    }

    public static void registerMavesItems() {
        MavesUtilitiesMod.LOGGER.info("Registering Mave's Items for " + MavesUtilitiesMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(OAK_BARK);
            entries.add(SPRUCE_BARK);
            entries.add(BIRCH_BARK);
            entries.add(JUNGLE_BARK);
            entries.add(ACACIA_BARK);
            entries.add(DARK_OAK_BARK);
            entries.add(MANGROVE_BARK);
            entries.add(CHERRY_BARK);
            entries.add(PALE_OAK_BARK);
            entries.add(APPLE_TREE_BARK);
            entries.add(AZALEA_BARK);
            entries.add(COCOA_TREE_BARK);
            entries.add(RUBBER_BARK);
            entries.add(WILLOW_BARK);
            entries.add(CRIMSON_BARK);
            entries.add(WARPED_BARK);
        });
    }
}