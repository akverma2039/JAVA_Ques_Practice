
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Area Of Rectangle Program

        System.out.println("Enter length: ");
        int length =sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("Area of Rectangle is: "+ area);

    }
}
