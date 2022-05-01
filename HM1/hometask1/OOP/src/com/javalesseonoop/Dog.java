package com.javalesseonoop;

public class Dog {
    private int paws;
    private int tail;
    private String name;
    private String breed;
    private String size;

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        if (size.equalsIgnoreCase("Big") ||
                size.equalsIgnoreCase("Avarege") ||
                size.equalsIgnoreCase("small")) {
            this.size = size;
        } else {
            System.out.println("Size should be one of these: Big, Avarange or Small");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = 4;
        } else {
            System.out.println("User tried to assing " + paws + "paws");
            System.out.println("Coorrect numbe is 4");
        }

    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        if (tail == 1) {
            this.tail = 1;
        } else {
            System.out.println("User tried to assing " + paws + "tails");
            System.out.println("Coorrect numbe is 4");
        }
    }

    public void bark() {
        if ( size.equalsIgnoreCase("Big")) {
            System.out.println("wof-wof");
        } else if (size.equalsIgnoreCase("Avarege")) {
            System.out.println("rof-rof");}
         else {
            System.out.println("tiaf-tiaf");
        }
    }

}
