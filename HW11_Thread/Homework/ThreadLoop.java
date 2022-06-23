package HW11_Threads;

public class ThreadLoop extends Thread{
    private String name;
    private int times;
    private ThreadLoop threadLoop;

    public ThreadLoop(String name, int times, ThreadLoop threadLoop) {
        this.name = name;
        this.times = times;
        this.threadLoop = threadLoop;
    }

    @Override
    public void run() {
        for (int i =0;i<times;i++) {
            System.out.println(this.name);
        }
        if (null != this.threadLoop) {
            this.threadLoop.start();
        }
    }
}