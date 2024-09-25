import java.util.Scanner;

public class MaxMinNumbers {
    // Method to print the maximum number
    public static void printMax(int num1, int num2, int num3) {
        int max = num1;  // Assume num1 is the maximum
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Maximum number: " + max);
    }

    // Method to print the minimum number
    public static void printMin(int num1, int num2, int num3) {
        int min = num1;  // Assume num1 is the minimum
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("Minimum number: " + min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 3 numbers from the user
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Calling the methods
        printMax(num1, num2, num3);
        printMin(num1, num2, num3);
    }
}
