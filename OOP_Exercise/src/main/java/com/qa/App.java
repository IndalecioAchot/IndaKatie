package com.qa;

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
        Pub pub1 = new Pub("Manchester");
        pub1.setCloseTime(2260);
        System.out.println(pub1.getCloseTime());

        pub1.addDrink("vodka");
        System.out.println(pub1.getDrinkList());
        pub1.removeDrink("madri");
        System.out.println(pub1.getDrinkList());
        System.out.println(pub1);
    }
}
