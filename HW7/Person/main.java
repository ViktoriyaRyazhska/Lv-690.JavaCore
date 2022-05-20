package HomeWork.Person;

public class main {
    public static void main(String[] args) {
        Person id1 = new Student("John", "Coltrayn", 18, 2);
        Person id2 = new Student("Aron", "Turner", 19, 3);

        Person[] idArr = {id1, id2, id1};

        for (Person pe : idArr) {
            System.out.println(pe.info());
            System.out.println(pe.activity());
        }
    }
}
