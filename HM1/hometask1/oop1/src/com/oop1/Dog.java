package com.oop1;

public class Dog {
    private static int DogsCount;
    private int paws = 4;
    private int tail = 1;
    private String name;
    private String breed;
    private String size;

    public Dog() {
        DogsCount++;
        System.out.println("Currect dogs count is " + DogsCount);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("Big") ||
                size.equalsIgnoreCase("Averange") ||
                size.equalsIgnoreCase("Small")) {
            this.size = size;
        } else {
            System.out.println(" one of option Big Avarene Small");
        }
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        } else
            System.out.println(" you asssing wrong number");
    }

    public int getPaws() {
        return paws;
    }


    public void setTail(int tail) {
        if (tail == 1) {
            this.tail = tail;
        } else System.out.println("you assing wrong number");
    }

    public int getTail() {
        return tail;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void bark() {
        if (size.equalsIgnoreCase("Big")) {
            System.out.println(" Wof-Wof");
        } else if (size.equalsIgnoreCase("Averange")) {
            System.out.println("RAf-RAf");
        } else if (size.equalsIgnoreCase("small")) {
            System.out.println("tiaff - tiaff");

        }

    }

    public void bite() {
        if (DogsCount > 2) {
            System.out.println("dogs are bite you");
        } else {
            bark();
        }
    }
}
