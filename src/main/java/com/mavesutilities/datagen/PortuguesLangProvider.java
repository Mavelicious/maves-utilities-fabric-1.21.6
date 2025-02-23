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
        translationBuilder.add(MavesItems.CACAO_TREE_BARK, "Casca de Cacaueiro");
        translationBuilder.add(MavesItems.RUBBER_BARK, "Casca de Seringueira");
        translationBuilder.add(MavesItems.WILLOW_BARK, "Casca de Salgueiro");
        translationBuilder.add(MavesItems.CRIMSON_BARK, "Casca Carmesim");
        translationBuilder.add(MavesItems.WARPED_BARK, "Casca Distorcida");

        translationBuilder.add(MavesItems.GREEN_APPLE, "Maçã Verde");
        translationBuilder.add(MavesItems.PUMPKIN_SLICE, "Fatia de Abóbora");
        translationBuilder.add(MavesItems.CHERRIES, "Cerejas");
        translationBuilder.add(MavesItems.WILD_BERRIES_BLUE, "Bagas Selvagens Azuis");
        translationBuilder.add(MavesItems.WILD_BERRIES_GREEN, "Bagas Selvagens Verdes");
        translationBuilder.add(MavesItems.WILD_BERRIES_YELLOW, "Bagas Selvagens Amarelas");
        translationBuilder.add(MavesItems.MILK_CHOCOLATE, "Chocolate ao Leite");
        translationBuilder.add(MavesItems.WHITE_CHOCOLATE, "Chocolate Branco");
        translationBuilder.add(MavesItems.DARK_CHOCOLATE, "Chocolate Amargo");

        translationBuilder.add(MavesItems.ACORN, "Bolota");
        translationBuilder.add(MavesItems.DARK_ACORN, "Bolota Escura");
        translationBuilder.add(MavesItems.PALE_ACORN, "Bolota Pálida");
        
        translationBuilder.add(MavesItems.APPLE_TREE_BOAT, "Barco de Macieira");
        translationBuilder.add(MavesItems.APPLE_TREE_CHEST_BOAT, "Barco de Macieira com Baú");
        translationBuilder.add(MavesItems.AZALEA_BOAT, "Barco de Azaleia");
        translationBuilder.add(MavesItems.AZALEA_CHEST_BOAT, "Barco de Azaleia com Baú");
        translationBuilder.add(MavesItems.CACAO_TREE_BOAT, "Barco de Cacaueiro");
        translationBuilder.add(MavesItems.CACAO_TREE_CHEST_BOAT, "Barco de Cacaueiro com Baú");
        translationBuilder.add(MavesItems.RUBBER_BOAT, "Barco de Seringueira");
        translationBuilder.add(MavesItems.RUBBER_CHEST_BOAT, "Barco de Seringueira com Baú");
        translationBuilder.add(MavesItems.WILLOW_BOAT, "Barco de Salgueiro");
        translationBuilder.add(MavesItems.WILLOW_CHEST_BOAT, "Barco de Salgueiro com Baú");

        translationBuilder.add(MavesBlocks.APPLE_TREE_LOG.asItem(), "Tronco de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_WOOD.asItem(), "Madeira de Macieira");
        translationBuilder.add(MavesBlocks.STRIPPED_APPLE_TREE_LOG.asItem(), "Tronco de Macieira Descascado");
        translationBuilder.add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD.asItem(), "Madeira de Macieira Descascada");
        translationBuilder.add(MavesBlocks.APPLE_TREE_LEAVES.asItem(), "Folhas de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_SAPLING.asItem(), "Muda de Macieira");
        translationBuilder.add(MavesBlocks.POTTED_APPLE_TREE_SAPLING.asItem(), "Muda de Macieira Envasada");
        translationBuilder.add(MavesBlocks.APPLE_TREE_PLANKS.asItem(), "Tábuas de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_BUTTON.asItem(), "Botão de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_DOOR.asItem(), "Porta de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_FENCE.asItem(), "Cerca de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_FENCE_GATE.asItem(), "Portão de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_PRESSURE_PLATE.asItem(), "Placa de Pressão de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_SLAB.asItem(), "Laje de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_STAIRS.asItem(), "Escadas de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_TRAPDOOR.asItem(), "Alçapão de Macieira");

        translationBuilder.add(MavesBlocks.AZALEA_STEM.asItem(), "Caule de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_WOOD.asItem(), "Madeira de Azaleia");
        translationBuilder.add(MavesBlocks.STRIPPED_AZALEA_STEM.asItem(), "Caule de Azaleia Descascado");
        translationBuilder.add(MavesBlocks.STRIPPED_AZALEA_WOOD.asItem(), "Madeira de Azaleia Descascada");
        translationBuilder.add(MavesBlocks.AZALEA_PLANKS.asItem(), "Tábuas de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_BUTTON.asItem(), "Botão de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_DOOR.asItem(), "Porta de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_FENCE.asItem(), "Cerca de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_FENCE_GATE.asItem(), "Portão de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_PRESSURE_PLATE.asItem(), "Placa de Pressão de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_SLAB.asItem(), "Laje de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_STAIRS.asItem(), "Escadas de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_TRAPDOOR.asItem(), "Alçapão de Azaleia");

        translationBuilder.add(MavesBlocks.CACAO_TREE_LOG.asItem(), "Tronco de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_WOOD.asItem(), "Madeira de Cacaueiro");
        translationBuilder.add(MavesBlocks.STRIPPED_CACAO_TREE_LOG.asItem(), "Tronco de Cacaueiro Descascado");
        translationBuilder.add(MavesBlocks.STRIPPED_CACAO_TREE_WOOD.asItem(), "Madeira de Cacaueiro Descascada");
        translationBuilder.add(MavesBlocks.CACAO_TREE_LEAVES.asItem(), "Folhas de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_SAPLING.asItem(), "Muda de Cacaueiro");
        translationBuilder.add(MavesBlocks.POTTED_CACAO_TREE_SAPLING.asItem(), "Muda de Cacaueiro Envasada");
        translationBuilder.add(MavesBlocks.CACAO_TREE_PLANKS.asItem(), "Tábuas de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_BUTTON.asItem(), "Botão de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_DOOR.asItem(), "Porta de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_FENCE.asItem(), "Cerca de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_FENCE_GATE.asItem(), "Portão de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_PRESSURE_PLATE.asItem(), "Placa de Pressão de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_SLAB.asItem(), "Laje de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_STAIRS.asItem(), "Escadas de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_TRAPDOOR.asItem(), "Alçapão de Cacaueiro");

        translationBuilder.add(MavesBlocks.RUBBER_LOG.asItem(), "Tronco de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_WOOD.asItem(), "Madeira de Seringueira");
        translationBuilder.add(MavesBlocks.STRIPPED_RUBBER_LOG.asItem(), "Tronco de Seringueira Descascado");
        translationBuilder.add(MavesBlocks.STRIPPED_RUBBER_WOOD.asItem(), "Madeira de Seringueira Descascada");
        translationBuilder.add(MavesBlocks.RUBBER_LEAVES.asItem(), "Folhas de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_SAPLING.asItem(), "Muda de Seringueira");
        translationBuilder.add(MavesBlocks.POTTED_RUBBER_SAPLING.asItem(), "Muda de Seringueira Envasada");
        translationBuilder.add(MavesBlocks.RUBBER_PLANKS.asItem(), "Tábuas de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_BUTTON.asItem(), "Botão de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_DOOR.asItem(), "Porta de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_FENCE.asItem(), "Cerca de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_FENCE_GATE.asItem(), "Portão de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_PRESSURE_PLATE.asItem(), "Placa de Pressão de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_SLAB.asItem(), "Laje de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_STAIRS.asItem(), "Escadas de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_TRAPDOOR.asItem(), "Alçapão de Seringueira");

        translationBuilder.add(MavesBlocks.WILLOW_LOG.asItem(), "Tronco de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_WOOD.asItem(), "Madeira de Salgueiro");
        translationBuilder.add(MavesBlocks.STRIPPED_WILLOW_LOG.asItem(), "Tronco de Salgueiro Descascado");
        translationBuilder.add(MavesBlocks.STRIPPED_WILLOW_WOOD.asItem(), "Madeira de Salgueiro Descascada");
        translationBuilder.add(MavesBlocks.WILLOW_LEAVES.asItem(), "Folhas de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_SAPLING.asItem(), "Muda de Salgueiro");
        translationBuilder.add(MavesBlocks.POTTED_WILLOW_SAPLING.asItem(), "Muda de Salgueiro Envasada");
        translationBuilder.add(MavesBlocks.WILLOW_PLANKS.asItem(), "Tábuas de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_BUTTON.asItem(), "Botão de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_DOOR.asItem(), "Porta de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_FENCE.asItem(), "Cerca de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_FENCE_GATE.asItem(), "Portão de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_PRESSURE_PLATE.asItem(), "Placa de Pressão de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_SLAB.asItem(), "Laje de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_STAIRS.asItem(), "Escadas de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_TRAPDOOR.asItem(), "Alçapão de Salgueiro");

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
        translationBuilder.add(MavesBlocks.APPLE_TREE_HANGING_SIGN, "Placa Suspensa de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_WALL_HANGING_SIGN.toString(), "Placa Suspensa de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_PRESSURE_PLATE, "Placa de Pressão de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_SIGN, "Placa de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_WALL_SIGN.toString(), "Placa de Macieira");
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
        translationBuilder.add(MavesBlocks.AZALEA_HANGING_SIGN, "Placa Suspensa de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_WALL_HANGING_SIGN.toString(), "Placa Suspensa de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_PRESSURE_PLATE, "Placa de Pressão de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_SIGN, "Placa de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_WALL_SIGN.toString(), "Placa de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_SLAB, "Laje de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_STAIRS, "Escadas de Azaleia");
        translationBuilder.add(MavesBlocks.AZALEA_TRAPDOOR, "Alçapão de Azaleia");

        translationBuilder.add(MavesBlocks.CACAO_TREE_LOG, "Tronco de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_WOOD, "Madeira de Cacaueiro");
        translationBuilder.add(MavesBlocks.STRIPPED_CACAO_TREE_LOG, "Tronco de Cacaueiro Descascado");
        translationBuilder.add(MavesBlocks.STRIPPED_CACAO_TREE_WOOD, "Madeira de Cacaueiro Descascada");
        translationBuilder.add(MavesBlocks.CACAO_TREE_LEAVES, "Folhas de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_SAPLING, "Muda de Cacaueiro");
        translationBuilder.add(MavesBlocks.POTTED_CACAO_TREE_SAPLING, "Muda de Cacaueiro Envasada");
        translationBuilder.add(MavesBlocks.CACAO_TREE_PLANKS, "Tábuas de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_BUTTON, "Botão de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_DOOR, "Porta de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_FENCE, "Cerca de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_FENCE_GATE, "Portão de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_HANGING_SIGN, "Placa Suspensa de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_WALL_HANGING_SIGN.toString(), "Placa Suspensa de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_PRESSURE_PLATE, "Placa de Pressão de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_SIGN, "Placa de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_WALL_SIGN.toString(), "Placa de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_SLAB, "Laje de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_STAIRS, "Escadas de Cacaueiro");
        translationBuilder.add(MavesBlocks.CACAO_TREE_TRAPDOOR, "Alçapão de Cacaueiro");

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
        translationBuilder.add(MavesBlocks.RUBBER_HANGING_SIGN, "Placa Suspensa de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_WALL_HANGING_SIGN.toString(), "Placa Suspensa de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_PRESSURE_PLATE, "Placa de Pressão de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_SIGN, "Placa de Seringueira");
        translationBuilder.add(MavesBlocks.RUBBER_WALL_SIGN.toString(), "Placa de Seringueira");
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
        translationBuilder.add(MavesBlocks.WILLOW_HANGING_SIGN, "Placa Suspensa de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_WALL_HANGING_SIGN.toString(), "Placa Suspensa de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_PRESSURE_PLATE, "Placa de Pressão de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_SIGN, "Placa de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_WALL_SIGN.toString(), "Placa de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_SLAB, "Laje de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_STAIRS, "Escadas de Salgueiro");
        translationBuilder.add(MavesBlocks.WILLOW_TRAPDOOR, "Alçapão de Salgueiro");
        
    }
}
