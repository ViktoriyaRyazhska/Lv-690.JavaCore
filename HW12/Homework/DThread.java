package Homework;

public class DThread extends Thread {
	int interval;
	String message;
	DThread thread2;
	public void setThread(DThread thread2) {
		this.thread2 = thread2;
	}

	public DThread(int interval, String message) {
		this.interval = interval;
		this.message = message;
	}
	
	public void run() {
		for (int i = 0; i < 50; i++) {
			try { 
				if (thread2 != null) {
					printWith();
				}
				sleep(interval); 
				} 
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}	
	}
	
	public String getMessage() {
		return message;
	}

	public synchronized void print() {		
		System.out.print(message);
	}

	public synchronized void printWith() {
		print();
		System.out.print("+");
		thread2.print();
		System.out.println("");
	}

}
