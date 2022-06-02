
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AdressBook {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
	
		System.out.println("What's Your name?");
		String name = br.readLine();
		System.out.println("Where do You live " + name +"?");
		String address = br.readLine();
		System.out.println("Your address " + name +" is "+ address);
		
	
	
	
	
	
	
	
	}
}


