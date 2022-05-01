import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hometask2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" What is your name? ");
        String name = br.readLine();
        System.out.println("Where are you live " + name);
        System.out.println("Country ?");
        String country = br.readLine();
        System.out.println(" City? ");
        String city = br.readLine();
        System.out.println("Street? ");
        String street = br.readLine();
        System.out.println("Building number ");
        int number = Integer.parseInt(br.readLine());
        System.out.println("Apartaments number ");
        int apartament = Integer.parseInt(br.readLine());
        System.out.println( name +" your adres is  " + country + " " + city + " " + street + " " + number + "/" + apartament);
    }
}
