//Import Random utility
import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args){

        // Creating functions
        Random random = new Random();
        Scanner input = new Scanner(System.in); //System.in reads raw data typed by user

        // Declaring int num variable
        int num;
        System.out.print("Enter your first number (origin): ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number (boundary): ");
        int num2 = input.nextInt();

        num = random.nextInt(num1,num2); // first is the origin, last is the boundary (not included)

        // Using Random
        // i++ (Post-increment): Uses the current value of i first, and then adds 1.
        // ++i (Pre-increment): Adds 1 to i first, and then uses the new value
        for(int i = 1; i <= 5; i++){
            System.out.println(num);
        }



    }
}
