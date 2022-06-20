package HW12.Thread.Tasks;

//Create file1.txt file with a text about your career.

//  Read context from file into array of strings. Each array item contains one line from file.
//  Write in to the file2.txt
//  1) number of lines in file1.txt.
//  2) the longest line in file1.txt.
//  3) your name and birthday date.

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class TaskFour {
	static StringBuilder st = new StringBuilder();

	public static void main(String[] args) {
//main text goes there
		String file = "file.txt";
		String carrier = "Run three threads and output there different messages for 5 times. The third thread supposed to start after finishing working of the two previous threads.\r\n"
				+ "Cause a deadlock. Organize the expectations of ending a thread in main(), and make the end of the method main() in this thread.\r\n"
				+ "Create a thread «one», which would start the thread «two», which has to output its number («Thread number two») 3 times and create thread «three», which would to output message «Thread number three» 5 times.\r\n"
				+ "Create file1.txt file with a text about your career.\r\n"
				+ "Read context from file into array of strings. Each array item contains one line from file.\r\n"
				+ "Write in to the file2.txt\r\n" + "   1) number of lines in file1.txt.\r\n"
				+ "   2) the longest line in file1.txt.\r\n" + "   3) your name and birthday date.";
		//BW write a file and catch exception 
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(carrier);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		try {
			bw.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		String s = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("file.txt"));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		while (true) {
			try {
				if (!((s = br.readLine()) != null))
					break;
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			st.append(s);
			st.append(System.lineSeparator());
			System.out.println(s);

		}
		try {
			br.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		String str1 = st.toString();
		String[] arrays1 = str1.split("\n");
		System.out.println(arrays1.length + "     amount of lines ");
		for (int i = 0; i < arrays1.length; i++) {
			System.out.print(arrays1[i] + "      " + arrays1[i].length() + "   ---amount in this line  ");
		}
		String lengs = "\n" + arrays1.length;

		String longestLine = Arrays.stream(str1.split("\n")).max(Comparator.comparing(String::length)).orElse(null);
		System.out.println("\n" + longestLine + "the longest line");
		String fileWriter = "filW.txt";
		String Data = "\n29.12.1979";
		BufferedWriter bufWri = null;
		try {
			bufWri = new BufferedWriter(new FileWriter(fileWriter));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		try {
			bufWri.write(longestLine);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		try {
			bufWri.write(lengs);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		try {
			bufWri.write(Data);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		try {
			bufWri.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}
