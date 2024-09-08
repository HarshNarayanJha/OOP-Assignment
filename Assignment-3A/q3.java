// 3. Write a java program to find the sum of diagonal elements of a matrix.

class q3 {
    public static void main(String[] args)  {
        int N = 3;
        int[][] matrix = {
            {2, 1, 4},
            {2, 5, 6},
            {9, 0, 7},
        };

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Matrix is: ");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + ", ");
            }

            System.out.println();
        }

        System.out.println("\nSum of Diagonal Elements is: " + sum);
    }
}
