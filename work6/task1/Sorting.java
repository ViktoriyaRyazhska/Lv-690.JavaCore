package work6.task1;

import java.util.Comparator;

public class Sorting implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.calculatePay() - o2.calculatePay();
    }
}