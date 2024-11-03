// 5. Write a Java program to search an element in a array list.

import java.util.ArrayList;
import java.util.Scanner;

class q5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();

        System.out.print("How many elements: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            ls.add(sc.nextInt());
        }

        System.out.print("Enter the element to search: ");
        int searchElement = sc.nextInt();

        if (ls.contains(searchElement)) {
            System.out.println("Element found at index: " + ls.indexOf(searchElement));
        } else {
            System.out.println("Element not found in the array list.");
        }

        sc.close();
    }
}
