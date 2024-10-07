import java.util.Scanner;

class q3 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Number of columns: ");
        int cols = scanner.nextInt();
        System.out.print("Depth: ");
        int depth = scanner.nextInt();

        int[][][] array = new int[rows][cols][depth];

        System.out.println("Enter the elements of the 3D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < depth; k++) {
                    System.out.print("Enter element at [" + i + "][" + j + "][" + k + "]: ");
                    array[i][j][k] = scanner.nextInt();
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
    }
}
