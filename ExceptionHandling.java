class InvalidAgeException extends Exception {

    public InvalidAgeException(String str) {
        super(str);
    }
}

public class ExceptionHandling {

    static void validate(int age) throws InvalidAgeException {
        if (age < 20 || age > 70) {

            // throw an object of user defined exception
            throw new InvalidAgeException("Invalid");
        } else {
            System.out.println("Valid");
        }
    }

    public static void main(String[] args) {
        try {
            // calling the method
            validate(13);
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }

    }
}
