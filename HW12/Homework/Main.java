package Homework;

import java.util.List;

import Practical.ManageFile;
import Practical.MyThread;

public class Main {

	public static void main(String[] args) {
		// 1.
		MyThread t1 = new MyThread(100, "thread1");
		MyThread t2 = new MyThread(100, "thread2");
		MyThread t3 = new MyThread(100, "thread3");
		t1.start();
		t2.start();
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
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");

		// 2. deadlock example
		DThread t4 = new DThread(500, "thread4");
		DThread t5 = new DThread(500, "thread5");
		t5.setThread(t4);
		t4.setThread(t5);
		t4.start();
		t5.start();
		System.out.println("");

		// 3.
		NThread tr3 = new NThread(100, "Thread number three", 5);
		NThread tr2 = new NThread(100, "Thread number two", 3);
		NThread tr1 = new NThread(100, "Thread number one", 0);
		tr2.setThread(tr3);
		tr1.setThread(tr2);
		tr1.start();
		try {
			tr1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			tr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			tr3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 4.
		System.out.println("");
		List<String> list = ManageFile.readFile("d:/java/file2.txt");
		if (list.size() > 0) {
			System.out.println("lines=" + list.size());
			System.out.println("Longest line is: " + ManageFile.getLongestLine(list));
			String name = ManageFile.getFistLinesContains(list, "Name:");
			if (name != "") {
				System.out.println(name);
			} else {
				System.out.println("Name not found in file");
			}
			String bd = ManageFile.getFistLinesContains(list, "Birthday:");
			if (bd != "") {
				System.out.println(name);
			} else {
				System.out.println("Birthday not found in file");
			}
		}
	}

}
