package com.javalesson.chapter1.task4;

public class OperatorsAndStatementsAnswers {
    private static int strange = 0;
    private static int normal = 0;

    public static void main(String[] args) {
        String[] numberTypes = checkStrangeNumbers();
        countNumTypes(numberTypes);

    }

    private static void countNumTypes(String[] types) {
//       Can be replaced with foreach if students know how to do that.
        for (int i = 0; i < types.length; i++) {
            switch (types[i]) {
                case "Strange":
                    strange++;
                    break;
                case "Normal":
                    normal++;
                    break;
            }
        }
    }

    private static String[] checkStrangeNumbers() {
        String[] numberTypes = new String[6];
        numberTypes[0] = checkStrangeness(3);
        numberTypes[1] = checkStrangeness(24);
        numberTypes[2] = checkStrangeness(4);
        numberTypes[3] = checkStrangeness(5);
        numberTypes[4] = checkStrangeness(29);
        numberTypes[5] = checkStrangeness(100);

        return numberTypes;
    }

    private static String checkStrangeness(int num) {
        if (num % 2 != 0 || (num % 2 == 0 && (6 <= num && num <= 20))) {
            return "Strange";
        } else if (((num % 2 == 0 && (2 <= num && num <= 5)) || (num % 2 == 0 && num > 20))) {
            return "Normal";
        } else {
            return "Undefined";
        }
    }

    public static int getStrange() {
        return strange;
    }

    public static int getNormal() {
        return normal;
    }

}


