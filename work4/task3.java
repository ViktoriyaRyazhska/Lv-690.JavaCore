package work4;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		int[] num = new int[5];
		int imin = 0;
		////
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 5 integer numbers:");
		for(int i = 0; i<num.length; i++) {
			num[i] = Integer.parseInt(sc.nextLine());
		}
		////
		int a =PositionOfPosNum(num, (PositionOfPosNum(num, 0)+1));
		if(a!=-1) {
			System.out.println("position of second positive number is "+a);
		}else {
			System.out.println("not found position of second positive number");
		}
		////
		for(int i=0;i < num.length;i++) {
			if (num[i] < num[imin]) {
				imin = i;
			}
		}
		System.out.println("Minimum is " + num[imin]+", placed "+imin);
		////
		////
		////
		num=new int[64];
		int check;
		int product =1;
		int length=0;
		////
		System.out.println("enter integers until the first negative number:");
		for(; length<num.length; length++) {
			check = Integer.parseInt(sc.nextLine());
			if(check<0) {
				break;
			}
			num[length]=check;
		}
		////
		for(int i = 0; i<length; i++) {
			if(num[i]%2==0) {
				product *=num[i];
			}
		}
		System.out.println("product of all even numbers: "+product);
	}
	
	
	
	static int PositionOfPosNum(int[] arr, int start) {
		if(start<0) {
			return -1;
		}
		for(; start<arr.length; start++) {
			if(arr[start]>0) {
				return start;
			}
		}
		return -1;
	}
}
