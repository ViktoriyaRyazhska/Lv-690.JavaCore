package lesson12.Task4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "file1.txt";
        String data = "I started learning java on my own since December 2021.\n" +
                "I listened to the course on the Udemy platform, used the Javarush platform.\n" +
                "In April 2022, I continued to study java at SoftServe IT Academy.\n" +
                "I am currently finishing my Java Core course. The next Online Marathon course is ahead.";
        Writer writer = new Writer();
        writer.writeFile(fileName, data);
        Reader reader = new Reader();
        List<String> list = reader.readFile(fileName);
        System.out.println(list.size());
        int max = 0;
        String maxItem = null;
        for (String item : list) {
            if (item.length() > max) {
                max = item.length();
                maxItem = item;
            }
        }
        System.out.println(maxItem);
        String add = list.size() + "\n" + maxItem + "\n" + "My name is Tetiana. My birthday date is 25.08.1984";
        writer.writeFile("file2.txt", add);
    }
}
