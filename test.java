package practice15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

	public static void main(String[] args) {
		int task;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number of task: ");
		try {
			task= Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			System.err.println("IOException error");
			return;
		} catch (NumberFormatException e) {
			System.err.println("wrong format");
			return;
		}
		
		switch(task) {
		case 1://Task1.execute();
		break;
		case 2://Task2.execute();
		break;
		case 3://Task3.execute();
		break;
		case 4://Task4.execute();
		break;
		case 5://Task5.execute();
		break;
		case 6://Task6.execute();
		break;
		case 7://Task7.execute();
		break;
		case 8://Task8.execute();
		break;
		case 9://Task9.execute();
		break;
		case 10://Task10.execute();
		break;
		case 11://Task11.execute();
		break;
		case 12://Task12.execute();
		break;
		case 13://Task13.execute();
		break;
		case 14://Task14.execute();
		break;
		}
		
		
		
	}

}
