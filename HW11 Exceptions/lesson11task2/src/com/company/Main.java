package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<Plant> plants = new ArrayList<>();

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Color color1;
    static Type type1;
    static int size1;

    public static void input() throws ColorException, TypeException, SizeException {
        for (int i = 0; i < 2; i++) {
            color1 = correctColor();
            type1 = correctType();
            size1 = correctSize();
            addToList();
        }
    }

    public static void addToList() throws ColorException, TypeException, SizeException {
        plants.add(new Plant(size1, color1, type1));
    }

    public static Color correctColor() throws ColorException {
        Color color = null;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Enter the color");
                String color2 = br.readLine();
                color = Plant.convertColorToEnum(color2);
                flag = false;
            } catch (ColorException | IOException e) {
                System.err.println(e.getMessage());
            }
        }
        return color;
    }

    public static Type correctType() throws TypeException {
        Type type = null;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Enter the type");
                String type2 = br.readLine();
                type = Plant.convertTypeToEnum(type2);
                flag = false;
            } catch (TypeException | IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return type;
    }

    public static int correctSize() throws SizeException {
        int size2 = 0;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Enter the size");
                size2 = Integer.parseInt(br.readLine());
                if (size2 <= 0) {
                    throw new SizeException("Incorrect size");
                } else {
                    flag = false;
                }
            } catch (InputMismatchException | SizeException | IOException|NumberFormatException exc) {
                if (exc.getClass().equals(InputMismatchException.class)) {
                } else {
                    System.err.println(exc.getMessage());
                }
            }

        }
        return size2;
    }


    public static void main(String[] args) throws ColorException, TypeException, SizeException {
        input();
        System.out.println(plants);
    }
}
