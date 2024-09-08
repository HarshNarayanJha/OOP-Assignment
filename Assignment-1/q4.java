// 4. WAJP to compute and display the count of occurrence of 4 in a number. E.g. 4564 will compute 2

import java.util.Scanner;
import java.lang.Math;

class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int t = num;
        int c = 0;
        while (t > 0) {
            int d = t % 10;
            if (d == 4) {
                c++;
            }
            t /= 10;
        }

        System.out.println("4 appears " + c + " times");
    }
}
