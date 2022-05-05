package HW1;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("Write Radius of circle: " );
        double r = Double.parseDouble(br.readLine());
        double s =  Math.PI * Math.pow(r,2) ;
        double p = 2 * Math.PI * Math.pow(r,2);
        System.out.println("S: " + s);
        System.out.println("R: " + p);




    }
}
