import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of terms in the Fibonacci series
        System.out.println("Enter the number of terms you want in the Fibonacci series:");
        int n = sc.nextInt();
        
        // Initialize the first two terms
        int a = 0, b = 1;

        // Print the series
        System.out.print("Fibonacci Series up to " + n + " numbers: ");
        
        // Handle the case when n is 0 or 1
        if (n <= 0) {
            System.out.println("No terms to display.");
        } else if (n == 1) {
            System.out.println(a);
        } else {
            // Print the first two numbers
            System.out.print(a + " " + b + " ");
            
            // Loop to generate and print the rest of the series
            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(next + " ");
                a = b;
                b = next;
            }
            System.out.println();
        }
    }
}
