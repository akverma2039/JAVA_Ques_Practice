
import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Area Of Isosceles Triangle

        System.out.println("Enter a base: ");
        double base = sc.nextDouble();
        System.out.println("Enter a height");
        double height = sc.nextDouble();

        double area = 0.5*(base*height);

        System.out.println("Area of Isosceles Triangle: " + area);

    }
}
