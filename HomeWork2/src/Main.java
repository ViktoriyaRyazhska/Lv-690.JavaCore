public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Oleksii", "Kononv");
        p1.setBirthYear(1986);
        Person p2 = new Person("Leonid", "Karplyuk");
        p2.setBirthYear(1958);
        Person p3 = new Person("Vira", "Chornii");
        p3.setBirthYear(1991);
        Person p4 = new Person("Yulia", "Tatutsko");
        p4.setBirthYear(1987);
        Person p5 = new Person("Boris", "Jonsonuk");
        p5.setBirthYear(1964);
        Person[] personArayys = {p1, p2, p3, p4, p5};

        for (int i = 0; i < personArayys.length; i++) {
             System.out.println(personArayys[i]);

        }
        p3.changeName("Stefania","Mama");
        System.out.println("p3 name " + p3);
    }
}