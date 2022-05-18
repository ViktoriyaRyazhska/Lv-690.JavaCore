package HomeWork1;

import java.util.Comparator;

public class PayComparatorPayment implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.calculatePlay()- o1.calculatePlay();
    }
}
