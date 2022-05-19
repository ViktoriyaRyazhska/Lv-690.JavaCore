package HW4;

public class DogMain {


    public static void main(String[] args) {

    	Dogs dog1 = new Dogs("Zhasmin" , "Chichua-Chua" , 4);
       Dogs dog2 = new Dogs("Stas" , "BullDogs", 3);
       Dogs dog3 = new Dogs("Bobik" , "KaneKorso", 6);

       if (dog1.getName() == dog2.getName()){
           System.out.println("name of dog1 = name of dog2");}
           else{
                if(dog1.getName() == dog3.getName()){
                    System.out.println("name of dog1 = name of dog3");}
                else{
                    if (dog2.getName() == dog3.getName()){
                        System.out.println("name of dog1 = name of dog3");}
                    else{
                        System.out.println("there is no two Dogss with the same name");
                        }
                    }
                }

        Dogs oldestDogs = dog1;
           if (oldestDogs.getAge() < dog2.getAge()){
               oldestDogs = dog2;
           }
           if (oldestDogs.getAge() < dog3.getAge()){
               oldestDogs = dog3;
           }

        System.out.println("name of the oldest Dogs is: " + oldestDogs.getName() + " ,breed of the oldest Dogs is:" + oldestDogs.getBreed() );
       }
    }




//
//Dog dog1 = new Dog();
//dog1.setBreed(Breed.LAB);
//dog1.setName("Mike");
//dog1.setAge(6);
//
//Dog dog2 = new Dog();
//dog2.setBreed(Breed.DOBERMAN);
//dog2.setName("Rex");
//dog2.setAge(5);
//
//Dog dog3 = new Dog();
//dog3.setBreed(Breed.SHEPPARD);
//dog3.setName("Wolfy");
//dog3.setAge(11);
//if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
//    System.out.println("Breed of eldest dog is " + Breed.LAB);
//} else if (dog2.getAge() > dog3.getAge()) {
//    System.out.println("Breed of eldest dog is " + Breed.DOBERMAN);
//
//} else {
//    System.out.println("Breed of eldest dog is " + Breed.SHEPPARD);
//}
//
//if (dog1.getName() == dog2.getName() ||
//        dog2.getName() == dog3.getName() ||
//        dog3.getName() == dog1.getName()) {
//    System.out.println(" some of dogs have same name");
//} else {
//    System.out.println("all dogs have different name");
//}
//
//
//}
//}