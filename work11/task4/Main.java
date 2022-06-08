package work11.task4;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<String> txt1 =new ArrayList<>();
		String fileLocation = null;
		String buff;
		
		
		BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter file location: ");// C:\Users\dmytr\eclipse-workspace\HomeWork\src\work11\task4\career.txt
		try {
			fileLocation = bf1.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			BufferedReader bf2 = new BufferedReader(new FileReader(fileLocation));
			for(int i =0;(buff = bf2.readLine())!=null;i++) {
			txt1.add(buff);
		}
		} catch (FileNotFoundException e) {
			System.err.println("there is no such file, try again");
			return;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedWriter fw = new BufferedWriter(new FileWriter("file2.txt"));
			fw.write("number of lines: "+ Parsertxt.numOfLines(txt1)+"\n");
			fw.write("the longest line: "+ Parsertxt.longestLine(txt1)+"\n");
			String[] NandB = Parsertxt.getNameAndBirthday(txt1);
			fw.write("name is  "+NandB[0] +", birthday is "+NandB[1]+"\n");
			System.out.print("completed successfully");
			fw.close();
		} catch (IOException e) {
			System.err.println("failed to create file, try again");
		}
	}

}
