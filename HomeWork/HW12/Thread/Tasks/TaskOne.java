package HW12.Thread.Tasks;
//Run three threads and output there different messages for 5 times.

//The third thread supposed to start after finishing working of the two previous threads.

public class TaskOne {

	public static void main(String[] args) {
		Thread thread1 = new Thread() {
			// starting 1-st thread
			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					System.out.println(" 1. - The first thread !   ");
				}
			}
		};
// starting 2-nd thread
		Thread thread2 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					System.out.println("2. - The second thread !  ");
				}
			}
		};

		Thread thread3 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("3. - The third thread ! ");
				}
			}

		};

		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		thread3.start();

	}
}