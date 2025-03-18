package com.modelos.client;

import com.modelos.desserts.Dessert;
import com.modelos.drinks.Drink;
import com.modelos.entries.Entry;
import com.modelos.factories.MenuFactory;
import com.modelos.mainCourses.MainCourse;

public class Client {

    private String name;
    private Entry entry;
    private MainCourse mainCourse;
    private Drink drink;
    private Dessert dessert;

    public Client(String name, MenuFactory factory) {
        this.name = name;
        entry = factory.createEntry();
        mainCourse = factory.createMainCourse();
        drink = factory.createDrink();
        dessert = factory.createDessert();
    }

    public void serveAll() {
        System.out.println("Hi " + name + ". ");
        entry.serve();
        mainCourse.serve();
        drink.serve();
        dessert.serve();
    }

    public void serveEntry() {
        System.out.println("Hi " + name + ". ");
        entry.serve();
    }

    public void serveMainCourse() {
        System.out.println("Hi " + name + ". ");
        mainCourse.serve();
    }

    public void serveDrink() {
        System.out.println("Hi " + name + ". ");
        drink.serve();
    }

    public void serveDessert() {
        System.out.println("Hi " + name + ". ");
        dessert.serve();
    }

}
