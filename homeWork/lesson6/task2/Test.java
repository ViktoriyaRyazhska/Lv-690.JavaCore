package Homework.lesson6.task2;

public class Test {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", 26, 3500);
        Developer denys = new Developer("Denys", 22, 13500, "Senior");
        System.out.println(ivan.report());
        System.out.println(denys.report());

    }
}
