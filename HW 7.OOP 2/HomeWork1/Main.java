package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> listEmploy=new ArrayList<>();
        listEmploy.add(new SalariedEmployee("salariedEmp","Roman",3132,160,25));
        listEmploy.add(new SalariedEmployee("salariedEmp","Igor",3131,180,30));
        listEmploy.add(new ContractEmployee("ContrEmp","Solomia",30000,"TaxSocial"));
        listEmploy.add(new ContractEmployee("ContrEmp","Nastia",21000,"TaxFree"));

        listEmploy.sort(new PayComparatorPayment());
        for(Employee e:listEmploy){
            System.out.println(e);
        }
    }
}
