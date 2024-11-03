// 2. WAP to handle the Exception using try and multiple catch blocks

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = sc.nextLine();
        int n;

        try {
            n = Integer.parseInt(num);
            System.out.println("Two times what you entered is " + n * 2);
            int z = 5 / n;
            System.out.println("5 / " + n + " is " + z);
        } catch (NumberFormatException nfe) {
            System.out.println("You didn't enter a number, you promised");
        } catch (ArithmeticException ae) {
            System.out.println("The number was zero, not acceptable");
        } finally {
            System.out.println("So whatever you entered, this will print anyways");
        }

        sc.close();
    }
}
// Sample output:
// Enter a number
// 15
// Two times what you entered is 30
// 5 / 15 is 0
// So whatever you entered, this will print anyways
//
// Enter a number
// abc
// You didn't enter a number, you promised
// So whatever you entered, this will print anyways
//
// Enter a number  
// 0
// Two times what you entered is 0
// The number was zero, not acceptable
// So whatever you entered, this will print anyways
