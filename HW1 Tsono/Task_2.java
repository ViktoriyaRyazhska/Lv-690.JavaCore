package tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        String name;
        String adress;
        System.out.println("What is yor name?");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        name= br.readLine();
        System.out.println("My name is "+name+".");
        System.out.println("Where are you live,"+name+"?");
        BufferedReader br_1 =new BufferedReader(new InputStreamReader(System.in));
        adress=br_1.readLine();
        System.out.println("I live in "+adress+".");
        System.out.println("My name is "+name+",i live in "+adress+".");

    }
}

