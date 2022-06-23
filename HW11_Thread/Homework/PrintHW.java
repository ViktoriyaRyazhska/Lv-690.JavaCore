package HW11_Threads;

public class PrintHW extends Thread {

   private String txt;
   private int times;


    public PrintHW(String txt,int times) {
        this.txt = txt;
        this.times = times;

    }

    @Override
    public void run() {
        for (int i =0;i<times;i++) {
            System.out.println(this.txt);
        }
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
