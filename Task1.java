public class Task1 {
//1.	Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)
    public static int execute(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return execute(n - 1) + execute(n - 2);
        }
    }
}
