package com.softserve.javacore;

import java.util.Locale;

public class Plant {

    private PlantType type;
    private Color color;
    private int size;

    public Plant(PlantType type, Color color, int size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public Plant(String type, String color, int size) throws PlantTypeException, ColorException {
        this(parseType(type), parseColor(color), size);
    }

    public static Color parseColor(String color) throws ColorException{
        try {
            return Color.valueOf(color.toUpperCase(Locale.ROOT));
        }
        catch (IllegalArgumentException ex) {
            throw new ColorException("Valid colors are: white / red / purple / blue");
        }
    }

    public static PlantType parseType(String type) throws PlantTypeException {
        try {
            return PlantType.valueOf(type.toUpperCase(Locale.ROOT));
        }
        catch (IllegalArgumentException ex) {
            throw new PlantTypeException("Valid types are: rose / tulip / orchid");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "type=" + type +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
