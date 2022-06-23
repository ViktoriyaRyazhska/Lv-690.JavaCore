package HW11_Threads;

public class DeadLockThread2 extends Thread{
    private Victim victim1;
    private Victim victim2;

    public DeadLockThread2(Victim victim1, Victim victim2) {
        this.victim1 = victim1;
        this.victim2 = victim2;
    }

    @Override
    public void run() {
        synchronized (victim2) {
            System.out.println("Thread 2: locked the victim2");

            try {
                Thread.sleep(1000);
            } catch (Exception excep) {
                System.err.println(excep.getMessage());
            }

            synchronized (victim1) {
                System.out.println("Thread 2: locked the victim1");
            }
        }
    }

}
