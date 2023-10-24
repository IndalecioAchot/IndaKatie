package com.qa;

public class Bus extends Vehicle{
    public Bus(){
        super("Bojo", "Olympian", COLOUR.Red);
        this.setNumberOfDecks(2);
    }

    public Bus(String make, String model, COLOUR colour, int numberOfDecks) {
        super(make, model, colour);
        this.setNumberOfDecks(numberOfDecks);
    }
    private int numberOfDecks;

    public int getNumberOfDecks() {
        return numberOfDecks;
    }
    public void setNumberOfDecks(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }

    public String requestStop() {
        return "Driver has received request to stop at the next bus stop";
    }

    @Override
    public String concreteInheritedOverriddenMethod(String thing) {
        String base = super.concreteInheritedOverriddenMethod(thing);
        return base + " I am a bus and I overrode this method";
    }

    @Override
    public String abstractMethod(String thing) {
        return "BUS BUS BUS: " + thing;
    }
}
