package com.company.devices;

public class Phone extends Device {

    public Phone(String mark, String model, Integer yearOfProduction) {
        super(mark, model, yearOfProduction);
    }

    @Override
    void turnOn() {
        System.out.println("hello kitty");
    }
}
