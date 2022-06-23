import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("Enter number of task");
        Scanner sc = new Scanner(System.in);

        int sw = sc.nextInt();


        switch (sw){
            case 1:
                task();
                break;
        }

    }
    public static void task(){
        System.out.println("Task on");

    }


}
