//Prepare mytext.txt file with a lot of text inside.
//        Read context from file into array of strings.
//        Each array item contains one line from file.
//        Complete next tasks:
//        1) count and write the number of symbols in every line.
//        2) find the longest and the shortest line.
//        3) find and write only that lines, which consist of word «var»


package PracticalTask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticalTask3 {
    public static void main(String[] args) {
        String text = "Министерство обороны США официально сообщило, что пополнит арсенал ВСУ реактивными системами залпового огня HIMARS.\n Эти РСЗО обладают высокой мобильностью, что позволяет разместить их в мало предсказуемых для противника местах.\n Об этом сообщается на странице Минобороны в Facebook.";
        String fileName = "myText.txt";

        writer(text, fileName);
        try {
            reader(fileName, text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        String str = sb.toString();
        System.out.println(str);
        String[] arr = str.split("\n");
        System.out.println(arr.length);
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].length() + " number of sumbols in every line---" + count + " line");
            count++;
        }

        longestLine(arr);
        shortestLine(arr);
        containWord(arr, "HIMARS");


    }

    public static void writer(String s, String fil) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fil));
            bw.write(s);
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String reader(String n, String l) throws IOException {
        try {
            System.out.println("Read data from file: " + n);

            BufferedReader br = new BufferedReader(new FileReader(n));
            while ((l = br.readLine()) != null) {
                System.out.println(l);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return l;
    }

    public static void longestLine(String[] arr) {
        int max = 0;
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i].length()) {
                max = arr[i].length();
                answer = arr[i];
            }

        }
        System.out.println(answer + "  amount of numbers--" + max);
    }


    public static void shortestLine(String[] arr) {
        int min = 0;
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            min = arr[0].length();
            if (min > arr[i].length()) {
                min = arr[i].length();
                answer = arr[i];
            }

        }
        System.out.println(answer + "  amount of numbers--" + min);
    }

    public static void containWord(String[] arrs, String word) {
        for (String s : arrs) {
            Pattern p = Pattern.compile(word);
            Matcher m = p.matcher(s);
            while (m.find()) {
                System.out.println(s.substring(m.start(), m.end()) + " in this line----" + s);
            }

        }

    }
}


