import java.util.Scanner;

public class array34 {
    //Дан массив размера N. Найти максимальный из его локальных минимумов
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }
int max=0;

        while (a [0] < a[1])
            max =a[0];
                for (int i = 1; i < N; i++) {
                    if (a[i] < a[i - 1] && a[i + 1] > a[i] && a[i] > a[0])
                      max = a[i];
                    System.out.println(max);
                }

        }
    }

