package PracticalAllTask;//Create an array of ten integers. Display
//        the biggest of these numbers;
//        the sum of positive numbers in the array;
//        the amount of negative numbers in the array.
//                What values there are more: negative or positive?


public class AllPracticalTask {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, -4, 5, 9, 10, 11, 3, -2};
        biggestNumber(numbers);
        biggerNumber(numbers);
        sumOfPositiveNumbers(numbers);
        sumOfNegativeNumbers(numbers);
        whatValues(numbers);

    }

    public static int biggestNumber(int[] number) {
        int[] nums = number;
        int max = nums[0];
        int imax = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] > max) {
                max = nums[i];
                imax = i;
            }
            i++;
        }
        System.out.println("Biggest number -" + max + " Position - " + imax);
        return max;
    }

    public static int biggerNumber(int[] number) {
        int[] nums = number;
        int max = nums[0];
        int positionMaxNumber = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > max) {
                max = nums[i];
                positionMaxNumber = i;
            }
        }
        System.out.println("Bigger number - " + max + "   Position - " + positionMaxNumber);
        return max;
    }

    public static int sumOfPositiveNumbers(int[] numbers) {
        int[] nums = numbers;
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                sum1 += nums[i];
            }
        }
        System.out.println("Sum of positive numbers - " + sum1);
        return sum1;
    }

    public static int sumOfNegativeNumbers(int[] numbers) {
        int[] nums = numbers;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                sum2 += nums[i];
            }
        }
        System.out.println("Sum of negative numbers - " + sum2);
        return sum2;
    }

    public static void whatValues(int[] numbers) {
        int[] nums = numbers;
        if (sumOfPositiveNumbers(nums) > sumOfNegativeNumbers(nums)) {
            System.out.println("Positive values are more");
        } else {
            System.out.println("Negative values are more");
        }
    }
}

