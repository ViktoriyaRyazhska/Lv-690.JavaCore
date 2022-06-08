package com.company;

public class Main {
    public static void output() throws InterruptedException {
        for(int i = 0; i < 10; i++){
            Thread.sleep(1000);
            System.out.println("I study java");
        }
    }
    public static void main(String[] args) throws InterruptedException {
//      output();

        Runnable helloWorld = new HelloWord();
        Runnable peaceInThePeace = new PeaceInThePeace();
        Thread t1 = new Thread(helloWorld);
        Thread t2 = new Thread(peaceInThePeace);

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
        System.out.println("My name is Artem");


    }
}
