import java.util.Scanner;

public class PrintGradeCard {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = sc.nextLine();

        System.out.println("How many subjects do you have?");
        int numSub = sc.nextInt();

        int[] marksSub = new int[numSub];
        System.out.println("Enter your marks for all subjects: ");
        
        // Loop to enter marks for each subject
        for (int i = 0; i < numSub; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marksSub[i] = sc.nextInt(); // Store the marks for the specific subject
        }

        int sumMarks = 0;
        for (int i = 0; i < marksSub.length; i++) {
            sumMarks += marksSub[i];
        }
        

        // Assuming each subject is out of 100 marks
        int totalPossibleMarks = numSub * 100; // Total marks possible
        double percentage = (double) sumMarks / totalPossibleMarks * 100;

        System.out.println("Hey," + name +" Your Total Marks of the Subjects is: " + sumMarks);
        System.out.println("Total Percentage is: " + percentage + "%");

        sc.close(); // Close the scanner
    }
}
