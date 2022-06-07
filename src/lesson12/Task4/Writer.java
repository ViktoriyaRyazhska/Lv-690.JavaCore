package lesson12.Task4;


import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writer {
    public void writeFile(String fileName, String data) {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            System.out.println("Write data to file: " + fileName);
            for (int i = 0; i < 1; i++) {
                bw.write(data);
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
