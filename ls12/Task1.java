package ls12;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) {

// Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("I study java");
		}

//		Output two messages «Hello, world» and «Peace in the peace» 5 times 
//		each with the intervals of 2 seconds, and the second - 3 seconds. 
//		After printing messages, print the text «My name is …»

		Thread t1 = new MyThread("Andrii", "Hello, world", 2000);
		Thread t2 = new MyThread("Anna", "Peace in the peace", 3000);
		t1.start();
		t2.start();

//		Prepare mytext.txt file with a lot of text inside.
//		Read context from file into array of strings.
//		Each array item contains one line from file.

		List<String> texts = null;
		try {
			texts = readTxtFileToList("mytext.txt");
		} catch (IOException e) {

			e.printStackTrace();
		}
	
//		count and write the number of symbols in every line
//		find the longest and the shortest line. 

		int count = 1;
		int[] textsLineLength = new int[texts.size()];
		for (String string : texts) {
			System.out.print("Line: " + count + " length - " + string.length() + "  ");
			System.out.println(string);
			textsLineLength[count - 1] = string.length();
			count++;
		}
		Arrays.sort(textsLineLength);
		int longestLine = textsLineLength[texts.size() - 1];
		int shortestLine = textsLineLength[0];
		System.out.println("Longest line: " + longestLine);
		System.out.println("Shortest line: " + shortestLine);

//		find and write only that lines, which consist of word «Java»
		Pattern pattern = Pattern.compile("Java");		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("onlyJavaLine.txt"));			
			for (String st : texts) {
				Matcher matcher = pattern.matcher(st);
				if(matcher.find()) {
					bw.write(st + "\n");
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static List<String> readTxtFileToList(String fileName) throws IOException {
		String s = null;
		List<String> textLine = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		try {
			while ((s = br.readLine()) != null) {
				textLine.add(s);
			}
		} finally {
			br.close();
		}
		return textLine;
	}

}
