import java.util.Scanner;

public class compoundcalc {
    public static void main(String[] args){

        //Compound Interest Calculator

        Scanner input = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter your principal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter your interest rate (in %): ");
        rate = input.nextDouble() / 100; // to make .03 and so on

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = input.nextInt();

        System.out.print("Enter number of years: ");
        years = input.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount); // Using %d for int, %.2f for 2 decimals

    }
}
