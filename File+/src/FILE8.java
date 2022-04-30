import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FILE8 {
// Даны имена двух файлов вещественных чисел. Известно, что первый
//из них существует и является непустым, а второй в текущем каталоге
//отсутствует. Создать отсутствующий файл и записать в него начальный и
//конечный элементы существующего файла (в указанном порядке).
public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите имя файла1:");
    String fileName1 = sc.nextLine();
    Path path = Paths.get(fileName1);
    System.out.print("Введите имя файла2:");
    String fileName2 = sc.nextLine();
    File file2 = new File(Pathpath, fileName2);

    if (file2.createNewFile()) {
        System.out.println("File created: " + file2.getAbsolutePath());
           } else {
        System.out.println("File not created: " + file2.getAbsolutePath());
    }
   //if (!file2.exists()) {
     //   System.out.println("File2 not exists.");
   // }
    FileInputStream fin = new FileInputStream(Pathpath);
    Scanner scanner = new Scanner(fileName1);
    String line = scanner.nextLine();
    String[] numbersString = line.split(" ");
    int [] numbers = new int[3];

   // int i=-1;
   // while ((i=fin.read())!=-1) {
     //   System.out.println((char)i);
    }

    FileOutputStream out = new FileOutputStream(Pathpath);

        out.write(a+d * i);
        System.out.println(in.read());}
    out.close();
    in.close();
}



}
