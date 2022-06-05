package Practical;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface ManageFile {
	public static List<String> readFile(String fileName) {
		List<String> list = new ArrayList<String>();
		File file = new File(fileName);
		FileReader fr;
		try {
			fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			String line = reader.readLine();
			while (line != null) {
				line = reader.readLine();
				if (line != null) {
					list.add(line);
				}
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void writeFile(String fileName, List<String> list) {
		FileWriter fw = null;
		BufferedWriter bw;
		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);

			for (int i = 0; i < list.size(); i++) {
				bw.write(list.get(i));
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getLongestLine(List<String> list) {
		if (list.size() == 0) {
			return "";
		}
		String resLine = list.get(0);
		int resLength = resLine.length();
		String curLine;
		int curLength;
		for (int i = 1; i < list.size(); i++) {
			curLine = list.get(i);
			curLength = curLine.length();
			if (curLength > resLength) {
				resLength = curLength;
				resLine = curLine;
			}
		}
		return resLine;
	}

	public static String getShortestLine(List<String> list) {
		if (list.size() == 0) {
			return "";
		}
		String resLine = list.get(0);
		int resLength = resLine.length();
		String curLine;
		int curLength;
		for (int i = 1; i < list.size(); i++) {
			curLine = list.get(i);
			curLength = curLine.length();
			if (curLength < resLength) {
				resLength = curLength;
				resLine = curLine;
			}
		}
		return resLine;
	}

	public static List<Integer> getLinesNumbersContains(List<String> list, String keyWord) {
		List<Integer> nlist = new ArrayList<Integer>(); // list with numbers of strings which contain word
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(keyWord)) {
				nlist.add(i);
			}
		}
		return nlist;
	}

	public static void printLinesWithLength(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).length() + " " + list.get(i));
		}
	}

	public static void printLinesContains(List<String> list, String keyWord) {
		List<Integer> nlist = getLinesNumbersContains(list, keyWord);
		for (int n = 0; n < nlist.size(); n++) {
			System.out.println(list.get(nlist.get(n)));
		}
	}

	public static String getFistLinesContains(List<String> list, String keyWord) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(keyWord)) {
				return list.get(i);
			}
		}
		return "";

	}

}
