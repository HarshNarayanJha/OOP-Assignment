// 3. Write a program to print first 10 number of the following Series using Do-while Loops 0,1,1,2,3,5,8,13..

class q3 {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = a + b;

        int i = 3;

        System.out.print(a + ", " + b + ", " + c + ", ");

        do {
            a = b;
            b = c;
            c = a + b;

            System.out.print(c + ", ");

            i++;
        } while (i < 10);

        System.out.println("...");
    }
}
