// 5. Write a java program to print the element of an array that has occurred the highest number of times. Example: Array-> 10,20,10,30,10,40,99 O/P: 10

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class q5 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> counts = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers to enter? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("> ");
            int k = sc.nextInt();
            list.add(k);

            if (counts.containsKey(k)) {
                counts.put(k, counts.get(k) + 1);
            } else {
                counts.put(k, 1);
            }
        }

        int max = 0;
        int mode = 0;

        for (int key : counts.keySet()) {
            if (counts.get(key) > max) {
                max = counts.get(key);
                mode = key;
            }
        }

        System.out.println("Most Frequent Element is " + mode);

        sc.close();
    }
}
