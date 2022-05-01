package com.oop1;

public class Main {
    public static void main(String[] args) {
        Dog Lab = new Dog();
        Lab.setPaws(4);
        Lab.setTail(1);
        Lab.setName("Rex");
        Lab.setBreed("Lab");
        Lab.setSize("Big");
        Lab.bite();

        Dog sheppard = new Dog();
        sheppard.setPaws(4);
        sheppard.setTail(1);
        sheppard.setName("Mike");
        sheppard.setBreed("Shappard");
        sheppard.setSize("Small");
        sheppard.bite();

        Dog tacsa = new Dog();
        tacsa.setPaws(4);
        tacsa.setTail(1);
        tacsa.setName("Mike");
        tacsa.setBreed("tacsa");
        tacsa.setSize("Avarenge");
        tacsa.bite();


        System.out.println("Lab name is " + Lab.getName());
        System.out.println("Shap name is " + tacsa.getName());

    }
}
