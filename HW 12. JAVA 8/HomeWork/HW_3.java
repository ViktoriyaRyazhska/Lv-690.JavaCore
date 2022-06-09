////3.Create method to validate date according to format"mm.dd.yy".

package HomeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HW_3 {
    public static void main(String[] args) {
        final String data = "10.10.10";
        System.out.println(dateV(data));

    }

    public static boolean dateV(final String data) {
        final SimpleDateFormat sdf = new SimpleDateFormat("mm.dd.yy");
        boolean valid = false;
        try {
            sdf.parse(data);
            sdf.setLenient(false);
            valid = true;
        } catch (ParseException e) {
            e.printStackTrace();
            valid = false;
        }
        return valid;
    }
}
