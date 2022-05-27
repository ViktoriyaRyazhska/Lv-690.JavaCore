//Implement a pattern for US currency: the first symbol "$",
//        then any number of digits, dot and two digits after the dot.
//        Enter the text from the console that contains several occurrences of US currency.
//        Display all occurrences on the screen

package HomeWork_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        String pattern = "[$]{1}+[0-9]*+[,]{1}+[0-9]{2}";

        String cur[] = {"10,50$", "$1,12", "$30,59c", "$10000,00", "$10,0"};
        Pattern p = Pattern.compile(pattern);
        for (String s : cur) {
            Matcher m = p.matcher(s);
            System.out.println(s + "   " + m.matches());

        }
    }
}
