package Homework.lesson4;

import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int error = scanner.nextInt();
        switch (error) {
            case 400:
                System.out.println(ErrorHTTP.BAD_REQUEST);
                System.out.println(ErrorHTTP.BAD_REQUEST.desc);
                break;
            case 401:
                System.out.println(ErrorHTTP.UNAUTHORIZED);
                System.out.println(ErrorHTTP.UNAUTHORIZED.desc);
                break;
            case 402:
                System.out.println(ErrorHTTP.PAYMENT_REQUIRED);
                System.out.println(ErrorHTTP.PAYMENT_REQUIRED.desc);
                break;
            case 403:
                System.out.println(ErrorHTTP.FORBIDDEN);
                System.out.println(ErrorHTTP.FORBIDDEN.desc);
                break;
            case 404:
                System.out.println(ErrorHTTP.NOT_FOUND);
                System.out.println(ErrorHTTP.NOT_FOUND.desc);
                break;
            case 405:
                System.out.println(ErrorHTTP.METHOD_NOT_ALLOWED);
                System.out.println(ErrorHTTP.METHOD_NOT_ALLOWED.desc);
                break;
            default:
                System.out.println("Wrong Error");

        }
    }

    enum ErrorHTTP {
        BAD_REQUEST("Incorrect/wrong request"), UNAUTHORIZED("Authorization is required"),
        PAYMENT_REQUIRED("Payment is required"), FORBIDDEN("Server refusing action"),
        NOT_FOUND("Resource could not be found"), METHOD_NOT_ALLOWED("request method is not supported");

        private final String desc;

        ErrorHTTP(String desc) {
            this.desc = desc;
        }
    }
}
