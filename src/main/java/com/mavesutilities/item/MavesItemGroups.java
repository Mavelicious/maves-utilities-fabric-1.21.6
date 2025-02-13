package com.mavesutilities.item;

import com.mavesutilities.MavesUtilitiesMod;
import com.mavesutilities.block.MavesBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MavesItemGroups {

    public static final Text MAVES_ITEMS = Text.translatable("itemGroup." + MavesUtilitiesMod.MOD_ID + ".maves_items");
    public static final Text MAVES_BLOCKS = Text.translatable("itemGroup." + MavesUtilitiesMod.MOD_ID + ".maves_blocks");

    public static final ItemGroup MAVES_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "maves_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(MavesItems.APPLE_TREE_BARK))
                    .displayName(MAVES_ITEMS)
                    .entries((displayContext, entries) -> {
                        entries.add(MavesItems.OAK_BARK);
                        entries.add(MavesItems.SPRUCE_BARK);
                        entries.add(MavesItems.BIRCH_BARK);
                        entries.add(MavesItems.JUNGLE_BARK);
                        entries.add(MavesItems.ACACIA_BARK);
                        entries.add(MavesItems.DARK_OAK_BARK);
                        entries.add(MavesItems.MANGROVE_BARK);
                        entries.add(MavesItems.CHERRY_BARK);
                        entries.add(MavesItems.PALE_OAK_BARK);
                        entries.add(MavesItems.APPLE_TREE_BARK);
                        entries.add(MavesItems.AZALEA_BARK);
                        entries.add(MavesItems.COCOA_TREE_BARK);
                        entries.add(MavesItems.RUBBER_BARK);
                        entries.add(MavesItems.WILLOW_BARK);
                        entries.add(MavesItems.CRIMSON_BARK);
                        entries.add(MavesItems.WARPED_BARK);
                    }).build());

    public static final ItemGroup MAVES_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MavesUtilitiesMod.MOD_ID, "maves_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(MavesBlocks.APPLE_TREE_LOG))
                    .displayName(MAVES_BLOCKS)
                    .entries((displayContext, entries) -> {
                        entries.add(MavesBlocks.APPLE_TREE_LOG);
                        entries.add(MavesBlocks.AZALEA_STEM);
                        entries.add(MavesBlocks.COCOA_TREE_LOG);
                        entries.add(MavesBlocks.RUBBER_LOG);
                        entries.add(MavesBlocks.WILLOW_LOG);
                        entries.add(MavesBlocks.APPLE_TREE_WOOD);
                        entries.add(MavesBlocks.AZALEA_WOOD);
                        entries.add(MavesBlocks.COCOA_TREE_WOOD);
                        entries.add(MavesBlocks.RUBBER_WOOD);
                        entries.add(MavesBlocks.WILLOW_WOOD);
                        entries.add(MavesBlocks.STRIPPED_APPLE_TREE_LOG);
                        entries.add(MavesBlocks.STRIPPED_AZALEA_STEM);
                        entries.add(MavesBlocks.STRIPPED_COCOA_TREE_LOG);
                        entries.add(MavesBlocks.STRIPPED_RUBBER_LOG);
                        entries.add(MavesBlocks.STRIPPED_WILLOW_LOG);
                        entries.add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD);
                        entries.add(MavesBlocks.STRIPPED_AZALEA_WOOD);
                        entries.add(MavesBlocks.STRIPPED_COCOA_TREE_WOOD);
                        entries.add(MavesBlocks.STRIPPED_RUBBER_WOOD);
                        entries.add(MavesBlocks.STRIPPED_WILLOW_WOOD);
                        entries.add(MavesBlocks.APPLE_TREE_PLANKS);
                        entries.add(MavesBlocks.AZALEA_PLANKS);
                        entries.add(MavesBlocks.COCOA_TREE_PLANKS);
                        entries.add(MavesBlocks.RUBBER_PLANKS);
                        entries.add(MavesBlocks.WILLOW_PLANKS);
                        entries.add(MavesBlocks.APPLE_TREE_LEAVES);
                        entries.add(MavesBlocks.COCOA_TREE_LEAVES);
                        entries.add(MavesBlocks.RUBBER_LEAVES);
                        entries.add(MavesBlocks.WILLOW_LEAVES);
                        entries.add(MavesBlocks.APPLE_TREE_SAPLING);
                        entries.add(MavesBlocks.COCOA_TREE_SAPLING);
                        entries.add(MavesBlocks.RUBBER_SAPLING);
                        entries.add(MavesBlocks.WILLOW_SAPLING);
                    }).build());

    public static void registerItemGroups() {
        MavesUtilitiesMod.LOGGER.info("Registering Item Groups for " + MavesUtilitiesMod.MOD_ID);
    }
}