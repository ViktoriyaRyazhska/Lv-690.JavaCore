package Practice.animal;

public class dog implements animal {

    private String name;

    public dog(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String voice() {
        return getName() + " Woff-Woff";
    }

    @Override
    public String feed() {
        return getName() + " Practice.animal.dog food";
    }


}
