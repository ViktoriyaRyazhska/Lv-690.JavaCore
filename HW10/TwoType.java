package HW10;

public class TwoType {
    //Enter the two variables of type String. Determine whether the first variable substring second. For example,
    // if you typed «IT» and «IT Academy» you must receive true.
    public static void main(String[] args) {
        String s1 = "BALL";
        String s2 = "BASKETBALL";
        System.out.println(s1.substring(0, 3).equals(s2.substring(6,9)));
        //System.out.println(s1.equals(s2));
    }
}
