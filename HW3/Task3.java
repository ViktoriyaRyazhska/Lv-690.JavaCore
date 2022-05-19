package HW3;

import java.util.Scanner;

public class Task3 {

    public enum HTTP_Error {BadRequest, Unauthorized, PaymentRequired, NotFound};

     public static void main(String[] args) {
        scanner concole = new scanner();
        System.out.print("Enter the HTTP Error:");
        int error = console.nextInt();

        switch (error) {
            case "400":
                System.out.println(HTTP_Error.BadRequest);
                break;
            case "401":
                System.out.println(HTTP_Error.Unauthorized);
            case "402":
                System.out.println(HTTP_Error.PaymentRequired);
            default:
                System.out.println(HTTP_Error.PaymentRequired);
        }
    }
}
