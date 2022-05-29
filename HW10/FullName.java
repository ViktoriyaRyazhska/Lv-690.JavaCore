package HW10;

public class FullName {
    public static void main(String[] args) {
//        Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
//        surnames and initials name; name; middle name and last name
        String name = "Taras Grygorovich Shevchenko";
        String[] letter = name.split("");
        String[] word = name.split(" ");
        System.out.println(word[2] + " " + letter[0] + "." + letter[6] + ".");
        System.out.println(word[0]);
        System.out.println(word[1] + " " + word[2]);

    }
}
