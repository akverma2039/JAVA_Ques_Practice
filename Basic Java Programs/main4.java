
import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Operator (+, -, *, /): ");
        String op = sc.next();
        
        // Use if conditions to determine which operator to use
        if (op.equals("+")){
            System.out.println("Result: " + (num1 + num2));
        }
        else if(op.equals("-")){
            System.out.println("Result: " + (num1 - num2));
        }
        else if(op.equals("*")){
            System.out.println("Result: " + (num1 * num2));
        }
        else if(op.equals("+")){
            if(num2 != 0){
                System.out.println("Result: " + (num1 / num2));
        }
        else{
            System.out.println("Error: Invalid Operator");

            }

        } 
    }
}

