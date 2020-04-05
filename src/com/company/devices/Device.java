package com.company.devices;

public abstract class Device {
    final public String mark;
    final public String model;
    final public Integer yearOfProduction;
    public Double value;

    public Device(String mark, String model, Integer yearOfProduction) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }


    public String toString() {
        return mark + " " + model + " " + yearOfProduction;
    }

    abstract void turnOn();
}
