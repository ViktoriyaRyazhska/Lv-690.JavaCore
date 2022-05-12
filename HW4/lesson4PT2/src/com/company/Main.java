package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department number: ");
        Employee tmp;
        int k = sc.nextInt();

        List<Employee> list = new ArrayList();
        list.add(new Employee("Artem" , 1 , 12000));
        list.add(new Employee("Artur" , 2 , 12400));
        list.add(new Employee("Vasia" , 3 , 14100));
        list.add(new Employee("Galia" , 4 , 17350));
        list.add(new Employee("Rostuk" , 1 , 12000));

        System.out.println("employees of a certain department:");
        for (Employee d : list) {
            if (k == d.getDn()) {
                System.out.println(d.getName());
            }
        }

        System.out.println();

        for (int i = 0; i < list.size()-1; i++){
            for (int j = i + 1; j < list.size(); j++){
                if ( list.get(i).getSalary() < list.get(j).getSalary() ){
                  tmp = list.get(i);
                  list.set(i,list.get(j));
                  list.set(j,tmp);

                }
            }
        }

        System.out.println("Arrange workers by the field salary in descending order:");
        for (Employee i : list){
            System.out.println(i.getName());
        }

        }
    }

