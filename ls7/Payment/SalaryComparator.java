package ls7.Payment;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Payment>{

	@Override
	public int compare(Payment o1, Payment o2) {		
		return (int) ((o2.calculatePay()) - o1.calculatePay());
	}
	
}
