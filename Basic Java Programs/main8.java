
import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // To find out whether the given String is Palindrome or not.
        System.out.println("Enter a word to check is Palindrome or not: ");
        String input = sc.nextLine();

        // Convert the input string to lowercase for case-insensitive comparison
        String original = input.toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

        // Check if the original string is equal to the reversed string
        if (original.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Close the scanner
        sc.close();

    }
}
