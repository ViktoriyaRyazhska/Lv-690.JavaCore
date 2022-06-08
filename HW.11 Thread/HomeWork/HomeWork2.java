//Cause a deadlock. Organize the expectations of ending a thread in main(),
//        and make the end of the method main() in this thread.


package HomeWork;

public class HomeWork2 {
    public final static Object first = new Object();
    public final static Object second = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                synchronized (first) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (second) {
                        System.out.println("Try show deadlock");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (second) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (first) {
                        System.out.println("Try show deadlock");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
