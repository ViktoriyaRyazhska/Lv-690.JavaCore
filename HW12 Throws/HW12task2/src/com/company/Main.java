package com.company;

public class Main {
    public static Object resource1 = new Object();
    public static Object resource2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (resource1) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                        ;
                    }
                    synchronized (resource2) {
                        System.out.println("Hello");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (resource2) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }
                    synchronized (resource1) {
                        System.out.println("World");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
