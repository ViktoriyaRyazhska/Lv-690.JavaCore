package com.company;

public class Month {
    public int printNumberOfMonth(int input) {

        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int result = 0;
        for (int i = 0; i < month.length; i++) {
            if (input == i) {
                result = month[i];
            }
        }
        return result;
    }
}

