package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Jacek";
        me.lastName = "Placek";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";
        me.pet.feed();

        System.out.println(me.pet.name);

        Animal dog = new Animal("dog");
        dog.name = "Akita";
        me.pet = dog;

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();

        me.setSalary(2000.0);
        Car passat = new Car("Volkswagen", "Passat", 1984, 1.9, "Red");
        me.setCar(passat);
        System.out.println("I'm driving " + me.getCar().model);

        Human myWife = new Human();
        myWife.firstName = "Karolina";
        myWife.lastName = "Warda";
        myWife.setSalary(32000.0);
        myWife.setCar(passat);

        System.out.println(me.getCar());
        System.out.println(myWife.getCar());

        System.out.println(me);
        System.out.println(me.species);
        me.feed();

        me.pet.beEaten();

        Human brotherInLow = new Human();
        brotherInLow.setSalary(1000.0);
        brotherInLow.firstName = "Mateusz";
        brotherInLow.lastName = "Skiba";

        passat.sell(me, brotherInLow, 50.0);

        System.out.println(me.getCar());
        System.out.println(me.cash);
        System.out.println(brotherInLow.getCar());
        System.out.println(brotherInLow.cash);


        me.phone = new Phone("Nokia", "3310", 2000);

        String[] apps = {"mesendżer", "łazap", "wow"};
        System.out.println(Arrays.toString(apps));
        Arrays.sort(apps);
        System.out.println(Arrays.toString(apps));

        Integer[] numbers = {1, 4324, -3, 243};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        me.phone.installAnApp(apps);


        Scanner in = new Scanner(System.in);

        me.farm[0] = new Animal("cat");
        me.farm[1] = new Animal("dog");
        me.farm[2] = null;
        me.farm[3] = new Animal("horse");

//        me.farm[2].weight = 2.0;
        me.farm[3].weight = 12.0;
        me.farm[1].weight = 1112.0;
        me.farm[0].weight = 1002.0;


        System.out.println(Arrays.toString(me.farm));
        Arrays.sort(me.farm, new AnimalWeightComparator());

        System.out.println(Arrays.toString(me.farm));


        List<Animal> animals = new LinkedList<Animal>();
        Animal cat = new Animal("cat");
        Animal parrot = new Animal("parrot");

        animals.add(cat);
        animals.add(parrot);
        animals.add(cat);
        animals.add(parrot);
        animals.add(cat);
        animals.add(parrot);
        System.out.println(animals);


        Collections.sort(animals, new AnimalWeightComparator());


        System.out.println(animals);


        Set<Animal> setOfAnimals = new HashSet<>();
        setOfAnimals.add(cat);
        setOfAnimals.add(cat);
        setOfAnimals.add(cat);
        setOfAnimals.add(cat);
        setOfAnimals.add(cat);
        setOfAnimals.add(cat);
        System.out.println(setOfAnimals.size());


        List<String> names = new LinkedList<>();
        names.add("Kacper");
        names.add("Janusz");
        names.add("Mirek");
        names.add("Marlena");

        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

        List<Double> doubles = new LinkedList<>();
        doubles.add(3.0);
        doubles.add(32.0);
        doubles.add(-3.0);
        doubles.add(-42343.0);
        doubles.add(3.1);
        System.out.println(doubles);
        Collections.sort(doubles);
        System.out.println(doubles);
    }
}
