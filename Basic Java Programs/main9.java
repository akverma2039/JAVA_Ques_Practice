import java.util.Scanner;

public class main9 {

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int digits = 0;

        // Calculate the number of digits in the number
        while (originalNumber != 0) {
            digits++;
            originalNumber /= 10;
        }

        originalNumber = number;

        // Calculate the sum of the digits raised to the power of the number of digits
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        // Check if the sum is equal to the original number
        return result == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the lower bound of the range: ");
        int lower = scanner.nextInt();
        
        System.out.print("Enter the upper bound of the range: ");
        int upper = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");

        // Find and print Armstrong numbers in the given range
        for (int i = lower; i <= upper; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
