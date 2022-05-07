package Dog;

public class dog {

    private String name;
    private int age;
    breed breedEn;

    public static dog resultDog;

    public dog(String name, int age, breed br) {
        this.name = name;
        this.age = age;
        this.breedEn = br;
    }

    public static void NameChecker(dog dog1, dog dog2, dog dog3) {
        if (dog1.name == dog2.name || dog1.name == dog3.name || dog2.name == dog3.name) {
            System.out.println("You nave a similar dog");
        } else {
            System.out.println("All dog are different");
        }
    }

    public static void OldestDog(dog dog1, dog dog2, dog dog3) {

        dog d[] = new dog[3];
        d[0] = dog1;
        d[1] = dog2;
        d[2] = dog3;
        dog result = new dog("", 0, breed.BULLDOG);

        for (int i = 0; i < d.length; i++) {
            if (result.age < d[i].age) {
                result = d[i];
                resultDog = result;
            }
        }
        System.out.println(resultDog);
    }

    public breed getBreedEn() {
        return this.breedEn;
    }

    @Override
    public String toString() {
        return "The oldest dog is " + name + " hes Dog.breed is " + getBreedEn();
    }

}
