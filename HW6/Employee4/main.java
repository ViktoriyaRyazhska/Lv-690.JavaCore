package HomeWork.Employee4;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Employee em1 = new ContractEmployee("Josh", "230-90-45", 12000);
        Employee em2 = new ContractEmployee("Mat", "199-78-45", 15000);
        Employee em3 = new SalariedEmployee("Takeshi", "23-34-789", 30, 123);
        Employee em4 = new SalariedEmployee("Raji", "90-323-789", 45, 200);

        List<Employee> emploList = new ArrayList<Employee>();

        emploList.add(em1);
        emploList.add(em2);
        emploList.add(em3);
        emploList.add(em4);

        emploList.sort(new PaymentComparator());

        for (Employee em : emploList) {
            em.getInfo();
        }


    }
}
