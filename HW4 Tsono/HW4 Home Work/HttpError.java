//read number of HTTP Error (400, 401,402, ...)
// and write the name of this error (Declare enum HTTPError)

import java.util.Scanner;

public class HttpError {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int error = sc.nextInt();
        switch (error) {
            case 400:
                System.out.println(Eror.BAD_REQUEST + " - " + Eror.BAD_REQUEST.getTranslation());
                return;
            case 401:
                System.out.println(Eror.UNAUTHORIZED + " - " + Eror.UNAUTHORIZED.getTranslation());
                return;
            case 402:
                System.out.println(Eror.PAYMENT_REQUIRED + " - " + Eror.PAYMENT_REQUIRED.getTranslation());
                return;
            default:
                System.out.println("Write another type of error (400,401,402).");
        }
    }

    enum Eror {
        BAD_REQUEST("Сервер не смог обработать запрос."),
        UNAUTHORIZED("«Отказ в доступе.»"),
        PAYMENT_REQUIRED("Запрос не может быть выполнен до тех пор, пока клиент не совершит оплату.");

        private final String translation;

        Eror(String translation) {
            this.translation = translation;
        }

        public String getTranslation() {
            return translation;
        }
    }
}





