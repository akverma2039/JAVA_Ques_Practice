
import java.util.Scanner;

public class main9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number and print all the factors of that number (use loops).

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factors of " + num + " are: ");
        
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }

    }
}
