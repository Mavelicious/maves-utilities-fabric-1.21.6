package com.mavesutilities;

import com.mavesutilities.datagen.*;
import com.mavesutilities.world.*;
import net.fabricmc.fabric.api.datagen.v1.*;
import net.minecraft.client.data.ModelSupplier;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class MavesUtilitiesDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(MavesRegistryDataGenerator::new);
        pack.addProvider(MavesBlockTagProvider::new);
        pack.addProvider(MavesItemTagProvider::new);
        pack.addProvider(MavesLootTableProvider::new);
        pack.addProvider(MavesRecipeProvider::new);
        pack.addProvider(EnglishLangProvider::new);
        pack.addProvider(PortuguesLangProvider::new);
        BiConsumer<Identifier, ModelSupplier> modelCollector = (identifier, modelSupplier) -> {
        };
        pack.addProvider((FabricDataGenerator.Pack.Factory<MavesModelProvider>)
                output -> new MavesModelProvider(output, modelCollector));
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, MavesConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, MavesPlacedFeatures::bootstrap);
    }
}