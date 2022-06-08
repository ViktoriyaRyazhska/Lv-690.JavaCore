package work11;

public class task2 {
	public static final Object i1=new Object();
	public static final Object i2= new Object();

	public static void main(String s[]) {
		Thread m1 = new Thread() {
			public void run() {
				synchronized (i1) {
					Thread.yield();
					synchronized (i2) {
						System.out.println("tread m1 finished");
					}  
				}  
			}  
		};
		
		m1.start();
		
		synchronized (i2) {
			Thread.yield();
			synchronized (i1) {
				System.out.println("tread main finished");
			}
		}
	}
}

