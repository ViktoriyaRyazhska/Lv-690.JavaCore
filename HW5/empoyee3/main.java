package homeWork.empoyee3;

public class main {
    public static void main(String[] args) {

        Employee3 user1 = new Employee3("josh", 34, 3000);
        Employee3 user2 = new developer("tom", 21, 3500, "Java homeWork.empoyee3.developer");

        user1.print();
        user2.print();
    }
}
