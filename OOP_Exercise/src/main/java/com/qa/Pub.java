package com.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pub {

    public Pub(String location) {
        this(location, 900, 2330, 4.50);
    }

    public Pub(String location, int openTime, int closeTime, double rating) {
        this.location = location;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.rating = rating;
        List<String> tempList = Arrays.asList("carling", "madri", "guinness", "g&t", "asahi", "1664", "carlsberg");
        this.drinkList.addAll(tempList);
    }

    private String location;
    private int openTime;
    private int closeTime;
    private double rating;
    private ArrayList<String> drinkList = new ArrayList<>();
//    private String[] drinks = {"carling", "madri", "guinness", "g&t", "asahi", "1664", "carlsberg"};

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        }
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        int closeHour = closeTime / 100;
        int closeMinute = closeTime % 100;
        if (closeHour <= 24 && closeMinute < 60 && closeHour >= 0 && closeMinute >= 0) {
            this.closeTime = closeTime;
        }
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        int openHour = openTime / 100;
        int openMinute = openTime % 100;
        if (openHour <= 24 && openMinute < 60 && openHour >= 0 && openMinute >= 0) {
            this.openTime = openTime;
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

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
}
