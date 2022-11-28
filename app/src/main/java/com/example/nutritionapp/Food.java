package com.example.nutritionapp;

public class Food {

    private String name,description;
    private double fat, protein, carbohydrate;

    public Food(){}

    public Food(String name, String description, double fat, double protein, double carbohydrate){
        this.carbohydrate = carbohydrate;
        this.name = name;
        this.description = description;
        this.fat = fat;
        this.protein = protein;
    }

    public String getName() {
        return name;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public double getFat() {
        return fat;
    }

    public double getProtein() {
        return protein;
    }

    public String getDescription() {
        return description;
    }
}
