package com.company;

public class Main {

    public static void main(String[] args) {
        int p = 0;
        int n = 0;
       int sum = 0;
       int amount = 0;

       int []arr = {2 , 3 ,1 ,10 , 34 , 7 ,-4 , -12 , 35 , -22};
       int b = arr[0];

       for (int i=0; i < arr.length ; i++ ) {
           if (arr[i] > b) {
               b = arr[i];
           }

           if (arr[i] > 0) {
               p++;
               sum += arr[i];
           }

           if (arr[i] < 0) {
               n++;
               amount += arr[i];
           }

       }

        if (p > n){
            System.out.println("positive values > negative values");
        }
        else {
            System.out.println("positive values < negative values");
        }


            System.out.println("positive values = " + p);
            System.out.println("negative values = " + n);

           System.out.println("biggest of these numbers: " + b);
           System.out.println("sum of positive numbers in the array: " + sum);
           System.out.println("amount of negative numbers in the array: " + amount);



    }
}
