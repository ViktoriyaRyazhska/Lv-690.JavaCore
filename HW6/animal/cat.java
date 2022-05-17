package Practice.animal;

public class cat implements animal {

    private String name;

    public cat(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String voice() {
        return getName() + " Meow-meow";
    }

    @Override
    public String feed() {
        return getName() + " Cat food";
    }


}
