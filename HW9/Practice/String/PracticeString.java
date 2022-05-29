package Practice.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeString {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Apple MAC ";


        System.out.println(str2.contains(str1));

        String name = "John Fitzgerald Kennedy";
        String[] arrName = name.split(" ");
        System.out.println(arrName[1] + " " + arrName[0].charAt(0) + " " + arrName[2].charAt(0));
        System.out.println(arrName[0]);
        System.out.println(arrName[2] + " " + arrName[1] + " " + arrName[0]);


        System.out.println(regexCheck("Kim"));
        System.out.println(regexCheck("Samuel"));
        System.out.println(regexCheck("Ki"));
        System.out.println(regexCheck("Martin"));


    }

    public static boolean regexCheck(String name) {

        Pattern p = Pattern.compile("^[a-zA-Z0-9]{3,15}$");
        Matcher m = p.matcher(name);
        return m.matches();

    }

}

