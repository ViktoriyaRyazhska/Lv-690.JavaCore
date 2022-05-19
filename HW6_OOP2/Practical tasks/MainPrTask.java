package HW6_OOP2;

public class MainPrTask {
    public static void main(String[] args) {
        printText("Practical task 1");
        Animal[] animals = createAnimals();
        infoAboutAnimals(animals);

        printText("Practical task 2");
        Person[] people = createPeople();
        infoAboutPeople(people);

    }
    public static void printText(String text){
        System.out.println(text);
    }
    public static Animal[] createAnimals(){

        Animal[] animals = new Animal[2];
        animals[0] = new Cat("Lola");
        animals[1] = new Dog("Pluto");
        return animals;
    }
    public static void infoAboutAnimals(Animal[] animals){

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }

    public static Person[] createPeople(){

        Person[] people = new Person[6];
        people[0] = new Student("Bill");
        people[1] = new Teacher("Kate",15160.98);
        people[2] = new Cleaner("Tony",11200.50);
        people[3] = new Student("Tom");
        people[4] = new Teacher("William",22090.74);
        people[5] = new Cleaner("Elise",13786.95);

        return people;
    }

    public static void infoAboutPeople(Person[] people){

        for (Person empl : people) {
            empl.print();
            if (empl instanceof Staff) {
                ((Staff) empl).salary();
            }
        }
    }
}
