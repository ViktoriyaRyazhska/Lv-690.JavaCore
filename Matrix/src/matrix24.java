public class matrix24 {
    public static void main(String[] args) {
        int[][] a = {
                {2, 3, 4, 5, 8},
                {3, 4, 1, -4, 0},
                {1, 5, 99, 0, 3},
                {-8, 67, 0, 4, 6},
        };

        for (int j = 0; j < a[0].length; j++) {
            int max = a[0][j];
            for (int i = 0; i < a.length; i++) {
             if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
                System.out.print(" "+max);
            }
        }
    }


