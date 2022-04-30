public class string23 {
    public static void main(String args[]) {
        int Sum =0;
        String str ="11+5-6+89-78+90";
        String[] number = str.split("(?=[-+])");
        for (String s:number) {
            Sum += Integer.parseInt(s);
                    }
        System.out.println(Sum);
    }
}
