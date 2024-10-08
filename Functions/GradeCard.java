import java.util.Scanner;

public class GradeCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        // Array to store the marks for each subject
        int[] marks = new int[numSubjects];
        int totalMarks = 0;
        
        // Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i]; // Add each mark to total
        }
        
        // Calculate percentage
        int maxMarks = numSubjects * 100; // Assuming each subject is out of 100
        double percentage = (totalMarks * 100.0) / maxMarks;
        
        // Display total marks and percentage
        System.out.println("Total Marks: " + totalMarks + "/" + maxMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        
        // Assign grade based on percentage
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F'; // Fail
        }
        
        // Display the grade
        System.out.println("Grade: " + grade);
    }
}
