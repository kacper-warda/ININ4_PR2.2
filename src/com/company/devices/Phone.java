package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device {

    public Phone(String mark, String model, Integer yearOfProduction) {
        super(mark, model, yearOfProduction);
    }

    @Override
    void turnOn() {
        System.out.println("hello kitty");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        try {
            super.sell(seller, buyer, price);

            buyer.phone = this;
            if (seller.phone == this) {
                seller.phone = null;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
