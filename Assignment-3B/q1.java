// 1. Take a 2-Dimensional array(3×4) of matrix and display it. [The elements of an array will be user input] .{Display it using for loop and enhanced for loop individually}.
import java.util.Scanner;

class q1 {

    public static void main(String args[]) {
        int mat[][] = new int[3][4];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("> ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe Elements are:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nUsing enhanced for loop:");

        for (int[] row : mat) {
            for (int e : row) {
                System.out.print(e + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
/*
Sample output:
Enter Elements
> 1
> 2
> 3
> 4
> 5
> 6
> 7
> 8
> 9
> 10
> 11
> 12

The Elements are:
1 2 3 4
5 6 7 8
9 10 11 12

Using enhanced for loop:
1 2 3 4
5 6 7 8
9 10 11 12
*/
