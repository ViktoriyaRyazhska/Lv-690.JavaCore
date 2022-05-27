package HW5.numbers;
import java.util.Scanner;
public class tenIntegers {

public static void tenIntegers1(String[] args) {

tenIntegers();
}
	
//private static void tenIntegers() {
//	// TODO Auto-generated method stub
//	
//}

//private tenIntegers() {
//	

int sum1 = 0;
int sum2 = 1;
boolean count = false;
System.out.println("Enter first five numbers:");
Scanner sc = new Scanner(System.in);

for (int i = 0; i < 5; i++) {
    int number = sc.nextInt();
    sum1 += number;
    if (number < 0) {
        count = true;
        System.out.println("Not this variant. Calculate product last five numbers");
        break;
    }
}
return sum1;

}
}

