package work3;

import java.util.Arrays;

public class DemonstratingDog {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Leva", DogsBreed.BULLDOG, 6);
		Dog dog2 = new Dog("Tusik", DogsBreed.RETRIEVER, 8);
		Dog dog3 = new Dog("Ruzik", DogsBreed.SHEPHERD, 1);
		Dog dog[]= {dog1,dog2,dog3};
        
		System.out.println("compare the names of three dogs");
		System.out.println(dog1.equals(dog2)||dog1.equals(dog3)||dog2.equals(dog3));
		System.out.println("this means that dogs are of different names");
		System.out.println("change the dog's name");
		dog1.setName("Ruzik");
		System.out.println("and compare the names");
		System.out.println(dog1.equals(dog2)||dog1.equals(dog3)||dog2.equals(dog3));
		System.out.println("now the names are the same\n");
		
		System.out.println("display the name of the oldest dog");
		dog1.oldestDog(dog);
	}
}


class Dog {
	private static int countdogs =3;
	private String name;
	private DogsBreed breed;
	private int age;
	
	public Dog(String name, DogsBreed breed, int age) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        
    }
	
    String getName() {
        return name;
    }
	DogsBreed getBreed() {
	    return breed;
	}
	int getAge() {
        return age;
    }
	
    void setName(String name) {
        this.name = name;
    }
	void setBreed(DogsBreed breed) {
	    this.breed = breed;
	}
	void setAge(int age) {
        this.age = age;
    }
	
	@Override
	public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (getClass() != obj.getClass()) return false;
	Dog other = (Dog) obj;
	if (name == other.name) return true;
	return false;
	}
	void oldestDog(Dog[] dog) {
		String[] name = new String[64];
		DogsBreed[] breed = new DogsBreed[64];
		int[] age = new int[64];
		
		for(int i =0; i<countdogs; i++) {
			name[i]=dog[i].name;
			breed[i]=dog[i].breed;
			age[i]=dog[i].age;
		}
		
		int a=0;
		int max = Arrays.stream(age).max().getAsInt();
		for(;a<countdogs;a++) {
			if(max==dog[a].age) {
			break;
			}
		}
		System.out.println("the oldest dog is " + name[a]+", with breed - "+breed[a]);
	}
}


enum DogsBreed {
	BULLDOG, RETRIEVER, SHEPHERD
}