package HW11_Threads;

import java.util.ArrayList;

public class HW11_Main {
    public static void main(String[] args) {

        //1 Thread
        PrintHW pr1 = new PrintHW("Hi, guys", 5);
        PrintHW pr2 = new PrintHW("Bugs bunny", 5);
        PrintHW pr3 = new PrintHW("Donald duck", 5);

        Thread thread1 = new Thread(pr1);
        Thread thread2 = new Thread(pr2);
        Thread thread3 = new Thread(pr3);
        Thread.yield();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException exception) {
            System.err.println(exception.getMessage());
        }
        try {
            thread2.join();
        } catch (InterruptedException exception) {
            System.err.println(exception.getMessage());
        }
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException exception) {
            System.err.println(exception.getMessage());
        }

        //2 Deadlock
        Victim victim1 = new Victim();
        Victim victim2 = new Victim();

        DeadLockThread1 deadThread1 = new DeadLockThread1(victim1, victim2);
        DeadLockThread2 deadThread2 = new DeadLockThread2(victim1, victim2);
        Thread.yield();
        try {
            deadThread1.start();
            deadThread2.start();
        } finally {
            System.err.println("You caught deadlock");
            System.exit(1);
        }


    //3 Create three threads
        ThreadLoop th3 = new ThreadLoop("thread number three",5,null);
        ThreadLoop th2 = new ThreadLoop("thread number two",3,th3);
        ThreadLoop th1 = new ThreadLoop("thread number one",0,th2);
        Thread.yield();
        th1.start();
        try {
            th1.join();
        } catch (InterruptedException exception) {
            System.err.println(exception.getMessage());
        }
        try {
            th2.join();
        } catch (InterruptedException exception) {
            System.err.println(exception.getMessage());
        }
        try {
            th3.join();
        } catch (InterruptedException exception) {
            System.err.println(exception.getMessage());
        }

        //4
        String file1Name = "C:/Java projects/ChessGame/src/main/java/HW11_Threads/file1.txt";
        ClassFile.createFile(file1Name);
        ArrayList<String> arrayList = ClassFile.readFileToArray(file1Name);

        String file2Name = "C:/Java projects/ChessGame/src/main/java/HW11_Threads/file2.txt";
        ClassFile.toDOHomeWork(arrayList,file2Name);

    }

}





