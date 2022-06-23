package Team1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task3 {

    public static void main(String[] args) throws IOException {
        Task3.execute();
    }

    public static void execute() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double doll = printWithInput("Enter cost dollar:_",br);
        double hr = printWithInput("Enter sum hryvnas:_",br);
        double answ = 0.0;
        if (doll!=0) {
            answ = hr/doll;
            System.out.println("user can buy: $ " +answ);
        }


    }

    public static double printWithInput(String txt, BufferedReader br)throws IOException {
        System.out.println(txt);
        double val = Double.parseDouble( br.readLine());
        return val;
    }

}
