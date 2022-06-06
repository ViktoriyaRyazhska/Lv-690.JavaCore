package Practice.p1;
public class Practice1 {
    public static void main(String[] args) throws InterruptedException {
        Thread id1 = new MyMethod1();
        Thread id2 = new MyMethod2();

        id1.start();
        id2.start();
    }
}
    class MyMethod1 extends Thread {
        public void run(){
            synchronized (Practice1.class){
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Hello world");
                }
                System.out.println("End");
            }
        }
    }
    class MyMethod2 extends Thread{
        public void run(){
            synchronized (Practice1.class){
                for (int i = 0; i < 5; i++) {

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Hello world");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Peace in the peace");
                }
            }
            System.out.println("End");
        }
    }


