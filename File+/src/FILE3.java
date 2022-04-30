import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FILE3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя файла:");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        System.out.print("Введите A:");
        int a = sc.nextInt();
        System.out.print("Введите D:");
        int d = sc.nextInt();


        if (!file.exists()) {
            System.out.println("File not exists.");
        }
        FileOutputStream out = new FileOutputStream(file);
        FileInputStream in = new FileInputStream(file);
        for (int i = 0; i < 10; i++) {
            out.write(a+d * i);
            System.out.println(in.read());}
        out.close();
        in.close();
    }

}
