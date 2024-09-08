// 4. Write a java program whether a given string is palindrome or not.

import java.util.Scanner;

class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("Not a Palindrome!");
                return;
            }
        }

        System.out.println("Palindrome");
    }
}
