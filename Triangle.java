class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String str) {
        super(str);
    }
}

public class Triangle {

    static void validateTriangle(int a, int b, int c) throws IllegalTriangleException {

        if (a >= b + c)
            throw new IllegalTriangleException("Invalid Triangle.");
        else if (b >= a + c)
            throw new IllegalTriangleException("Invalid Triangle.");
        else if (c >= b + a)
            throw new IllegalTriangleException("Invalid Triangle.");
        else {
            System.out.println("Valid");
        }
    }

    public static void main(String[] args) {
        try {
            // calling the method
            validateTriangle(2, 2, 5);

        } catch (IllegalTriangleException ex) {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }

    }

}
