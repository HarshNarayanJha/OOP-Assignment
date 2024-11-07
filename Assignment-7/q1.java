// Write a program to accept name and age of a person from the command prompt (passed as arguments when you execute the class)
// and ensure that the age entered is >=18 and < 60.
// Display proper error messages. The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
// (Hint : Create a user defined exception class for handling errors.)

class AgeException extends Exception {

    AgeException(String msg) {
        super(msg);
    }
}

class q1 {

    public static void main(String[] args) {
        String name;
        int age = 0;

        if (args.length != 2) {
            System.out.println("Exactly 2 arguments required");
            return;
        }
        name = args[0];

        try {
            age = Integer.parseInt(args[1]);
            if (age < 18 || age >= 60) {
                throw new AgeException("Age should be between 18 and 60 exclusive");
            }
        } catch (AgeException ae) {
            System.out.println(ae);
            System.exit(1);
        } catch (NumberFormatException nfe) {
            System.out.println("Pass a number for age");
        }

        System.out.println("You entered valid details");
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }
}
