package HW10.StringsTask3;

//Implement a pattern for US currency: the first symbol "$",
//then any number of digits, dot and two digits after the dot.
//Enter the text from the console that contains several occurrences of US currency.
//Display all occurrences on the screen

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class MainPattern {
public static void main(String[] args) {
String pattern = "[$]{1}+[0-9]*+[,]{1}+[0-9]{2}";

String cur[] = {"10,50$", "$1,12", "$30,59c", "$10000,00", "$10,0"};
Pattern p = Pattern.compile(pattern);
for (String s : cur) {
  Matcher m = p.matcher(s);
  System.out.println(s + "   " + m.matches());
}
}
//public static void main(String[] args) {
//    String pattern = "[a-z]+";
//    String text = "Now is the time";
//    Pattern p = Pattern.compile(pattern);
//    Matcher m = p.matcher(text);
//    while (m.find()) {
//       System.out.print(text.substring(m.start(), m.end()) + "*");
// }

//}
}