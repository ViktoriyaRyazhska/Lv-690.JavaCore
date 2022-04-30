import java.util.Scanner;

public class series12 {
    public static void main(String[] args) {
        int[] a = new int[100];
        Scanner in = new Scanner(System.in);

        int i = 0, k = 0;


        for (int element : a) {
            System.out.print("Введите" + (i + 1) + "й элемент массива");
            a[i] = in.nextInt();
               if (a[i] !=0)
               {k = k + 1;
                i++;}
                else
                    break;
                            }

            System.out.println(k);

        }

    }




