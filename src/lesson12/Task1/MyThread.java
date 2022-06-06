package lesson12.Task1;

public class MyThread extends Thread {
    private int number;
    private int pause;

    public MyThread(int number, int pause) {
        this.number = number;
        this.pause = pause;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread " + number);
        }
    }
}

class Example {
    public static void main(String[] args) throws Exception {
        Thread t1 = new MyThread(1, 1000);
        Thread t2 = new MyThread(2, 1000);
        Thread t3 = new MyThread(3, 1000);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
        t3.join();

        System.out.println("Thread main");
    }
}


