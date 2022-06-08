package com.company;

public class Main {

    public static void main(String[] args) {
	Runnable thread1 = new Thread1();
    Runnable thread2 = new Thread2();
    Runnable thread3 = new Tread3();

    Thread t1 = new Thread(thread1);
    Thread t2 = new Thread(thread2);
    Thread t3 = new Thread(thread3);

    t1.start();
    t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        try {
            t2.join();
        }catch (InterruptedException e){
            System.err.println(e.getMessage());
        }

        t3.start();


    }
}
