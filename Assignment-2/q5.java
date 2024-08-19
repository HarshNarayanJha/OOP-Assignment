// 5. Write a java program to print the following pattern
//
// 1
// 2 3
// 4 5 6

class q5 {

    public static void main(String[] args) {
        int n = 3;

        int t = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++, t++) {
                System.out.print(t + " ");
            }

            System.out.println();
        }
    }
}
