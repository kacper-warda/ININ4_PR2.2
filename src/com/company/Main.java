package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;

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

        passat.sell(me, brotherInLow, 999.0);

        System.out.println(me.getCar());
        System.out.println(me.cash);
        System.out.println(brotherInLow.getCar());
        System.out.println(brotherInLow.cash);

    }
}
