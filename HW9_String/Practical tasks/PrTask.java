package HW9_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrTask {
    public static void main(String[] args) throws Exception{

        String str1 = "IT";
        String str2 = "IT Academy";
        System.out.println(str2.contains(str1));

        String person = "Nicholson Nick Nickovych";

        String[]arr = person.split(" ");

        System.out.println(arr[1]);
        System.out.println(arr[1] +" "+ arr[2]+" "+arr[0]);
        System.out.println(arr[0] +" "+ arr[1].charAt(0)+". "+arr[2].charAt(0)+".");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = enterNick("enter nick:",br);
        boolean yes = validNick(str);
        if (yes)
            System.out.println("valid nickname");
        else System.out.println("invalid nickname");

    }

    public static String enterNick(String txt, BufferedReader br) throws IOException {
        System.out.println(txt);
        return br.readLine();
    }

    public static boolean validNick(String txt){

        Pattern pattern = Pattern.compile("[a-z0-9_]{3,15}");
        Matcher matcher = pattern.matcher(txt);

        return matcher.matches();
    }

}
