import java.util.Scanner;

public class HW4_HTTP_Error {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int error = scanner.nextInt();
        switch (error){
            case 400:
                System.out.println(HTTP_Error.BadRequest.getDescription());
                break;
            case 401:
                System.out.println(HTTP_Error.Unauthorized.getDescription());
                break;
            case 402:
                System.out.println(HTTP_Error.PaymentRequired.getDescription());
                break;
            case 403:
                System.out.println(HTTP_Error.Forbidden.getDescription());
                break;
            case 404:
                System.out.println(HTTP_Error.NotFound.getDescription());
                break;
            default:
                System.out.println("wrong error number");
        }


    }
}
