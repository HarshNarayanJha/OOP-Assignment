// 4. Write a program for sorting of elements from an array list.

import java.util.ArrayList;
import java.util.Collections;

class q4 {

    public static void main(String args[]) {
        ArrayList<Integer> ls = new ArrayList<>();

        ls.add(5);
        ls.add(2);
        ls.add(8);
        ls.add(1);
        ls.add(9);

        System.out.println("Unsorted ArrayList: " + ls);

        Collections.sort(ls);

        System.out.println("Sorted ArrayList: " + ls);
    }
}
