package Practice.animal;

public class main {
    public static void main(String[] args) {
        animal[] anim = {new cat("Jimmy"),
                new dog("Jack"),
                new cat("Tobi"),
                new dog("Mandy")};

        for (animal an : anim) {
            System.out.println(an.feed() + " " + an.voice());

        }
    }
}
