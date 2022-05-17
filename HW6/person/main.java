package Practice.person;

public class main {
    public static void main(String[] args) {
        Person user1 = new Claener("Josh", 23, 9000);
        Person user2 = new Teacher("Jim", 34, 5000);
        Person user3 = new Claener("Tom", 45, 7000);
        Person user4 = new Teacher("Jerry", 67, 12000);
        Person user5 = new Student("Sem", 15);
        Person user6 = new Student("Bob", 16);
        Person user7 = new Student("Sem", 17);

        Person[] persons = {user1, user2, user3, user4, user5, user6, user7};


        for (Person per : persons) {
            per.print();
            if (per instanceof Staff) {
                ((Staff) per).salary();
            }
        }


    }
}
