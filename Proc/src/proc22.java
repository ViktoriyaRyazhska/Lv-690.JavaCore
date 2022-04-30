import java.util.Scanner;

public class proc22 {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;
        Scanner inp = new Scanner(System.in);
        System.out.println("Choose an operator: 1, 2, 3");
        operator = inp.next().charAt(0);

        System.out.println("Enter first number");
        number1 = inp.nextDouble();

        System.out.println("Enter second number");
        number2 = inp.nextDouble();
//Описать функцию Calc(A, B, Op) вещественного типа, выполняющую
//над ненулевыми вещественными числами A и B одну из арифметических
//операций и возвращающую ее результат. Вид операции определяется целым параметром Op: 1 — вычитание, 2 — умножение,
// 3 — деление, остальные значения — сложение. С помощью Calc выполнить для данных A и B
//операции, определяемые данными целыми N1, N2, N3.
        switch (operator) {
            case '1':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '2':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '3':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
        }
        inp.close();
    }
}
