
import java.util.Scanner;

public class main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ankit is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

        // August has 31 days
        int totalDays = 31;
        int evenDayCount = 0;
        
        // Loop through all days from 1 to 31
        for (int day = 1; day <= totalDays; day++) {
            // Check if the day is even
            if (day % 2 == 0) {
                evenDayCount++;
            }
        }
        
        // Output the number of even days
        System.out.println("Ankit can go out on " + evenDayCount + " days in August.");
        
    

    
}
}
