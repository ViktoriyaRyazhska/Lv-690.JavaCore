import java.util.Scanner;

public class array19 {
    //Дан целочисленный массивAразмера 10. Вывести порядковый номерпоследнего из тех его элементовAK,
    // которые удовлетворяют двойномунеравенствуA1<AK<A10. Если таких элементов нет, то вывести 0
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }
        int rez=0;
        for (int i = 8; i >= 0; i--) {
            if (a[0] < a[i] && a[i] < a[9]) {
               rez=i+1;}
            System.out.printf("Rezult: %s",rez);

            }

        }
    }


