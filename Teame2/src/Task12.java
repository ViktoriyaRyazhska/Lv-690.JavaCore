package HW1;

public class Task12 {
    public static void executeTask12() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0) {
                sum += i;
            } else {
                if (i % 5 == 0) {
                    sum += i;
                } else {
                    sum += 0;
                }
            }
        }
        System.out.println(sum);
    }
}
