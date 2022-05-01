package com.javalesson.chapter1.task0;

import java.util.Scanner;

public class LoopSolution {
    public static void main(String []args){
        System.out.println("Please enter a number of execution cycles");
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
        System.out.println("Please enter parameters");
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int accumulator = a;
            for(int j=0; j<n; j++){
                int x = (int)Math.pow(2,j);
                accumulator = accumulator + x * b;
                System.out.print(accumulator+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
