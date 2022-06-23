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
    public static void task9(){
         int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
          int k= (int) Math.ceil(Math.random());
          if(k == 1){
              count+=1;
          }

        }
        System.out.println(count);
    }
    public static int inputTask10() {
        int number = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number > 1:");
        boolean flag = true;
        while (flag) {
            try {
                number = Integer.parseInt(br.readLine());
                if (number < 1) {
                    throw new RuntimeException("Incorrect number, try again");
                } else {
                    flag = false;
                    return number;
                }
            } catch (IOException | NumberFormatException e) {
                System.err.println("Incorrect value. Try again");
            }
        }
        return 0;
    }

    public static void executeTask10() {
        int steps = 0;
        int number1 = inputTask10();

        while (number1 != 1) {
            if (number1 % 2 == 0) {
                number1 = number1 / 2;
                steps++;
            } else {
                number1 = number1 * 3 + 1;
                steps++;
            }
        }
        System.out.println(steps);
    }
    public static void executeTask11() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0) {
                sum += i;
            } else {
                if (i % 5 == 0) {
                    sum += i;
                } else {
                    sum += 0;
                }
            }
        }
        System.out.println(sum);
    }

}
