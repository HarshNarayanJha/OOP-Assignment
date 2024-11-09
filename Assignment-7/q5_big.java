// 5.  Illustrate the use of Thread class and create 3 threads A, B, C for undertaking three different tasks.

class Task1 extends Thread {

    public void run() {
        System.out.println("Calculating fibonacci sequence...");
        int n = 10;
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println("\nFibonacci calculation complete!");
    }
}

class Task2 extends Thread {

    public void run() {
        System.out.println("Checking for prime numbers between 1 and 50:");
        for (int i = 1; i <= 50; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
        }
        System.out.println("\nPrime number check complete!");
    }
}

class Task3 extends Thread {

    public void run() {
        System.out.println("Starting file processing simulation...");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Processing file " + (i + 1) + " of 5...");
                Thread.sleep(1000);
            }
            System.out.println("File processing complete!");
        } catch (InterruptedException ie) {
            System.out.println("File processing interrupted!");
        }
    }
}

public class q5_big {

    public static void main(String[] args) {
        Thread task1 = new Task1();
        task1.start();

        Thread task2 = new Task2();
        task2.start();

        Thread task3 = new Task3();
        task3.start();
    }
}
// Sample Output:
/*
Calculating fibonacci sequence...
Checking for prime numbers between 1 and 50:
Starting file processing simulation...
0 1 1 2 3 5 8 13 21 34
Processing file 1 of 5...
1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
Processing file 2 of 5...
Fibonacci calculation complete!
Processing file 3 of 5...
Prime number check complete!
Processing file 4 of 5...
Processing file 5 of 5...
File processing complete!
*/
