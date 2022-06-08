package com.company;

public class PeaceInThePeace implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++ ){
            try {
                Thread.sleep(2000);
                System.out.println("peace in the peace");
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());;
            }
        }
    }
}
