// 3. Take a 3-dimensional array and display its value.

import java.util.Scanner;

class q3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Number of columns: ");
        int cols = sc.nextInt();
        System.out.print("Depth: ");
        int depth = sc.nextInt();

        int[][][] array = new int[rows][cols][depth];

        System.out.println("Enter the elements of the 3D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < depth; k++) {
                    System.out.print("Enter element at [" + i + "][" + j + "][" + k + "]: ");
                    array[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("The 3D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < depth; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}


/*
Sample Output:
Number of rows: 2
Number of columns: 2
Depth: 2
Enter the elements of the 3D array:
Enter element at [0][0][0]: 1
Enter element at [0][0][1]: 2
Enter element at [0][1][0]: 3
Enter element at [0][1][1]: 4
Enter element at [1][0][0]: 5
Enter element at [1][0][1]: 6
Enter element at [1][1][0]: 7
Enter element at [1][1][1]: 8
The 3D array is:
1 2
3 4

5 6
7 8
*/
