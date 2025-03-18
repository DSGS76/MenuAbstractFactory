package com.modelos.factories;

import com.modelos.desserts.Dessert;
import com.modelos.drinks.Drink;
import com.modelos.entries.Entry;
import com.modelos.mainCourses.MainCourse;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface MenuFactory {

    Entry createEntry();
    MainCourse createMainCourse();
    Drink createDrink();
    Dessert createDessert();

}
