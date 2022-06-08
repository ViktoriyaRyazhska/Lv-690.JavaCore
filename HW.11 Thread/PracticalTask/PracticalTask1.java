//Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).


package PracticalTask;

public class PracticalTask1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

    }

    static class MyThread extends Thread {
        @Override
        public void run() {

            for (int i = 0; i < 10; i++) {
                try {
                    MyThread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("I study java");
            }
        }

    }
}

