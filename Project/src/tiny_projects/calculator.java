package tiny_projects;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        // Variables
        double num1;
        double num2;
        char operator;
        double result = 0; // Initialize result to 0 to avoid compilation error if no case matches
        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter your first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter your operator (+, -, *, /, ^): ");
        operator = input.next().charAt(0); // Ensures we get CHAR instead of String

        System.out.print("Enter your second number: ");
        num2 = input.nextDouble();

        // Switch case for operators ; Using advanced switch case
        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '^' -> result = Math.pow(num1, num2);
            default  -> throw new IllegalArgumentException("Invalid operator!");
        }

        // Outputs results
        System.out.print("Result: " + result);

        // Close scanner
        input.close();
    
    }
    
}
