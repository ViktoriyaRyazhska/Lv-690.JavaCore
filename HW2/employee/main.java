package employee;

public class main {
    public static void main(String[] args) {

        employee user1 = new employee("Steve",15,45);
        employee user2 = new employee("Kenny",23,34);
        employee user3 = new employee("Elza",13,60);
        employee[] employeesArrays = {user1,user2,user3};

        for (int i = 0;i<employeesArrays.length;i++)
        {
            System.out.println(employeesArrays[i]);
            System.out.println("----------");
        }

        System.out.println("Total sum of all salary is " + employee.totalSum);
        user1.ChangeRate(34);
        System.out.println("Total sum of all salary is " + employee.totalSum);






    }
}
