package HomeWork.String;

import java.io.PrintStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork {
    public static void main(String[] args) {

        String txt = "Anyone who has never made a mistake has never tried anything new";
        System.out.println(txt);
        //Longest word
        String longestTxt = Arrays.stream(txt.split(" ")).
                max(Comparator.comparingInt(String::length)).
                orElse(null);
        System.out.println(longestTxt);
        //Longest word length
        int longestTxtLength = longestTxt.length();
        System.out.println(longestTxtLength);
        //Revers word
        String[] arrTxt = txt.split(" ");
        String reversWord = arrTxt[1];
        StringBuilder builder = new StringBuilder();
        builder.append(reversWord);
        builder.reverse();
        System.out.println(builder);
        //Space remover
        String txt2 = "I    am      learning     Java   Core";
        System.out.println(txt2);
        txt2 = txt2.replaceAll("[ ]+", " ");
        System.out.println(txt2);
        //Format string
        Scanner sc = new Scanner(System.in);
        List<String> FormList = new ArrayList<>();

        FormList.add(String.format("$ %.2f", sc.nextFloat()));
        FormList.add(String.format("$ %.2f", sc.nextFloat()));
        FormList.add(String.format("$ %.2f", sc.nextFloat()));

        for (String s : FormList) {
            System.out.printf(s.concat(" "));
        }


    }
}
