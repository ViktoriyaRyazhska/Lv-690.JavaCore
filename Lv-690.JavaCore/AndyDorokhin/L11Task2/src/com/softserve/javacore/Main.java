package com.softserve.javacore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {

        //In the method main create an array of five plants. Check to work your exceptions

        List<Plant> plants = new ArrayList<>();

        try {
            plants.add(new Plant("rose", "white", 20));
            plants.add(new Plant("tulip", "red", 15));
            plants.add(new Plant("orchid", "purple", 10));
            //plants.add(new Plant("flower", "white", 5)); //should fail with PlantTypeException
            plants.add(new Plant("rose", "black", 5)); //should fail with ColorException

        }
        catch (PlantTypeException | ColorException ex) {
            System.out.println(ex.getClass().getSimpleName() + " : " + ex.getMessage());
            //ex.printStackTrace();
        }
        finally {
            System.out.println("Plants added:" + plants.size());
            for (Plant plant : plants) {
                System.out.println(plant);
            }
        }

    }
}
