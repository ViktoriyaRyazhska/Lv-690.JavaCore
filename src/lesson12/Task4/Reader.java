package lesson12.Task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public List readFile(String fileName) {
        FileReader fr = null;
        BufferedReader br = null;
        List list = new ArrayList();
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String s = null;
            int count = 0;
            System.out.println("Read data from file: " + fileName);
            while ((s = br.readLine()) != null) {
                list.add(s);
                System.out.println("row " + ++count + " read:" + s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

