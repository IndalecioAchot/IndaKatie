package com.qa;
import java.util.ArrayList;
import java.util.List;

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
        Pub[] pubs = {new Pub("Kings Head","Brighton"),
                new Pub("David's","Plymouth", 1800, 200, 4.95),
                new Pub("Indas","London", 1100, 2300, 2.49)};

        for (Pub item: pubs)
        {
            System.out.println(item);
            item.addDrink("Estrella Galicia");
            System.out.println(item.getDrinkList());
        }

        ArrayList<Establishment> establishmentFlexible = new ArrayList<>();
        establishmentFlexible.add(new Pub("Wetherspoons","Edinburgh"));
        establishmentFlexible.add(new Pub("Wetherspoons","Glasgow", 700, 1700, 0.35));
        establishmentFlexible.add(new Restaurant(new ArrayList<String>()));

        for (Establishment item: establishmentFlexible)
        {
            item.setOpenTime(1300);
            System.out.println(item);
            System.out.println(item.statement());;

        }

        Car ford = new Car();
        Pub pub1 = new Pub("The Bull", "Birmingham");
        Restaurant restaurant1 = new Restaurant(new ArrayList<String>());
        List<IHireable> hireableEstablishments = new ArrayList<>() {
            {add(ford); add(pub1); add(restaurant1);}
        };

        boolean tattoos = true;

        for (IHireable establishment : hireableEstablishments) {
            System.out.println(establishment.hire(tattoos));
        }






    }
}
