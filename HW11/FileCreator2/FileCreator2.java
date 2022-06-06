package HomeWork.FileCreator2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
            FileOutputStream out = new FileOutputStream("Date1.txt");
            byte[] array = txt.getBytes(StandardCharsets.UTF_8);
            out.write(array);
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        try {
            InputStream in = new FileInputStream("Date1.txt");
            byte[] arrOut = in.readAllBytes();
            in.read(arrOut);
            String txt2 = new String(arrOut);
            String[] arrTxt2 = txt2.split(" ");

            String lineAmountInt = String.valueOf(arrTxt2.length);

            String txtArrLongest = Arrays.stream(txt2.split(" ")).
                    max(Comparator.comparingInt(String::length)).
                    orElse(null);

            String find = arrTxt2[4] + arrTxt2[9] + arrTxt2[10] + arrTxt2[11];

            String outDate = "Number of lines :"+lineAmountInt + " Longest word : " + txtArrLongest + " Birth : " + find;
            System.out.println(outDate);

            FileOutputStream out = new FileOutputStream("Date2.txt");
            byte[] array = outDate.getBytes(StandardCharsets.UTF_8);
            out.write(array);
            out.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
