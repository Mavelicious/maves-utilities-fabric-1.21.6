package com.mavesutilities;

import com.mavesutilities.datagen.*;
import com.mavesutilities.world.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.*;

public class MavesUtilitiesDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();


        pack.addProvider(MavesBlockTagProvider::new);
        pack.addProvider(MavesItemTagProvider::new);
        pack.addProvider(MavesLootTableProvider::new);
        pack.addProvider(MavesModelProvider::new);
        pack.addProvider(MavesRecipeProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, MavesConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, MavesPlacedFeatures::bootstrap);
    }
}