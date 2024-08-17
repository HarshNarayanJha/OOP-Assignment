// 4. Write a Java program to find the sum of the series 1-2+3-4+...

import java.util.Scanner;

class q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Compute series upto which number? ");
        int upto = sc.nextInt();

        int sum = 0;
        int sign = 1;
        int cur = 1;

        do {
            sum += cur * sign;
            sign *= -1;
            cur++;
        } while (cur <= upto);

        System.out.println("Sum is " + sum);
    }
}
