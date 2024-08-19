// 2.  Write a java program to sort n elements in an array.
// Using Bubble Sort

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class q2 {

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

        for (int i = 0; i < n; i++) {
            boolean passed = false;
            for (int j = 1; j < n - i; j++) {
                if (list.get(j - 1) > list.get(j)) {
                    int k = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, k);
                    passed = true;
                }
            }

            if (!passed) {
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + ", ");
        }

        System.out.println();
    }
}
