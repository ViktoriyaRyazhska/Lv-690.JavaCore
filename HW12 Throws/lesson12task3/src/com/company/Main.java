package com.company;

import javafx.beans.binding.When;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = null;
    static String myText = "mytext.txt";
    static File file = new File(myText);
    static String line;
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        try {
            br = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    if (!((line = br.readLine()) != null)) break;
                } catch (IOException e) {
                    System.err.println(e.getMessage());;
                }
                line = line.trim();
                if(line.length() != 0){
                    list.add(line);
                }
            }
        }catch (FileNotFoundException e){
            System.err.println("File no found");
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

        int longestLine = list.get(0).length();
        int shortestLine = list.get(0).length();
        String longeststr = null;
        String shorteststr = null;

        for (String s : list){
            System.out.println(s.length());
            if (s.length() < shortestLine){
                shortestLine = s.length();
                shorteststr = s;
            }
        }
        System.out.println("Shortest line: " + shorteststr + " " + shortestLine);

        for (String s : list){
            if(s.contains("var")){
                System.out.println("Line which consist `var` " + s);
            }
            if (s.length() > longestLine){
                longestLine = s.length();
                longeststr = s;
            }
        }
        System.out.println("Longest line: " + longeststr + " " + longestLine);

    }
}
