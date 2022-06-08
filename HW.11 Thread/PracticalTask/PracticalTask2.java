//Output two messages «Hello, world» and «Peace in the peace» 5 times each with the intervals of 2 seconds,
//        and the second - 3 seconds. After printing messages, print the text «My name is …»


package PracticalTask;

public class PracticalTask2 {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Peace in the peace");
                }
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My name is_________");


    }

    public static class MyThread1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    MyThread1.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello world");
            }
        }
    }
}
