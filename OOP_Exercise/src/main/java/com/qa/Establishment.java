package com.qa;

import java.util.Arrays;
import java.util.List;

public class Establishment {
    public Establishment() {
        this("Manchester", 900, 2330, 4.50);
    }
    public Establishment(String location, int openTime, int closeTime, double rating) {
        this.location = location;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.rating = rating;
    }

    private String location;
    private int openTime;
    private int closeTime;
    private double rating;

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
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
