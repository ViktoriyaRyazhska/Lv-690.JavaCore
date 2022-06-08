package com.softserve.javacore;

public enum Continent {
    ASIA("Asia"),
    AFRICA("Africa"),
    NORTH_AMERICA("North America"),
    SOUTH_AMERICA("South America"),
    ANTARCTICA("Antarctica"),
    EUROPE("Europe"),
    AUSTRALIA("Australia"),
    NA("Not available");

    private final String name;

    Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
