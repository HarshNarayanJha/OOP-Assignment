// 6. Write a Java program to find minimum of 5 elements from an array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class q6 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();

        System.out.println("Enter 5 elements: ");
        for (int i = 0; i < 5; i++) {
            ls.add(sc.nextInt());
        }

        Collections.sort(ls);
        System.out.println("Minimum of 5 elements: " + ls.get(0));
    }
}
