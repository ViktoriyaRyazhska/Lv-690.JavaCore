package com.softserve.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Continent continent = Continent.NA;

        System.out.println("Please enter country name");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String country = br.readLine();

        switch (country.toLowerCase()) {
            case "china": case "japan": case "india":
                continent = Continent.ASIA;
                break;
            case "nigeria": case "egypt": case "kenya":
                continent = Continent.AFRICA;
                break;
            case "usa": case "canada": case "mexico":
                continent = Continent.NORTH_AMERICA;
                break;
            case "brazil": case "argentina": case "chile":
                continent = Continent.SOUTH_AMERICA;
                break;
            case "ukraine": case "poland": case"france":
                continent = Continent.EUROPE;
                break;
            case "australia":
                continent = Continent.AUSTRALIA;
                break;
            default:
                System.out.println("Please try another country!");
        }

        System.out.println("Continent: " + continent.getName());

    }
}
