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

        sc.close();
    }
}
