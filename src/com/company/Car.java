package com.company;

public class Car {
    final String mark;
    final String model;
    final Integer yearOfProduction;
    final Double engineCapacity;
    final String colour;
    Double value;

    public Car(String mark, String model, Integer yearOfProduction, Double engineCapacity, String colour) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.colour = colour;

        this.value = 20000.0;
    }
}
