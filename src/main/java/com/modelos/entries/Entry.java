package com.modelos.entries;

/**
 * Entries is the first product family.
 */
public abstract class Entry {

    private String servingSize;

    public String getServingSize() {
        return servingSize;
    }

    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    public abstract void serve();

}
