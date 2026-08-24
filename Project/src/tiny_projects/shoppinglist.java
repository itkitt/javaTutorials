package tiny_projects;
import java.util.Scanner;

public class shoppinglist {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = input.nextLine();
        if(name.toLowerCase().equals("itkitt")){

            System.out.println("You are my creator, Itkitt!");
            System.out.print("What would you like to buy: ");
            String item = input.nextLine();
            System.out.print("What is the price of it: ");
            double price = input.nextDouble();
            System.out.print("How many would you like to buy: ");
            int amount = input.nextInt();
            double final_price = price * amount;
            System.out.println("Itkitt, you have bought " + amount + " " + item + " and spent $" + final_price + "!");

        }
        else if(name.toLowerCase().equals("damien")){

            System.out.println("You are Damien!");
            System.out.print("What would you like to buy: ");
            String item = input.nextLine();
            System.out.print("What is the price of it: ");
            double price = input.nextDouble();
            System.out.print("How many would you like to buy: ");
            int amount = input.nextInt();
            double final_price = price * amount;
            System.out.println("Damien, you have bought " + amount + " " + item + " and spent $" + final_price + "!");

        }
        else{
            System.out.println("You are not someone I recognise.");
        }


    }
}
