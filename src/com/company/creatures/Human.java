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

    public final static Double DEFAULT_HUMAN_WEIGHT = 70.0;

    public Human() {
        super("homo sapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.cash = 1000.0;
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
}
