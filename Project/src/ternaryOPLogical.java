import java.util.Scanner;

// && = And
// || = Or
// ! = Not

public class ternaryOPLogical {
    public static void main (String[] args){

        // Tests yes/or or if/else
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        // 0 - 9
        if(num >= 0 && num < 10){
            System.out.println("This number is positive");
            if(num > 10){
                System.out.println("This number is greater than 10");
            }
            else{
                System.out.println("This number is less than or equal to 10");
            }
        }
        // 10 - 20
        else if(num >= 10 && num <= 20){
            System.out.println("This number is between 10 and 20");
        }
        // <0
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
