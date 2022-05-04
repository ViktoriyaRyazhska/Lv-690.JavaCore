package com.company;



public class Main {

    public static void main(String[] args) {
	Person Artem = new Person ("Lysiak", "Artem", 1999);
    Person Roman = new Person ("Pasichnik", "Roman", 1999);
    Person Yulia = new Person ();
    Person Katia = new Person ("Pereyma", "Katia");
    Person Rostuk = new Person ();

        Yulia.setFirstName("Yulia");
        Yulia.setLastName("Farina");

        System.out.println("Artem have " + Artem.getAge() + " years old");
        System.out.println("Roman have " + Roman.getAge() + " years old");
        Yulia.output();
        Katia.output();

        Rostuk.input();
        System.out.println("Rostuk have " + Rostuk.getAge() + " years old");


        Artem.changeName("Pokotulo" , "Artur");
        Artem.output();

    }


    }

