package com.qa;

import java.util.ArrayList;

/**
 * OOP Practice
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        oopWalkThrough();
//        carExample();
//        stringFormat();
//        arrays();
        methodPractice();
    }

    public static void methodPractice() {
        Bus redBus = new Bus();
        redBus.setColour(COLOUR.Red);
        System.out.println(redBus.requestStop());
        redBus.setNumberOfDecks(2);
        System.out.println(redBus);
        System.out.println("Make is " + redBus.getMake());

        String message = redBus.concreteInheritedMethod("banana");
        System.out.println(message);
        System.out.println(redBus.concreteInheritedOverriddenMethod("plum"));

//        Vehicle v = new Vehicle();
//        System.out.println(v);
        System.out.println(redBus.abstractMethod("Satsuma"));
        Car c1 = new Car();
        Car c2 = new Car();
        System.out.println(c1.abstractMethod("Grapes"));
        ArrayList<Vehicle> vehicles = new ArrayList<>();
//        can add child class objects in parent class aray list
        vehicles.add(c1);
        vehicles.add(c2);
        vehicles.add(redBus);

//        bus can also have a type vehicle
        Vehicle blueBus = new Bus();
        blueBus.setColour(COLOUR.Blue);
        if (blueBus instanceof Bus) {
            Bus actualBlueBus = (Bus) blueBus;
            actualBlueBus.setNumberOfDecks(2);
            System.out.println(actualBlueBus.getNumberOfDecks());
        }
        System.out.println("========================================");

//        polymorphism!!!
//        runtime type and compile type are different - they always look for the most derived type
        for (Vehicle v : vehicles) {
            System.out.println(v);
            System.out.println(v.concreteInheritedMethod("apple"));
            System.out.println(v.concreteInheritedOverriddenMethod("overridden pear"));
//            System.out.println(v.abstractMethod("abstract melon"));
            washVehicle(v);
        }
    }

    public static void washVehicle(Vehicle dirtyVehicle) {
        System.out.println(dirtyVehicle.abstractMethod("Soap"));
    }

    private static void oopWalkThrough() {
        //        object instantiation
        Car sheilasCar;
        sheilasCar = new Car();
        String makeOfSheilasCar = sheilasCar.getMake();
        System.out.println("The make of Sheila's car is: " + makeOfSheilasCar);
        System.out.println("The model of Sheila's car is: " + sheilasCar.getModel());
        sheilasCar.setColour(COLOUR.White);
        System.out.println("Sheila's car is " + sheilasCar.getColour());

        Car gracesCar = new Car();
        System.out.println("Grace: " + gracesCar.getMake() + " " + gracesCar.getModel());
        gracesCar.setColour(COLOUR.Blue);
        System.out.println("Grace's car is " + gracesCar.getColour());

        sheilasCar.setAge(2);
        gracesCar.setAge(96);
        System.out.println("Sheila's car is " + sheilasCar.getAge() + " years old");
        System.out.println("Grace's car is " + gracesCar.getAge() + " years old");

        System.out.println(sheilasCar.toString());
        System.out.println(gracesCar.toString());
//        sout only prints string so toString is automatically called
        System.out.println(gracesCar);
//        sheilasCar = null;

        System.out.println(sheilasCar.stop());
//        method overloading
        System.out.println(gracesCar.start());
        System.out.println(gracesCar.start("Retina scan"));

        Car evelynsCar = new Car("Mini", "Cooper", COLOUR.Red);
        System.out.println(evelynsCar);
        Car billsCar = new Car("Austin", "Allegro");
        System.out.println(billsCar);
    }

    public static void carExample() {
//        object instantiation
        Car lisaCar = new Car();
//        variable does not have the object, but instead is a pointer to where the class is
//        object on the managed heap, variables on the stack
        String lisa = lisaCar.toString();
        System.out.println(lisa);

        Car bartCar = new Car();
        System.out.println(bartCar.toString());

        boolean isSame = bartCar.equals(lisaCar);
        System.out.println(isSame);
    }

    public static void stringFormat() {
        String greeting = "Hello World";

        int x = 5, y = 12;
        String result = String.format("X: %d and Y: %d are the same: %b", x, y, x==y);
        System.out.println(result);
    }

    public static void arrays() {
        int[] luckyNumbers = new int[4];

//        indexing or subscript notation
        luckyNumbers[0] = 7;
        luckyNumbers[1] = 13;
        luckyNumbers[2] = 21;
        luckyNumbers[3] = 1;
//        if going out of bound, will generate an index out of bound exception
        for (int i = 0; i < luckyNumbers.length; i++) {
            System.out.println(luckyNumbers[i]);
        }
//        'for each' loop: 'enhanced for loop'
        for (int number : luckyNumbers) {
            System.out.println(number);
        }

        String[] food = new String[3];
        food[0] = "Chicken";
        food[1] = "Kebabs";
        food[2] = "Spag Bol";

        for (String item : food) {
            System.out.println(item);
        }

        Car[] muppetCars = new Car[2];
        Car kermitCar = new Car();
        Car missPiggyCar = new Car();
        muppetCars[0] = kermitCar;
        muppetCars[1] = missPiggyCar;

        Car[] cars = {new Car(), new Car("Nissan", "Qashqai")};
        for (Car c : cars) {
            c.setAge(2);
            System.out.println(c);
        }
    }
}
