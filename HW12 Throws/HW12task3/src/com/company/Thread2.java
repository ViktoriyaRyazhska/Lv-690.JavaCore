package com.company;

public class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            System.out.println("Thread number two");
        }
    Thread t3 = new Thread(){
        @Override
        public void run() {
            for (int i = 0; i < 5; i++){
                System.out.println("Thread number three");
            }
        }
    };
    t3.start();
    }
}
