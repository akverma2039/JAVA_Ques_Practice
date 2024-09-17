import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount:");
        double principal = sc.nextDouble();
        System.out.println("Enter Time in Years:");
        double time = sc.nextDouble();
        System.out.println("Enter Rate of Interest:");
        double rate = sc.nextDouble();
        double simpleInterest = (principal * time * rate) / 100;
        // System.out.println("Simple Interest is: " + simpleInterest);

        // Format numbers with commas
                @SuppressWarnings("deprecation")
                NumberFormat formatter = NumberFormat.getInstance(new Locale("en", "IN"));

        double Total_Amount = (simpleInterest + principal);
        System.out.println("Your Simple Interest: " + formatter.format(simpleInterest) + " And Your Total Amount: " + formatter.format(Total_Amount));
    }
}
