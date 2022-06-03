package lesson10.Task2;

public class Task2 {
    public static void main(String[] args) {
        String string = "I   am      learning     Java   Core";
        System.out.println(string.replaceAll("\\s+", " "));
    }
}
