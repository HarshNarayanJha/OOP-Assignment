// 5. WAP to multiply 2 matrices.

import java.util.Scanner;

public class q5 {

    static void multiply(int[][] A, int[][] B, int[][] P, int r1, int c2, int c1r2) {
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                P[i][j] = 0;
                for (int k = 0; k < c1r2; k++) {
                    P[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns in first matrix/rows in second matrix: ");
        int c1r2 = sc.nextInt();
        System.out.print("Enter number of columns in second matrix: ");
        int c2 = sc.nextInt();

        int[][] matrix1 = new int[r1][c1r2];
        int[][] matrix2 = new int[c1r2][c2];
        int[][] product = new int[r1][c2];

        System.out.println("Enter first matrix elements:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1r2; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix elements:");
        for (int i = 0; i < c1r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nFirst Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1r2; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSecond Matrix:");
        for (int i = 0; i < c1r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        multiply(matrix1, matrix2, product, r1, c2, c1r2);

        System.out.println("\nProduct Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
/*
Enter number of rows in first matrix: 2
Enter number of columns in first matrix/rows in second matrix: 3
Enter number of columns in second matrix: 2
Enter first matrix elements:
1
2
3
4
5
6
Enter second matrix elements:
7
8
9
10
11
12

First Matrix:
1 2 3
4 5 6

Second Matrix:
7 8
9 10
11 12

Product Matrix:
58 64
139 154
*/
