package com.mavesutilities.util;

import com.mavesutilities.block.*;
import com.mavesutilities.block.floweringleaves.MavesAppleFloweringLeaves;
import com.mavesutilities.block.floweringleaves.MavesJungleFloweringLeaves;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.state.property.Property;

import java.lang.reflect.Method;

@Environment(EnvType.CLIENT)
public class MavesBlockColors {

    public static void registerBlockColors() {
        BlockColors blockColors = new BlockColors();
        ColorProviderRegistry<Block, BlockColorProvider> add = ColorProviderRegistry.BLOCK;

        add.register((state, world, pos, tintIndex) ->
                (world != null && pos != null) ? BiomeColors.getFoliageColor(world, pos) :
                        -12012264, MavesBlocks.ACACIA_FLOWERING_LEAVES);
        add.register((state, world, pos, tintIndex) ->
                (world != null && pos != null) ? BiomeColors.getFoliageColor(world, pos) :
                        -12012264, MavesBlocks.ACACIA_FLOWERED_LEAVES);
        add.register((state, world, pos, tintIndex) ->
                -8345771, MavesBlocks.BIRCH_FLOWERING_LEAVES);
        add.register((state, world, pos, tintIndex) ->
                (world != null && pos != null) ? BiomeColors.getFoliageColor(world, pos) :
                        -12012264, MavesBlocks.DARK_OAK_FLOWERING_LEAVES);
        add.register((state, world, pos, tintIndex) ->
                (world != null && pos != null) ? BiomeColors.getFoliageColor(world, pos) :
                        -12012264, MavesBlocks.JUNGLE_FLOWERING_LEAVES);
        add.register((state, world, pos, tintIndex) ->
                (world != null && pos != null) ? BiomeColors.getFoliageColor(world, pos) :
                        -12012264, MavesBlocks.OAK_FLOWERING_LEAVES);

        add.register((state, world, pos, tintIndex) ->
                (world != null && pos != null) ? BiomeColors.getFoliageColor(world, pos) :
                        0xbeff00, MavesBlocks.APPLE_TREE_LEAVES);
        add.register((state, world, pos, tintIndex) ->
                (world != null && pos != null) ? BiomeColors.getFoliageColor(world, pos) :
                        0xbeff00, MavesBlocks.APPLE_TREE_FLOWERING_LEAVES);
        add.register((state, world, pos, tintIndex) ->
                (world != null && pos != null) ? BiomeColors.getFoliageColor(world, pos) :
                        0xbeff00, MavesBlocks.APPLE_TREE_FLOWERED_LEAVES);
        add.register((state, world, pos, tintIndex) ->
                (world != null && pos != null) ? BiomeColors.getFoliageColor(world, pos) :
                        0x97ff00, MavesBlocks.CACAO_TREE_LEAVES);
        add.register((state, world, pos, tintIndex) ->
                (world != null && pos != null) ? BiomeColors.getFoliageColor(world, pos) :
                        0x00ff03, MavesBlocks.RUBBER_LEAVES);
        add.register((state, world, pos, tintIndex) ->
                (world != null && pos != null) ? BiomeColors.getFoliageColor(world, pos) :
                        0x67ff00, MavesBlocks.WILLOW_LEAVES);

        try {
            Method registerColorPropertyMethod = BlockColors.class.getDeclaredMethod("registerColorProperty", Property.class, Block[].class);
            registerColorPropertyMethod.setAccessible(true);
            registerColorPropertyMethod.invoke(blockColors, MavesFloweringLeaves.AGE, new Block[]{
                    MavesBlocks.ACACIA_FLOWERING_LEAVES,
                    MavesBlocks.BIRCH_FLOWERING_LEAVES,
                    MavesBlocks.DARK_OAK_FLOWERING_LEAVES,
                    MavesBlocks.OAK_FLOWERING_LEAVES
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Method registerColorPropertyMethod = BlockColors.class.getDeclaredMethod("registerColorProperty", Property.class, Block[].class);
            registerColorPropertyMethod.setAccessible(true);
            registerColorPropertyMethod.invoke(blockColors, MavesAppleFloweringLeaves.AGE, new Block[]{
                    MavesBlocks.APPLE_TREE_FLOWERING_LEAVES
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Method registerColorPropertyMethod = BlockColors.class.getDeclaredMethod("registerColorProperty", Property.class, Block[].class);
            registerColorPropertyMethod.setAccessible(true);
            registerColorPropertyMethod.invoke(blockColors, MavesJungleFloweringLeaves.AGE, new Block[]{
                    MavesBlocks.JUNGLE_FLOWERING_LEAVES
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}