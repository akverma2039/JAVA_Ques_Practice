
import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        // Take 2 numbers as input and print the largest number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("Largest number is: " + num1);
            } else {
                System.out.println("Largest number is: " + num2);
            }

    }
}
