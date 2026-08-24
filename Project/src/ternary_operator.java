import java.util.Scanner;

public class ternary_operator {
    public static void main (String[] args){

        // Tests yes/or or if/else
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        if(num >= 0){
            System.out.println("This number is positive");
            if(num > 10){
                System.out.println("This number is greater than 10");
            }
            else{
                System.out.println("This number is less than or equal to 10");
            }
        }
        else{
            System.out.println("This number is negative");
            if(num > 10){
                System.out.println("This number is greater than 10");
            }
            else{
                System.out.println("This number is less than or equal to 10");
            }
        }
        input.close();
        
    }
    
}
