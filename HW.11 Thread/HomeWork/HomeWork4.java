//Create file1.txt file with a text about your career.
//        Read context from file into array of strings. Each array item contains one line from file.
//        Write in to the file2.txt
//        1) number of lines in file1.txt.
//        2) the longest line in file1.txt.
//        3) your name and birthday date.


package HomeWork;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class HomeWork4 {
    static StringBuilder st = new StringBuilder();

    public static void main(String[] args) {

        String file = "file.txt";
        String carrier = "There are plenty of different professions.\nSome of my friends want to be doctors, others want to be lawyers or journalists, some want to become designers, IT workers.\n But I’ve always had a particular interest to advertising.\n So, I‘ve already decided what I want to do, when I grow up.\n I want to have a job where I can apply my creative skills.\n I‘d like to have a job of a creative director in an advertising agency.\n If you want to be a good art director, you need to be creative.\n The way advertisement motivates people to do something what they actually didn’t plan to do is fascinating.\n I also strongly believe that work of creative director can be compared with art.\n A good advertisement is really an art object.\n";
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(carrier);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String s = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("file.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (true) {
            try {
                if (!((s = br.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            st.append(s);
            st.append(System.lineSeparator());
            System.out.println(s);

        }
        try {
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        System.out.println(st.toString());
        String str1 = st.toString();
        String[] arrays1 = str1.split("\n");
        System.out.println(arrays1.length + "     amount of lines ");
        for (int i = 0; i < arrays1.length; i++) {
            System.out.println(arrays1[i] + "      " + arrays1[i].length() + "   ---amount in every lines  ");
        }
        String lengs = "\n" + arrays1.length;


        String longestLine = Arrays.stream(str1.split("\n")).max(Comparator.comparing(String::length)).orElse(null);
        System.out.println("\n" + longestLine + ":::::::the longest line");
        String fileWriter = "filW.txt";
        String Data = "\n02.10.1993";
        BufferedWriter bufWri = null;
        try {
            bufWri = new BufferedWriter(new FileWriter(fileWriter));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bufWri.write(longestLine);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bufWri.write(lengs);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bufWri.write(Data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bufWri.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
