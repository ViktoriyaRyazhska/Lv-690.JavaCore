package HW9_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeTask {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String oneSpace = " ";
        String moreOneSpace = "  ";

        //5 words
        String str = enterSentence("enter 5 words:",br);
        String[]arr = str.split(oneSpace);

        int maxLength = arr[0].length();
        String maxWord = arr[0];
        for (String word : arr) {
            System.out.println(word+"-"+word.length());
            if (word.length()>maxLength){
                maxWord=word;
            }
        }
        System.out.println("the longest word: "+maxWord);

        StringBuilder sb = new StringBuilder(arr[1]);
        System.out.println(sb.reverse());

        //I'm learning Java core
        String strJava = enterSentence("enter sentence with more than one space:",br);
        do {
            strJava = strJava.replaceAll(moreOneSpace, oneSpace);
        } while (strJava.contains(moreOneSpace));

        System.out.println(strJava);

        //$
        boolean good = false;
        do  {
          String strDollar = enterSentence("enter number:",br);
        Pattern pattern = Pattern.compile("[$]{1}+[0-9]*+[.][0-9]{2}");
        Matcher matcher = pattern.matcher(strDollar);
        good = matcher.matches();
      } while (!good);

        System.out.println("correct");

    }

    public static String enterSentence(String txt, BufferedReader br) throws IOException {
        System.out.println(txt);
        return br.readLine();
    }

}
