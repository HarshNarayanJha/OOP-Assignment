// 1. Write a program to find greatest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.

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

/*
Sample output 1:
$ java q1 1 2 3 4 5 6 7 8 9
The greatest number in the matrix is: 9

Sample output 2:
$ java q1 10 20 30 40 50 60 70 80 90
The greatest number in the matrix is: 90

Sample output 3:
$ java q1 1 2 3
Exactly 9 numbers required.
*/