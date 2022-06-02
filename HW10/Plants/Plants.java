package Practice.Plants;

public class Plants {
    private Color color;
    private Type type;
    private int size;

    public Plants(String color, String type, int size) throws ColorException, TypeException {
        Color c = colorEnum(color);
        Type t = typeEnum(type);
        this.color = c;
        this.type = t;
        this.size = size;
    }



    public Color colorEnum(String color) throws ColorException{
        switch (color) {
            case "Red":
                return Color.RED;
            case "Blue":
                return Color.BLUE;
            case "Yellow":
                return Color.YELLOW;
            default:
                throw new ColorException("Wrong color");

        }
    }

    public Type typeEnum(String type) throws TypeException {
        switch (type) {
            case "Climbers":
                return Type.CLIMBERS;
            case "Herbs":
                return Type.HERBS;
            case "Tree":
                return Type.TREE;
            default:
                throw new TypeException("Wrong type");

        }

    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "\s" + getColor() + "\s" + getType() + "\s" + getSize() + "\sMeters";
    }
}
