package HW11_Threads;

public class PrintPractice implements Runnable{

    private String txt;
    private int millis;

    public PrintPractice(String txt, int millis) {
        this.txt = txt;
        this.millis = millis;
    }

    @Override
    public void run() {
        for (int i =0;i<5;i++){
            try {
                Thread.sleep(this.millis);
                System.out.println(this.txt);
                } catch (InterruptedException e) {
                 throw new RuntimeException(e);
            }
        }
    }
}
