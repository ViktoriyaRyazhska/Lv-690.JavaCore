import java.io.*;
public class HomeWorkIntro {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
	// Flower bad
	System.out.print("Radius of flower is ..");
		String FlowerRadius = br.readLine();
		int radius = Integer.parseInt (FlowerRadius);
		float perim = (float) (2*3.14*radius);
		float area = (float) (2*3.14*radius);
		System.out.println("Perimetr of Flower bad is " + perim );
		System.out.println("Area of Flower bad is " + area );
	}
}


