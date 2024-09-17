import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fibonacci Series In Java Programs
         // Taking input for how many terms to generate
         System.out.print("Enter the number of terms: ");
         int terms = sc.nextInt();
 
         // Variables to store the previous two numbers
         int num1 = 0, num2 = 1;
 
         System.out.print("Fibonacci Series: " + num1 + ", " + num2);
 
         // Loop to generate the Fibonacci series
         for (int i = 2; i < terms; i++) {
             int nextTerm = num1 + num2;
             System.out.print(", " + nextTerm);
 
             // Update the previous two numbers
             num1 = num2;
             num2 = nextTerm;
         }

    }
}
