// 4. WAP to handle the user defined Exception using throw keyword.

class InvalidAgeException extends Exception {

    InvalidAgeException(String str) {
        super(str);
    }
}

public class q4 {

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String args[]) {
        try {
            validate(13);
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception");
            System.out.println(e);
        }
    }
}
// output
// Caught the exception
// InvalidAgeException: Age is not valid to vote
