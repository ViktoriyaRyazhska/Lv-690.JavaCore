//Create a class Plant, which includes fields int size, Color color and Type type,
//        and constructor where these fields are initialized.
//        Color and type are Enum. Override the method toString( ).
//        Create classes ColorException and TypeException and describe there all possible colors
//        and types of plants. In the method main create an array of five plants.
//        Check to work your exceptions.


package PracticalTask_2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) throws ColorException, TypeException {
        Type t = typeFromEnum(type);
        Color c = colorFromEnum(color);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" + "size=" + size + ", color=" + color + ", type=" + type + '}';
    }

    public static void main(String[] args) throws ColorException, TypeException {
        Plant[] p = new Plant[5];
        // Метод для провірки окремих Plant. Як можна оминути багато повторів Try/Catch?
        try {
            p[0] = new Plant(1, "RED", "STREPTOPHYTA");
            System.out.println(p[0]);
        } catch (ColorException | TypeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//        try {
//            p[1] = new Plant(2, "BLUE", "STREPTOPHYTA");
//            System.out.println(p[1]);
//        } catch (ColorException | TypeException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        try {
//            p[2] = new Plant(3, "WHITE", "CHLOROPHYTA");
//            System.out.println(p[2]);
//        } catch (ColorException | TypeException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        try {
//            p[3] = new Plant(4, "RED", "STREPTOPHYTA");
//            System.out.println(p[3]);
//        } catch (ColorException | TypeException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        try {
//            p[4] = new Plant(5, "BLACK", "STREPTOPHYTA");
//            System.out.println(p[4]);
//        } catch (ColorException | TypeException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
        List<Plant> l = new ArrayList<>();
        creatingP(l, 1, "RED", "STREPTOPHYTA");
        creatingP(l, 2, "BLUE", "STREPTOPHYTA");
        creatingP(l, 3, "WHITE", "CHLOROPHYTA");
        creatingP(l, 4, "RED", "STREPTOPHYTA");
        creatingP(l, 5, "BLACK", "STREPTOPHYTA");
        for (Plant f : l) {
            System.out.println(f);

        }

    }

    private Color colorFromEnum(String color) throws ColorException {
        switch (color.toUpperCase()) {
            case "WHITE":
                return Color.WHITE;
            case "RED":
                return Color.RED;
            case "BLUE":
                return Color.BLUE;
            default:
                throw new ColorException("Please choose only color - red,blue,white.");
        }
    }

    private Type typeFromEnum(String type) throws TypeException {
        switch (type.toUpperCase()) {
            case "CHLOROPHYTA":
                return Type.CHLOROPHYTA;
            case "STREPTOPHYTA":
                return Type.STREPTOPHYTA;

            default:
                throw new TypeException("There is only two types of plant: STREPTOPHYTA,CHLOROPHYTA ");
        }
    }


    public static void creatingP(List<Plant> l, int size, String color, String type) throws ColorException, TypeException {


        try {
            l.add(new Plant(size, color, type));

        } catch (ColorException | TypeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}

