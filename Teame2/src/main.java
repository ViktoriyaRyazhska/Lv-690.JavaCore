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

}
