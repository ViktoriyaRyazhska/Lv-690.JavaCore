package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    int k = 0;
    double sum = 0;
    double avrSal;
    List<Employee> list = new ArrayList<Employee>();

    list.add(new ContractEmployee("12345" , "Ivan" , "11" , 17500));
    list.add(new ContractEmployee("23456" , "Katia" , "22" ,  15300));
    list.add(new ContractEmployee("34567" , "Vasia" , "33" ,20250));
    list.add(new SalariedEmployee("45678" , "Kolia" , "1" ,280));
    list.add(new SalariedEmployee("56789" ,"Artem" , "2", 275));
    list.add(new SalariedEmployee("67890" ,"Rostuk" , "3" ,250));

    list.sort(new ComparatorSalaty());

    for (Employee i : list){
       i.getInformation();
        System.out.println(", salary is: " + i.calculatePay() + " \u20B4" );
         }

    for (Employee i : list){
        sum += i.calculatePay();
        k++;
    }
        System.out.println();
        avrSal = sum/k;
        System.out.println("Average monthly wage of all employee: " + Math.round(avrSal) + " \u20B4");
    }


}
