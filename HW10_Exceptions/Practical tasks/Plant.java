package HW10_Exceptions;

enum Color{
    GREEN,BLACK,WHITE;
}
enum Type{
    TREE, BUSH;
}

public class Plant {
    private int Size;
    private Color color;
    private Type type;

    public Plant(int size, String enterColor, String enterType) throws DoubleException {
        Size = size;
        try {
            this.color = checkAndSetColor(enterColor);
        } catch (ColorException colorException){
            System.err.println(enterColor+" - invalid color of plant!");
        }
        try {
            this.type = checkAndSetType(enterType);
        } catch (TypeException typeException){
            System.err.println(enterType+"- unknown type of plant!");
        }

        if (this.color==null && this.type ==null){
            throw new DoubleException("Double fail. Type -"+enterType + " & Color -" + enterColor);
        }
    }


    public static void main(String[] args) {

        //task 2 Plants
        try {
            Plant [] plants = createPlants();
            for (Plant pl:plants) {
                System.out.println(pl);
                }
        } catch (ArrayIndexOutOfBoundsException | DoubleException exception){
            System.err.println(exception.getMessage());
            // exception.printStackTrace();
        }

    }

    public static Plant [] createPlants() throws ArrayIndexOutOfBoundsException,DoubleException {

        Plant [] plants = new Plant[5];
        plants [0] = new Plant(100, "white", "it");
        plants [1] = new Plant(200, "green", "bush");
        plants [2] = new Plant(100, "black", "tree");
        plants [3] = new Plant(50, "white", "grass");
        plants [4] = new Plant(15, "red", "book");

        return plants;
    }

    public Color checkAndSetColor(String enterColor) throws ColorException {
        Color color = null;
        switch (enterColor.toUpperCase()) {
            case "GREEN", "BLACK", "WHITE":
                color = Color.valueOf(enterColor.toUpperCase());
                break;
            default:
               throw new ColorException();
        }
        return color;
    }

    public Type checkAndSetType(String enterType) throws TypeException{

        Type type = null;
        switch (enterType.toUpperCase()) {
            case "TREE", "BUSH":
                type = Type.valueOf(enterType.toUpperCase());
                break;
            default:
                throw new TypeException();
        }
        return type;
    }


    @Override
    public String toString() {
        return "Plant{" +
                "Size=" + Size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
