package HW4;

public class Dogs {

	    private String name;
	    private String breed;
	    private int age;

	    public Dogs(String name , String breed , int age ){
	        this.name = name;
	        this.breed = breed;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getBreed() {
	        return breed;
	    }

	    public void setBreed(String breed) {
	        this.breed = breed;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	
	    enum Breed {
	        ВІВЧАРКА, АЛАБАЙ, МАЛАМУТ, БУЛЬДОГ
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