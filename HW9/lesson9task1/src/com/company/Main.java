package com.company;

import java.util.Random;

import java.util.*;


public class Main {
    static List<Integer> myCollection = new ArrayList<>();
    static List<Integer> newCollection = new ArrayList<>();

        static void addValue(int a , int b){
            if (a <= myCollection.size()){
                myCollection.add(a , b);
            }
            else {
                System.out.println("Error");
            }
        }


    public static void main(String[] args) {

        Random r = new Random();
        for (int i = 0; i < 11; i++){
            myCollection.add(r.nextInt(45));
        }

        System.out.println(myCollection + " - my start collection");

        for (int i = 0; i < myCollection.size(); i++) {
            if (i > 4) {
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println(newCollection + " - my new collection");

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
                i--;
            }
        }
        System.out.println(myCollection + " - my new collection after deleted elements, which are greater then 20");

        addValue(3 , -1);
        System.out.println(myCollection);

        addValue(6 , -3);
        System.out.println(myCollection);

        addValue(8 , -5);
        System.out.println(myCollection);



        Collections.sort(myCollection);
        System.out.println(myCollection + " - my sort collection");



    }
}
