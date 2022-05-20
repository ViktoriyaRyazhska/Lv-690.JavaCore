package HomeWork1;

public class MainAppl {
    public static void main(String[] args) {
        Person personStudent1=new Student(25,new Person.FullName("Roman","Tirell"),4);
        Person personStudent2=new Student(20,new Person.FullName("Solomia","Kupchak"),3);
        Person personStudent3=new Student(18,new Person.FullName("Oleg","Lifans"),3);
        Person personStudent4=new Student(23,new Person.FullName("Igor","Komar"),3);


        Person [] list={personStudent1,personStudent2,personStudent3,personStudent4};
        for(Person s:list){
            System.out.println(s.info());
            System.out.println(s.activity());
        }
    }
}
