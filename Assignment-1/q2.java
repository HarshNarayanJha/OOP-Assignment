// 2. Write a Java program to check whether a number is Automorphic number or not.

import java.util.Scanner;
import java.lang.Math;

class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sq = num * num;

        int t = num;
        int d = 0;
        while (t > 0) {
            t /= 10;
            d++;
        }

        int last = sq % (int) Math.pow(10, d);

        if (last == num) {
            System.out.println(num + " is Automorphic");
        } else {
            System.out.println(num + " is NOT Automorphic");
        }
    }
}
