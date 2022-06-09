package lesson11.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String[] args) {
        Div div=new Div();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number a: ");
        double a = 0;
        try {
            a = Double.parseDouble(br.readLine());
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Input number b: ");

        double b = 0;
        try {
            b = Double.parseDouble(br.readLine());
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        try {
            div.div(a,b);
        } catch (Exception e) {
            System.err.println("from div "+e.getMessage());
        }
        System.out.println("hello");
    }
}
