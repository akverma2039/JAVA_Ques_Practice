import java.util.Scanner;

public class FactorialExample {

    // Method to calculate factorial
    public static int Factorial(int n) {
        int fact = 1;
        // Loop to calculate factorial
        for (int i = 1; i <= n; i++) {
            fact *= i; // Multiply fact by the current number
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for user input
        System.out.print("Enter a non-negative integer to find its factorial: ");
        int number = scanner.nextInt();

        // Check if the input is negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calling the Factorial method and displaying the result
            int result = Factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }
    }
}
