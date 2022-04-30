import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FILE2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите N:");
        int n = sc.nextInt();

        File file = new File("File3.txt");

        if (!file.exists()) {
            System.out.println("File not exists.");
        }
        FileOutputStream out = new FileOutputStream(file);
        FileInputStream in = new FileInputStream(file);
        for (int i = 1; i <= n; i++) {
            out.write(i * 2);
            System.out.println(in.read());}
        out.close();
        in.close();
    }
}
