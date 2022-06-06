package HomeWork.Hw1;
public class main {
    public static void main(String[] args) throws RuntimeException {

        MyMethod thread1 = new MyMethod("Hello world",500);
        MyMethod thread2 = new MyMethod("Peace in peace",500);
        MyMethod thread3 = new MyMethod("Ash to ash",500);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyMethod extends Thread {

    private String txt;
    private int pause;


    public MyMethod(String txt, int pause) {
        this.txt = txt;
        this.pause = pause;

    }

    @Override
    public synchronized void run() {
        synchronized (main.class) {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(pause);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(txt);
            }

        }
    }
}
