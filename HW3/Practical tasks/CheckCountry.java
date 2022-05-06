package JavaCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum Continents {
    Africa,Europe,Asia,America,Australia;
}

public class CheckCountry {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = printWithInput("Input  country:_",br);
        String country = str.toUpperCase();
        whichContinent(country);
    }
    public static String printWithInput(String txt, BufferedReader br)throws IOException {
        System.out.println(txt);
        return br.readLine();
    }
    public static void whichContinent(String country) {
        switch (country) {
            case "UKRAINE":
            case "POLAND":
                System.out.println("" + Continents.Europe);
                break;
            case "USA":
            case "CANADA":
                System.out.println("" + Continents.America);
                break;
            case "JAPAN":
                System.out.println("" + Continents.Asia);
                break;
            default:
                System.out.println("Wrong");
        }
    }
}
