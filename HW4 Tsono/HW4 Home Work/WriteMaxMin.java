import java.util.Scanner;

//read 3 integer numbers and write max and min of them;
public class WriteMaxMin {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        int o;
        int p;

        try {
            i = sc.nextInt();
            o = sc.nextInt();
            p = sc.nextInt();
        } catch (Exception e) {
            System.out.println("You write wrong type of numbers");
            return;
        }

        System.out.println(Math.min(i, Math.min(o, p))+"---Min.");
        System.out.println(maxNum(i, maxNum(o, p))+"---Max.");
    }

    public static int maxNum(int i, int o) {
        return i > o ? i : o;
    }

}
