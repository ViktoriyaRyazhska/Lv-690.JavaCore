package work9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//////task1
		
		System.out.println("enter 5 words: ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		
		String[] splitedLine = line.split(" ");
		List<Integer> lenghts = new ArrayList<>();
		for(int i=0; i<splitedLine.length; i++) {
			splitedLine[i]=splitedLine[i].trim();
			lenghts.add(splitedLine[i].length());
		}
		int index = lenghts.indexOf(Collections.max(lenghts));
		
		System.out.println("the longest word: "+ splitedLine[index]);
		
		System.out.println("the length of the longest word: "+ Collections.max(lenghts));
		
		System.out.println("reversed second word: "+ new StringBuilder(splitedLine[1]).reverse()+"\n");
		
		//////task2
		
		System.out.println("enter a sentence that contains the words between more than one space: ");
		String withSpaces = bf.readLine();
		System.out.println("without backspaces: "+ withSpaces.replaceAll(" +", " ")+"\n");
		
		//////task3
		
		System.out.println("enter the number of dollars: ");
		String pattern = "\\$[0-9]+(\\.[0-9]{2})?";
		String text = bf.readLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		if (m.matches()) { 
			System.out.print(text);
		} else {
			System.out.print("wrong format");
		}
		
	}

}
