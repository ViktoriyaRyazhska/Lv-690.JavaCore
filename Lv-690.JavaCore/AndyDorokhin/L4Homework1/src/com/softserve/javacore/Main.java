package com.softserve.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // read 3 float numbers and check: are they all belong to the range [-5,5]
        int counter = 1;
        while (counter <= 3) {
            try {
                System.out.println("Please enter a number: ");
                boolean inRange = Math.abs(Float.parseFloat(br.readLine())) <=5;
                System.out.println("belong to the range [-5,5]: " + inRange);
                counter++;
            }
            catch (NumberFormatException ex) {
                System.out.println("Please enter VALID number");
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("**********************");

        // read 3 integer numbers and write max and min of them;
        counter = 1;
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        while (counter <= 3) {
            try {
                System.out.println("Please enter an integer number: ");
                int num = Integer.parseInt(br.readLine());
                max = Integer.max(max, num);
                min = Integer.min(min, num);
                counter++;
            }
            catch (NumberFormatException ex) {
                System.out.println("Please enter VALID INTEGER number");
                System.out.println(ex.getMessage());
            }

        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("**********************");

        // read number of HTTP Error (400, 401,402, ...) and write the name of this error
        System.out.println("Please enter http error code, 400 to 410:");
        String httpcode = "CODE" + br.readLine();


        try {
            System.out.println("Code name: " + HTTPError.valueOf(httpcode).getName());
        }
        catch (IllegalArgumentException ex) {
            System.out.println("Please provide valid http error code, 400 to 410");
            System.out.println(ex.getMessage());
        }

    }


}
