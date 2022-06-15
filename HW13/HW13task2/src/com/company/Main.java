package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    static BufferedReader br = null;
    static String outputWord = "";
    static int outpunNumber;
    static String newWord = "";
    static String oldWord = "";
    final static List<String> str = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j" ,
             "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "y", "z");

    public static String enctypt(String outputWord , int outpunNumber){
        for (int i = 0; i < outputWord.length(); i++) {
            for(int j = 0; j < str.size(); j++){
                if (outputWord.charAt(i) == str.get(j).charAt(0)){
                    newWord += str.get(j+outpunNumber);
                }
            }
        }
        return newWord;
    }

    public static String decrypt(String newWord , int outpunNumber){
        for (int i = 0; i < newWord.length(); i++) {
            for(int j = 0; j < str.size(); j++){
                if (newWord.charAt(i) == str.get(j).charAt(0)){
                    oldWord += str.get(j-outpunNumber);
                }
            }
        }
        return oldWord;
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word: ");
        outputWord = br.readLine().toLowerCase();
        System.out.println("Enter the number: ");
        outpunNumber = Integer.parseInt(br.readLine());

        System.out.println("Coded word: " + enctypt(outputWord , outpunNumber));
        System.out.println("Decoded word: " + decrypt(newWord , outpunNumber));
    }
}
