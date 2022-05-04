package projEmployee;

public class employeeAplication {
    public static void main(String[] args) {
        Employee e1=new Employee("Igor",100,100);
        System.out.println("Information: employee - e1 :");
        System.out.println(e1);
        System.out.println("Salary e1 - "+e1.getSalaru()+"$.");
        System.out.println("Bonuse e1 - "+e1.getBonuses()+"$.");
        System.out.println("Total salary - "+e1.totalSum+"$.");
        System.out.println();

        System.out.println("Information: employee - e2");
        Employee e2=new Employee("Nazar",200);
        e2.setHours(100);
        System.out.println(e2);
        System.out.println("Salary e2 - "+e2.getSalaru()+"$.");
        System.out.println("Bonuse e2 - "+e2.getBonuses()+"$.");
        System.out.println("Total salary - "+e2.totalSum);
        e2.changeRate(150);
        e2.setHours(110);
        System.out.println(e2);
        System.out.println("Total salary - "+e2.totalSum+"$.");
        System.out.println();

        System.out.println("Information: employee - e3");
        Employee e3=new Employee();
        e3.setName("Vitalii");
        e3.setRate(80);
        e3.setHours(20);
        System.out.println(e3);
        System.out.println("Salary e3 - "+e3.getSalaru()+"$.");
        System.out.println("Bonuse e3 - "+e3.getBonuses()+"$.");
        System.out.println("Total salary - "+e3.totalSum+"$.");
        e3.changeRate(150);
        e3.setHours(10);
        System.out.println(e3);
        System.out.println("Total salary - "+e3.totalSum);
    }
}
