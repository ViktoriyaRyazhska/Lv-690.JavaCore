package com.company;

public class Main {

    public static void main(String[] args) {

       Dog d1 = new Dog("Stas" , Breed.Mastiff.name() , 12);
       Dog d2 = new Dog("Stas" , Breed.Bulldog.name(), 3);
       Dog d3 = new Dog("Bobik" , Breed.KaneKorso.name(), 6);

       if (d1.getName() == d2.getName()){
           System.out.println("name of d1 = name of d2");}
           else{
                if(d1.getName() == d3.getName()){
                    System.out.println("name of d1 = name of d3");}
                else{
                    if (d2.getName() == d3.getName()){
                        System.out.println("name of d1 = name of d3");}
                    else{
                        System.out.println("there is no two dogs with the same name");
                        }
                    }
                }

        Dog oldestDog = d1;
           if (oldestDog.getAge() < d2.getAge()){
               oldestDog = d2;
           }
           if (oldestDog.getAge() < d3.getAge()){
               oldestDog = d3;
           }

        System.out.println("name of the oldest dog is: " + oldestDog.getName() + " ,breed of the oldest dog is:" + oldestDog.getBreed() );
       }
    }

