
import java.util.Scanner;

public class main1{
    public static void main(String[] args) {
// 1. Write a program to print whether a number is even or odd, also take input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for checking even or odd: ");
        long num = sc.nextLong();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        }
        else {
            System.out.println(num + " is odd.");

    }
}
}