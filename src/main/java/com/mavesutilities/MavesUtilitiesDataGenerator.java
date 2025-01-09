package com.mavesutilities;

import com.mavesutilities.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MavesUtilitiesDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(MavesBlockTagProvider::new);
        pack.addProvider(MavesLootTableProvider::new);
        pack.addProvider(MavesModelProvider::new);
        pack.addProvider(MavesRecipeProvider::new);
    }
}