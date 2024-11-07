// 2. WAP to implement nested try statements.

public class q2 {

    public static void main(String[] args) {
        try {
            try {
                int[] arr = { 1, 2, 3 };
                System.out.println(arr[5]); // throws ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch block: Array index out of bounds");
                throw new ArithmeticException(); // throws new exception
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer catch block: Arithmetic exception");
        }
    }
}
