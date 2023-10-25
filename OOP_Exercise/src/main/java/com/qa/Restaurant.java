package com.qa;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Restaurant extends Establishment {
    public Restaurant(ArrayList<String> foodList) {
        super("George","Manchester", 1100, 2200, 4.50);
        this.foodList = foodList;
    }

    private ArrayList<String> foodList;

    public ArrayList<String> getFoodList() {
        return foodList;
    }
    public void addFood(String food) {
        food = food.toLowerCase();
        if (!this.foodList.contains(food)) {
            this.foodList.add(food);
        }
    }

    public void removeDrink(String food) {
        food = food.toLowerCase();
        this.foodList.remove(food);
    }

    @Override
    public String toString() {
        return String.format("The %s restaurant opens at %04d and closes at %04d and has a rating of %.2f",
                this.getLocation(), this.getOpenTime(), this.getCloseTime(), this.getRating());
    }

    @Override
    public String statement() {
<<<<<<< HEAD
        return "This is the " + this.getName()+ " restaurant located in " + this.getLocation();
    }

=======
        return null;
    }
>>>>>>> ef8ae2ed303be7165133697ef9e87ca73c45e4b7
}
