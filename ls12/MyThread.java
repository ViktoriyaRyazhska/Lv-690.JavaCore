package ls12;

public class MyThread extends Thread{
	private String name;
	private String message;
	private int interval;
	
	public MyThread(String name, String message, int interval) {
		this.name = name;
		this.message = message;
		this.interval = interval;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(interval);
				
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println(message);
		}
		System.out.println("My name is " + name);
		
	}
	
	

}
