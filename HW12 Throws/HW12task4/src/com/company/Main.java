package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static String myText = "AboutMe.txt";
    static File file = new File(myText);
    static String information = "newFile2.txt";
    static File fileWriter = new File(information);
    static String text;
    static BufferedReader br = null;
    static PrintWriter pw = null;
    static List<String> list = new ArrayList<>();
    static String longeststr;
    static int longLine;
    static int numberOfLines = 0;
    static Pattern pattern = Pattern.compile("((([0-3][1-9])|([1-9][0-9]))[.](([0-9][1-9])|([1-9][0-9]))[.][1-2][0,9][0-9][0-9])");
//    ((((1|2)?[0-9])|(30)\\.(4|6|9|11))|(((1|2)?[0-9])|(31)\\.(1|2|3|7|8|10|12)))

    public static void main(String[] args) {
        try {
            pw = new PrintWriter(fileWriter);
            br = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    if (!((text = br.readLine()) != null)) break;
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
                text = text.trim();


                if (text.length() != 0) {
                    list.add(text);
                }

                Matcher m = pattern.matcher(text);
                while (m.find()) {
                    String data = text.substring(m.start(), m.end());
                    pw.println(data);
                }
            }
            longLine = list.get(0).length();
            for (String s : list) {
                numberOfLines++;
                if (s.length() > longLine) {
                    longeststr = s;
                }
            }
            pw.println("count of lines: " + numberOfLines);
            pw.println(longeststr);


        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                pw.close();
                br.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }


    }
}
