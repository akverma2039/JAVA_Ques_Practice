
import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {
        // Input currency in rupees and output in USD.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Indian Currency: ");
        int rupees = sc.nextInt();
        double usd = rupees * 0.012;
        System.out.println("USD: " + usd);

    }
}
