package homework3;

public class Read {
	public static void main(String[] args) {
		//3 float
		float a1=3.3f;
		float b1=4.4f;
		float c1=-5.4f;
		
		if(a1<=5 && a1>=-5) {
			System.out.println(a1+" in range [-5,5]");
		}else {
			System.out.println(a1+" not in range [-5,5]");
		}if(b1<=5 && b1>=-5) {
			System.out.println(b1+" in range [-5,5]");
		}else {
			System.out.println(b1+" not in range [-5,5]");
		}if(c1<=5 && c1>=-5) {
			System.out.println(c1+" in range [-5,5]");
		}else {
			System.out.println(c1+" not in range [-5,5]");
		}
		
		//3 int
		int a2=3;
		int b2=4;
		int c2=15;
		
		if(a2>b2 && a2>c2) {
			System.out.println("Max numbers ="+a2);
			}else {
				if (b2>a2 && b2>c2) {
					System.out.println("Max numbers ="+b2);
				}else {
					if (c2>b2 && c2>b2) {
						System.out.println("Max numbers ="+c2);
					}
				}
			}	
		if(a2<b2 && a2<c2) {
			System.out.println("Min numbers ="+a2);
				}else if (b2<a2 && b2<c2){
				System.out.println("Min numbers ="+b2);
					}else if (c2<a2 && c2<b2) {
					System.out.println("Min numbers ="+b2);
			}
		//HTTP eror
		for(Error element2:Error.values()) {
			System.out.println(element2.getNumber()+" "+element2.toString());
		}
		
	}
}
