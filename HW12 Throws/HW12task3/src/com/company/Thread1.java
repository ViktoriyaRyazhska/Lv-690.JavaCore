package com.company;

public class Thread1 extends Thread{
    @Override
    public void run() {
        Thread t2 = new Thread2();
        t2.start();
        }
}
