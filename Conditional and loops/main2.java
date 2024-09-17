
import java.util.Scanner;

public class main2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Area Of Triangle
        System.out.println("Enter base: ");
        double base = sc.nextDouble();

        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        double area = 0.5 * (base*height);

        System.out.println("Area of Triangle: " + area);


    }
}
