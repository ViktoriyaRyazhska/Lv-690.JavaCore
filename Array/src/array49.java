import java.util.Scanner;

public class array49 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();}

        //Дан целочисленный массив размера N. Если он является перестановкой, то есть содержит все числа от 1 до N,
        // то вывести 0; в противном случае вывести номер первого недопустимого элемента.
        int arg = 0;
        for (int i = 0; i <= N - 2; i++) {
            if (a[i] + 1 != a[i + 1]) {
                arg = i+2;
                            }
        }
        System.out.println(arg);
    }

}
