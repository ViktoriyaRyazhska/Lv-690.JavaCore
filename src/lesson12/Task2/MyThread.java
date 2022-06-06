package lesson12.Task2;

public class MyThread extends Thread {
   public boolean isRunning=true;
    @Override
    public void run() {
       // System.exit(0);
        while (isRunning) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("thread is running");
        }
        System.out.println("main exit");
        System.exit(0);
    }
}
