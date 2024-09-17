import java.util.Scanner;

public class main1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Area Of Circle Java Program
        System.out.println("Enter a radius: ");  /* Taking input from user */

        double radius = sc.nextDouble();

        double pi = Math.PI;

        double area = pi * (radius*radius);

        System.out.println(area);
        

   }
}