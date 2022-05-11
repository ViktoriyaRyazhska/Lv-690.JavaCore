package emplloyee2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        employee2 user1 = new employee2("Sam", 12, 323);
        employee2 user2 = new employee2("Smith", 13, 378);
        employee2 user3 = new employee2("Jacob", 14, 389);
        employee2 user4 = new employee2("jon", 13, 307);
        employee2 user5 = new employee2("Wes", 19, 345);

        employee2[] userArray = {user1, user2, user3, user4, user5};

        fiendUser(userArray);
        System.out.println("-------");
        userSort(userArray);

    }

    public static void fiendUser(employee2[] user) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input user department");
        int input = Integer.parseInt(sc.next());

        for (int i = 0; i < user.length; i++) {
            if (input == user[i].department) {
                System.out.println(user[i].toString());
            }
        }

    }

    public static void userSort(employee2[] user) {
        int tmpSalary;
        String tempName;
        int tempDepart;
        for (int i = 0; i < user.length - 1; i++) {
            for (int j = i + 1; j < user.length; j++) {
                if (user[i].salary < user[j].salary) {
                    tmpSalary = user[i].salary;
                    tempName = user[i].name;
                    tempDepart = user[i].department;
                    user[i].salary = user[j].salary;
                    user[i].name = user[j].name;
                    user[i].department = user[j].department;
                    user[j].salary = tmpSalary;
                    user[j].name = tempName;
                    user[j].department = tempDepart;
                }
            }
        }
        for (int i = 0; i < user.length; i++) {
            System.out.println(user[i]);
        }


    }
}
