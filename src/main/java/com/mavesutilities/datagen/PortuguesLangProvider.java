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
        translationBuilder.add(MavesItems.HANGING_BLACK_WIDOW_BARK, "Casca de Viúva Negra Suspensa");
        translationBuilder.add(MavesItems.RUBBER_BARK, "Casca de Seringueira");
        translationBuilder.add(MavesItems.WILLOW_BARK, "Casca de Salgueiro");
        translationBuilder.add(MavesItems.CRIMSON_BARK, "Casca Carmesim");
        translationBuilder.add(MavesItems.WARPED_BARK, "Casca Distorcida");

        translationBuilder.add(MavesItems.OAK_SLIVER, "Lasca de Carvalho");
        translationBuilder.add(MavesItems.STRIPPED_OAK_SLIVER, "Lasca de Carvalho Descascada");
        translationBuilder.add(MavesItems.SPRUCE_SLIVER, "Lasca de Pinheiro");
        translationBuilder.add(MavesItems.STRIPPED_SPRUCE_SLIVER, "Lasca de Pinheiro Descascada");
        translationBuilder.add(MavesItems.BIRCH_SLIVER, "Lasca de Bétula");
        translationBuilder.add(MavesItems.STRIPPED_BIRCH_SLIVER, "Lasca de Bétula Descascada");
        translationBuilder.add(MavesItems.JUNGLE_SLIVER, "Lasca de Selva");
        translationBuilder.add(MavesItems.STRIPPED_JUNGLE_SLIVER, "Lasca de Selva Descascada");
        translationBuilder.add(MavesItems.ACACIA_SLIVER, "Lasca de Acácia");
        translationBuilder.add(MavesItems.STRIPPED_ACACIA_SLIVER, "Lasca de Acácia Descascada");
        translationBuilder.add(MavesItems.DARK_OAK_SLIVER, "Lasca de Carvalho Escuro");
        translationBuilder.add(MavesItems.STRIPPED_DARK_OAK_SLIVER, "Lasca de Carvalho Escuro Descascada");
        translationBuilder.add(MavesItems.MANGROVE_SLIVER, "Lasca de Mangue");
        translationBuilder.add(MavesItems.STRIPPED_MANGROVE_SLIVER, "Lasca de Mangue Descascada");
        translationBuilder.add(MavesItems.CHERRY_SLIVER, "Lasca de Cerejeira");
        translationBuilder.add(MavesItems.STRIPPED_CHERRY_SLIVER, "Lasca de Cerejeira Descascada");
        translationBuilder.add(MavesItems.PALE_OAK_SLIVER, "Lasca de Carvalho Pálido");
        translationBuilder.add(MavesItems.STRIPPED_PALE_OAK_SLIVER, "Lasca de Carvalho Pálido Descascada");
        translationBuilder.add(MavesItems.APPLE_TREE_SLIVER, "Lasca de Macieira");
        translationBuilder.add(MavesItems.STRIPPED_APPLE_TREE_SLIVER, "Lasca de Macieira Descascada");
        translationBuilder.add(MavesItems.AZALEA_SLIVER, "Lasca de Azaleia");
        translationBuilder.add(MavesItems.STRIPPED_AZALEA_SLIVER, "Lasca de Azaleia Descascada");
        translationBuilder.add(MavesItems.CACAO_TREE_SLIVER, "Lasca de Cacaueiro");
        translationBuilder.add(MavesItems.STRIPPED_CACAO_TREE_SLIVER, "Lasca de Cacaueiro Descascada");
        translationBuilder.add(MavesItems.RUBBER_SLIVER, "Lasca de Seringueira");
        translationBuilder.add(MavesItems.STRIPPED_RUBBER_SLIVER, "Lasca de Seringueira Descascada");
        translationBuilder.add(MavesItems.WILLOW_SLIVER, "Lasca de Salgueiro");
        translationBuilder.add(MavesItems.STRIPPED_WILLOW_SLIVER, "Lasca de Salgueiro Descascada");
        translationBuilder.add(MavesItems.CRIMSON_SLIVER, "Lasca Carmesim");
        translationBuilder.add(MavesItems.STRIPPED_CRIMSON_SLIVER, "Lasca Carmesim Descascada");
        translationBuilder.add(MavesItems.WARPED_SLIVER, "Lasca Distorcida");
        translationBuilder.add(MavesItems.STRIPPED_WARPED_SLIVER, "Lasca Distorcida Descascada");

        translationBuilder.add(MavesItems.GREEN_APPLE, "Maçã Verde");
        translationBuilder.add(MavesItems.PUMPKIN_SLICE, "Fatia de Abóbora");
        translationBuilder.add(MavesItems.PALE_PUMPKIN_SLICE, "Fatia de Abóbora Pálida");
        translationBuilder.add(MavesItems.CHERRIES, "Cerejas");
        translationBuilder.add(MavesItems.WILD_BERRIES_BLUE, "Bagas Selvagens Azuis");
        translationBuilder.add(MavesItems.WILD_BERRIES_GREEN, "Bagas Selvagens Verdes");
        translationBuilder.add(MavesItems.WILD_BERRIES_YELLOW, "Bagas Selvagens Amarelas");
        translationBuilder.add(MavesItems.BLACK_WIDOW_BERRIES, "Bagas de Viúva Negra");
        translationBuilder.add(MavesItems.MILK_CHOCOLATE, "Chocolate ao Leite");
        translationBuilder.add(MavesItems.WHITE_CHOCOLATE, "Chocolate Branco");
        translationBuilder.add(MavesItems.DARK_CHOCOLATE, "Chocolate Amargo");

        translationBuilder.add(MavesItems.ACORN, "Bolota");
        translationBuilder.add(MavesItems.DARK_ACORN, "Bolota Escura");
        translationBuilder.add(MavesItems.PALE_ACORN, "Bolota Pálida");
        translationBuilder.add(MavesItems.SPRUCE_CONE, "Cone de Pinheiro");
        translationBuilder.add(MavesItems.PALE_PUMPKIN_SEEDS, "Sementes de Abóbora Pálida");

        translationBuilder.add(MavesItems.HANGING_BLACK_WIDOW_BRANCH, "Viúva Negra Suspensa");
        translationBuilder.add(MavesItems.LATEX_BOTTLE, "Frasco de Látex");

        translationBuilder.add(MavesItems.ACACIA_BLOSSOM, "Flores de Acácia");
        translationBuilder.add(MavesItems.APPLE_BLOSSOM, "Flores de Macieira");
        translationBuilder.add(MavesItems.AZALEA_BLOSSOM, "Flores de Azaleia");
        
        translationBuilder.add(MavesItems.APPLE_TREE_BOAT, "Barco de Macieira");
        translationBuilder.add(MavesItems.APPLE_TREE_CHEST_BOAT, "Barco de Macieira com Baú");
        translationBuilder.add(MavesItems.AZALEA_BOAT, "Barco de Azaleia");
        translationBuilder.add(MavesItems.AZALEA_CHEST_BOAT, "Barco de Azaleia com Baú");
        translationBuilder.add(MavesItems.CACAO_TREE_BOAT, "Barco de Cacaueiro");
        translationBuilder.add(MavesItems.CACAO_TREE_CHEST_BOAT, "Barco de Cacaueiro com Baú");
        translationBuilder.add(MavesItems.HANGING_BLACK_WIDOW_RAFT, "Jangada de Viúva Negra Suspensa");
        translationBuilder.add(MavesItems.HANGING_BLACK_WIDOW_CHEST_RAFT, "Jangada de Viúva Negra Suspensa com Baú");
        translationBuilder.add(MavesItems.RUBBER_BOAT, "Barco de Seringueira");
        translationBuilder.add(MavesItems.RUBBER_CHEST_BOAT, "Barco de Seringueira com Baú");
        translationBuilder.add(MavesItems.WILLOW_BOAT, "Barco de Salgueiro");
        translationBuilder.add(MavesItems.WILLOW_CHEST_BOAT, "Barco de Salgueiro com Baú");

        translationBuilder.add(MavesBlocks.ACACIA_FLOWERED_LEAVES, "Folhas de Acácia Florescentes");
        translationBuilder.add(MavesBlocks.CHERRY_FLOWERING_LEAVES, "Folhas de Cerejeira Florescentes");
        translationBuilder.add(MavesBlocks.DARK_OAK_FLOWERING_LEAVES, "Folhas de Carvalho Escuro Florescentes");
        translationBuilder.add(MavesBlocks.JUNGLE_FLOWERING_LEAVES, "Folhas de Selva Florescentes");
        translationBuilder.add(MavesBlocks.OAK_FLOWERING_LEAVES, "Folhas de Carvalho Florescentes");
        translationBuilder.add(MavesBlocks.PALE_OAK_FLOWERING_LEAVES, "Folhas de Carvalho Pálido Florescentes");

        translationBuilder.add(MavesBlocks.OAK_BLOCK, "Tronco de Carvalho");
        translationBuilder.add(MavesBlocks.STRIPPED_OAK_BLOCK, "Tronco de Carvalho Descascado");
        translationBuilder.add(MavesBlocks.SPRUCE_BLOCK, "Tronco de Pinheiro");
        translationBuilder.add(MavesBlocks.STRIPPED_SPRUCE_BLOCK, "Tronco de Pinheiro Descascado");
        translationBuilder.add(MavesBlocks.BIRCH_BLOCK, "Tronco de Bétula");
        translationBuilder.add(MavesBlocks.STRIPPED_BIRCH_BLOCK, "Tronco de Bétula Descascado");
        translationBuilder.add(MavesBlocks.JUNGLE_BLOCK, "Tronco de Selva");
        translationBuilder.add(MavesBlocks.STRIPPED_JUNGLE_BLOCK, "Tronco de Selva Descascado");
        translationBuilder.add(MavesBlocks.ACACIA_BLOCK, "Tronco de Acácia");
        translationBuilder.add(MavesBlocks.STRIPPED_ACACIA_BLOCK, "Tronco de Acácia Descascado");
        translationBuilder.add(MavesBlocks.DARK_OAK_BLOCK, "Tronco de Carvalho Escuro");
        translationBuilder.add(MavesBlocks.STRIPPED_DARK_OAK_BLOCK, "Tronco de Carvalho Escuro Descascado");
        translationBuilder.add(MavesBlocks.MANGROVE_BLOCK, "Tronco de Mangue");
        translationBuilder.add(MavesBlocks.STRIPPED_MANGROVE_BLOCK, "Tronco de Mangue Descascado");
        translationBuilder.add(MavesBlocks.CHERRY_BLOCK, "Tronco de Cerejeira");
        translationBuilder.add(MavesBlocks.STRIPPED_CHERRY_BLOCK, "Tronco de Cerejeira Descascado");
        translationBuilder.add(MavesBlocks.PALE_OAK_BLOCK, "Tronco de Carvalho Pálido");
        translationBuilder.add(MavesBlocks.STRIPPED_PALE_OAK_BLOCK, "Tronco de Carvalho Pálido Descascado");
        translationBuilder.add(MavesBlocks.APPLE_TREE_BLOCK, "Tronco de Macieira");
        translationBuilder.add(MavesBlocks.STRIPPED_APPLE_TREE_BLOCK, "Tronco de Macieira Descascado");
        translationBuilder.add(MavesBlocks.AZALEA_BLOCK, "Caule de Azaleia");
        translationBuilder.add(MavesBlocks.STRIPPED_AZALEA_BLOCK, "Caule de Azaleia Descascado");
        translationBuilder.add(MavesBlocks.CACAO_TREE_BLOCK, "Tronco de Cacaueiro");
        translationBuilder.add(MavesBlocks.STRIPPED_CACAO_TREE_BLOCK, "Tronco de Cacaueiro Descascado");
        translationBuilder.add(MavesBlocks.RUBBER_BLOCK, "Tronco de Seringueira");
        translationBuilder.add(MavesBlocks.STRIPPED_RUBBER_BLOCK, "Tronco de Seringueira Descascado");
        translationBuilder.add(MavesBlocks.WILLOW_BLOCK, "Tronco de Salgueiro");
        translationBuilder.add(MavesBlocks.STRIPPED_WILLOW_BLOCK, "Tronco de Salgueiro Descascado");
        translationBuilder.add(MavesBlocks.CRIMSON_BLOCK, "Caule Carmesim");
        translationBuilder.add(MavesBlocks.STRIPPED_CRIMSON_BLOCK, "Caule Carmesim Descascado");
        translationBuilder.add(MavesBlocks.WARPED_BLOCK, "Caule Distorcido");
        translationBuilder.add(MavesBlocks.STRIPPED_WARPED_BLOCK, "Caule Distorcido Descascado");

        translationBuilder.add(MavesBlocks.PALE_PUMPKIN, "Abóbora Pálida");
        translationBuilder.add(MavesBlocks.CARVED_PALE_PUMPKIN, "Abóbora Pálida Esculpida");
        translationBuilder.add(MavesBlocks.PALE_JACK_O_LANTERN, "Abóbora Pálida de Halloween");
        translationBuilder.add(MavesBlocks.PALE_PUMPKIN_STEM, "Caule de Abóbora Pálida");
        translationBuilder.add(MavesBlocks.ATTACHED_PALE_PUMPKIN_STEM, "Caule de Abóbora Pálida Unido");

        translationBuilder.add(MavesBlocks.APPLE_TREE_LOG, "Tronco de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_WOOD, "Madeira de Macieira");
        translationBuilder.add(MavesBlocks.STRIPPED_APPLE_TREE_LOG, "Tronco de Macieira Descascado");
        translationBuilder.add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD, "Madeira de Macieira Descascada");
        translationBuilder.add(MavesBlocks.APPLE_TREE_LEAVES, "Folhas de Macieira");
        translationBuilder.add(MavesBlocks.APPLE_TREE_FLOWERING_LEAVES, "Folhas de Macieira Florescentes");
        translationBuilder.add(MavesBlocks.APPLE_TREE_FLOWERED_LEAVES, "Folhas de Macieira Florescentes");
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

        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_STEM, "Caule de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.STRIPPED_HANGING_BLACK_WIDOW_STEM, "Caule de Viúva Negra Suspensa Descascado");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_TAIL, "Folhas de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_HEAD, "Folhas de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_LEAVES_BODY, "Folhas de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_SAPLING, "Muda de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.POTTED_HANGING_BLACK_WIDOW_SAPLING, "Muda de Viúva Negra Suspensa Envasada");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_BLOCK, "Bloco de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_PLANKS, "Tábuas de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC, "Mosaico de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_BUTTON, "Botão de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_DOOR, "Porta de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_FENCE, "Cerca de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_FENCE_GATE, "Portão de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_HANGING_SIGN, "Placa Suspensa de Viúva Negra");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_WALL_HANGING_SIGN.toString(), "Placa Suspensa de Viúva Negra");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_PRESSURE_PLATE, "Placa de Pressão de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_SIGN, "Placa de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_WALL_SIGN.toString(), "Placa de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_SLAB, "Laje de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC_SLAB, "Laje de Mosaico de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_STAIRS, "Escadas de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_MOSAIC_STAIRS, "Escadas de Mosaico de Viúva Negra Suspensa");
        translationBuilder.add(MavesBlocks.HANGING_BLACK_WIDOW_TRAPDOOR, "Alçapão de Viúva Negra Suspensa");

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
