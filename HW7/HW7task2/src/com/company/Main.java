package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    Wrapper<Integer> w1 = new Wrapper<>(47);
    Wrapper<String > w2 = new Wrapper<>("Artem");
    Wrapper<Boolean> w3 = new Wrapper<>(true);

        List<Wrapper> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);

        for (Wrapper i : list){
            System.out.println(i.getValue());
        }
    }
}
