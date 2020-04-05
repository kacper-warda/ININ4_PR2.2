package com.company.devices;

import com.company.Saleable;
import com.company.creatures.Human;

public abstract class Device implements Saleable {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash >= price) {
            seller.cash += price;
            buyer.cash -= price;
            System.out.println(buyer.firstName + " bought " + this.toString() + " from " + seller.firstName + " for " + price);
        } else {
            throw new Exception("sorry, you have not enough money");
        }
    }
}
