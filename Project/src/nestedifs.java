import java.util.Scanner;

public class nestedifs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isStudent;
        boolean isSenior;
        double price = 10.99;

        System.out.print("Are you a student or senior?: ");
        String status = input.nextLine();
        if (status.toLowerCase().equals("student")) {
            isStudent = true;
            if (isStudent) {
                price *= 0.9;
                System.out.printf("Your price is $%.2f", price);
            }
        } else if (status.toLowerCase().equals("senior")) {
            isSenior = true;
            if (isSenior) {
                price *= 0.8;
                System.out.printf("Your price is $%.2f", price);
            } else {
                System.out.println("Invalid");
            }


        }

    }
}