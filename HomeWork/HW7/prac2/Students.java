package HW7.prac2;

public class Students extends Person {
    private final String TYPE_PERSON="student";
    public Students(String name) {
        super(name);
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println(getName()+" TYPE_PERSON: "+getTYPE_PERSON());
    }
}