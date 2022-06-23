package Homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Task6() {

	}
	
	
	public static String Read(String q, BufferedReader br) {
		System.out.println(q);
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

	public void Execute() {
		String word = Read("text: ", br);
		System.out.println("words in text =" + word.split(" ").length);
	}

}
	
	


