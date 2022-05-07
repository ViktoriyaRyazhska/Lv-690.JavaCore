package JavaCore;

enum breeds{
    bulldog,retriever,huskies
}
public class Dog {

    public String name;
    public String breed;
    public int age;

    public  Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Dog pr1 = new Dog("Rex",5);
        pr1.breed = String.valueOf(breeds.bulldog);

        Dog pr2 = new Dog("Max",7);
        pr2.breed = String.valueOf(breeds.retriever);

        Dog pr3 = new Dog("Tom",2);
        pr3.breed = String.valueOf(breeds.huskies);


        if (pr1.getName() == pr2.getName()) {
            System.out.println(pr1.getName()+" - such a dog has already been created");
        }
        if (pr2.getName() == pr3.getName()) {
            System.out.println(pr2.getName()+" - such a dog has already been created");
        }
        if (pr1.getName() == pr3.getName()) {
            System.out.println(pr1.getName()+" - such a dog has already been created");
        }

        int maxAge=0;

        if (pr1.getAge() > maxAge ) {
            maxAge = pr1.getAge();
        }
        if (pr2.getAge() > maxAge ) {
            maxAge = pr2.getAge();
        }
        if (pr3.getAge() > maxAge ) {
            maxAge = pr3.getAge();
        }

        if (pr1.getAge() == maxAge ) {
            System.out.println(pr1.getName()+" is the oldest dog with age "+maxAge);
        }
        if (pr2.getAge() == maxAge ) {
            System.out.println(pr2.getName()+" is the oldest dog with age "+maxAge);
        }
        if (pr3.getAge() == maxAge ) {
            System.out.println(pr3.getName()+" is the oldest dog with age "+maxAge);
        }

    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

}
