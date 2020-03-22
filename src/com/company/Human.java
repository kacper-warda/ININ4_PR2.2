package com.company;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary;


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
        if (this.salary > car.value) {
            System.out.println("you bought is by cash");
            this.car = car;
        } else if (this.salary >= car.value / 12) {
            System.out.println("you bought it on credit");
            this.car = car;
        } else {
            System.out.println("sorry, first ask for a rise");
        }
    }
}
