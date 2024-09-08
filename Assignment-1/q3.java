// 3. Write a Java Program to find the reverse of a number (Take user input).

import java.util.Scanner;
import java.lang.Math;

class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;

        int t = num;
        int d = 0;
        while (t > 0) {
            t /= 10;
            d++;
        }
        t = num;
        int i = d;
        while (t > 0) {
            rev += (t % 10) * Math.pow(10, i - 1);
            t /= 10;
            i--;
        }

        System.out.println(rev);
    }
}
