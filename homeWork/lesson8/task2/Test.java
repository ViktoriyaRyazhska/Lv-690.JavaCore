package Homework.lesson8.task2;

public class Test {
    public static void main(String[] args) {
        Wrapper<Integer> a1 = new Wrapper<>();
        Wrapper<String> a2 = new Wrapper<>();
        Wrapper<Boolean> a3 = new Wrapper<>();

        a1.setValue(123);
        a2.setValue("Abc");
        a3.setValue(true);


        System.out.println(a1.getValue());
        System.out.println(a2.getValue());
        System.out.println(a3.getValue());
    }
}
