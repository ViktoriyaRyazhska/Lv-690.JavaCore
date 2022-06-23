package HW7_InnerClasses;

public class WrapperHW <T> {
    private T value;

    public static void main(String[] args) {

        WrapperHW[] wrapps = createWrapps();
        print(wrapps);
        setNewValues(wrapps);
        print(wrapps);

    }

    public static WrapperHW[] createWrapps(){

        WrapperHW[] wrapps = new WrapperHW[3];
        wrapps[0] = new WrapperHW<Integer>(10);
        wrapps[1] = new WrapperHW<String>("test");
        wrapps[2] = new WrapperHW<Boolean>(true);
        return wrapps;
    }

    public static void print(WrapperHW[] wrapps){

        for (WrapperHW wr: wrapps) {
            System.out.println(wr.getValue());
        }

    }

    public static void setNewValues(WrapperHW[] wrapps){

        wrapps[0].setValue("random");
        wrapps[1].setValue(false);
        wrapps[2].setValue(20);

    }

    public WrapperHW(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
