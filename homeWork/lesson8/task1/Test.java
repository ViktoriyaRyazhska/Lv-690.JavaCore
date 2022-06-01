package Homework.lesson8.task1;

public class Test {
    public static void main(String[] args) {
        Student a1 = new Student(new FullName("Denys", "Bratukh"), 22, 692);
        Student a2 = new Student(new FullName("Oleg", "Hor"), 25, 885);
        System.out.println(a1.info());
        System.out.println(a1.activity());
        System.out.println(a2.info());
        System.out.println(a2.activity());

    }
}
