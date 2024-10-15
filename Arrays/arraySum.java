
import java.util.Arrays;

public class arraySum{
    
    public static void main(String[] args) {

        // Write a program to find the sum and average of elements in an array

        int [] num = {45, 2, 4, 6, 9, 12, 78, 64};
        int sum = 0;

        for(int i = 0; i < num.length; i++){
            sum += num[i]; // shorthand operation: sum = sum + num[i];
            
        }
        
        System.out.println(" The sum of an element in array is: " + sum);

        // Find Average

        double avg = (double) sum / num.length;
        System.out.println("The average is: " + avg);

    }
        
}