//Create a thread «one», which would start the thread «two», which has to output its number
//        («Thread number two») 3 times and create thread «three», which would to output message
//        «Thread number three» 5 times.


package HomeWork;

public class HomeWork3 {
    public static void main(String[] args) {
        Thread thr2 = new myThread("Thread number two", 3, 1000);
        Thread thr3 = new myThread("Thread number three", 5, 1000);
        Thread thr1 = new Thread() {
            @Override
            public void run() {
                thr2.start();
                try {
                    thr2.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                thr3.start();
            }
        };

        thr1.start();

    }

    public static class myThread extends Thread {
        private String message;
        private int count;
        private int sleep;


        public myThread(String message, int count, int sleep) {
            this.message = message;
            this.count = count;
            this.sleep = sleep;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < count; i++) {
                    myThread.sleep(sleep);
                    System.out.println(message);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

