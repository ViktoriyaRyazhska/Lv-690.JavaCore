package lesson12.Task3;

public class Thread1 extends Thread {
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("Thread 1 starting");
        Thread thread2 = new Thread2();
        thread2.start();
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread number two");
        }

        Thread thread3 = new Thread3();
        thread3.start();
    }
}

class Thread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread number three");
        }
    }
}


