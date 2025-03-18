package com.modelos.factories;

import com.modelos.desserts.Dessert;
import com.modelos.desserts.RedFruitYogurt;
import com.modelos.drinks.Drink;
import com.modelos.drinks.Tea;
import com.modelos.entries.Entry;
import com.modelos.entries.Quinoa;
import com.modelos.mainCourses.MainCourse;
import com.modelos.mainCourses.SteakWithVegetables;

public class HealthyMenuFactory implements MenuFactory {

    private double proteinQuantity;

    public double getProteinQuantity() {
        return proteinQuantity;
    }

    public void setProteinQuantity(double proteinQuantity) {
        this.proteinQuantity = proteinQuantity;
    }

    @Override
    public Entry createEntry() {
        return new Quinoa();
    }

    @Override
    public MainCourse createMainCourse() {
        return new SteakWithVegetables();
    }

    @Override
    public Drink createDrink() {
        return new Tea();
    }

    @Override
    public Dessert createDessert() {
        return new RedFruitYogurt();
    }

}
