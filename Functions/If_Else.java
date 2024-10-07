
import java.util.Scanner;

public class If_Else{

    public static void main(String[] args) {

      voter_eligiblity();

}

    static void voter_eligiblity (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age>=18 ){
            System.out.println("You are eligible to vote");
        } 
        else{
            System.out.println("You are not eligible for voting");
        }
        
    }

}