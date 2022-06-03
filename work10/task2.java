package work10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {

	public static void main(String[] args) {
		System.out.println("enter 10 integer number(1 < a1 < ... < a10 < 100)");
		int[] nums =new int[10];
		
		
		try {
		for(int i=0; i<nums.length; i++) {
			nums[i]=readNumber(2, 99);
			if(i!=0&&nums[i]<=nums[i-1]) {
				throw new SpecificException("non-compliance with the condition");
			}
		}
		
		
		} catch(NumberFormatException e) {
			System.err.println("incorrect data format");
			System.err.println("please, try again");
		} catch(IOException e) {
			System.err.println("how did you call IOException?");
			System.err.println("please, try again");
		} catch(RangeException|SpecificException e) {
			System.err.println(e.getMessage());
			System.err.println("please, try again");
		}
		
		
		System.out.println("your numbers:");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
	
	public static int readNumber(int start, int end) throws NumberFormatException, IOException, RangeException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter integer number: ");
		int num = Integer.parseInt(bf.readLine());
		if(num<=end&&num>=start) {
			return num;
		}else {
			throw new RangeException("out of range");
		}
	}

}
