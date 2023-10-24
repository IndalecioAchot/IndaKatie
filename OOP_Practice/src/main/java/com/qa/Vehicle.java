package com.qa;

public abstract class Vehicle {
    public Vehicle() {
        this("Unknown", "Unknown", COLOUR.White);
    }
    public Vehicle(String make, String model, COLOUR colour) {
        this.make = make;
        this.model = model;
        this.colour = colour;
    }

    private String make;
    private String model;
    private COLOUR colour;
    private int age;
    private int speed;

    public String getMake() {
//        e.g. can be used to convert units
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public COLOUR getColour() {
        return this.colour;
    }
    public void setColour(COLOUR colour) {
        this.colour = colour;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        if (age >= 0 && age < 70) {
            this.age = age;
        }
//        can throw an exception, but it can be expensive
//        needs to validate in setter
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //    BEHAVIOURAL METHODS
    public String start() {
        return String.format("The %s car has started", this.getColour().toString().toLowerCase());
    }

    //    overload the start method by changing signatures
    public String start(String means) {
        return String.format("The %s car has started using a %s", this.getColour().toString().toLowerCase(), means);
    }

    public String stop(){
        return String.format("The %s car has stopped", this.getColour().toString().toLowerCase());
    }

    public String concreteInheritedMethod(String thing) {
        return "I am a concrete inherited method and my thing is: " + thing;
    }

    public String concreteInheritedOverriddenMethod(String thing) {
        return "I am a concrete inherited overridden method and my thing is: " + thing;
    }

//    abstract methods do not contain implementation code
//    a single abstract member means your class must also be abstract
    public abstract String abstractMethod(String thing);
}
