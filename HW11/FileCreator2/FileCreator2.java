package HomeWork.FileCreator2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;

public class FileCreator2 {
    public static void main(String[] args) {
        String txt = "Hello. My name is Sergey.\n " +
                "I was born on November 10, 1983.\n " +
                "I am a sound engineer on the radio.\n " +
                "I write music and create commercials.\n";
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
            StringBuilder st = new StringBuilder();
            int lineAmountInt = 0;

            while (txt2 != null) {
                st.append(txt2);
                st.append(System.lineSeparator());
                txt2 = br.readLine();
            }
            String everything = st.toString();
            br.close();


            String[] arrTxt2 = everything.split("\n");

            for (int i = 0; i < arrTxt2.length; i++) {
                lineAmountInt++;
            }

            String txtArrLongest = Arrays.stream(everything.split("\n")).
                    max(Comparator.comparingInt(String::length)).
                    orElse(null);

            String find = arrTxt2[1];

            String outDate = "Number of lines :" + lineAmountInt + "\nLongest word : " + txtArrLongest + "\nBirth : " + find;
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
