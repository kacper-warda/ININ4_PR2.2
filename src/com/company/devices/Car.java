package com.company.devices;

import com.company.creatures.Human;

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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        try {
            super.sell(seller, buyer, price);
            buyer.setCar(this);
            if (seller.getCar() == this) {
                seller.setCar(null);
            }
        } catch (Exception e) {
            System.out.println("transaction aborted");
            throw e;
        }
    }
}
