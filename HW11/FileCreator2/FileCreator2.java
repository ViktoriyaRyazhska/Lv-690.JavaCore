package HomeWork.FileCreator2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;

public class FileCreator2 {
    public static void main(String[] args) {
        String txt = "Hello. My name is Sergey. " +
                "I was born on November 10, 1983. " +
                "I am a sound engineer on the radio. " +
                "I write music and create commercials.";
        try {

            FileWriter in = new FileWriter("Date1.txt");
            BufferedWriter bw = new BufferedWriter(in);
            bw.write(txt);
            bw.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
        try {

            FileReader out = new FileReader("Date1.txt");
            BufferedReader br = new BufferedReader(out);
            String txt2 = br.readLine();
            br.close();

            String[] arrTxt2 = txt2.split(" ");

            String lineAmountInt = String.valueOf(arrTxt2.length);

            String txtArrLongest = Arrays.stream(txt2.split(" ")).
                    max(Comparator.comparingInt(String::length)).
                    orElse(null);

            String find = arrTxt2[4] + arrTxt2[9] + arrTxt2[10] + arrTxt2[11];

            String outDate = "Number of lines :" + lineAmountInt + " Longest word : " + txtArrLongest + " Birth : " + find;
            System.out.println(outDate);

            FileWriter out2 = new FileWriter("Date2.txt");
            BufferedWriter bw2 = new BufferedWriter(out2);
            bw2.write(outDate);
            bw2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
