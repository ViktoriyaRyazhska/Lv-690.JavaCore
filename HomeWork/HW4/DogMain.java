//Сreate class Dog with fields name, breed, age. 
//Declare enum for field breed. 
//Create 3 instances of type Dog. 
//Check if there is no two dogs with the same name. 
//Display the name and the kind of the oldest dog. 

package HW4;

public class DogMain {


    public static void main(String[] args) {

    	Dogs dog1 = new Dogs("Zhasmin" , "Chichua-Chua" , 4);
       Dogs dog2 = new Dogs("Stas" , "BullDogs", 3);
       Dogs dog3 = new Dogs("Bobik" , "Unwkown", 6);

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

