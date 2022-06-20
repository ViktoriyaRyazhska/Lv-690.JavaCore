package HW12.Thread.Tasks;
//Cause a deadlock. Organize the expectations of ending a thread in main(),
//and make the end of the method main() in this thread.

public class TaskTwo {
public final static Object obj1 = new Object();
public final static Object obj2 = new Object();

public static void main(String[] args) {
// run the first thread
Thread thread1 = new Thread() {
  public void run() {
      synchronized (obj1) {
    	  System.out.println("1. - The first thread ! ");
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          synchronized (obj2) {
              System.out.println("Try to cause deadlock");
          }
      }
  }
};
//run the second thread
Thread thread2 = new Thread() {
  public void run() {
	  
      synchronized (obj2) {
    	  System.out.println("2. - The second thread ! ");
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          synchronized (obj1) {
        	  System.out.println("3. - The third thread ! ");
              System.out.println("Try to cause deadlock");
          }
      }
  }
};
thread1.start();
thread2.start();
}
}