package ls7.Payment;

import java.util.Comparator;

public class EmployeeldComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {		
		return o1.getEmployeeld().compareTo(o2.getEmployeeld());
	}

}
