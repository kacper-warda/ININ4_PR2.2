package com.company.devices;

public class Car {
    final public String mark;
    final public String model;
    final public Integer yearOfProduction;
    final public Double engineCapacity;
    final public String colour;
    public Double value;

    public Car(String mark, String model, Integer yearOfProduction, Double engineCapacity, String colour) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.colour = colour;

        this.value = 20000.0;
    }

    public String toString() {
        return mark + " " + model + " " + yearOfProduction;
    }
}
