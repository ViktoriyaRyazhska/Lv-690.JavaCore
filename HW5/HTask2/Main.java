package HW5.HTask2;

public class Main {
    public static void main(String[] args){
        Emloyee e1 = new Emloyee("Oleg", 28, 3000);
        Developer d1 = new Developer("Anna", 39, 5000, "Senior PHGM");
        Emloyee e2 = new Emloyee("Boris", 34, 2400);

        e1.print();
        d1.print();
        e2.print();
    }
}
