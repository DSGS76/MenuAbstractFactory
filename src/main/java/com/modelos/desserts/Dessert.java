package com.modelos.desserts;

/**
 * Desserts is the fourth product family.
 */
public abstract class Dessert {

    private Double calories;

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public abstract void serve();

}
