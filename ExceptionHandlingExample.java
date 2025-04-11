// Custom Exception Class
class validAgeException extends Exception {
    public validAgeException(String message) {
        super(message); // Pass the message to the Exception class
    }
}

public class ExceptionHandlingExample {
    // Method that uses throws to declare a potential exception
    static void checkAge(int age) throws validAgeException {
        if (age < 18) {
            // Throw an exception if the age is less than 18
            throw new validAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            // Call the method with an invalid age
            checkAge(19);
        } catch (validAgeException e) {
            // Handle the custom exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Code in finally block always executes
            System.out.println("Finally block executed.");
        }

       
    }
}
