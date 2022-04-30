import java.util.Scanner;

public class array30 {
    //Дан массив размераN. Найти номера тех элементов массива, которые больше своего правого соседа, и количество
    // таких элементов. Найденные номера выводить в порядке их возрастания
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }

        int num = 0;

        for (int i = 0; i < N - 1; i++) {
            if (a[i] > a[i + 1]) {
                num = num + 1;
                System.out.println(i + 1);
            }
            }
        System.out.println("Количество соответствующих элементов:" +num);
    }
}

