public class Dog {
     private String name ;
     private Breed breed;
     private int age;

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Breed getBreed() {
          return breed;
     }

     public void setBreed(Breed breed) {
          this.breed = breed;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     @Override
     public String toString() {
          return "Dog{" +
                  "name='" + name + '\'' +
                  ", breed=" + breed +
                  ", age=" + age +
                  '}';
     }
}
