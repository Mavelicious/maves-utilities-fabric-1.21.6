package com.mavesutilities.item;

import net.minecraft.component.type.FoodComponent;

public class MavesFoods {

    public static final FoodComponent GREEN_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.4f)
            .build();

    public static final FoodComponent PUMPKIN_SLICE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.4f)
            .build();

    public static final FoodComponent PALE_PUMPKIN_SLICE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build();

    public static final FoodComponent CHERRIES_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.2f)
            .build();

    public static final FoodComponent WILD_BERRIES_BLUE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.1f)
            .build();

    public static final FoodComponent WILD_BERRIES_GREEN_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.1f)
            .build();

    public static final FoodComponent WILD_BERRIES_YELLOW_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.1f)
            .build();

    public static final FoodComponent MILK_CHOCOLATE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(0.4f)
            .build();

    public static final FoodComponent WHITE_CHOCOLATE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent DARK_CHOCOLATE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.5f)
            .build();
}
