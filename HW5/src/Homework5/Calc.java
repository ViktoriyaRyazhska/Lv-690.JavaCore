package Homework5;

public class Calc {
	private int[] list;

	public Calc(int[] list) {
		this.list = list;
	}
	
	public int getBiggest() {
		int biggest=0;
		for (int i=0;i<list.length;i++) {
			if (list[i]>biggest) {
				biggest = list[i]; 
			}
		};
		 return biggest;
		
	}

	public void printBiggest() {
		 System.out.println("biggest="+getBiggest());	
	}

	public void printAmountNeg() {
		int AmountPos=0;
		int AmountNeg=0;
		for (int i=0;i<list.length;i++) {
			if (list[i]<0) {
				AmountNeg = AmountNeg + 1; 
			}
			if (list[i]>0) {
				AmountPos = AmountPos + 1; 
			}
		};
		 System.out.println("amountPos="+AmountPos);
		 System.out.println("amountNeg="+AmountNeg);
		if (AmountNeg>AmountPos) {
			System.out.println("negatives are more than positives");
			}
		if (AmountNeg<AmountPos) {
			System.out.println("positives are more than negatives");
			}
		if (AmountNeg==AmountPos) {
			System.out.println("positives are equal to negatives");
			}
		}
	

	public void printSumPos() {
		int sumPos=0;
		for (int i=0;i<list.length;i++) {
			if (list[i]>0) {
				sumPos = sumPos + list[i]; 
			}
		};
		System.out.println("sumPos="+sumPos);
		
	}

	public boolean isPositiveFirst5() {
		for (int i=0;i<5;i++) {
			if (list[i]<0) {
				return false; 
			}
		};
		return true;		
	}

	
	public void printSP() {
		if (isPositiveFirst5()) {
			int res = 0;
			for (int i=0;i<5;i++) {
				res = res + list[i]; 
				}
			System.out.println("sum="+res);
		}
		else {
			int res = 1;
			for (int i=list.length-1;i>=5;i--) {
				res = res * list[i]; 
				}
			System.out.println("product ="+res);
		}
		
	}
	
	public void printPositionOfSecondPositive() {
		int foundPositives = 0;
		for (int i=0;i<5;i++) {
			if (list[i]>0) {
				foundPositives++;
			};
			if (foundPositives==2) {
				System.out.println("position ="+(i+1));
				return;
			}
			}
		System.out.println("not found");
		
	}

	
	public void printMinimumAndPosition() {
		int min = list[0];
		int position = 1;
		for (int i=0;i<5;i++) {
			if (list[i]<min) {
				min = list[i];
				position = i+1;
			};
			}
		System.out.println("min="+min+", position="+position);
		
	}

	
}
