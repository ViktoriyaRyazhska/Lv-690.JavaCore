package com.company;




public class Eployee {
    static double totalSum = 0;
    private String name;
    private double rate;
    private int hours;
    private double salary = 0;


    public  Eployee(String name, double rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Eployee(String name, double rate){
        this.name = name;
        this.rate = rate;
    }

    public  Eployee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double  getSalary(){
        totalSum -= salary;
        salary = this.rate * this.hours;
        totalSum += salary;
        return
            salary;

    }



    @Override
    public String toString() {
        return ("name = " + name  + ", rate = " + rate + ", hours = " + hours);
    }

    public void changeRate(double rate){
        this.rate = rate;
    }

    public double getBonus(double getSalary){
        return this.getSalary() * 0.1d;

    }
}
