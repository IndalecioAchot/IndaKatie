package com.qa;

public class Animal {
    public Animal() {
        this(3, 0.1, "Ant");
    }

    public Animal(int age, double height, String species) {
        this.age = age;
        this.height = height;
        this.species = species;
    }

    private int age;
    private double height;
    private String species;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return String.format("The %s is %d years old and is %.2f in height",
                this.getSpecies(), this.getAge(), this.getHeight());
    }
}
