package lesson13.task2;

/*Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
Method encrypt should take a string and return coded string where every letter is moved on n positions in
alphabet (e.g. encrypt("abc", 3) returns "def“).
Method decrypt should return decoded value */

import java.util.stream.Collectors;

public class Task2 {

    public String stringEncrypt(String s, int n) {
        return s.chars()
                .mapToObj(m -> (char) (m + n))
                .toList()
                .stream()
                .map(m -> String.valueOf(m))
                .collect(Collectors.joining());
    }

    public String stringDecrypt(String s, int n) {
        return s.chars()
                .mapToObj(m -> (char) (m - n))
                .toList()
                .stream()
                .map(m -> String.valueOf(m))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        String s = "b";
        int n = 1;
        task2.stringEncrypt(s, n);
        task2.stringDecrypt(s, n);
        System.out.println(task2.stringEncrypt(s, n));
        System.out.println(task2.stringDecrypt(s, n));
    }
}


