package HomeWork.Deadlock;
public class main {
    public static void main(String[] args) throws InterruptedException {
        DeadLockSample ds = new DeadLockSample();

        try{
            ds.T1.start();
            ds.T2.start();
        }finally {
            Thread.sleep(2000);
            System.out.println("Deadlock ");
            System.exit(0);
        }
    }
}
class DeadLockSample {

    String R1 = "R1";
    String R2 = "R2";


    Thread T1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Starting T1");
            synchronized (R1) {
                try {
                    Thread.sleep(100);
                } catch (Exception ex) {
                }
                synchronized (R2) {
                    System.out.println("Acquired both!");
                }
            }
            System.out.println("Completed T1");
        }
    });

    Thread T2 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Starting T2");
            synchronized (R2) {
                try {

                    Thread.sleep(100);
                } catch (Exception ex) {
                }
                synchronized (R1) {
                    System.out.println("Acquired both!");
                }
            }
            System.out.println("Completed T2");
        }
    });

}

