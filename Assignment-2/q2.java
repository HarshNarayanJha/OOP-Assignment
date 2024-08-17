// Write a program to add all the values in a given number and check if the sum is prime number or not. Ex: 1234->10, not prime

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
    }
}
