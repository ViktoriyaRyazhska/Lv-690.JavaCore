package HW12.Thread.practice1;
//1. Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).

public class Outputtext {
  public static void main(String[] args) {
      MyThread trd = new MyThread();
      trd.start();

  }

  static class MyThread extends Thread {
           public void run() {
          for (int i = 0; i < 10; i++) {
              try {
                  MyThread.sleep(1000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
              System.out.println("I study java");
          }
      }

  }
}
