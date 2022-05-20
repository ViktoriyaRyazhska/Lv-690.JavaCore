package com.company;

import java.util.Comparator;

public class ComparatorPassengers implements Comparator<Passengers> {

    @Override
    public int compare(Passengers o1, Passengers o2) {
        return o1.getPassengers() - o2.getPassengers();
    }
}
