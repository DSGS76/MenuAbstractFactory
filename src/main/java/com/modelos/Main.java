package com.modelos;

import com.modelos.client.Client;
import com.modelos.factories.GourmetMenuFactory;
import com.modelos.factories.HealthyMenuFactory;
import com.modelos.factories.MenuFactory;
import com.modelos.factories.VegetarianMenuFactory;

/**
 * Example of abstract factory implementation with the case of the menus from a restaurant
 * Author: Duvan Gil
 * Main class. Everything comes together here.
 */
public class Main {

    /**
     * Application picks the factory type and creates it in run time
     */
    private static Client configureClient() {

        Client client;
        MenuFactory factory;

        String menuName = ("gourmet").toLowerCase();
        if (menuName.contains("vegetarian")) {
            factory = new VegetarianMenuFactory();
        } else if (menuName.contains("gourmet")) {
            factory = new GourmetMenuFactory();
        } else {
            factory = new HealthyMenuFactory();
        }

        client = new Client("Duvan", factory);
        return client;
    }

    public static void main(String[] args) {
        Client client = configureClient();
        client.serveAll();
    }

}