//Run three threads and output there different messages for 5 times.
//        The third thread supposed to start after finishing working of the two previous threads.


package HomeWork;


public class HomeWork1 {

    public static void main(String[] args) {
        Thread th1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("     The last thread.Must be in the end.    ");
                }
            }
        };
        Thread th2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("   Why are you doing it?     ");
                }
            }
        };

        Thread th3 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Start after Thread 1 and 2-------");
                }
            }


        };

        th1.start();
        th2.start();
        System.out.println("after this thread ---start thread 3");
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        th3.start();

    }
}
