package HW7.task1;


import java.util.Comparator;

public class PayComparatorPayment implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.calculatePay()- o1.calculatePay();
    }
    
}