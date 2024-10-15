// 1. Write a program to find greatest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.

import java.util.Arrays;

class q1 {

    public static void main(String args[]) {
        if (args.length != 9) {
            System.out.println("Exactly 9 numbers required.");
            return;
        }

        int[][] array = new int[3][3];
        int index = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = Integer.parseInt(args[index]);
                index++;
            }
        }

        int greatest = array[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > greatest) {
                    greatest = array[i][j];
                }
            }
        }

        System.out.println("The greatest number in the matrix is: " + greatest);
    }
}
