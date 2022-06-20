package HW12.Thread.practice1;
//	Output two messages «Hello, world» and «Peace in the peace» 5 times 
//   	each with the intervals of 2 seconds, and the second - 3 seconds. 
//			After printing messages, print the text «My name is …»

public class OutputMessage {
	public static void main(String[] args) throws InterruptedException {
		Thread thr1 = new MyThread1();
		thr1.start();
	}
}

class MyThread1 extends Thread {
	public void run() {
		synchronized (OutputMessage.class) {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Hello, world");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Peace in the peace");
			}
		}
		System.out.println("End");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("My Name is Ross");
	}

}