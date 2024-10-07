//  Write a program in Java to generate hexadecimal equivalent of a number without using array.

import java.util.HashMap;
import java.util.Scanner;

class q5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        HashMap<Integer, Character> map = new HashMap<>();
        map.put(10, 'A');
        map.put(11, 'B');
        map.put(12, 'C');
        map.put(13, 'D');
        map.put(14, 'E');
        map.put(15, 'F');

        int a = num;

        StringBuilder hex = new StringBuilder(12);

        while (a > 0) {
            int r = a % 16;

            if (r < 10) {
                hex.insert(0, r);
            } else {
                hex.insert(0, map.get(r));
            }

            a /= 16;
        }

        System.out.println(hex.toString());
    }
}
