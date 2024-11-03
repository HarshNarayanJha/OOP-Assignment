// 2. Take 5 String type elements into an array list. Then (i) print the elements in the array list. (ii)add elements in the array list. (iii) Access elements in the array list (iv)Change elements in the list (v) Remove elements from the list.

import java.util.ArrayList;
import java.util.Scanner;

class q2 {

    public static void main(String args[]) {
        ArrayList<String> ls = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String Elements");
        for (int i = 0; i < 5; i++) {
            System.out.print("> ");
            ls.add(sc.nextLine());
        }

        boolean run = true;
        int op;

        outer: while (run) {
            System.out.println("\n1. Print\n2. Add\n3. Access\n4. Change\n5. Remove\n6. Exit");
            System.out.print("Option> ");
            op = sc.nextInt();

            sc.nextLine();

            switch (op) {
                case 1:
                    printList(ls);
                    break;
                case 2:
                    addElement(ls, sc);
                    break;
                case 3:
                    accessElement(ls, sc);
                    break;
                case 4:
                    changeElement(ls, sc);
                    break;
                case 5:
                    removeElement(ls, sc);
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    System.out.println("Don't see the options listed?");
                    continue outer;
            }
        }

        sc.close();
    }

    static void printList(ArrayList<String> ls) {
        System.out.println();
        for (String el : ls) {
            System.out.print(el + " ");
        }

        System.out.println();
    }

    static void addElement(ArrayList<String> ls, Scanner sc) {
        String s;
        System.out.print("What to add?> ");
        s = sc.nextLine();
        ls.add(s);
    }

    static void accessElement(ArrayList<String> ls, Scanner sc) {
        int i;
        System.out.print("Index to Access?> ");
        i = sc.nextInt();
        System.out.println(ls.get(i));
    }

    static void changeElement(ArrayList<String> ls, Scanner sc) {
        int i;
        String s;
        System.out.print("Index to Change?> ");
        i = sc.nextInt();
        sc.nextLine();
        System.out.print("Change " + ls.get(i) + " to?> ");
        s = sc.nextLine();
        ls.set(i, s);
    }

    static void removeElement(ArrayList<String> ls, Scanner sc) {
        String s;
        System.out.print("What to remove?> ");
        s = sc.nextLine();
        ls.remove(s);
    }
}
