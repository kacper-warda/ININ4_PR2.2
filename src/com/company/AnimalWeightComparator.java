package com.company;

import com.company.creatures.Animal;

import java.util.Comparator;

public class AnimalWeightComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1 == null && o2 == null) {
            return 0;
        } else if (o1 == null) {
            return -1;
        } else if (o2 == null) {
            return 1;
        }

        return (int) (o1.weight - o2.weight);
    }
}
