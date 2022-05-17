package HomeWork.Employee4;

import java.util.Comparator;

public class PaymentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.calculatePay() - o1.calculatePay();
    }
}
