package HomeWork.Hw2;
public class ThreadChain {
    public static void main(String[] args) {
        Thread th1 = new ThreadCh1();

        th1.start();

    }
}

class ThreadCh1 extends Thread {
    @Override
    public synchronized void run() {
        System.out.println("This is thread number 1");
        Thread th2 = new ThreadCh2();
        th2.start();

    }

}

class ThreadCh2 extends Thread {
    @Override
    public synchronized void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("This is thread number 2");
        }
        Thread th3 = new ThreadCh3();
        th3.start();

    }
}

class ThreadCh3 extends Thread {
    @Override
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("This is thread number 3");
        }

    }


}
