package work11.task1;

public class Main {

	public static void main(String[] args) {
		Thread m1 = new MyMessage(1, "Jeane");
		Thread m2 = new MyMessage(2, "Henry");
		Thread m3 = new MyMessage(3, "Steve");
		
		m1.start();
		m2.start();
		try {
			m1.join();
			m2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		m3.start();
	}

}
