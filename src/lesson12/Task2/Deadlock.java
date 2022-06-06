package lesson12.Task2;

public class Deadlock {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main end");
    }

}
