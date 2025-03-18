package com.modelos.mainCourses;

/**
 * Main courses is the second product family.
 */
public abstract class MainCourse {

    private Double protein;

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public abstract void serve();

}
