package com.company;

import com.company.creatures.Human;

public interface Saleable {
    void sell(Human seller, Human buyer, Double price) throws Exception;
}
