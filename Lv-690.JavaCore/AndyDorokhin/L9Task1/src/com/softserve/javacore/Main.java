package com.softserve.javacore;

import java.util.*;
import java.util.ArrayList;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

	// Declare collection myCollection of 10 integers and fill it (from the console or random)
        ArrayList<Integer> myCollection = new ArrayList<>(List.of(
                (int)(Math.random() * 11),
                (int)(Math.random() * 21),
                (int)(Math.random() * 31),
                (int)(Math.random() * 41),
                (int)(Math.random() * 51),
                (int)(Math.random() * 61),
                (int)(Math.random() * 71),
                (int)(Math.random() * 81),
                (int)(Math.random() * 91),
                (int)(Math.random() * 101)));
        System.out.println(myCollection.getClass());
        System.out.println(myCollection);
        System.out.println(myCollection.size());

        // Find and save in list newCollection all positions of element more than 5 in the collection

        List<Integer> newCollection = new ArrayList<>();
        for (int index = 0; index < myCollection.size(); index++) {
            if (myCollection.get(index) > 5) {
                newCollection.add(index);
            }
        }
        System.out.println(newCollection);

        // Remove from collection myCollection elements, which are greater then 20
        Iterator<Integer> myIterator = myCollection.iterator();
        while (myIterator.hasNext()) {
            if (myIterator.next() > 20) {
                myIterator.remove();;
            }
        }
        System.out.println(myCollection);
        System.out.println(myCollection.size());


        // Insert elements 1, -3, -4 in positions 2, 8, 5
        // if after filtering values list size < 10, fill with 0
        if (myCollection.size() < 10) {
            myCollection.addAll(new ArrayList<Integer>(Collections.nCopies(10-myCollection.size() , 0)));
            System.out.println(myCollection);
        }
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        System.out.println(myCollection);
        for (int index = 0; index < myCollection.size(); index++) {
            System.out.println(String.format("position – %d, value of element – %d", index, myCollection.get(index)));
        }

        // Sort and print collection
        myCollection.sort(Integer::compareTo);
        System.out.println(myCollection);
    }

}
