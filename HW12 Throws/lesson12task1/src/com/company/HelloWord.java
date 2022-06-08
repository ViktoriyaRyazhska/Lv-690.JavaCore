package com.company;

public class HelloWord implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("Hello world");
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
