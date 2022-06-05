package Practical;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// 1.
		for (int i = 0; i < 10; i++) {
			System.out.println("I study Java");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 2.
		MyThread t1 = new MyThread(2000, "Hello, world");
		MyThread t2 = new MyThread(3000, "Peace in the peace");
		t1.start();
		t2.start();
		System.out.println("My name is Java");
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");

		// 3.
		List<String> list = ManageFile.readFile("d:/java/git.txt");
		ManageFile.printLinesWithLength(list);
		System.out.println("");
		System.out.println("Longest line is: " + ManageFile.getLongestLine(list));
		System.out.println("Shortest line is: " + ManageFile.getShortestLine(list));
		System.out.println("Lines with word 'get' : ");
		ManageFile.printLinesContains(list, "get");
	}

}
