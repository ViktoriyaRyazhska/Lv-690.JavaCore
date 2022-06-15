package ls12;

import java.io.IOException;
import java.util.List;

public class Homework {
	public static Object obj1 = new Object();
	public static Object obj2 = new Object();

	public static void main(String[] args) {
		// Run three threads and output there different messages for 5 times.
		// The third thread supposed to start after finishing working of the two
		// previous threads.

//		Thread t1 = new MyThread("Andrii", "Hello, world", 2000);
//		Thread t2 = new MyThread("Anna", "Peace in the peace", 3000);
//		Thread t3 = new MyThread("Margaryta", "I stady java", 1000);
//		t1.start();
//		t2.start();		
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		t3.start();

		// Cause a deadlock. Organize the expectations of ending a thread in main(),
		// and make the end of the method main() in this thread.

//		Thread thread1 = new Thread() {
//			public void run() {
//				synchronized (obj1) {
//					Thread.yield();
//					synchronized (obj2) {
//						System.out.println("First");
//					}
//				}
//			}
//		};
//		
//		Thread thread2 = new Thread() {
//			public void run() {
//				synchronized (obj2) {	
//					Thread.yield();
//					synchronized (obj1) {
//						System.out.println("Second");
//					}
//				}
//			}
//		};
//		
//		thread1.start();
//		thread2.start();

//		Create a thread «one», which would start the thread «two», 
//		which has to output its number («Thread number two») 3 times 
//		and create thread «three», which would to output message «Thread number three» 5 times.	

//		Thread jthr3 = new JThread("Thread number three", 5, 1000);
//		Thread jthr2 = new JThread("Thread number two", 3, 1000);
//		Thread jthr1 = new Thread() {
//
//			@Override
//			public void run() {
//				jthr2.start();
//				try {
//					jthr2.join();
//				} catch (InterruptedException e) {
//
//					e.printStackTrace();
//				}
//				jthr3.start();
//			}
//
//		};
//		jthr1.start();

//		Create file1.txt file with a text about your career.
//		Read context from file into array of strings. Each array item contains one line from file.
//		Write in to the file2.txt
//		   1) number of lines in file1.txt.
//		   2) the longest line in file1.txt.
//		   3) your name and birthday date.
		List<String> s = null;
		try {
			s = Task1.readTxtFileToList("myCareer.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int numberOfLines = s.size();
		int longestLine = 0;
		for (String string : s) {
			if (string.length() > longestLine) {
				longestLine = string.length();
			}
			if (string.indexOf(':') > 0) {
				System.out.println(string.substring(string.indexOf(':') + 1));
			}
		}
		
//		String name =  s.get(3).substring(s.get(3).indexOf(':') + 1);
//		System.out.println(name);
		
		System.out.printf(" Number of lines: %d \n The longest line: %d", numberOfLines, longestLine);

	}

}
