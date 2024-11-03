// 1. Write a Java program to search an element in an array.

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class q1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers to enter? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("> ");
            int k = sc.nextInt();
            list.add(k);
        }

        System.out.print("What to search? ");
        int search = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (list.get(i) == search) {
                System.out.println("Found!");
                return;
            }
        }

        System.out.println("Not found!");

        sc.close();
    }
}
