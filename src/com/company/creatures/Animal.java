package com.company.creatures;

import java.io.File;
import java.sql.SQLOutput;

public class Animal {
    public final String species;
    private Double weight;
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
}

