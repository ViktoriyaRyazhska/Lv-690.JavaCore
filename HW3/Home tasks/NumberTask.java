package JavaCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum HTTPError{
    BadRequest("Bad request"),Unauthorized("Unauthorized"),PaymentRequired("Payment Required"),Forbidden("Forbidden"),NotFound("Not Found");

    public String getDescription() {
        return description;
    }
    private final String description;
    HTTPError(String descr){
        this.description = descr;
    }
}

public class NumberTask {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        floatNumbers(br);
        intNumbers(br);
        httpErrors(br);
    }

    public static String printWithInput(String txt,BufferedReader br)throws IOException{

        System.out.println(txt);
        return br.readLine();
    }
    public static void floatNumbers(BufferedReader br) throws IOException {

        String str1 = printWithInput("Input first float number:_",br);
        String str2 = printWithInput("Input second float number:_",br);
        String str3 = printWithInput("Input third float number:_",br);

        float val1 = Float.parseFloat(str1);
        float val2 = Float.parseFloat(str2);
        float val3 = Float.parseFloat(str3);

        float[] arr = {val1, val2, val3};

        for (int i = 0; i <= 2; i++) {
            if (arr[i] < -5 || arr[i] > 5 ) {
                System.out.println(arr[i]+" are not belong to the range [-5,5]");
            }
        }
     }
    public static void intNumbers(BufferedReader br) throws IOException {

        String str1 = printWithInput("Input first integer number:_",br);
        String str2 = printWithInput("Input second integer number:_",br);
        String str3 = printWithInput("Input third integer number:_",br);

        int val1 = Integer.parseInt(str1);
        int val2 = Integer.parseInt(str2);
        int val3 = Integer.parseInt(str3);

        int[] arr = {val1, val2, val3};

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int i = 0; i <= 2; i++) {
            if (arr[i] > max ) {
                max = arr[i];
            }

            if (arr[i] < min ) {
                min = arr[i];
            }
        }
        System.out.println(" max number = "+max);
        System.out.println(" min number = "+min);

    }

    public static void httpErrors(BufferedReader br) throws IOException {

        String str = printWithInput("Input number of error:_",br);

        int error = Integer.parseInt(str);

        String answer="";

        switch (error){
            case 400:
                answer = HTTPError.BadRequest.getDescription();
                break;
            case 401:
                answer = HTTPError.Unauthorized.getDescription();
                break;
            case 402:
                answer = HTTPError.PaymentRequired.getDescription();
                break;
            case 403:
                answer = HTTPError.Forbidden.getDescription();
                break;
            case 404:
                answer = HTTPError.NotFound.getDescription();
                break;
            default:
                System.out.println("wrong input number!");
        }
        if (answer != "") {
            System.out.println("The name of this error is " + answer);
        }

    }
}

