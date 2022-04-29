package tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {
    public static void main(String[] args) throws IOException {
        // дзвінки з різних країн с1,c2,c3(вартість за хвилину)
        double c1;
        double c2;
        double c3;
        // тривалість дзвінків t1,t2,t3
        double t1;
        double t2;
        double t3;
        System.out.println("Введіть варість дзвінків для кожної країни с1,с2,с3");
        BufferedReader br_c1=new BufferedReader(new InputStreamReader(System.in));
        c1=Integer.parseInt(br_c1.readLine());
        BufferedReader br_c2=new BufferedReader(new InputStreamReader(System.in));
        c2=Integer.parseInt(br_c2.readLine());
        BufferedReader br_c3=new BufferedReader(new InputStreamReader(System.in));
        c3=Integer.parseInt(br_c3.readLine());
        System.out.println("Введіть тривалість дзвінків з кожної країни t1,t2,t3");
        BufferedReader br_t1=new BufferedReader(new InputStreamReader(System.in));
        t1=Integer.parseInt(br_t1.readLine());
        BufferedReader br_t2=new BufferedReader(new InputStreamReader(System.in));
        t2=Integer.parseInt(br_t2.readLine());
        BufferedReader br_t3=new BufferedReader(new InputStreamReader(System.in));
        t3=Integer.parseInt(br_t3.readLine());
        // Відображуємо вхідні дані
        System.out.println("Ви ввели "+" c1 = "+c1+" c2 = "+c2+" c3 = "+c3+" t1 = "+t1+" t2 = "+t2+" t3 = "+t3);
        System.out.println();
        double call_1=c1*t1;
        System.out.println("Вартість дзвінків з країни с1 по тарифу t1 "+call_1);
        System.out.println();
        double call_2=c2*t2;
        System.out.println("Вартість дзвінків з країни с2 по тарифу t2 "+call_2);
        System.out.println();
        double call_3=c3*t3;
        System.out.println("Вартість дзвінків з країни с3 по тарифу t3 "+call_3);
        System.out.println();
        double call_all=c1*t1+c2*t2+c3*t3;
        System.out.println("Загальна вартість усіх дзвінків "+call_all);
    }
}
