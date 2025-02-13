package com.mavesutilities.datagen;

import com.mavesutilities.MavesUtilitiesMod;
import com.mavesutilities.block.MavesBlocks;
import com.mavesutilities.item.MavesItemGroups;
import com.mavesutilities.item.MavesItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class PortuguesLangProvider  extends FabricLanguageProvider {
    public PortuguesLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "pt_br", registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            MavesUtilitiesMod.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {

        addText(translationBuilder, MavesItemGroups.MAVES_ITEMS, "Itens de Mave");
        addText(translationBuilder, MavesItemGroups.MAVES_BLOCKS, "Blocos de Mave");

        translationBuilder.add(MavesItems.OAK_BARK, "Casca de Carvalho");
        translationBuilder.add(MavesItems.SPRUCE_BARK, "Casca de Pinheiro");
        translationBuilder.add(MavesItems.BIRCH_BARK, "Casca de Bétula");
        translationBuilder.add(MavesItems.JUNGLE_BARK, "Casca de Selva");
        translationBuilder.add(MavesItems.ACACIA_BARK, "Casca de Acácia");
        translationBuilder.add(MavesItems.DARK_OAK_BARK, "Casca de Carvalho Escuro");
        translationBuilder.add(MavesItems.MANGROVE_BARK, "Casca de Mangue");
        translationBuilder.add(MavesItems.CHERRY_BARK, "Casca de Cerejeira");
        translationBuilder.add(MavesItems.PALE_OAK_BARK, "Casca de Carvalho Pálido");
        translationBuilder.add(MavesItems.APPLE_TREE_BARK, "Casca de Macieira");
        translationBuilder.add(MavesItems.AZALEA_BARK, "Casca de Azaleia");
        translationBuilder.add(MavesItems.COCOA_TREE_BARK, "Casca de Cacaueiro");
        translationBuilder.add(MavesItems.RUBBER_BARK, "Casca de Seringueira");
        translationBuilder.add(MavesItems.WILLOW_BARK, "Casca de Salgueiro");
        translationBuilder.add(MavesItems.CRIMSON_BARK, "Casca Carmesim");
        translationBuilder.add(MavesItems.WARPED_BARK, "Casca Distorcida");

        translationBuilder.add(MavesBlocks.APPLE_TREE_LOG, "Tronco de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_WOOD, "Madeira de Macieira");
        translationBuilder.add(MavesBlocks.STRIPPED_APPLE_TREE_LOG, "Tronco de Macieira Descascado");
        translationBuilder.add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD, "Madeira de Macieira Descascada");
        translationBuilder.add(MavesBlocks.APPLE_TREE_LEAVES, "Folhas de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_SAPLING, "Muda de Macieira");
        translationBuilder.add(MavesBlocks.POTTED_APPLE_TREE_SAPLING, "Muda de Macieira Envasada");
        translationBuilder.add(MavesBlocks.APPLE_TREE_PLANKS, "Tábuas de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_BUTTON, "Botão de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_DOOR, "Porta de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_FENCE, "Cerca de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_FENCE_GATE, "Portão de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_PRESSURE_PLATE, "Placa de Pressão de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_SLAB, "Laje de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_STAIRS, "Escadas de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_TRAPDOOR, "Alçapão de Macieira");

        translationBuilder.add(MavesBlocks.AZALEA_STEM, "Caule de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_WOOD, "Madeira de Azaleia");
        translationBuilder.add(MavesBlocks.STRIPPED_AZALEA_STEM, "Caule de Azaleia Descascado");
        translationBuilder.add(MavesBlocks.STRIPPED_AZALEA_WOOD, "Madeira de Azaleia Descascada");
        translationBuilder.add(MavesBlocks.AZALEA_PLANKS, "Tábuas de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_BUTTON, "Botão de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_DOOR, "Porta de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_FENCE, "Cerca de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_FENCE_GATE, "Portão de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_PRESSURE_PLATE, "Placa de Pressão de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_SLAB, "Laje de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_STAIRS, "Escadas de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_TRAPDOOR, "Alçapão de Azaleia");

        translationBuilder.add(MavesBlocks.COCOA_TREE_LOG, "Tronco de Cacaueiro");
        translationBuilder.add(MavesBlocks.COCOA_TREE_WOOD, "Madeira de Cacaueiro");
        translationBuilder.add(MavesBlocks.STRIPPED_COCOA_TREE_LOG, "Tronco de Cacaueiro Descascado");
        translationBuilder.add(MavesBlocks.STRIPPED_COCOA_TREE_WOOD, "Madeira de Cacaueiro Descascada");
        translationBuilder.add(MavesBlocks.COCOA_TREE_LEAVES, "Folhas de Cacaueiro");
        translationBuilder.add(MavesBlocks.COCOA_TREE_SAPLING, "Muda de Cacaueiro");
        translationBuilder.add(MavesBlocks.POTTED_COCOA_TREE_SAPLING, "Muda de Cacaueiro Envasada");
        translationBuilder.add(MavesBlocks.COCOA_TREE_PLANKS, "Tábuas de Cacaueiro");
        translationBuilder.add(MavesBlocks.COCOA_TREE_BUTTON, "Botão de Cacaueiro");
        translationBuilder.add(MavesBlocks.COCOA_TREE_DOOR, "Porta de Cacaueiro");
        translationBuilder.add(MavesBlocks.COCOA_TREE_FENCE, "Cerca de Cacaueiro");
        translationBuilder.add(MavesBlocks.COCOA_TREE_FENCE_GATE, "Portão de Cacaueiro");
        translationBuilder.add(MavesBlocks.COCOA_TREE_PRESSURE_PLATE, "Placa de Pressão de Cacaueiro");
        translationBuilder.add(MavesBlocks.COCOA_TREE_SLAB, "Laje de Cacaueiro");
        translationBuilder.add(MavesBlocks.COCOA_TREE_STAIRS, "Escadas de Cacaueiro");
        translationBuilder.add(MavesBlocks.COCOA_TREE_TRAPDOOR, "Alçapão de Cacaueiro");

        translationBuilder.add(MavesBlocks.RUBBER_LOG, "Tronco de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_WOOD, "Madeira de Seringueira");
        translationBuilder.add(MavesBlocks.STRIPPED_RUBBER_LOG, "Tronco de Seringueira Descascado");
        translationBuilder.add(MavesBlocks.STRIPPED_RUBBER_WOOD, "Madeira de Seringueira Descascada");
        translationBuilder.add(MavesBlocks.RUBBER_LEAVES, "Folhas de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_SAPLING, "Muda de Seringueira");
        translationBuilder.add(MavesBlocks.POTTED_RUBBER_SAPLING, "Muda de Seringueira Envasada");
        translationBuilder.add(MavesBlocks.RUBBER_PLANKS, "Tábuas de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_BUTTON, "Botão de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_DOOR, "Porta de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_FENCE, "Cerca de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_FENCE_GATE, "Portão de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_PRESSURE_PLATE, "Placa de Pressão de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_SLAB, "Laje de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_STAIRS, "Escadas de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_TRAPDOOR, "Alçapão de Seringueira");

        translationBuilder.add(MavesBlocks.WILLOW_LOG, "Tronco de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_WOOD, "Madeira de Salgueiro");
        translationBuilder.add(MavesBlocks.STRIPPED_WILLOW_LOG, "Tronco de Salgueiro Descascado");
        translationBuilder.add(MavesBlocks.STRIPPED_WILLOW_WOOD, "Madeira de Salgueiro Descascada");
        translationBuilder.add(MavesBlocks.WILLOW_LEAVES, "Folhas de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_SAPLING, "Muda de Salgueiro");
        translationBuilder.add(MavesBlocks.POTTED_WILLOW_SAPLING, "Muda de Salgueiro Envasada");
        translationBuilder.add(MavesBlocks.WILLOW_PLANKS, "Tábuas de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_BUTTON, "Botão de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_DOOR, "Porta de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_FENCE, "Cerca de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_FENCE_GATE, "Portão de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_PRESSURE_PLATE, "Placa de Pressão de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_SLAB, "Laje de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_STAIRS, "Escadas de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_TRAPDOOR, "Alçapão de Salgueiro");
        
    }
}
