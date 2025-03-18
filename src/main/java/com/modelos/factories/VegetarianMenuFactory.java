package com.modelos.factories;

import com.modelos.desserts.Brownie;
import com.modelos.desserts.Dessert;
import com.modelos.drinks.Drink;
import com.modelos.drinks.Lemonade;
import com.modelos.entries.Entry;
import com.modelos.entries.Salad;
import com.modelos.mainCourses.MainCourse;
import com.modelos.mainCourses.VegetableRoll;

public class VegetarianMenuFactory implements MenuFactory {

    private Boolean isVegan;

    public Boolean getVegan() {
        return isVegan;
    }

    public void setVegan(Boolean vegan) {
        isVegan = vegan;
    }

    @Override
    public Entry createEntry() {
        return new Salad();
    }

    @Override
    public MainCourse createMainCourse() {
        return new VegetableRoll();
    }

    @Override
    public Drink createDrink() {
        return new Lemonade();
    }

    @Override
    public Dessert createDessert() {
        return new Brownie();
    }
}
