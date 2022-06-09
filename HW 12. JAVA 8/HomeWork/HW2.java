//2. Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
//        Method encrypt should take a string and return coded string where every letter is moved
//        on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“).
//        Method decrypt should return decoded value


package HomeWork;

import java.util.stream.Collectors;

public class HW2 {
    public static void main(String[] args) {
//        encrypt("ab",1);
        System.out.println(encrypt("abc", 1));
//        decrypt("ab",1);
        System.out.println(decrypt("bcd", 1));

    }

    public static String encrypt(String s, int n) {

        return s.chars().mapToObj(m -> (char) (m + n)).toList().stream().map(m->String.valueOf(m)).collect(Collectors.joining());
    }

    public static String decrypt(String s, int n) {
        return s.chars().mapToObj(m -> (char) (m - n)).toList().stream().map(m->String.valueOf(m)).collect(Collectors.joining());
    }
}
