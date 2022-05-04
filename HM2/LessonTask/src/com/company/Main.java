package com.company;

public class Main {

    public static void main(String[] args) {
	Eployee Artem = new Eployee("Artem", 12.5d ,45);
    Eployee Katia = new Eployee("Katia",11.5d);
    Eployee Ivan = new Eployee();

        System.out.println("Salary is " + Artem.getSalary());
        System.out.println(Artem.toString());
        System.out.println("bonus " + Artem.getBonus(Artem.getSalary()));

        System.out.println();

        Artem.changeRate(14);
        System.out.println(Artem.toString());
        System.out.println("new salary Artem is " + Artem.getSalary());
        System.out.println("new bonus Artem " + Artem.getBonus(Artem.getSalary()));

        System.out.println();

        System.out.println(Ivan.toString());
        Ivan.setHours(30);
        Ivan.setRate(10);
        System.out.println("new salary Ivan is " + Ivan.getSalary());
        System.out.println("new bonus Ivan " + Ivan.getBonus(Ivan.getSalary()));


        System.out.println(Eployee.totalSum);
    }
}
