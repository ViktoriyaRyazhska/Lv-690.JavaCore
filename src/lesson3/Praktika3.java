package lesson3;

import java.util.Scanner;

public class Praktika3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Praktika3 praktika3 = new Praktika3();
        praktika3.readerror(console);
    }
        public enum HTTPError {
            ERROR_400 ("Bad request"),
            ERROR_401 ("Unauthorized Error"),
            ERROR_402 ("Payment Required"),
            NO_ERROR("No this error");


            public final String description;
            HTTPError (String description) {
            this.description=description;
            }

        }

    public void readerror(Scanner console) {
        int error = console.nextInt();
        HTTPError httpError = switch (error) {
            case 400 -> HTTPError.ERROR_400;
            case 401 -> HTTPError.ERROR_401;
            case 402 -> HTTPError.ERROR_402;
            default -> HTTPError.NO_ERROR;
        };
        System.out.println(httpError.description);
    }}











