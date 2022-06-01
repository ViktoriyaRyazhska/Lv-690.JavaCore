package Homework.lesson7.task1;

import java.util.Comparator;

public class ComparatorSalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.calculatePay() - o2.calculatePay());
    }
}
