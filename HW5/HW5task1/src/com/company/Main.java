package com.company;

import sun.font.TrueTypeFont;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Bird> birds = new ArrayList();
        birds.add(new Eagle(true , false));
        birds.add(new Chicken(true , false));
        birds.add(new Penguin(false , true));
        birds.add(new Swallow(true , true));


        for (Bird i : birds){
            System.out.print(i + "  ");
            System.out.println(i.fly());
        }


    }
}
