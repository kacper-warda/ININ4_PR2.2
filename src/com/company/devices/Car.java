package com.company.devices;

public class Car extends Device {
    final public Double engineCapacity;
    final public String colour;

    public Car(String mark, String model, Integer yearOfProduction, Double engineCapacity, String colour) {
        super(mark, model, yearOfProduction);
        this.engineCapacity = engineCapacity;
        this.colour = colour;

        this.value = 20000.0;
    }

    @Override
    void turnOn() {
        System.out.println("engine is on");
    }

}
