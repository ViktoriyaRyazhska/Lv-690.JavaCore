package HW7.task1;

import java.util.ArrayList;
import java.util.List;

public class MainPayment {
    public static void main(String[] args) {
        List<Employee> listEmploy=new ArrayList<>();
        listEmploy.add(new SalariedEmployee("salariedEmp","Andrew",5,140,20));
        listEmploy.add(new SalariedEmployee("salariedEmp","Sergio",2,150,25));
        listEmploy.add(new SalariedEmployee("salariedEmp","Roman",3,180,25));
        List<Employee> listEmployCon=new ArrayList<>();
        listEmployCon.add(new ContractEmployee("ContrEmp","Sofi", 25000,"TaxFree"));
        listEmployCon.add(new ContractEmployee("ContrEmp","Anna",28000,"TaxFree"));
        listEmployCon.add(new ContractEmployee("ContrEmp","Alina",26000,"TaxSocial"));
        
        listEmploy.sort(new PayComparatorPayment());
        for(Employee e:listEmploy){
            System.out.println(e);
        }
        listEmployCon.sort(new PayComparatorContract());
        for(Employee y:listEmployCon){
            System.out.println(y);
        }
        
               
      
    }
}