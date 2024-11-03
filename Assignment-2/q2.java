// 2. Take input from user a character variable in a program and if the value is alphabet then print "Alphabet" if it’s a number then print "Digit" and for other characters print "Special Character".

import java.util.Scanner;

class q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        int ci = (int) c;

        if ((ci >= 65 && ci <= 90) || (ci >= 97) && (ci <= 122)) {
            System.out.println("Alphabet");
        } else if (ci >= 48 && ci <= 57) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }

        sc.close();
    }
}
