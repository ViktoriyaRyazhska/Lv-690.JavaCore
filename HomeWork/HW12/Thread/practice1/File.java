package HW12.Thread.practice1;
//Prepare mytext.txt file with a lot of text inside.
//Read context from file into array of strings.
//Each array item contains one line from file.
//Complete next tasks:
//   1) count and write the number of symbols in every line.
//   2) find the longest and the shortest line. 
//   3) find and write only that lines, which consist of word «var»

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class File {
	public static void main(String[] args) throws IOException {
		String txt = "A thread is a thread of execution in a program. The JavaVirtual Machine allows an application to have"
				+ "\n" + "multiple threads of execution running concurrently"
				+ "\n" + "Every thread has a priority. Threads with higher priority areexecuted in preference to threads with"
				+ "\n"
				+ "lower priority. Each threadmay or may not also be marked as a daemon. When code running insome thread"
				+ "\n"
				+ " creates a new Thread object, the newthread has its priority initially set equal to the priority of thecreating"
				+ "\n" + "thread, and is a daemon thread if and only if thecreating thread is a daemon.";
		//reading the text
		try { 
			FileWriter out = new FileWriter("Text.txt");
			BufferedWriter br = new BufferedWriter(out);
			br.write(txt);
			br.close();
		} catch (Exception e) {
			e.getStackTrace();

		}
		//stringify the text
		try {
			FileReader in = new FileReader("Text.txt");
			BufferedReader br = new BufferedReader(in);
			StringBuilder st = new StringBuilder();
			String txtIn = br.readLine();
			//adding parts of text to each other and looking for the end of text
			while (txtIn != null) {
				st.append(txtIn);
				st.append(System.lineSeparator());
				txtIn = br.readLine();
			}
			String everything = st.toString();

			// System.out.println(everything);
			br.close();
			// split text into lines
			String[] txtArr = everything.split("\n");
			// Symbols counter
			for (int i = 0; i < txtArr.length; i++) {
				System.out.println("Line " + i + " has length " + txtArr[i].length());

			}
			// the Longest and the shortest line
			String txtLongest = Arrays.stream(everything.split("\n")).max(Comparator.comparingInt(String::length))
					.orElse(null);
			String txtShortest = Arrays.stream(everything.split("\n")).min(Comparator.comparingInt(String::length))
					.orElse(null);
			System.out.println("Longest lines :" + txtLongest);
			System.out.println("Shortest lines :" + txtShortest);
			// searching a particular word
			Pattern p = Pattern.compile("may");
			Matcher m = p.matcher(everything);
			System.out.println("Looking for specific word ");
			while (m.find()) {
				System.out.println(everything.substring(m.start(), m.end()));
			}

		} catch (Exception e) {
			e.getStackTrace();
		}

	}
}