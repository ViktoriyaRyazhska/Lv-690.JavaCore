import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String choise = br.readLine();
        switch (choise) {
            case "1":
                System.out.println("Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                System.out.println(Task1.execute(Integer.parseInt(br.readLine())));
                break;
            case "2":
                System.out.println("Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                Task2.execute(Integer.parseInt(br.readLine()));
                break;
            case "3":
                System.out.println("Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                Task3.execute(Integer.parseInt(br.readLine()));
                break;
            case "4":
                System.out.println("Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                Task4.execute(Integer.parseInt(br.readLine()));
                break;
            case "5":
                System.out.println("Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                Task5.execute(Integer.parseInt(br.readLine()));
                break;
            case "6":
                System.out.println("Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                Task6.execute(Integer.parseInt(br.readLine()));
                break;
            case "7":
                System.out.println("Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                Task7.execute(Integer.parseInt(br.readLine()));
                break;
            case "8":
                System.out.println("Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                Task8.execute(Integer.parseInt(br.readLine()));
                break;
            case "9":
                System.out.println("Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                Task9.execute(Integer.parseInt(br.readLine()));
                break;
            case "10":
                System.out.println("Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                Task10.execute(Integer.parseInt(br.readLine()));
                break;
            case "11":
                System.out.println("Enter the credit card number from the manufacturer //n" +
                        "(Visa, MasterCard, American Express, Discover) and check for //n " +
                        "the correct number (see how credit cards use the checksum)");
                Task11.execute(br.readLine());
                break;
            case "12":
                System.out.println("Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                Task12.execute(Integer.parseInt(br.readLine()));
                break;
            case "13":
                System.out.println("Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                Task13.execute(Integer.parseInt(br.readLine()));
                break;
            case "14":
                System.out.println("Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                Task14.execute(Integer.parseInt(br.readLine()));
                break;
            default: System.out.println("Wrong enter");


        }

    }
}
