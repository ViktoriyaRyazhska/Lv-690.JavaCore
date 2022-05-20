package HomeWork.Wrapper;

public class main {
    public static void main(String[] args) {

        Wrapper<Integer> wrapInt = new Wrapper<>();
        wrapInt.setT(5);
        System.out.println(wrapInt.getT());

        Wrapper<String> wrapSt = new Wrapper<>();
        wrapSt.setT("This is String");
        System.out.println(wrapSt.getT());

        Wrapper<Boolean> wrapBool = new Wrapper<>();
        wrapBool.setT(true);
        System.out.println(wrapBool.getT());




    }
}
