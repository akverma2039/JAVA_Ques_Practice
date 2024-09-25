
import java.util.Scanner;

public class EvenOrOdd {

    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check Even or odd");
        int num =sc.nextInt();


        // Define a program to find out whether a given number is even or odd.
        // Calling methods
        printEvenOrOdd(num);
    }
    public static void printEvenOrOdd(int num){

        if (num%2==0){
            System.out.println(num + " is Even");
        }else{
            System.out.println(num + " is Odd");
        }


    }
    
}
