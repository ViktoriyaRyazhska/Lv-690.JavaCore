//Enter a sentence that contains the words between more than one space.
//        Convert all spaces, consecutive, one.
//        For example, if we introduce the sentence
//        "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»
//


package HomeWork_2;

public class main {
    public static void main(String[] args) {
        String str = "I  am  learning  Java  Core";
        String strFormat = str.replaceAll("  ", " ");
        System.out.println(strFormat + "  ---only one space not two");
        String fStr = strFormat.replaceAll(" am", "'m");
        System.out.println(fStr + " ---new format I'm ");

    }
}
