package HomeWork2;

public class WraperAppl {
    public static void main(String[] args) {
        Wrapper<Integer> WrapIneteger=new Wrapper<>();
        Wrapper<String> WrapString=new Wrapper<>();
        Wrapper<Boolean> WrapBoolean=new Wrapper<>();
        WrapIneteger.setValue(10);
        WrapString.setValue("This is string");
        WrapBoolean.setValue(true);
        System.out.println(WrapIneteger.getValue());
        System.out.println(WrapString.getValue());
        System.out.println(WrapBoolean.getValue());
    }
}
