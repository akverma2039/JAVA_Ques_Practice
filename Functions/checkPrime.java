import java.util.Scanner;

public class checkPrime {
    
    public static void main(String[] args) {
        // Define a method to find out if a number is prime or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int number = sc.nextInt();

        // Call method to check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    static boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // If no divisors, it's prime
    }


    }

