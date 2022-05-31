package lesson8.Task1;

public class Main {
    public static void main(String[] args) {
        FullName nik = new FullName("Taras", "Petrov");
        Student student1 = new Student(nik, 22, 5);
        Student student2 = new Student(new FullName("Petr", "Tarasov"), 21, 3);
        student1.info();
        System.out.println(student1.activity());
        student2.info();
        String activity2 = student2.activity();
        System.out.println(activity2);
    }
}
