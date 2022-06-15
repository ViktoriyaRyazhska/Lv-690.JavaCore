package ls12;

public class JThread extends Thread {	
	private String message;
	private int repit;
	private int sleep;

	public JThread(String message, int repit, int sleep) {
		this.message = message;
		this.repit = repit;
		this.sleep = sleep;
	}

	

	@Override
	public void run() {
		for (int i = 0; i < repit; i++) {
			try {
				sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(message);
		}		

	}

}
