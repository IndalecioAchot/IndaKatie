package com.qa;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Animal cat = new Animal(5, 0.5, "Cat");
//        System.out.println(cat);
//
//        Animal ant = new Animal();
//        ant.setAge(1);
//        System.out.println(ant);
//        Pub pub1 = new Pub("Manchester");
//        pub1.setCloseTime(2260);
//        System.out.println(pub1.getCloseTime());
//
//        pub1.addDrink("vodka");
//        System.out.println(pub1.getDrinkList());
//        pub1.removeDrink("madri");
//        System.out.println(pub1.getDrinkList());
//        System.out.println(pub1);
        arrayExercise();

    }
    public static void arrayExercise()
    {
        Pub[] pubs = {new Pub("Brighton"),
                new Pub("Plymouth", 1800, 200, 4.95),
                new Pub("London", 1100, 2300, 2.49)};

        for (Pub item: pubs)
        {
            System.out.println(item);
            item.addDrink("Estrella Galicia");
            System.out.println(item.getDrinkList());
        }

        ArrayList<Pub> pubFlexible = new ArrayList<>();
        pubFlexible.add(new Pub("Edinburgh"));
        pubFlexible.add(new Pub("Glasgow", 700, 1700, 0.35));
        for (Pub item: pubFlexible)
        {
            item.setOpenTime(1300);
            System.out.println(item);
            System.out.println(item.getDrinkList());
        }
    }
}
