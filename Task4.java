package Homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Task4() {

	}
	
	public void Execute () {
		String loudStr = "aeuoiAEUOI";
		String word = Read("word: ", br);
		int count = 0;
		for (int i=0; i<word.length(); i++) {
			int pos = loudStr.indexOf(word.charAt(i));
			if (pos>=0) {
				count = count +1;
			};
		}
		System.out.println("loud letters in word "+ word+ " =" + count);
		
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

}
	
	


