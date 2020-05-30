package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private Car car;
    private Double salary;
    public Double cash;
    public final static Integer DEFAULT_FARM_SIZE = 4;

    public final static Double DEFAULT_HUMAN_WEIGHT = 70.0;
    public Animal[] farm;

    public Human() {
        super("homo sapiens sapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.cash = 1000.0;
        this.farm = new Animal[DEFAULT_FARM_SIZE];
    }

    public Human(Integer farmSize) {
        super("homo sapiens sapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.cash = 1000.0;
        this.farm = new Animal[farmSize];
    }

    public Human(Double cash) {
        super("homo sapiens sapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.cash = cash;
    }

    public Human(Double cash, Double weight) {
        super("homo sapiens sapiens");
        this.weight = weight;
        this.cash = cash;
    }


    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        System.out.println("Your salary is now: " + salary);
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
//        if (this.salary > car.value) {
//            System.out.println("you bought is by cash");
        this.car = car;
//        } else if (this.salary >= car.value / 12) {
//            System.out.println("you bought it on credit");
//            this.car = car;
//        } else {
//            System.out.println("sorry, first ask for a rise");
//        }
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    public void sell() throws Exception {
        throw new Exception("no way");
    }

    public void feed() {
        System.out.println("gimme fork and knife");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        throw new Exception("no way");
    }
}
