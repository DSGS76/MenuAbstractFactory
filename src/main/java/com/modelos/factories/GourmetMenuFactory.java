package com.modelos.factories;

import com.modelos.desserts.Dessert;
import com.modelos.desserts.SourCream;
import com.modelos.drinks.Drink;
import com.modelos.drinks.Wine;
import com.modelos.entries.Ceviche;
import com.modelos.entries.Entry;
import com.modelos.mainCourses.BeefTenderloin;
import com.modelos.mainCourses.MainCourse;

public class GourmetMenuFactory implements MenuFactory {

    private String ingredientsOrigin;

    public String getIngredientsOrigin() {
        return ingredientsOrigin;
    }

    public void setIngredientsOrigin(String ingredientsOrigin) {
        this.ingredientsOrigin = ingredientsOrigin;
    }

    @Override
    public Entry createEntry() {
        return new Ceviche();
    }

    @Override
    public MainCourse createMainCourse() {
        return new BeefTenderloin();
    }

    @Override
    public Drink createDrink() {
        return new Wine();
    }

    @Override
    public Dessert createDessert() {
        return new SourCream();
    }

}
