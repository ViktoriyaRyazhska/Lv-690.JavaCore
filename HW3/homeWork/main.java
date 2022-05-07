package homeWork;

public class main {
    public static void main(String[] args) {

        float num1 = 23.34f;
        float num2 = 2.23f;
        float num3 = -1.45f;

        int nextInt1 = 234;
        int nextInt2 = 9;
        int nextInt3 = 567;

        int errorNum = 400;


        RangeNum(num1, num2, num3);
        System.out.println("----------");
        MaxInt(nextInt1, nextInt2, nextInt3);
        System.out.println("----------");
        RangeNumArray(num1, num2, num3);
        System.out.println("----------");
        MaxIntArray(nextInt1, nextInt2, nextInt3);
        System.out.println("----------");
        httpError(errorNum);

    }

    public static void RangeNum(float num1, float num2, float num3) {
        if (num1 >= -5 & num1 <= 5) {
            System.out.println(num1 + " in range[-5,5]");
        } else if (num1 < -5 || num1 > 5) {
            System.out.println(num1 + " out of range[-5,5]");
        }

        if (num2 >= -5 & num2 <= 5) {
            System.out.println(num2 + " in range[-5,5]");
        } else if (num2 < -5 || num2 > 5) {
            System.out.println(num2 + " out of range[-5,5]");
        }

        if (num3 >= -5 & num3 <= 5) {
            System.out.println(num3 + " in range[-5,5]");
        } else if (num3 < -5 || num3 > 5) {
            System.out.println(num2 + " out of range[-5,5]");
        }

    }

    public static void MaxInt(int num1, int num2, int num3) {
        int result1 = 0;
        int result2 = 0;

        if (num1 > num2 && num1 > num3) {
            result1 = num1;
        }
        if (num2 > num1 && num2 > num3) {
            result1 = num2;
        }
        if (num3 > num1 && num3 > num2) {
            result1 = num3;
        }
        System.out.println("----------");
        System.out.println("Biggest number is " + result1);
        System.out.println("----------");

        if (num1 < num2 && num1 < num3) {
            result2 = num1;
        }
        if (num2 < num1 && num2 < num3) {
            result2 = num2;
        }
        if (num3 < num1 && num3 < num2) {
            result2 = num3;
        }
        System.out.println("Smallest number is " + result2);


    }

    public static void RangeNumArray(float num1, float num2, float num3) {
        float numArray[] = new float[3];

        numArray[0] = num1;
        numArray[1] = num2;
        numArray[2] = num3;

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] >= -5 & numArray[i] <= 5) {
                System.out.println(numArray[i] + " in range[-5,5]");
            }
        }
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] < -5 || numArray[i] > 5) {
                System.out.println(numArray[i] + " out of range[-5,5]");
            }
        }
    }

    public static void MaxIntArray(int num1, int num2, int num3) {
        int numArray[] = new int[3];

        numArray[0] = num1;
        numArray[1] = num2;
        numArray[2] = num3;

        int result1 = 0;
        int result2 = num1;

        for (int i = 0; i < numArray.length; i++) {
            if (result1 < numArray[i]) {
                result1 = numArray[i];
            }
        }
        System.out.println("Biggest number is " + result1);

        for (int i = 0; i < numArray.length; i++) {
            if (result2 > numArray[i]) {
                result2 = numArray[i];
            }
        }
        System.out.println("Smallest number is " + result2);

    }

    public static void httpError(int num) {
        HTTPError er = null;

        switch (num) {
            case (400):
                er = HTTPError.BAD_REQUEST;
                break;
            case (401):
                er = HTTPError.UNAUTHORIZED;
                break;
            case (402):
                er = HTTPError.PAYMENT_REQUIRED;
                break;
            case (403):
                er = HTTPError.FORBIDDEN;
                break;
            case (404):
                er = HTTPError.NOT_FOUND;
                break;
            default:
                System.out.println("Wrong input");

        }
        System.out.println(er);

    }

    public enum HTTPError {
        BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND;

    }

}
