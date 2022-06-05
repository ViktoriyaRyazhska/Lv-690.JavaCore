package com.company;

import java.util.Locale;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color  color, Type type) throws ColorException, TypeException {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public static Color convertColorToEnum(String color) throws ColorException{
        switch (color.toLowerCase()){
            case "yellow" : return Color.YELLOW;
            case "red" : return Color.RED;
            case "purple" : return Color.PURPLE;
            case "pink" : return Color.PINK;
            default : throw new ColorException("Incorrect color, try only : red, yellow, purple or pink");
        }
    }

    public static Type convertTypeToEnum(String type) throws TypeException{
        switch (type.toLowerCase()){
            case "tree" : return Type.TREE;
            case "flower" : return Type.FLOWER;
            default : throw  new TypeException("Incorrect type, try only : tree or flower");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}

