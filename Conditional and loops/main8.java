
import java.util.Scanner;

public class main8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Subtract the Product and Sum of Digits of an Integer
        /*
         Given an integer number n, return the difference between the product of its digits and the sum of its digits.

         Example 1:

            Input: n = 234
            Output: 15 
            Explanation: 
            Product of digits = 2 * 3 * 4 = 24 
            Sum of digits = 2 + 3 + 4 = 9 
            Result = 24 - 9 = 15
         */
        
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        
        int product = 1;
        int sum = 0;
        int temp =num;
        
        while(temp>0){
            int digit = temp%10;
            product = product*digit;
            sum = sum + digit;
            temp /= 10;

        }
        int difference = product-sum;

        System.out.println("Difference between product and sum of digits is: " + difference);




    }
}
