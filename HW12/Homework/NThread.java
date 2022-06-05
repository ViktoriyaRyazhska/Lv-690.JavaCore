package Homework;

public class NThread extends Thread {
	int interval;
	String message;
	NThread thread2;
	int times;

	public void setThread(NThread thread2) {
		this.thread2 = thread2;
	}

	public NThread(int interval, String message, int times) {
		this.interval = interval;
		this.message = message;
		this.times = times;
	}

	public void run() {
		if (thread2 != null) {
			thread2.start();
		}
		for (int i = 0; i < times; i++) {
			print();
			try {
				sleep(interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void print() {
		System.out.println(message);
	}


}
