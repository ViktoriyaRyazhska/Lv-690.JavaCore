package HW1;


public class Task5 {
    public static void execute() {

        // Input string and check if this string is palindrome (e.g. “ABCCBA”)
        String testString = "Kayak";
        String reversedString = new StringBuilder(testString).reverse().toString();
        //new StringBuilder(testString).

        System.out.println("\n*** Task 5 ***");
        System.out.println("Test string:");
        System.out.println(testString);

        System.out.println(String.format("Palindrome: " + testString.equalsIgnoreCase(reversedString)));
    }

}
