package com.qa;

public class Car extends Vehicle{
//    CONSTRUCTOR - parameterless constructor by default
    public Car() {
        this("Ford", "Focus", COLOUR.Black);
    }
//    OVERLOADING - methods, writing something modifying them
    public Car(String make, String model) {
//        constructor chaining
        this(make, model, COLOUR.Black);
    }
    public Car(String make, String model, COLOUR colour) {
        super(make, model, colour);
//        this.make = make;
//        this.model = model;
//        this.colour = colour;
    }

    private int numberOfDoors;
    private static double carTax = 180.00;
    public static final double VAT = 20.00;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public static double getCarTax() {
        return carTax;
    }

    public static void setCarTax(double carTax) {
        Car.carTax = carTax;
    }

//    by default a subclass of java.lang.object
//    what is this class for?
//    how will it be used?
//    DESIGN
//    create a good abstraction of a car
//    DATA
//    fields aka instance variables

//    getters and setters - special methods that allow reading and writing of private fields

//    not necessary but a safety net - telling java that you are writing over a known entity
//    @override is just to make sure there is something with the exact signature that you're overriding
//    if not matching, give error upon compile
    @Override
    public String toString() {
//        return "Car make: " + this.make + " Car model: " + this.model + " Age: " + this.age + " Colour: " + this.colour;
//        if you're going to concatenate lots of strings together - use a string builder
//        String.format()
        String output = String.format("This car is a %s %s and is %d years old and is %s in colour", this.getMake(), this.getModel(), this.getAge(), this.getColour().toString().toLowerCase());
        return output;
    }

    public static boolean compare(Car c1, Car c2) {
        return c1.getAge() == c2.getAge();
    }

    @Override
    public String abstractMethod(String thing) {
        return "I am a car and this is an abstract method that I have overridden: " + thing;
    }
}
