package HW11_Threads;

import java.util.ArrayList;

public class PrTask {

    public static void main(String[] args) {

        //1
        for (int i =0;i<10;i++){
            System.out.println("I study Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception){
                System.err.println(exception.getMessage());
            }
        }

        //2
        PrintPractice pr1 = new PrintPractice("Hello, world",2000);
        PrintPractice pr2 = new PrintPractice("Peace in the peace",3000);
        Thread thread1 = new Thread(pr1);
        Thread thread2 = new Thread(pr2);
        thread1.start();
        thread2.start();
        Thread.yield();
        try {
            thread1.join();
        } catch (InterruptedException exception){
            System.err.println(exception.getMessage());
        }
        try {
            thread2.join();
        } catch (InterruptedException exception){
            System.err.println(exception.getMessage());
        }
        System.out.println("My name is Yevhen");

        //3
        String fileName = "C:/Java projects/ChessGame/src/main/java/HW11_Threads/file1.txt";
        ArrayList<String> arrayList = ClassFile.readFileToArray(fileName);
        ClassFile.toDOPracticeTask(arrayList,"CUSTOMER");



    }

}
