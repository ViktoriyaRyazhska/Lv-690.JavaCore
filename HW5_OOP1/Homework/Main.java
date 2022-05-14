package HW5_OOP1_Inheritance;

public class Main {
    public static void main(String[] args) {

        Bird[] birds= createBirds();
        printInfo(birds);

    }

    public static Bird[] createBirds(){
        Bird[]birds = new Bird[4];
        birds[0]=new Eagle("white",2);
        birds[1]=new Swallow("brown",5);
        birds[2]=new Chicken("yellow",12);
        birds[3]=new Penguin("black",1);
        return birds;
    }

    public static void printInfo(Bird[] birds){
        for (Bird b: birds) {
            b.fly();
            System.out.println(b);
        }
    }

}
