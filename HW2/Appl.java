package HW2;

public class Appl {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Olga");
        e1.setRate(4);
        e1.setHours(2);

        Emloyee e2= new Employee("Oleg", 5);
        e2.setHours(3);

        Employee e3 = new Emloyee("Anna", 3, 6);

        System.out.println(e1,toString());
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(Employee,totalSum());

    }
}
