package work6.task1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Employee> listEmployeers = new ArrayList<Employee>();
		
		listEmployeers.add(new SalariedEmployee("Elsa", "231-45-7851", 71, 94));
		listEmployeers.add(new SalariedEmployee("Tom", "467-91-6553", 44, 68));
		listEmployeers.add(new SalariedEmployee("Jerry", "194-27-3591", 84, 58));
		listEmployeers.add(new ContractEmployee("Anna", "487-65-4882", 6357));
		listEmployeers.add(new ContractEmployee("John", "344-45-4475", 8546));

		listEmployeers.sort(new Sorting());

        for (Employee employee : listEmployeers) {
            employee.info();
        }
	}

}
