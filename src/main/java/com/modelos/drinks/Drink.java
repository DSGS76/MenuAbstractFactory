package com.modelos.drinks;

/**
 * Drinks is the third product family.
 */
public abstract class Drink {

    private Double volume;

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public abstract void serve();

}
