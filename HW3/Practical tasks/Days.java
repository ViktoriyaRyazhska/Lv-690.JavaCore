package JavaCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Days {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int day = printWithInput("Input day of week:_",br);
        whichDay(day);
    }
    public static int printWithInput(String txt, BufferedReader br)throws IOException {
        System.out.println(txt);
        return Integer.parseInt(br.readLine());
    }
    public static void onlyPrint(String eng,String ukr){
        System.out.println("Day of week: "+eng+"/ День тижня: "+ukr);
    }
    public static void whichDay(int day) {
        switch (day) {
            case 1:
                onlyPrint("monday","понеділок");
                break;
            case 2:
                onlyPrint("tuesday","вівторок");
                break;
            case 3:
                onlyPrint("wednesday","середа");
                break;
            case 4:
                onlyPrint("thursday","четвер");
                break;
            case 5:
                onlyPrint("friday","п'ятниця");
                break;
            case 6:
                onlyPrint("saturday","субота");
                break;
            case 7:
                onlyPrint("sunday","неділя");
            break;
            default:
                System.out.println("Wrong");

    }
}
}