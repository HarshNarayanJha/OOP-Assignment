// 1. Write a program to add all the values in a given number and check if the sum is prime number or not. Ex: 1234->10, not prime

import java.util.Scanner;

class q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int t = num;
        int s = 0;
        while (t > 0) {
            s += t % 10;
            t /= 10;
        }

        boolean isPrime = true;
        for (int i = 2; i < s; i++) {
            if (s % i == 0)  {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Sum is Prime!");
        } else {
            System.out.println("Sum is not Prime!");
        }

        sc.close();
    }
}
