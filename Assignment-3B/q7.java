// 7. Write a Java Program to print the transpose of a matrix.

import java.util.Scanner;

class q7 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of the Matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
/* Sample Output:
Rows: 3
Columns: 3
Enter the elements of the matrix:
1 2 3
4 5 6
7 8 9
Original Matrix:
1 2 3
4 5 6
7 8 9
Transpose of the Matrix:
1 4 7
2 5 8
3 6 9
*/
