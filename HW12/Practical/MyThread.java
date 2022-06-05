package Practical;

import java.util.Date;

public class MyThread extends Thread {
	int interval;
	String message;

	public MyThread(int interval, String message) {
		this.interval = interval;
		this.message = message;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Date date1 = new Date();
				System.out.println(message + " :" + date1.getSeconds());
				sleep(interval);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
