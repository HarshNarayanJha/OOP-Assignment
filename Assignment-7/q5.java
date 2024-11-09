// 5.  Illustrate the use of Thread class and create 3 threads A, B, C for undertaking three different tasks.

class A extends Thread {

    public void run() {
        System.out.println("Counting: " + (1 + 2 + 3));
    }
}

class B extends Thread {

    public void run() {
        System.out.println("Hello from Thread 2!");
    }
}

class C extends Thread {

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Woke up!");
        } catch (InterruptedException ie) {}
    }
}

public class q5 {

    public static void main(String[] args) {
        Thread task1 = new A();
        task1.start();

        Thread task2 = new B();
        task2.start();

        Thread task3 = new C();
        task3.start();
    }
}
/* SAMPLE OUTPUT:
    Counting: 6
    Hello from Thread 2!
    Woke up!
*/
