package com.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pub extends Establishment {

    public Pub(String name, String location) {
        this(name,location, 900, 2330, 4.50);
    }

    public Pub(String name, String location, int openTime, int closeTime, double rating) {
        super(name, location, openTime, closeTime, rating);
        List<String> tempList = Arrays.asList("carling", "madri", "guinness", "g&t", "asahi", "1664", "carlsberg");
        this.drinkList.addAll(tempList);
    }

    private ArrayList<String> drinkList = new ArrayList<>();
//    private String[] drinks = {"carling", "madri", "guinness", "g&t", "asahi", "1664", "carlsberg"};


    public void addDrink(String drink) {
        drink = drink.toLowerCase();
        if (!this.drinkList.contains(drink)) {
            this.drinkList.add(drink);
        }
    }

    public void removeDrink(String drink) {
        drink = drink.toLowerCase();
        this.drinkList.remove(drink);
    }

    public ArrayList<String> getDrinkList() {
        return this.drinkList;
    }

    @Override
    public String toString() {
        return String.format("The %s pub opens at %04d and closes at %04d and has a rating of %.2f",
                this.getLocation(), this.getOpenTime(), this.getCloseTime(), this.getRating());
    }

    @Override
    public String statement() {
        return "This is the " + this.getName()+ " pub located in " + this.getLocation();
    }
}
