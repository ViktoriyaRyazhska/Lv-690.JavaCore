package Practice.Plants;
public class main {
    public static void main(String[] args) {

        try {
            Plants id1 = new Plants("Red", "Tree", 123);
            System.out.println(id1);
        }catch (ColorException|TypeException e){
            System.out.println(e);
        }
    }
}
