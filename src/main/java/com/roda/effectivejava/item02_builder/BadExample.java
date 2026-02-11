package com.roda.effectivejava.item02_builder;

/**
 * the telescoping constructor pattern works, but it is hard to write
 * client code when there are many parameters, and harder still to read it
 */
public class BadExample {
    private final int size;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public BadExample(int size, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.size = size;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public BadExample(int size, int servings, int calories, int fat, int sodium) {
        this(size, servings, calories, fat, sodium, 0);
    }

    public BadExample(int size, int servings, int calories, int fat) {
        this(size, servings, calories, fat, 0);
    }

    public BadExample(int size, int servings, int calories) {
        this(size, servings, calories, 0);
    }

    public BadExample(int size, int servings) {
        this(size, servings, 0);
    }

}
