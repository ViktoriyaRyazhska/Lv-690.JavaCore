package Practice.p2;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) throws IOException {
        String txt = "Born to poor cotton farmers in Kingsland, Arkansas, Cash rose to fame during the mid-1950s " +
                "in the burgeoning rockabilly scene in Memphis, Tennessee, after four years in the Air Force. " +
                "He traditionally began his concerts by simply introducing himself, \"Hello, I'm Johnny Cash\",[c] " +
                "followed by \"Folsom Prison Blues\", one of his signature songs. Alongside \"Folsom Prison Blues\", " +
                "his other signature songs include \"I Walk the Line\", \"Ring of Fire\", \"Get Rhythm\", and \"Man in var\"" +
                ". He also recorded humorous numbers like \"One Piece at a Time\" and \"A Boy Named var\", a duet with his " +
                "future wife June called \"Jackson\" (followed by many further duets after their wedding), and railroad songs " +
                "such as \"Hey, Porter\", \"Orange Blossom Special\", and \"Rock Island Line\".[12] During the last stage of " +
                "his career, he covered songs by contemporary rock artists; among his most notable covers were \"Hurt\" by " +
                "Nine Inch Nails, \"Rusty Cage\" by Soundgarden, and \"Personal Jesus\" by Depeche Mode.variant";

        try {
            FileWriter out = new FileWriter("Date.txt");
            BufferedWriter br = new BufferedWriter(out);
            br.write(txt);
            br.close();
        } catch (Exception e) {
            e.getStackTrace();

        }

        try {
            FileReader in = new FileReader("Date.txt");
            BufferedReader br = new BufferedReader(in);
            String txtIn = br.readLine();

            String[] txtArr = txtIn.split(" ");
            //Symbols counter
            for (int i = 0; i < txtArr.length; i++) {
                System.out.println("Index " + i + " has length " + txtArr[i].length());
            }
            //Longest and short
            String txtArrLongest = Arrays.stream(txtIn.split(" ")).
                    max(Comparator.comparingInt(String::length)).
                    orElse(null);
            String txtArrShort = Arrays.stream(txtIn.split(" ")).
                    min(Comparator.comparingInt(String::length)).
                    orElse(null);
            System.out.println("Longest word " + txtArrLongest);
            System.out.println("Shortest word " + txtArrShort);
            //regex search
            Pattern p = Pattern.compile("var");
            Matcher m = p.matcher(txtIn);
            System.out.println("Finding specific word ");
            while (m.find()) {
                System.out.println(txtIn.substring(m.start(), m.end()));
            }


        } catch (Exception e) {
            e.getStackTrace();
        }


    }
}
