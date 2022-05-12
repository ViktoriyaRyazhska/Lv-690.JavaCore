package JavaCore;

public class ArraysLoops {

    public static void main(String[] args) {

    int[] arr = {25,99,15,-4,-5,6,7,-8,87,546};

        biggestNum(arr);
        sum(arr);
        amount(arr);
    }
    public static void biggestNum(int[] arr){

        int max = arr[0];
        for (int i=0;i < arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("max = "+max);
    }
    public static void sum(int[] arr){

        int sum = 0;
        for (int i=0;i < arr.length; i++){
            if (arr[i]>0){
                sum += arr[i];
            }
        }

        System.out.println("sum positive = "+sum);
    }
    public static void amount(int[] arr){

        int amount = 0;
        for (int i=0;i < arr.length; i++){
            if (arr[i]<0){
                amount ++;
            }
        }
        System.out.println("amount negative numbers "+amount);
        System.out.println("amount positive numbers "+(arr.length-amount));
    }

}

