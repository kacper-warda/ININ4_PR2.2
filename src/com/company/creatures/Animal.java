package com.company.creatures;

import com.company.Saleable;

import java.io.File;

public class Animal implements Edible, Saleable {
    public final String species;
    protected Double weight;
    public String name;
    File pic;

    public static final Double DEAFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEAFAULT_MOUSE_WEIGHT = 0.01;
    public static final Double DEAFAULT_LION_WEIGHT = 123.0;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = DEAFAULT_DOG_WEIGHT;
                break;
            case "mouse":
                this.weight = DEAFAULT_MOUSE_WEIGHT;
                break;
            case "lion":
                this.weight = DEAFAULT_LION_WEIGHT;
                break;
        }

    }

    public void feed() {
        if (weight > 0.0) {
            weight++;
            System.out.println("thx for food bro, " + weight + "kg");
        } else {
            System.out.println("Man! Your dog is dead you cannot feed him");
        }
    }

    public void takeForAWalk() {
        weight--;
        if (weight > 0.0) {
            System.out.println("thx for taking me for walk, " + weight + "kg");
        } else {
            System.out.println("Man! Your dog is dead you cannot take him for a walk");
            System.out.println("Your dog is dead");
        }

    }

    public boolean imDead() {
        if (weight <= 0.0) {
            System.out.println("Your animal is dead");
            return false;
        } else {
            return true;
        }

    }

    public String toString() {
        return this.species + " " + this.name;
    }

    @Override
    public void beEaten() throws Exception {
        if (this instanceof Human) {
            throw new Exception("no way you cannibal!!!!!!!!11!1!");
        } else {
            System.out.println("adioooooooooooooos");
            this.weight = 0.0;
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("no way");
        } else {
            if (buyer.cash >= price) {
                seller.cash += price;
                buyer.cash -= price;
                buyer.pet = this;
                if (seller.pet == this) {
                    seller.pet = null;
                }
                System.out.println(buyer.firstName + " bought " + this.toString() + " from " + seller.firstName + " for " + price);
            } else {
                throw new Exception("sorry, you have not enough money");
            }
        }
    }
}

